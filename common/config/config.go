package config

import (
	"github.com/BETEPOK3/tawt-scheduler/common/errors"
	"gopkg.in/yaml.v3"
	"io"
	"os"
	"reflect"
)

// ConfigInterface - интерфейс конфигурации.
type ConfigInterface interface {
	// Validate - валидация полей в конфигурации.
	Validate() error
}

// ReadAndValidate - прочитать конфиг и провести валидацию данных.
func ReadAndValidate(configFile string, target interface{}) error {
	file, err := os.Open(configFile)
	if err != nil {
		return errors.Error(errors.ERR_SYSTEM, "can't open config file %s", configFile)
	}
	defer file.Close()

	data, err := io.ReadAll(file)
	if err != nil {
		return errors.Error(errors.ERR_SYSTEM, "can't read config file %s", configFile)
	}

	if err = yaml.Unmarshal(data, target); err != nil {
		return errors.Wrap(err, errors.ERR_SYSTEM, "can't unmarshal config file %s", configFile)
	}

	err = ValidateMainConfig(target)
	if err != nil {
		return errors.Wrap(err, errors.ERR_SYSTEM, "invalid config")
	}

	return nil
}

// ValidateMainConfig - валидация главного конфига.
func ValidateMainConfig(mainConfig interface{}) error {
	if mainConfig == nil {
		return nil
	}

	v := reflect.ValueOf(mainConfig)
	for v.Kind() == reflect.Ptr {
		v = v.Elem()
	}

	for i := 0; i < v.NumField(); i++ {
		field := v.Field(i)

		if field.CanInterface() {
			if conf, ok := field.Interface().(ConfigInterface); ok {
				err := conf.Validate()
				if err != nil {
					return errors.Wrap(err, errors.ERR_SYSTEM, "validate %s", field.String())
				}
			}
		}
	}

	return nil
}

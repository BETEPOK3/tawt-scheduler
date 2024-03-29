module github.com/BETEPOK3/tawt-scheduler/scheduler

go 1.21.1

replace github.com/BETEPOK3/tawt-scheduler/common => ../../common

replace github.com/BETEPOK3/tawt-scheduler/schema => ../../schema

require (
	github.com/BETEPOK3/tawt-scheduler/common v0.0.0
	github.com/BETEPOK3/tawt-scheduler/schema v0.0.0
	github.com/golang-migrate/migrate/v4 v4.17.0
	github.com/rabbitmq/amqp091-go v1.9.0
	google.golang.org/grpc v1.62.1
)

require (
	github.com/golang/protobuf v1.5.3 // indirect
	github.com/google/uuid v1.6.0 // indirect
	github.com/hashicorp/errwrap v1.1.0 // indirect
	github.com/hashicorp/go-multierror v1.1.1 // indirect
	github.com/jackc/pgpassfile v1.0.0 // indirect
	github.com/jackc/pgservicefile v0.0.0-20221227161230-091c0ba34f0a // indirect
	github.com/jackc/pgx/v5 v5.4.3 // indirect
	github.com/jinzhu/inflection v1.0.0 // indirect
	github.com/jinzhu/now v1.1.5 // indirect
	github.com/lib/pq v1.10.9 // indirect
	github.com/pkg/errors v0.9.1 // indirect
	go.uber.org/atomic v1.7.0 // indirect
	golang.org/x/crypto v0.18.0 // indirect
	golang.org/x/net v0.20.0 // indirect
	golang.org/x/sys v0.16.0 // indirect
	golang.org/x/text v0.14.0 // indirect
	google.golang.org/genproto/googleapis/rpc v0.0.0-20240123012728-ef4313101c80 // indirect
	google.golang.org/protobuf v1.33.0 // indirect
	gopkg.in/yaml.v3 v3.0.1 // indirect
	gorm.io/driver/postgres v1.5.7 // indirect
	gorm.io/gorm v1.25.8 // indirect
)

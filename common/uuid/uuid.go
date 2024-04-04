package uuid

import (
	"github.com/google/uuid"
	"time"
)

// UUID - обёртка вокруг google uuid.UUID.
type UUID = uuid.UUID

// UUIDs - список UUID.
type UUIDs []UUID

// NewRandom - генерация UUIDv4. Паника в случае ошибки.
func NewRandom() UUID {
	return uuid.Must(uuid.NewRandom())
}

// NewULID - генерация UUIDv4 по алгоритму ULID.
func NewULID() UUID {
	id := NewRandom()
	ts := time.Now().UnixMilli()

	id[0] = byte(ts >> 40)
	id[1] = byte(ts >> 32)
	id[2] = byte(ts >> 24)
	id[3] = byte(ts >> 16)
	id[4] = byte(ts >> 8)
	id[5] = byte(ts)

	return id
}

// Nil - возвращает нулевый UUID.
func Nil() UUID {
	return [16]byte{}
}

// MustParse - распарсить строку в uuid. В случае ошибки - паника.
func MustParse(str string) uuid.UUID {
	return uuid.MustParse(str)
}

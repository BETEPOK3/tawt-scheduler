FROM golang:1.21-alpine AS builder
ARG path=services/sender

# Внедрение общей библитеки common.
WORKDIR /build/common
ADD common .
RUN go mod download

# Скачивание зависимостей.
WORKDIR /build/services/sender
COPY $path/go.mod $path/go.sum ./
RUN go mod download

# Копирование программы в контейнер.
COPY $path/cmd/main.go .
ADD $path/internal ./internal/
ADD $path/sql ./sql/

# Установка необходимых переменных среды.
ENV CGO_ENABLED=0 GOOS=linux GOARCH=amd64
RUN go build -ldflags="-s -w" -o sender .

FROM scratch
COPY --from=builder ["/build/services/sender/sender", "/"]
COPY --from=builder ["/build/services/sender/sql", "/sql/"]
ENTRYPOINT ["/sender"]
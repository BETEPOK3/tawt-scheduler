FROM golang:1.21-alpine AS builder
ARG path=services/scheduler

# Внедрение общей библитеки schema.
WORKDIR /build/schema
ADD schema .
RUN go mod download

# Внедрение общей библитеки common.
WORKDIR /build/common
ADD common .
RUN go mod download

# Скачивание зависимостей.
WORKDIR /build/services/scheduler
COPY $path/go.mod $path/go.sum ./
RUN go mod download

# Копирование программы в контейнер.
COPY $path/cmd/main.go .
COPY $path/cmd/config.template.yaml .
ADD $path/internal ./internal/
ADD $path/sql ./sql/

# Установка переменных сред и сборка.
ENV CGO_ENABLED=0 GOOS=linux GOARCH=amd64
RUN go build -ldflags="-s -w" -o scheduler .

FROM scratch
COPY --from=builder ["/build/services/scheduler/scheduler", "/"]
COPY --from=builder ["/build/services/scheduler/config.template.yaml", "/"]
COPY --from=builder ["/build/services/scheduler/sql", "/sql/"]
CMD ["/scheduler"]
FROM golang:1.21-alpine AS builder

# Скачивание зависимостей.
WORKDIR /build
COPY go.mod go.sum ./
RUN go mod download

# Копирование программы в контейнер.
COPY cmd/main.go .
ADD internal ./internal/

# Установка необходимых переменных среды.
ENV CGO_ENABLED=0 GOOS=linux GOARCH=amd64
RUN go build -ldflags="-s -w" -o sender .

FROM scratch
COPY --from=builder ["/build/sender", "/"]
ENTRYPOINT ["/sender"]
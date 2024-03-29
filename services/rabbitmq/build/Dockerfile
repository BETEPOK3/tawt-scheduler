FROM rabbitmq:management

RUN apt-get update && \
  apt-get install -y --no-install-recommends \
  curl \
  && rm -rf /var/lib/apt/lists/*

COPY ./services/rabbitmq/cmd/definitions.json /tmp/

COPY ./services/rabbitmq/cmd/entrypoint.sh /tmp
ENTRYPOINT ["/bin/bash", "/tmp/entrypoint.sh"]

CMD ["rabbitmq-server"]
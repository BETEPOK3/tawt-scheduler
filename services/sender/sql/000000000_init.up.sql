-- users - пользователи (тестовая таблица, пока без пароля)
create table if not exists users (
    id uuid primary key not null,
    login text not null
);

-- requests - запросы пользователей.
create table if not exists requests (
    id uuid primary key not null,
    user_id uuid not null references users(id),
    input jsonb not null,
    output jsonb,
    status text not null,
    create_at timestamptz not null default(now()),
    finished_at timestamptz
);

create index if not exists requests_user_id_index on requests(user_id);

create unique index if not exists users_login_uindex on users(login);
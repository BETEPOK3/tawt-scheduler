-- users - пользователи (тестовая таблица, пока без пароля)
create table if not exists users (
    id uuid primary key not null,
    login text not null
);

-- tasks - задачи от пользователей.
create table if not exists tasks (
    id uuid primary key not null,
    user_id uuid not null references users(id),
    input jsonb not null,
    output jsonb,
    type text not null,
    status text not null,
    created_at timestamptz not null default(now()),
    finished_at timestamptz,
    error text
);

create index if not exists tasks_user_id_index on tasks(user_id);

create unique index if not exists users_login_uindex on users(login);
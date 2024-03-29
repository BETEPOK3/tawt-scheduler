-- tasks - задачи от пользователей.
create table if not exists tasks (
    id uuid primary key not null,
    input jsonb not null,
    output jsonb,
    type text not null,
    status text not null,
    created_at timestamptz not null default(now()),
    finished_at timestamptz,
    error text,
    is_in_progress bool
);

create index if not exists tasks_is_in_progress_index on tasks(is_in_progress);
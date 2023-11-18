-- Добавление временного пользователя для выполнения запросов от его имени.
insert into users (id, login) values ('e9b3ddab-d3cc-4aad-9265-0b06edc3452c'::uuid, 'system') on conflict do nothing;
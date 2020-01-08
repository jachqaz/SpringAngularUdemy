INSERT INTO regiones(id, nombre)
VALUES (1, 'Sudamerica');
INSERT INTO clientes(region_id, apellido, create_at, email, nombre)
VALUES (1, 'Guzman', '2018-01-01', 'A@G.com', 'Andres');
INSERT INTO clientes(region_id, apellido, create_at, email, nombre)
VALUES (1, 'Guzman1', '2018-01-01', 'A1@G.com', 'Andres1');
INSERT INTO clientes(region_id, apellido, create_at, email, nombre)
VALUES (1, 'Guzman2', '2018-01-01', 'A2@G.com', 'Andres2');
INSERT INTO usuarios(enabled, password, username)
VALUES (1, '$2a$10$I8pIRcnWl5coJLzr2xFvtu8yxMJbwDtbiskoLzFQurQt2XHMeLwgO', 'andres');
INSERT INTO usuarios(enabled, password, username)
VALUES (1, '$2a$10$CRCQHUGlQRkWXVs9jcoztOd8/5Q4g.EURcwbWPuZdgJdcz62h0y2a', 'guzman');
INSERT INTO roles(nombre)
VALUES ('ROLE_USER');
INSERT INTO roles(nombre)
VALUES ('ROLE_ADMIN');
INSERT INTO usuarios_roles(usuario_id, roles_id)
VALUES (1, 1);
INSERT INTO usuarios_roles(usuario_id, roles_id)
VALUES (2, 1);
INSERT INTO usuarios_roles(usuario_id, roles_id)
VALUES (2, 2);
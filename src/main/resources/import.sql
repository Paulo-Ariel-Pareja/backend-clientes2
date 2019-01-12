insert into regiones (id, nombre) values (1, 'Sudamerica');
insert into regiones (id, nombre) values (2, 'Centroamerida');
insert into regiones (id, nombre) values (3, 'Norteamerica');
insert into regiones (id, nombre) values (4, 'Europa');
insert into regiones (id, nombre) values (5, 'Asia');
insert into regiones (id, nombre) values (6, 'Otros');

insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre1', 'apellido1', 'email1@mail.com', '2018-12-01', 1);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre2', 'apellido2', 'email2@mail.com', '2018-12-02', 2);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre3', 'apellido3', 'email3@mail.com', '2018-12-03', 3);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre4', 'apellido4', 'email4@mail.com', '2018-12-04', 4);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre5', 'apellido5', 'email5@mail.com', '2018-12-05', 5);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre6', 'apellido6', 'email6@mail.com', '2018-12-09', 6);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre7', 'apellido7', 'email7@mail.com', '2018-12-07', 1);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre8', 'apellido8', 'email8@mail.com', '2018-12-08', 2);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre9', 'apellido9', 'email9@mail.com', '2018-12-09', 3);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre10', 'apellido10', 'email10@mail.com', '2018-12-10', 4);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre11', 'apellido11', 'email11@mail.com', '2018-12-11', 5);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre12', 'apellido12', 'email12@mail.com', '2018-12-12', 6);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre13', 'apellido13', 'email13@mail.com', '2018-12-13', 1);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre14', 'apellido14', 'email14@mail.com', '2018-12-14', 2);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre15', 'apellido15', 'email15@mail.com', '2018-12-15', 3);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre16', 'apellido16', 'email16@mail.com', '2018-12-16', 4);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre17', 'apellido17', 'email17@mail.com', '2018-12-17', 5);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre18', 'apellido18', 'email18@mail.com', '2018-12-18', 6);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre19', 'apellido19', 'email19@mail.com', '2018-12-19', 1);
insert into clientes (nombre, apellido, email, create_at, region_id) values ('nombre20', 'apellido20', 'email20@mail.com', '2018-12-20', 2);

insert into usuarios (username, password, enabled, nombre, apellido, email) values ('paulo', '$2a$10$4BkE1wc/0ATTUKXk1GENte18QDLHefJ3KIE7f27k0N5VYOkz2y3c6', 1, 'paulo', 'pareja', 'email1@gmail.com');
insert into usuarios (username, password, enabled, nombre, apellido, email) values ('admin', '$2a$10$KOC2Uyjyj9HX8qB.jpbls.1Gf/PMpKLQ/R8ELlwOF3psG1Bg6BtyK', 1, 'ariel', 'pareja', 'email2@gmail.com');

insert into roles (nombre) values ('ROLE_USER');
insert into roles (nombre) values ('ROLE_ADMIN');

insert into usuarios_roles (usuario_id, role_id) values (1, 1);
insert into usuarios_roles (usuario_id, role_id) values (2, 2);
insert into usuarios_roles (usuario_id, role_id) values (2, 1);
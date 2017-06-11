insert into USER (id, name, password) values (1,'zhenxiongwu','123');
insert into USER (id, name, password) values (2,'guodongrui','123');

insert into SYS_ROLE (id,name) values (1,'ROLE_ADMIN');
insert into SYS_ROLE (id,name) values (2,'ROLE_USER');

insert into USER_ROLES (USER_ID,ROLES_ID) values (1,1);
insert into USER_ROLES (USER_ID,ROLES_ID) values (2,2);

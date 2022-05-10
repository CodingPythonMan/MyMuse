create table user_table(
    id nvarchar2(30),
    password nvarchar2(120) not null,
    name nvarchar2(20) not null,
    primary key(id)
);

insert into user_table
values ('kim', '1234', '±Ë¡÷øµ');

commit;
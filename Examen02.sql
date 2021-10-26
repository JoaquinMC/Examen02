
Create database examen02;
use examen02;

create table choferes
(idchoferes int primary key auto_increment,
nombre varchar(30) not null,
apellidos varchar(30) not null,
dni char(8)
);

insert into choferes values (null,"Juan","Mendez","45789621");
insert into choferes values (null,"Pepe","Garcia","45126398");
insert into choferes values (null,"Lucho","Velazques","78596321");
insert into choferes values (null,"Alex","Iglesias","45632178");

create table rutas
(idrutas int auto_increment primary key,
nombre varchar(40) not null,
distancia varchar(40) not null
);

insert into rutas values (null,"Ruta A","12km");
insert into rutas values (null,"Ruta B","20km");
insert into rutas values (null,"Ruta C","15km");
insert into rutas values (null,"Ruta D","17km");

create table buses
(idbuses int auto_increment primary key,
matricula varchar(5) not null,
capacidad int not null,
modelo varchar(60) not null,
idchoferes int,
idrutas int,
constraint fk_choferes foreign key (idchoferes) references choferes(idchoferes),
constraint fk_rutas foreign key (idrutas) references rutas(idrutas)
);

insert into buses values (null,"BUS45",30,"Maz",1,4);
insert into buses values (null,"BUS98",30,"Citroen",2,3);
insert into buses values (null,"BUS47",30,"Zil",3,2);
insert into buses values (null,"BUS65",30,"Commer",4,1);

select * from choferes;
select * from rutas;
select * from buses;

select * from tb_productos;


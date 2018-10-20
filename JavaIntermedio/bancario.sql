create table cliente(
nocliente varchar(12),
nombre varchar(30) not null,
apellidos varchar(30) not null,
fechanac date not null,
genero char(1) not null check(genero = 'M' or genero = 'F'),
primary key(nocliente) 
);

CREATE TABLE prestamo(
idPrestamo int,
fechaContrata date not null,
monto float not null check(monto >= 0.0),
vigencia date not null,
idcliente varchar(12) not null,
primary key(idprestamo),
foreign key (idcliente) references cliente(nocliente)
);
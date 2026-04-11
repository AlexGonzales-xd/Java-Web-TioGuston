create database proyecto_senati2 character set utf8mb4 collate utf8mb4_spanish_ci;
use proyecto_senati2;
-- TABLA USUARIOS.
create table usuario (
	id_usuario int auto_increment primary key,
    nombre varchar(100) not null,
    correo varchar(100) unique,
    contraseña varchar(250) not null,
    rol enum('administrador','empleado') not null,
    fecha_creacion timestamp default current_timestamp
);
-- TABLA PRODUCTO.
create table producto (
    id_producto int auto_increment primary key,
    nombre varchar(100) not null,
    descripcion text,
    precio decimal(10,2) not null
);
-- TABLA VENTA.
CREATE TABLE venta (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10,2),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);
-- TABLA DETALLE_VENTA.
CREATE TABLE detalle_venta (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_venta INT,
    id_producto INT,
    cantidad INT NOT NULL,
    precio_unitario DECIMAL(10,2),
    subtotal DECIMAL(10,2),
    FOREIGN KEY (id_venta) REFERENCES venta(id_venta),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);











    

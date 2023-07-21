--Creacion de tabla de ubicacion
CREATE TABLE Ubicaciones (
  id_ubicacion INT PRIMARY KEY,
  ubicacion VARCHAR(100)
);

--Vista
CREATE VIEW VistaUbicaciones AS
SELECT id_ubicacion, ubicacion
FROM Ubicaciones;

-- Creación de la tabla de puertos
CREATE TABLE Puertos (
  id_puerto INT PRIMARY KEY,
  nombre VARCHAR(50),
  capacidad_amarre INT,
  id_ubicacion INT,
  FOREIGN KEY (id_ubicacion) REFERENCES Ubicaciones(id_ubicacion)
);
--Vista de Puertos
CREATE VIEW VistaPuertos AS
SELECT P.id_puerto, P.nombre, P.capacidad_amarre, U.ubicacion
FROM Puertos P
INNER JOIN Ubicaciones U ON P.id_ubicacion = U.id_ubicacion;

-- Creación de la tabla de mantenimiento
CREATE TABLE Mantenimiento (
  id_mantenimiento INT PRIMARY KEY,
  descripcion VARCHAR(100),
  fecha_inicio DATE,
  fecha_fin DATE
);
--Vista de Mantenimiento
CREATE VIEW VistaMantenimiento AS
SELECT id_mantenimiento, descripcion, fecha_inicio, fecha_fin
FROM Mantenimiento;

-- Creación de la tabla de barcos
CREATE TABLE Barcos (
  id_barco INT PRIMARY KEY,
  nombre VARCHAR(50),
  modelo VARCHAR(50),
  capacidad_carga DECIMAL(10, 2),
  id_mantenimiento INT,
  FOREIGN KEY (id_mantenimiento) REFERENCES Mantenimiento(id_mantenimiento)
);



---Vista
CREATE VIEW vistaBarcos AS
SELECT id_barco, nombre, modelo, capacidad_carga, id_mantenimiento
FROM Barcos;

--Creacion de Roles
CREATE TABLE Roles (
  id_rol INT PRIMARY KEY,
  nombre VARCHAR(50)
);

CREATE VIEW VistaRoles AS
SELECT id_rol, nombre
FROM Roles;

-- Creación de la tabla de tripulaciones
CREATE TABLE Tripulaciones (
  id_tripulacion INT PRIMARY KEY,
  nombre VARCHAR(50),
  fecha_inicio DATE,
  fecha_fin DATE,
  id_barco INT,
  FOREIGN KEY (id_barco) REFERENCES Barcos(id_barco),
  id_rol INT,
	FOREIGN KEY (id_rol) REFERENCES Roles(id_rol)
);

-- Creación de la tabla de capturas
CREATE TABLE Registro_Pesca (
  id_registro_pesca INT PRIMARY KEY,
  fecha_captura DATE,
  lugar_captura VARCHAR(100),
  id_barco INT,
  id_puerto INT,
  FOREIGN KEY (id_barco) REFERENCES Barcos(id_barco),
  FOREIGN KEY (id_puerto) REFERENCES Puertos(id_puerto),
);

CREATE VIEW Vista_RegistroPesca AS
SELECT rp.id_registro_pesca, rp.fecha_captura, rp.lugar_captura, b.nombre AS nombre_barco, p.nombre AS nombre_puerto
FROM Registro_Pesca rp
INNER JOIN Barcos b ON rp.id_barco = b.id_barco
INNER JOIN Puertos p ON rp.id_puerto = p.id_puerto;


CREATE TABLE Capturas (
id_captura INT PRIMARY KEY,
id_registro_pesca INT,
cantidad INT,
id_especie INT,
FOREIGN KEY (id_registro_pesca) REFERENCES Registro_Pesca(id_registro_pesca),
FOREIGN KEY (id_especie) REFERENCES Especies(id_especie)
);

--Vista Capturas
CREATE VIEW VistaCapturas AS
SELECT c.id_captura, rp.id_registro_pesca, c.cantidad, e.nombre AS nombre_especie
FROM Capturas c
JOIN Registro_Pesca rp ON c.id_registro_pesca = rp.id_registro_pesca
JOIN Especies e ON c.id_especie = e.id_especie;

--Creacion de la tabla de Especies
CREATE TABLE Especies (
  id_especie INT PRIMARY KEY,
  nombre VARCHAR(50)
);



CREATE TABLE usuario (
    id_user INT PRIMARY KEY,
    usuario VARCHAR(50) UNIQUE,
    contrasena VARBINARY(64) -- Almacenar la contraseña en formato VARBINARY
);

-- Insertar un usuario con contraseña encriptada
INSERT INTO usuario (id_user, usuario, contrasena)
VALUES (1, 'anyel', HASHBYTES('SHA2_256', 'anyel'));
INSERT INTO usuario (id_user, usuario, contrasena)
VALUES (2, 'admin', HASHBYTES('SHA2_256', 'admin'));

INSERT INTO usuario (id_user, usuario, contrasena)
VALUES (3, 'jhan', HASHBYTES('SHA2_256', 'jhan'));

INSERT INTO usuario (id_user, usuario, contrasena)
VALUES (4, 'may', HASHBYTES('SHA2_256', 'may'));
select * from usuario



-----
ALTER TABLE Registro_Pesca
ADD nombre_registro VARCHAR(100);


select * from Registro_Pesca

drop view Vista_RegistroPesca


CREATE VIEW Vista_RegistroPesca AS
SELECT rp.id_registro_pesca, rp.nombre_registro, rp.fecha_captura, rp.lugar_captura, b.nombre AS nombre_barco, p.nombre AS nombre_puerto
FROM Registro_Pesca rp
INNER JOIN Barcos b ON rp.id_barco = b.id_barco
INNER JOIN Puertos p ON rp.id_puerto = p.id_puerto;







DROP view VistaCapturas


CREATE VIEW VistaCapturas AS
SELECT c.id_captura, rp.nombre_registro, c.cantidad, e.nombre AS nombre_especie
FROM Capturas c
JOIN Registro_Pesca rp ON c.id_registro_pesca = rp.id_registro_pesca
JOIN Especies e ON c.id_especie = e.id_especie;









----------------------------


-- Inserción de datos en la tabla Ubicaciones
INSERT INTO Ubicaciones (id_ubicacion, ubicacion)
VALUES
  (1, 'Ciudad de México'),
  (2, 'Nueva York'),
  (3, 'Tokio'),
  (4, 'Sídney'),
  (5, 'Londres');

-- Inserción de datos en la tabla Puertos
INSERT INTO Puertos (id_puerto, nombre, capacidad_amarre, id_ubicacion)
VALUES
  (1, 'Puerto de Veracruz', 50, 1),
  (2, 'Puerto de Nueva York', 40, 2),
  (3, 'Puerto de Tokio', 30, 3),
  (4, 'Puerto de Sídney', 20, 4),
  (5, 'Puerto de Londres', 10, 5);

-- Inserción de datos en la tabla Mantenimiento
INSERT INTO Mantenimiento (id_mantenimiento, descripcion, fecha_inicio, fecha_fin)
VALUES
  (1, 'Mantenimiento programado', '2023-01-01', '2023-01-15'),
  (2, 'Mantenimiento preventivo', '2023-02-01', '2023-02-10'),
  (3, 'Mantenimiento correctivo', '2023-03-01', '2023-03-05'),
  (4, 'Mantenimiento regular', '2023-04-01', '2023-04-07'),
  (5, 'Mantenimiento urgente', '2023-05-01', '2023-05-03');

-- Inserción de datos en la tabla Barcos
INSERT INTO Barcos (id_barco, nombre, modelo, capacidad_carga, id_mantenimiento)
VALUES
  (1, 'Barco A', 'Modelo X', 1000.50, 1),
  (2, 'Barco B', 'Modelo Y', 800.25, 2),
  (3, 'Barco C', 'Modelo Z', 1200.75, 3),
  (4, 'Barco D', 'Modelo W', 1500.00, 4),
  (5, 'Barco E', 'Modelo V', 900.50, 5);

-- Inserción de datos en la tabla Roles
INSERT INTO Roles (id_rol, nombre)
VALUES
  (1, 'Capitán'),
  (2, 'Marinero'),
  (3, 'Cocinero'),
  (4, 'Mecánico'),
  (5, 'Navegante');

-- Inserción de datos en la tabla Tripulaciones
INSERT INTO Tripulaciones (id_tripulacion, nombre, fecha_inicio, fecha_fin, id_barco, id_rol)
VALUES
  (1, 'Juan Pérez', '2023-01-01', '2023-12-31', 1, 1),
  (2, 'María García', '2023-02-01', '2023-12-31', 2, 2),
  (3, 'Pedro López', '2023-03-01', '2023-12-31', 3, 3),
  (4, 'Ana Torres', '2023-04-01', '2023-12-31', 4, 4),
  (5, 'Luis Rodríguez', '2023-05-01', '2023-12-31', 5, 5);

-- Inserción de datos en la tabla Registro_Pesca
INSERT INTO Registro_Pesca (id_registro_pesca, fecha_captura, lugar_captura, id_barco, id_puerto)
VALUES
  (1, '2023-01-01', 'Océano Atlántico', 1, 1),
  (2, '2023-02-01', 'Océano Pacífico', 2, 2),
  (3, '2023-03-01', 'Mar Caribe', 3, 3),
  (4, '2023-04-01', 'Mar Mediterráneo', 4, 4),
  (5, '2023-05-01', 'Mar de Japón', 5, 5);

-- Inserción de datos en la tabla Capturas
INSERT INTO Capturas (id_captura, id_registro_pesca, cantidad, id_especie)
VALUES
  (1, 1, 10, 1),
  (2, 2, 15, 2),
  (3, 3, 12, 3),
  (4, 4, 8, 4),
  (5, 5, 20, 5);

-- Inserción de datos en la tabla Especies
INSERT INTO Especies (id_especie, nombre)
VALUES
  (1, 'Atún'),
  (2, 'Salmón'),
  (3, 'Merluza'),
  (4, 'Pez Espada'),
  (5, 'Dorado');









-- diccionario de datos
SELECT 
	'DATADICTIONARY' AS [REPORT],
	@@SERVERNAME AS [ServerName],
	DB_NAME() AS [DatabaseName],
	t.name AS [TableName], 
	schema_name(t.schema_id) AS [SchemaName], 
	c.name AS [ColumnName], 
	st.name AS [DataType], 
	c.max_length AS [MaxLength], 
	CASE 
		WHEN c.is_nullable = 0 THEN 'NO'
		ELSE 'YES'
	END AS [IsNull],
	CASE 
		WHEN c.is_identity = 0 THEN 'NO'
		ELSE 'YES'
	END AS [IsIdentity], 
	isnull(ep.value, '-- add description here') AS [Description]
FROM [sys].[tables] t
INNER JOIN [sys].[columns] c
	ON t.object_id= c.object_id 
INNER JOIN [sys].[systypes] st 
	ON c.system_type_id= st.xusertype 
INNER JOIN [sys].[objects] o 
	ON t.object_id= o.object_id 
LEFT JOIN [sys].[extended_properties] ep 
	ON o.object_id = ep.major_id 
	AND c.column_Id = ep.minor_id
WHERE t.name <> 'sysdiagrams' 
ORDER BY 
	t.name,
	c.column_Id
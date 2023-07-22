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
CREATE VIEW Vista_RegistroPesca AS
SELECT rp.id_registro_pesca, rp.nombre_registro, rp.fecha_captura, rp.lugar_captura, b.nombre AS nombre_barco, p.nombre AS nombre_puerto
FROM Registro_Pesca rp
INNER JOIN Barcos b ON rp.id_barco = b.id_barco
INNER JOIN Puertos p ON rp.id_puerto = p.id_puerto;


ALTER TABLE Registro_Pesca
ADD nombre_registro VARCHAR(100);


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

-- crear una vista

CREATE VIEW diccionarioDatosMariscosNueva AS
SELECT 
	'DATADICTIONARY' AS [REPORT],
	@@SERVERNAME AS [ServerName],
	DB_NAME() AS [DatabaseName],
	t.name AS [TableName], 
	schema_name(t.schema_id) AS [SchemaName], 
	c.name AS [ColumnName], 
	st.name AS [DataType], 
	CASE 
		WHEN st.name IN ('nvarchar', 'nchar', 'ntext', 'xml') THEN c.max_length / 2 -- Dividir por 2 para ajustar la longitud de caracteres Unicode
		ELSE c.max_length
	END AS [MaxLength],
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
	ON t.object_id = c.object_id 
INNER JOIN [sys].[systypes] st 
	ON c.system_type_id = st.xusertype 
INNER JOIN [sys].[objects] o 
	ON t.object_id = o.object_id 
LEFT JOIN [sys].[extended_properties] ep 
	ON o.object_id = ep.major_id 
	AND c.column_Id = ep.minor_id
WHERE t.name <> 'sysdiagrams'

USE Mariscos;


-- Crear roles
CREATE ROLE RolAplicacion;
CREATE ROLE RolReportes;
-- Crear el usuario sistemaMariscos1
CREATE LOGIN sistemaMariscos1 WITH PASSWORD = 'admin';
CREATE USER sistemaMariscos1 FOR LOGIN sistemaMariscos1;
ALTER ROLE RolAplicacion ADD MEMBER sistemaMariscos1;

-- Crear el usuario sistemaMariscos2
CREATE LOGIN sistemaMariscos2 WITH PASSWORD = '12345';
CREATE USER sistemaMariscos2 FOR LOGIN sistemaMariscos2;
ALTER ROLE RolAplicacion ADD MEMBER sistemaMariscos2;



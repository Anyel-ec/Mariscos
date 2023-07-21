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
-- Crear usuarios y asignarlos a los roles
CREATE LOGIN angel WITH PASSWORD = 'angel';
CREATE USER angel FOR LOGIN angel;
ALTER ROLE RolAplicacion ADD MEMBER angel;

CREATE LOGIN may WITH PASSWORD = 'may';
CREATE USER may FOR LOGIN may;
ALTER ROLE RolAplicacion ADD MEMBER may;

CREATE LOGIN jhan WITH PASSWORD = 'jhan';
CREATE USER jhan FOR LOGIN jhan;
ALTER ROLE RolAplicacion ADD MEMBER jhan;

CREATE LOGIN jhon WITH PASSWORD = 'jhon';
CREATE USER jhon FOR LOGIN jhon;
ALTER ROLE RolAplicacion ADD MEMBER jhon;



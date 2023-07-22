USE Mariscos; -- Cambiar al contexto de la base de datos Mariscos

-- Otorgar permisos SELECT, UPDATE, DELETE, INSERT a las tablas mencionadas
GRANT SELECT, UPDATE, DELETE, INSERT ON usuario TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Ubicaciones TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Puertos TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Mantenimiento TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Barcos TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Roles TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Tripulaciones TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Registro_Pesca TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Especies TO sistemaMariscos1;
GRANT SELECT, UPDATE, DELETE, INSERT ON Capturas TO sistemaMariscos1;

-- Otorgar permisos para realizar transacciones
GRANT EXECUTE TO sistemaMariscos1;

USE Mariscos; -- Cambiar al contexto de la base de datos Mariscos

-- Permisos para las vistas
GRANT SELECT ON VistaBarcosMantenimiento TO sistemaMariscos1;
GRANT SELECT ON VistaTripulaciones TO sistemaMariscos1;
GRANT SELECT ON VistaRoles TO sistemaMariscos1;
GRANT SELECT ON VistaEspecies TO sistemaMariscos1;
GRANT SELECT ON VistaUbicaciones TO sistemaMariscos1;
GRANT SELECT ON VistaPuertos TO sistemaMariscos1;
GRANT SELECT ON VistaMantenimiento TO sistemaMariscos1;
GRANT SELECT ON Vista_RegistroPesca TO sistemaMariscos1;
GRANT SELECT ON VistaCapturas TO sistemaMariscos1;





USE Mariscos; -- Cambiar al contexto de la base de datos Mariscos

-- Otorgar permisos SELECT, UPDATE, DELETE, INSERT a las tablas mencionadas
GRANT SELECT,  INSERT ON usuario TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Ubicaciones TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Puertos TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Mantenimiento TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Barcos TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Roles TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Tripulaciones TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Registro_Pesca TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Especies TO sistemaMariscos2;
GRANT SELECT,  INSERT ON Capturas TO sistemaMariscos2;

-- Otorgar permisos para realizar transacciones
GRANT EXECUTE TO sistemaMariscos2;

USE Mariscos; -- Cambiar al contexto de la base de datos Mariscos

-- Permisos para las vistas
GRANT SELECT ON VistaBarcosMantenimiento TO sistemaMariscos2;
GRANT SELECT ON VistaTripulaciones TO sistemaMariscos2;
GRANT SELECT ON VistaRoles TO sistemaMariscos2;
GRANT SELECT ON VistaEspecies TO sistemaMariscos2;
GRANT SELECT ON VistaUbicaciones TO sistemaMariscos2;
GRANT SELECT ON VistaPuertos TO sistemaMariscos2;
GRANT SELECT ON VistaMantenimiento TO sistemaMariscos2;
GRANT SELECT ON Vista_RegistroPesca TO sistemaMariscos2;
GRANT SELECT ON VistaCapturas TO sistemaMariscos2;

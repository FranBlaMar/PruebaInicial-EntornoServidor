REM   Script: Prueba Inicial Fran
REM   servidor

CREATE TABLE empresa(  
   nombre VARCHAR2(50),  
   id_emp VARCHAR2(9),  
   nombre_gerente VARCHAR2(100),  
   fecha_creacion DATE DEFAULT SYSDATE,  
   CONSTRAINT empresa_pk PRIMARY KEY(id_emp)  
);

CREATE TABLE empleados(  
    nombre VARCHAR2(30),  
    apellidos VARCHAR2(60),  
    empleado_id VARCHAR2(9),  
    id_empresa VARCHAR2(9),  
    fecha_nacimiento DATE,  
    sueldo NUMBER,  
    CONSTRAINT empleado_pk PRIMARY KEY (empleado_id),   
    CONSTRAINT empleado_fk FOREIGN KEY (id_empresa) REFERENCES empresa (id_emp) ON DELETE CASCADE  
);

CREATE TABLE hijos (  
    nombre VARCHAR2(30),  
    edad NUMBER,  
    padre VARCHAR2(9),  
    CONSTRAINT hijo_pk PRIMARY KEY (nombre,padre),   
    CONSTRAINT hijo_fk FOREIGN KEY (padre) REFERENCES empleados (empleado_id) ON DELETE CASCADE  
);

ALTER TABLE empresa ADD numeroDepartamentos number;

INSERT INTO empresa VALUES ('Amazon','12345678A','Bezzos',TO_DATE('05/07/1994', 'DD/MM/YYYY'),6);

INSERT INTO empresa VALUES ('Cocacola','12345678B','Manuel',TO_DATE('29/01/1892', 'DD/MM/YYYY'),7);

INSERT INTO empleados VALUES ('Paco','Perez Díaz','111111111','12345678A',TO_DATE('12/10/1997', 'DD/MM/YYYY'),1200);

INSERT INTO empleados VALUES ('Ana','García Lopez','222222222','12345678A',TO_DATE('20/02/1999', 'DD/MM/YYYY'),2200);

INSERT INTO empleados VALUES ('Rafa','Ruíz Martín','333333333','12345678B',TO_DATE('10/10/2000', 'DD/MM/YYYY'),900);

INSERT INTO hijos VALUES ('Pedro',11,'222222222');

INSERT INTO hijos VALUES ('María',4,'111111111');

UPDATE empleados SET sueldo = 3400 WHERE id_empresa LIKE '12345678B';

SELECT COUNT(*) 
FROM empleados 
WHERE id_empresa LIKE '12345678A';

SELECT e.nombre 
FROM empresa e, empleados p 
WHERE e.id_emp = p.id_empresa 
AND p.nombre LIKE 'Rafa';

SELECT COUNT(*)
FROM empleados
WHERE id_empresa LIKE '12345678A';



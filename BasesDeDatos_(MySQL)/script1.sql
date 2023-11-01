CREATE DATABASE futbol;
USE futbol;

CREATE TABLE futbolista (id_futbolista int(10) NOT NULL AUTO_INCREMENT,
						nombre varchar(40) NOT NULL,
						nacionalidad varchar(10),
                        id_equipo int(10) NOT NULL,
						PRIMARY KEY(id_futbolista), FOREIGN KEY(id_equipo) REFERENCES equipo(id_equipo);

CREATE TABLE equipo (id_equipo int(10) NOT NULL AUTO_INCREMENT,
					nombre varchar(40),
                    pais varchar(10),
                    liga varchar(20),
                    PRIMARY KEY(id_equipo));
                    

drop database db_topico;
create database db_Topico;
use  db_Topico;

/*create table topico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(50) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    curso VARCHAR(255) NOT NULL
);*/

select * from topico;

INSERT INTO topico (titulo, mensaje, fecha_creacion, status, autor, curso)
VALUES 
('Introducción a la Programación', 'Este tópico cubre los conceptos básicos de programación.', '2024-07-09 10:00:00', 'activo', 'Juan Pérez', 'Informática'),
('Historia del Arte', 'En este tópico exploraremos las principales corrientes artísticas a lo largo de la historia.', '2024-07-09 11:00:00', 'activo', 'María López', 'Artes'),
('Principios de Economía', 'Este tópico abarca los fundamentos de la economía y sus aplicaciones prácticas.', '2024-07-09 12:00:00', 'inactivo', 'Carlos García', 'Economía');
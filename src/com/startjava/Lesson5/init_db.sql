create table robots
(
    id serial primary key,
    modelname text,
    mark      text,
    height    numeric,
    weight    numeric,
    status    text,
    origin    text,
    launch    date,
    kaijukill smallint
);


INSERT INTO robots(modelName, mark, height, weight, status, origin, launch, kaijuKill) VALUES
('Gipsy Danger','Mark-3','79.25','1.980','Destroyed','USA','07/10/2017','9'),
('Striker Eureka','Mark-5','76.2','1.850','Destroyed','Australia','11/02/2019','11'),
('Gipsy Avenger','Mark-6','81.77','2.004','Destroyed','USA','01/12/2034','1'),
('Obsidian Fury','Mark-4','83.45','2.572','Destroyed','USA','02/05/2017','3'),
('Crimson Typhoon','Mark-4','82.36','2.872','Destroyed','China','22/08/2018','7'),
('Gipsy Danger2','Mark-9','80.25','2.980','Destroyed','USA','07/10/2027','3'),
('Striker Eureka2','Mark-9','77.2','2.850','Alive','Australia','11/02/2029','5'),
('Gipsy Avenger2','Mark-8','82.77','2.504','Destroyed','USA','01/12/2044','6'),
('Obsidian Fury2','Mark-7','84.45','2.642','Destroyed','USA','02/05/2027','4'),
('Crimson Typhoon2','Mark-6','83.36','2.972','Alive','China','22/08/2028','2');
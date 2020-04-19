CREATE database jaegers;
\c jaegers;

CREATE TABLE robots (
    id serial PRIMARY KEY,
    modelname TEXT,
    mark      TEXT,
    height    NUMERIC,
    weight    NUMERIC,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijukill SMALLINT
);
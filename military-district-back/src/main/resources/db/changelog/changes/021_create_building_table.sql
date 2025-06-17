CREATE TABLE IF NOT EXISTS buildings
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    coordinate COORDINATE,
    adress ADRESS,
    unit_name VARCHAR(255) REFERENCES units(name) ON DELETE SET NULL ON UPDATE CASCADE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    CONSTRAINT building_in_unit_unique UNIQUE (name, unit_name)
);
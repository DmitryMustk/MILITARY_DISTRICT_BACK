CREATE TABLE IF NOT EXISTS combat_equipment_attributes
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    value VARCHAR(255) NOT NULL,
    type_id INTEGER NOT NULL REFERENCES combat_equipment_types(id) ON DELETE CASCADE ON UPDATE CASCADE,
    UNIQUE (name, type_id)
);

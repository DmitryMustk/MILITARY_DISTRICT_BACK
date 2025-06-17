CREATE TABLE IF NOT EXISTS building_attributes
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    value VARCHAR(255) NOT NULL,
    building_id INTEGER NOT NULL REFERENCES buildings(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT building_attribute_name_building_id_unique UNIQUE (name, building_id)
);

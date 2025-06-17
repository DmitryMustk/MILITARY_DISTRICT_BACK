CREATE TABLE IF NOT EXISTS combat_equipment_types
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category_id INTEGER NOT NULL REFERENCES combat_equipment_categories(id) ON DELETE SET NULL ON UPDATE CASCADE,
    CONSTRAINT combat_equipment_type_name_category_unique UNIQUE(name, category_id)
);

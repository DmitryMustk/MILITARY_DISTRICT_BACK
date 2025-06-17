CREATE TABLE IF NOT EXISTS combat_equipment_categories
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

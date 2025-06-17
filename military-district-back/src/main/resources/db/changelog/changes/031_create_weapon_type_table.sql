CREATE TABLE IF NOT EXISTS weapon_types
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category_id INTEGER NOT NULL REFERENCES weapon_categories(id),
    UNIQUE(name, category_id)
);

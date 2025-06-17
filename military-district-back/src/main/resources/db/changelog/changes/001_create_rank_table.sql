CREATE TABLE IF NOT EXISTS ranks
(
    id               SERIAL PRIMARY KEY,
    name             VARCHAR(255) NOT NULL UNIQUE CHECK (name <> ''),
    level            INTEGER      NOT NULL CHECK (level >= 0),
    rank_category_id INTEGER      NOT NULL REFERENCES rank_categories (id) ON DELETE SET NULL ON UPDATE CASCADE
);
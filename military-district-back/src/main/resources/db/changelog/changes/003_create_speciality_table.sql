CREATE TABLE IF NOT EXISTS specialties
(
    id   SERIAL PRIMARY KEY,
    code VARCHAR(7)   NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL
);

CREATE INDEX IF NOT EXISTS specialties_name_index ON specialties (name);
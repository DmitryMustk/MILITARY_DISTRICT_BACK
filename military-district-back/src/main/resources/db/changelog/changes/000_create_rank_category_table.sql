CREATE TABLE IF NOT EXISTS rank_categories
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL UNIQUE
);
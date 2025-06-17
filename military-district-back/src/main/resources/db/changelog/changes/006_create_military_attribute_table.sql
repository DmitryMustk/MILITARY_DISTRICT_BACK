CREATE TABLE IF NOT EXISTS military_attributes
(
    id          SERIAL PRIMARY KEY,
    military_id INTEGER      NOT NULL REFERENCES militaries (id) ON DELETE CASCADE ON UPDATE CASCADE,
    name        VARCHAR(255) NOT NULL,
    rank_id     INTEGER      NOT NULL REFERENCES ranks (id) ON DELETE CASCADE ON UPDATE CASCADE,
    value       VARCHAR(255),
    UNIQUE (military_id, name, rank_id)
);
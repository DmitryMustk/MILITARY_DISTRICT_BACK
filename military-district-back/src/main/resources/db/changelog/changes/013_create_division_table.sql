CREATE TABLE IF NOT EXISTS divisions
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE,
    commander_token_id VARCHAR(255) REFERENCES militaries (token_id) ON DELETE SET NULL ON UPDATE CASCADE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS divisions_commander_token_id_idx ON divisions (commander_token_id);
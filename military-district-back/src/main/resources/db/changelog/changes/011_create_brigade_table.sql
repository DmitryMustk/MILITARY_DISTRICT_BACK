CREATE TABLE IF NOT EXISTS brigades
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE,
    commander_token_id VARCHAR(255) REFERENCES militaries (token_id) ON DELETE SET NULL ON UPDATE CASCADE,
    created_at TIMESTAMPTZ DEFAULT NOW(),
    updated_at TIMESTAMPTZ DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS brigades_commander_token_id_idx ON brigades (commander_token_id);

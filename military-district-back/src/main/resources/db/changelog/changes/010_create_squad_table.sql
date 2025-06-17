CREATE TABLE IF NOT EXISTS squads
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE,
    commander_token_id VARCHAR(255) REFERENCES militaries(token_id) ON DELETE SET NULL ON UPDATE CASCADE,
    platoon_id INTEGER REFERENCES platoons(id) ON DELETE CASCADE ON UPDATE CASCADE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS squads_commander_token_id_idx ON squads(commander_token_id);

COMMENT ON TABLE squads IS 'Отделения';
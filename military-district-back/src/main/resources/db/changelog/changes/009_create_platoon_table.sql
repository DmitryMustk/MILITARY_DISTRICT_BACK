CREATE TABLE IF NOT EXISTS platoons (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE,
    commander_token_id VARCHAR(255) REFERENCES militaries (token_id) ON DELETE SET NULL ON UPDATE CASCADE,
    company_id INTEGER REFERENCES companies (id) ON DELETE CASCADE ON UPDATE CASCADE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS platton_commander_token_id_idx ON platoons (commander_token_id);
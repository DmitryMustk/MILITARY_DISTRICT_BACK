CREATE TABLE IF NOT EXISTS companies
(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) NOT NULL UNIQUE,
	commander_token_id VARCHAR(255) REFERENCES militaries(token_id) ON DELETE SET NULL ON UPDATE CASCADE,
	unit_id INTEGER NOT NULL REFERENCES units(id) ON DELETE SET NULL ON UPDATE CASCADE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS companies_commander_token_id_idx ON companies (commander_token_id);

COMMENT ON TABLE companies IS 'Роты';
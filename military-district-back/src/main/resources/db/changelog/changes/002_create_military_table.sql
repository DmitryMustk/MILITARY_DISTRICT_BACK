CREATE TABLE IF NOT EXISTS militaries
(
    id                  SERIAL PRIMARY KEY,
    token_id   VARCHAR(255) NOT NULL UNIQUE,
    first_name          VARCHAR(255) NOT NULL,
    last_name           VARCHAR(255) NOT NULL,
    middle_name         VARCHAR(255),
    birth_date          DATE         NOT NULL,
    rank_id             INTEGER REFERENCES ranks (id) ON DELETE SET NULL ON UPDATE CASCADE,
    created_at          TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    updated_at          TIMESTAMPTZ  NOT NULL DEFAULT NOW(),
    unit_name           VARCHAR(255)
);

CREATE INDEX IF NOT EXISTS militaries_first_name_index ON militaries (first_name);
CREATE INDEX IF NOT EXISTS militaries_last_name_index ON militaries (last_name);
CREATE INDEX IF NOT EXISTS militaries_middle_name_index ON militaries (middle_name);
CREATE INDEX IF NOT EXISTS militaries_unit_name_index ON militaries (unit_name);
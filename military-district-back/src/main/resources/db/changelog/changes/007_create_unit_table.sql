DO
$$
    BEGIN
        CREATE TYPE COORDINATE AS
        (
            latitude DOUBLE PRECISION,
            longitude DOUBLE PRECISION
        );
    EXCEPTION
        WHEN duplicate_object THEN NULL;
    END
$$;

DO
$$
    BEGIN
        CREATE TYPE ADRESS AS
        (
            post_code INTEGER,
            country VARCHAR(255),
            state VARCHAR(255),
            locality VARCHAR(255),
            street VARCHAR(255),
            house_number VARCHAR(255)
        );
    EXCEPTION
        WHEN duplicate_object THEN NULL;
    END
$$;

CREATE TABLE IF NOT EXISTS units
(
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL UNIQUE,
    coordinate          COORDINATE,
    adress              ADRESS,
    commander_token_id  VARCHAR(255) REFERENCES militaries (token_id) ON DELETE SET NULL ON UPDATE CASCADE,
    created_at          TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at          TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS units_commander_token_id_idx ON units (commander_token_id);

ALTER TABLE IF EXISTS militaries
    ADD FOREIGN KEY (unit_name) REFERENCES units (name) ON DELETE SET NULL ON UPDATE CASCADE;
CREATE TABLE IF NOT EXISTS militaries_specialties
(
    military_id  INTEGER NOT NULL REFERENCES militaries (id) ON DELETE CASCADE ON UPDATE CASCADE,
    specialty_id INTEGER NOT NULL REFERENCES specialties (id) ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (military_id, specialty_id)
);
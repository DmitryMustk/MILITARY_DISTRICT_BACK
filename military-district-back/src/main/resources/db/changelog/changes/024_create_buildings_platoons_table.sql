CREATE TABLE IF NOT EXISTS buildings_platoons
(
    building_id INTEGER NOT NULL REFERENCES buildings(id) ON DELETE CASCADE ON UPDATE CASCADE,
    platoon_id INTEGER NOT NULL REFERENCES platoons(id) ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (building_id, platoon_id)
);

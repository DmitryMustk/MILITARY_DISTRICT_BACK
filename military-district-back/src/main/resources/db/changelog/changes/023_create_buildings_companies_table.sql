CREATE TABLE IF NOT EXISTS buildings_companies
(
    building_id INTEGER NOT NULL REFERENCES buildings(id) ON DELETE CASCADE ON UPDATE CASCADE,
    company_id INTEGER NOT NULL REFERENCES companies(id) ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (building_id, company_id)
);

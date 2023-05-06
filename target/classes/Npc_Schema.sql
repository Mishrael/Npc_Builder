DROP TABLE IF EXISTS npcs;
DROP TABLE IF EXISTS backgrounds_professions;
DROP TABLE IF EXISTS backgrounds;
DROP TABLE IF EXISTS professions;
DROP TABLE IF EXISTS personalities;
DROP TABLE IF EXISTS species;
DROP TABLE IF EXISTS names;


CREATE TABLE names (
  name_pk int unsigned NOT NULL AUTO_INCREMENT,
  name_id varchar(16) NOT NULL,
  name_origin enum('MOD_ENG', 'MID_ENG', 'OLD_ENG', 'NORSE', 'ARABIC'),
  PRIMARY KEY (name_pk)
);

CREATE TABLE species (
  species_pk int unsigned NOT NULL AUTO_INCREMENT,
  species_id enum('HUMAN', 'ELF', 'DWARF', 'HALFING', 'GNOME', 'TIEFLING', 'HALF_ELF', 'HALF_ORC') NOT NULL,
  description varchar(256),
  PRIMARY KEY (species_pk),
  UNIQUE KEY (species_id)
);

CREATE TABLE personalities (
  personality_pk int unsigned NOT NULL AUTO_INCREMENT,
  personality_id enum('ENTP', 'ISFJ', 'ENFJ', 'ISTP', 'ESFP', 'INTJ', 'ESFJ', 'ISTJ'),
  traits varchar(60) NOT NULL,
  description varchar(128),
  PRIMARY KEY (personality_pk),
  UNIQUE KEY (personality_id)
);

CREATE TABLE professions (
  profession_pk int unsigned NOT NULL AUTO_INCREMENT,
  profession_id enum('BLACKSMITH', 'BAKER', 'FARMER', 'FISHERMAN', 'HUNTER', 'TRADER', 'MERCHANT', 
  'MINER', 'CARPENTER', 'PAINTER', 'POTTER', 'TAILOR', 'CHEF', 'BREWER', 'WEAVER', 'ARTIST', 
  'MUSICIAN', 'ACTOR', 'DOCTOR', 'PRIEST'),
  PRIMARY KEY (profession_pk)
);

CREATE TABLE backgrounds (
  background_pk int unsigned NOT NULL AUTO_INCREMENT,
  background_id enum('ACOLYTE', 'CRIMINAL', 'FOLK_HERO', 'GUILD_ARTISAN', 'HERMIT', 'NOBLE', 
  'OUTLANDER', 'SAGE', 'SAILOR', 'SOLDIER'),
  PRIMARY KEY (background_pk)
);

CREATE TABLE backgrounds_professions (
  profession_fk int unsigned NOT NULL,
  background_fk int unsigned NOT NULL,
  FOREIGN KEY (profession_fk) REFERENCES professions (profession_pk) ON DELETE CASCADE,
  FOREIGN KEY (background_fk) REFERENCES backgrounds (background_pk) ON DELETE CASCADE
);

CREATE TABLE npcs (
  npc_pk int unsigned NOT NULL AUTO_INCREMENT,
  name_fk int unsigned NOT NULL,
  species_fk int unsigned NOT NULL,
  personality_fk int unsigned NOT NULL,
  background_fk int unsigned NOT NULL,
  PRIMARY KEY (npc_pk),
  FOREIGN KEY (name_fk) REFERENCES names (name_pk) ON DELETE CASCADE,
  FOREIGN KEY (species_fk) REFERENCES species (species_pk) ON DELETE CASCADE,
  FOREIGN KEY (personality_fk) REFERENCES personalities (personality_pk) ON DELETE CASCADE,
  FOREIGN KEY (background_fk) REFERENCES backgrounds (background_pk) ON DELETE CASCADE
);
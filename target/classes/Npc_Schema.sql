DROP TABLE IF EXISTS npcs;
DROP TABLE IF EXISTS backgrounds_professions;
DROP TABLE IF EXISTS backgrounds;
DROP TABLE IF EXISTS professions;
DROP TABLE IF EXISTS personalities;
DROP TABLE IF EXISTS species;
DROP TABLE IF EXISTS names;
DROP TABLE IF EXISTS surnames;
DROP TABLE IF EXISTS first_names;

CREATE TABLE first_names (
  first_name_pk int unsigned NOT NULL AUTO_INCREMENT,
  first_name_id varchar(40) NOT NULL,
  first_name_origin enum ('MOD_ENG', 'MID_ENG', 'OLD_ENG', 'NORSE', 'GERMAN'),
  PRIMARY KEY (first_name_pk)
);

CREATE TABLE surnames (
  surname_pk int unsigned NOT NULL AUTO_INCREMENT,
  surname_id varchar(40) NOT NULL,
  surname_origin enum ('MOD_ENG', 'MID_ENG', 'OLD_ENG', 'NORSE', 'GERMAN'),
  PRIMARY KEY (surname_pk)
);

CREATE TABLE names (
  name_pk int unsigned NOT NULL AUTO_INCREMENT,
  first_name_fk int unsigned NOT NULL,
  surname_fk int unsigned NOT NULL,
  PRIMARY KEY (name_pk),
  FOREIGN KEY (first_name_fk) REFERENCES first_names (first_name_pk) ON DELETE CASCADE,
  FOREIGN KEY (surname_fk) REFERENCES surnames (surname_pk) ON DELETE CASCADE
);

CREATE TABLE species (
  species_pk int unsigned NOT NULL AUTO_INCREMENT,
  species_id enum('HUMAN', 'ELF', 'DWARF', 'HALFING', 'GNOME', 'TIEFLING', 'HALF_ORC', 'HALF_ELF') NOT NULL,
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
  profession_id varchar(40) NOT NULL,
  mastery_level enum('APPRENTICE', 'JOURNEYMAN', 'EXPERT', 'MASTER', 'GRAND_MASTER'),
  PRIMARY KEY (profession_pk)
);

CREATE TABLE backgrounds (
  background_pk int unsigned NOT NULL AUTO_INCREMENT,
  background_id varchar(40) NOT NULL,
  ethnicity enum('EUROPEAN', 'ARABIC', 'SYLVAN', 'DWARVEN'),
  status enum('WEALTHY', 'MIDDLE_CLASS', 'POOR'),
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
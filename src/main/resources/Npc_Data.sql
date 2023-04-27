-- First Names
-- Modern English names
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('William', 'MOD_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Elizabeth', 'MOD_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Henry', 'MOD_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Charlotte', 'MOD_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('George', 'MOD_ENG');
-- Middle English names
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Alice', 'MID_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Richard', 'MID_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Margaret', 'MID_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('John', 'MID_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Catherine', 'MID_ENG');
-- Old English names
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Æthelred', 'OLD_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Æthelstan', 'OLD_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Godwin', 'OLD_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Leofric', 'OLD_ENG');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Ealdred', 'OLD_ENG');
-- Norse names
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Thor', 'NORSE');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Freya', 'NORSE');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Astrid', 'NORSE');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Erik', 'NORSE');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Harald', 'NORSE');
-- German names
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Heinrich', 'GERMAN');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Elsa', 'GERMAN');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Ludwig', 'GERMAN');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Gisela', 'GERMAN');
INSERT INTO first_names (first_name_id, first_name_origin) VALUES ('Dieter', 'GERMAN');


-- Surnames
-- Modern English surnames
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Smith', 'MOD_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Jones', 'MOD_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Taylor', 'MOD_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Brown', 'MOD_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Wilson', 'MOD_ENG');
-- Middle English surnames
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Carter', 'MID_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Bailey', 'MID_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Butler', 'MID_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Fisher', 'MID_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Miller', 'MID_ENG');
-- Old English surnames
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Wright', 'OLD_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Baker', 'OLD_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Singer', 'OLD_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Thatcher', 'OLD_ENG');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Cooper', 'OLD_ENG');
-- Norse surnames
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Eriksson', 'NORSE');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Svensson', 'NORSE');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Johansson', 'NORSE');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Larsson', 'NORSE');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Andersson', 'NORSE');
-- German surnames
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Müller', 'GERMAN');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Schmidt', 'GERMAN');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Fischer', 'GERMAN');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Meyer', 'GERMAN');
INSERT INTO surnames (surname_id, surname_origin) VALUES ('Weber', 'GERMAN');


-- Species
INSERT INTO species (species_id, description) VALUES ('HUMAN', 'A versatile species known for their adaptability and ingenuity.');
INSERT INTO species (species_id, description) VALUES ('ELF', 'A graceful and magical species with a deep connection to nature.');
INSERT INTO species (species_id, description) VALUES ('DWARF', 'A tough and hardy species with a love of mining and craftsmanship.');
INSERT INTO species (species_id, description) VALUES ('HALFING', 'A small and nimble species with a talent for thievery and mischief.');
INSERT INTO species (species_id, description) VALUES ('GNOME', 'A curious and inventive species with a passion for tinkering and invention.');
INSERT INTO species (species_id, description) VALUES ('TIEFLING', 'A mysterious and alluring species with infernal ancestry and dark powers.');
INSERT INTO species (species_id, description) VALUES ('HALF_ORC', 'A fierce and powerful species with a reputation for brutality and savagery.');
INSERT INTO species (species_id, description) VALUES ('HALF_ELF', 'A hybrid species with both human and elf ancestry, possessing the best traits of both.');


-- Personalities
INSERT INTO personalities (personality_id, traits, description) VALUES ('ENTP', 'Inventive, curious, outspoken', 'Inspired innovators, find new solutions');
INSERT INTO personalities (personality_id, traits, description) VALUES ('ISFJ', 'Warm, considerate, responsible', 'Industrious caretakers, loyal to traditions');
INSERT INTO personalities (personality_id, traits, description) VALUES ('ENFJ', 'Charismatic, empathetic, persuasive', 'Idealist organizers, catalysts for growth');
INSERT INTO personalities (personality_id, traits, description) VALUES ('ISTP', 'Bold, practical, experimental', 'Virtuoso problem-solvers, find practical solutions');
INSERT INTO personalities (personality_id, traits, description) VALUES ('ESFP', 'Spontaneous, energetic, enthusiastic', 'Vivacious entertainers, talent for making others feel special');
INSERT INTO personalities (personality_id, traits, description) VALUES ('INTJ', 'Strategic, intellectual, logical', 'Analytical problem-solvers, see possibilities for improvement');
INSERT INTO personalities (personality_id, traits, description) VALUES ('ESFJ', 'Supportive, outgoing, conscientious', 'Conscientious helpers, highly attuned to emotional environment');
INSERT INTO personalities (personality_id, traits, description) VALUES ('ISTJ', 'Responsible, loyal, hardworking', 'Responsible organizers, neat and orderly, have procedure for everything');


-- Professions
-- APPRENTICE
INSERT INTO professions (profession_id, mastery_level) VALUES ('Carpenter', 'APPRENTICE');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Blacksmith', 'APPRENTICE');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Scribe', 'APPRENTICE');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Baker', 'APPRENTICE');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Weaver', 'APPRENTICE');
-- JOURNEYMAN
INSERT INTO professions (profession_id, mastery_level) VALUES ('Carpenter', 'JOURNEYMAN');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Blacksmith', 'JOURNEYMAN');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Scribe', 'JOURNEYMAN');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Baker', 'JOURNEYMAN');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Weaver', 'JOURNEYMAN');
-- EXPERT
INSERT INTO professions (profession_id, mastery_level) VALUES ('Carpenter', 'EXPERT');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Blacksmith', 'EXPERT');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Scribe', 'EXPERT');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Baker', 'EXPERT');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Weaver', 'EXPERT');
-- MASTER
INSERT INTO professions (profession_id, mastery_level) VALUES ('Carpenter', 'MASTER');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Blacksmith', 'MASTER');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Scribe', 'MASTER');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Baker', 'MASTER');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Weaver', 'MASTER');
-- GRAND_MASTER
INSERT INTO professions (profession_id, mastery_level) VALUES ('Carpenter', 'GRAND_MASTER');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Blacksmith', 'GRAND_MASTER');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Scribe', 'GRAND_MASTER');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Baker', 'GRAND_MASTER');
INSERT INTO professions (profession_id, mastery_level) VALUES ('Weaver', 'GRAND_MASTER');


-- Backgrounds
-- Wealthy
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Soldier', 'European', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Noble', 'European', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Guild Artisan', 'European', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('City Watch', 'Arabic', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Merchant', 'Arabic', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Courtier', 'Arabic', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Folk Hero', 'Sylvan', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Sage', 'Sylvan', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Priest', 'Sylvan', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Acolyte', 'Dwarven', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Miner', 'Dwarven', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Engineer', 'Dwarven', 'WEALTHY');

-- Middle Class
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Entertainer', 'European', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Criminal', 'European', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Sailor', 'European', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Scholar', 'Arabic', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Mercenary', 'Arabic', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Artisan', 'Arabic', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Hermit', 'Sylvan', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Druid', 'Sylvan', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Ranger', 'Sylvan', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Barkeep', 'Dwarven', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Blacksmith', 'Dwarven', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Brewer', 'Dwarven', 'MIDDLE_CLASS');

-- Poor
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Urchin', 'European', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Beggar', 'European', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Thief', 'European', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Alchemist', 'Arabic', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Street Urchin', 'Arabic', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Nomad', 'Arabic', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Guild Artisan', 'SLYVAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Soldier', 'SLYVAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Urchin', 'SLYVAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Charlatan', 'DWARVEN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Outlander', 'DWARVEN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Sage', 'DWARVEN', 'POOR');

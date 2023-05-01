-- Names
-- Modern English names
INSERT INTO names (name_id, name_origin) VALUES ('William', 'MOD_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Elizabeth', 'MOD_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Henry', 'MOD_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Charlotte', 'MOD_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('George', 'MOD_ENG');
-- Middle English names
INSERT INTO names (name_id, name_origin) VALUES ('Alice', 'MID_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Richard', 'MID_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Margaret', 'MID_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('John', 'MID_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Catherine', 'MID_ENG');
-- Old English names
INSERT INTO names (name_id, name_origin) VALUES ('Æthelred', 'OLD_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Æthelstan', 'OLD_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Godwin', 'OLD_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Leofric', 'OLD_ENG');
INSERT INTO names (name_id, name_origin) VALUES ('Ealdred', 'OLD_ENG');
-- Norse names
INSERT INTO names (name_id, name_origin) VALUES ('Thor', 'NORSE');
INSERT INTO names (name_id, name_origin) VALUES ('Freya', 'NORSE');
INSERT INTO names (name_id, name_origin) VALUES ('Astrid', 'NORSE');
INSERT INTO names (name_id, name_origin) VALUES ('Erik', 'NORSE');
INSERT INTO names (name_id, name_origin) VALUES ('Harald', 'NORSE');
-- Arabic names
INSERT INTO names (name_id, name_origin) VALUES ('Aisha', 'ARABIC');
INSERT INTO names (name_id, name_origin) VALUES ('Fatima', 'ARABIC');
INSERT INTO names (name_id, name_origin) VALUES ('Ali', 'ARABIC');
INSERT INTO names (name_id, name_origin) VALUES ('Yusuf', 'ARABIC');
INSERT INTO names (name_id, name_origin) VALUES ('Omar', 'ARABIC');


-- Species
INSERT INTO species (species_id, description) VALUES ('HUMAN', 'A versatile species known for their adaptability and ingenuity.');
INSERT INTO species (species_id, description) VALUES ('ELF', 'A graceful and magical species with a deep connection to nature.');
INSERT INTO species (species_id, description) VALUES ('DWARF', 'A tough and hardy species with a love of mining and craftsmanship.');
INSERT INTO species (species_id, description) VALUES ('HALFING', 'A small and nimble species with a talent for thievery and mischief.');
INSERT INTO species (species_id, description) VALUES ('GNOME', 'A curious and inventive species with a passion for tinkering and invention.');
INSERT INTO species (species_id, description) VALUES ('TIEFLING', 'A mysterious and alluring species with infernal ancestry and dark powers.');


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
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Soldier', 'EUROPEAN', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Noble', 'EUROPEAN', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Guild Artisan', 'EUROPEAN', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('City Watch', 'ARABIC', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Merchant', 'ARABIC', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Courtier', 'ARABIC', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Folk_Hero', 'SYLVAN', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Sage', 'SYLVAN', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Priest', 'SYLVAN', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Acolyte', 'DWARVEN', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Miner', 'DWARVEN', 'WEALTHY');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Engineer', 'DWARVEN', 'WEALTHY');

-- Middle Class
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Entertainer', 'EUROPEAN', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Criminal', 'EUROPEAN', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Sailor', 'EUROPEAN', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Scholar', 'ARABIC', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Mercenary', 'ARABIC', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Artisan', 'ARABIC', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Hermit', 'SYLVAN', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Druid', 'SYLVAN', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Ranger', 'SYLVAN', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Barkeep', 'DWARVEN', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Blacksmith', 'DWARVEN', 'MIDDLE_CLASS');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Brewer', 'DWARVEN', 'MIDDLE_CLASS');

-- Poor
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Urchin', 'EUROPEAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Beggar', 'EUROPEAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Thief', 'EUROPEAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Alchemist', 'ARABIC', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Street Urchin', 'ARABIC', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Nomad', 'ARABIC', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Guild Artisan', 'SYLVAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Soldier', 'SYLVAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Urchin', 'SYLVAN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Charlatan', 'DWARVEN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Outlander', 'DWARVEN', 'POOR');
INSERT INTO backgrounds (background_id, ethnicity, status) VALUES ('Sage', 'DWARVEN', 'POOR');

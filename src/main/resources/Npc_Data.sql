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
INSERT INTO professions (profession_id) VALUES ('BLACKSMITH');
INSERT INTO professions (profession_id) VALUES ('BAKER');
INSERT INTO professions (profession_id) VALUES ('FARMER');
INSERT INTO professions (profession_id) VALUES ('FISHERMAN');
INSERT INTO professions (profession_id) VALUES ('HUNTER');
INSERT INTO professions (profession_id) VALUES ('TRADER');
INSERT INTO professions (profession_id) VALUES ('MERCHANT');
INSERT INTO professions (profession_id) VALUES ('MINER');
INSERT INTO professions (profession_id) VALUES ('CARPENTER');
INSERT INTO professions (profession_id) VALUES ('PAINTER');
INSERT INTO professions (profession_id) VALUES ('POTTER');
INSERT INTO professions (profession_id) VALUES ('TAILOR');
INSERT INTO professions (profession_id) VALUES ('CHEF');
INSERT INTO professions (profession_id) VALUES ('BREWER');
INSERT INTO professions (profession_id) VALUES ('WEAVER');
INSERT INTO professions (profession_id) VALUES ('ARTIST');
INSERT INTO professions (profession_id) VALUES ('MUSICIAN');
INSERT INTO professions (profession_id) VALUES ('ACTOR');
INSERT INTO professions (profession_id) VALUES ('DOCTOR');
INSERT INTO professions (profession_id) VALUES ('PRIEST');


-- Backgrounds
INSERT INTO backgrounds (background_id) VALUES ('ACOLYTE');
INSERT INTO backgrounds (background_id) VALUES ('CRIMINAL');
INSERT INTO backgrounds (background_id) VALUES ('FOLK_HERO');
INSERT INTO backgrounds (background_id) VALUES ('GUILD_ARTISAN');
INSERT INTO backgrounds (background_id) VALUES ('HERMIT');
INSERT INTO backgrounds (background_id) VALUES ('NOBLE');
INSERT INTO backgrounds (background_id) VALUES ('OUTLANDER');
INSERT INTO backgrounds (background_id) VALUES ('SAGE');
INSERT INTO backgrounds (background_id) VALUES ('SAILOR');
INSERT INTO backgrounds (background_id) VALUES ('SOLDIER');


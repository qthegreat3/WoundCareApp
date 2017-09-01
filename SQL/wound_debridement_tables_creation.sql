create table debridement
(
	id int not null auto_increment,
	date_obtained date,
	health_care_surrogate_name varchar(50),
	pre_debridement_depth int,
	pre_debridement_stage int,
	post_debridement_depth int,
	post_debridement_stage int,
	constraint debridement_pk PRIMARY KEY (id)
);

create table debridement_risk_benefits
(
  debridement_id int,
  risk_benefits varchar(250),
  CONSTRAINT debridement_risk_benefits_pk PRIMARY KEY (debridement_id, risk_benefits),
  CONSTRAINT FK_debridement_risk_benefits
      FOREIGN KEY (debridement_id) REFERENCES debridement (id),
  CONSTRAINT FK_risk_benefits
      FOREIGN KEY (risk_benefits) REFERENCES risk_benefits (name)
);

create table debridement_tissue
(
  name varchar(50),
  CONSTRAINT debridement_tissue_pk PRIMARY KEY (name)
);

create table debridement_tissues
(
  debridement_id int,
  debridement_tissue varchar(50),
  CONSTRAINT debridement_tissues_pk PRIMARY KEY (debridement_id, debridement_tissue),
  CONSTRAINT FK_debridement_tissues
      FOREIGN KEY (debridement_id) REFERENCES debridement (id),
  CONSTRAINT FK_debridement_tissue
      FOREIGN KEY (debridement_tissue) REFERENCES debridement_tissue (name)
);

create table indications
(
  name varchar(250),
  CONSTRAINT indications_pk PRIMARY KEY (name)
);

create table debridement_indications
(
  debridement_id int,
  indication varchar(250),
  CONSTRAINT debridement_indications_pk PRIMARY KEY (debridement_id, indication),
  CONSTRAINT FK_debridement_indications
      FOREIGN KEY (debridement_id) REFERENCES debridement (id),
  CONSTRAINT FK_indications
      FOREIGN KEY (indication) REFERENCES indications (name)
);

create table anesthesia
(
  name varchar(50),
  CONSTRAINT anesthesia_pk PRIMARY KEY (name)
);

create table debridement_anesthesias
(
  debridement_id int,
  anesthesia varchar(50),
  CONSTRAINT debridement_anesthesias_pk PRIMARY KEY (debridement_id, anesthesia),
  CONSTRAINT FK_debridement_anesthesia
      FOREIGN KEY (debridement_id) REFERENCES debridement (id),
  CONSTRAINT FK_anesthesia
      FOREIGN KEY (anesthesia) REFERENCES anesthesia (name)
);

create table instruments
(
  name varchar(50),
  CONSTRAINT instruments_pk PRIMARY KEY (name)
);

create table debridement_instruments
(
  debridement_id int,
  instrument varchar(50),
  CONSTRAINT debridement_instruments_pk PRIMARY KEY (debridement_id, instrument),
  CONSTRAINT FK_debridement_instruments
      FOREIGN KEY (debridement_id) REFERENCES debridement (id),
  CONSTRAINT FK_instruments
      FOREIGN KEY (instruments) REFERENCES instruments (name)
);

create table complications
(
  name varchar(50),
  CONSTRAINT complications_pk PRIMARY KEY (name)
);

create table debridement_complications
(
  debridement_id int,
  complication varchar(50),
  CONSTRAINT debridement_complications_pk PRIMARY KEY (debridement_id, complication),
  CONSTRAINT FK_debridement_complications
      FOREIGN KEY (debridement_id) REFERENCES debridement (id),
  CONSTRAINT FK_complications
      FOREIGN KEY (complications) REFERENCES complications (name)
);

create table disposition
(
  name varchar(250),
  CONSTRAINT disposition_pk PRIMARY KEY (name)
);

create table debridement_dispositions
(
  debridement_id int,
  disposition varchar(250),
  CONSTRAINT debridement_disposition_pk PRIMARY KEY (debridement_id, disposition),
  CONSTRAINT FK_debridement_disposition
      FOREIGN KEY (debridement_id) REFERENCES debridement (id),
  CONSTRAINT FK_disposition
      FOREIGN KEY (disposition) REFERENCES disposition (name)
);

create table cauterization_options
(
  name varchar(50),
  CONSTRAINT cauterization_options_pk PRIMARY KEY (name)
);

create table debridement_cauterization_options
(
  debridement_id int,
  cauterization_option varchar(50),
  CONSTRAINT debridement_cauterization_options_pk PRIMARY KEY (debridement_id, cauterization_option),
  CONSTRAINT FK_debridement_cauterization_options
      FOREIGN KEY (debridement_id) REFERENCES debridement (id),
  CONSTRAINT FK_cauterization_options
      FOREIGN KEY (cauterization_option) REFERENCES cauterization_options (name)
);

create table pressure_stage
(
  name varchar(50),
  CONSTRAINT pressure_stage_pk PRIMARY KEY (name)
);

create table arterial
(
  name varchar(50),
  pressure_stage_id varchar(50),
  CONSTRAINT arterial_pk PRIMARY KEY (name),
    constraint FK_pressure_stage
	FOREIGN KEY (pressure_stage_id) REFERENCES pressure_stage (name)
);

create table location
(
  name varchar(50),
  CONSTRAINT location_pk PRIMARY KEY (name)
);



create table wound_description
(
  name varchar(50),
  CONSTRAINT wound_description_pk PRIMARY KEY (name)
);



create table wound_objective
(
  name varchar(50),
  CONSTRAINT wound_objective_pk PRIMARY KEY (name)
);



create table exudate
(
  name varchar(50),
  CONSTRAINT exudate_pk PRIMARY KEY (name)
);


create table amount
(
  name varchar(50),
  CONSTRAINT amount_pk PRIMARY KEY (name)
);

create table other_wound_tissue
(
  name varchar(50),
  CONSTRAINT other_wound_tissue_pk PRIMARY KEY (name)
);

create table periwound
(
  name varchar(50),
  CONSTRAINT periwound_pk PRIMARY KEY (name)
);



create table blister
(
  name varchar(50),
  CONSTRAINT blister_pk PRIMARY KEY (name)
);



create table dressings
(
  name varchar(50),
  CONSTRAINT dressings_pk PRIMARY KEY (name)
);



create table recommendations
(
  name varchar(250),
  CONSTRAINT recommendations_pk PRIMARY KEY (name)
);



create table source_of_history
(
  name varchar(250),
  CONSTRAINT source_of_history_pk PRIMARY KEY (name)
);

create table follow_up_ranges
(
  name varchar(50),
  CONSTRAINT follow_up_ranges_pk PRIMARY KEY (name)
);

create table frequency
(
  name varchar(50),
  CONSTRAINT frequency_pk PRIMARY KEY (name)
);

create table wounds
(
	id int not null auto_increment,
	tissue_eschar_percentage int,
	tissue_necrotic_percentage int,
	tissue_granulation_percentage int,
	other_wound_tissue_name varchar(50),
	other_tissue_percentage int,
	skin_percentage int,
	hasScab bit(1),
	duration int,
	stage int,
	length float(4,2),
	width float(4,2),
	depth float(4,2),
	hasDebridement bit(1),
	debridement_id int,	
	hasBiopsy bit(1)
	hasCauterization bit(1),
	blister varchar(50),
	follow_up_range varchar(50),
	source_of_history varchar(250),
	frequency varchar(50),
	amount varchar(50),
	constraint wounds_pk PRIMARY KEY (id),
	constraint FK_debridement_wound
		FOREIGN KEY (debridement_id) REFERENCES debridement (id),
	constraint FK_other_wound_tissue
		FOREIGN KEY (other_wound_tissue_name) REFERENCES other_wound_tissue (name),
	constraint FK_follow_up_ranges
		FOREIGN KEY (follow_up_range) REFERENCES follow_up_ranges (name),
	constraint FK_source_of_history
		FOREIGN KEY (source_of_history) REFERENCES source_of_history (name),
	constraint FK_amount
		FOREIGN KEY (amount) REFERENCES amount(name),
	constraint FK_frequency
		FOREIGN KEY (frequency) REFERENCES frequency (name),		
	constraint FK_blister
		FOREIGN KEY (blister) REFERENCES blister (name)		
);

create table wound_recommendations
(
  wound_id int,
  recommendations_id varchar(50),
  CONSTRAINT wound_recommendations_pk PRIMARY KEY (wound_id, recommendations_id),
  CONSTRAINT FK_wound_recommendations
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_recommendations
      FOREIGN KEY (recommendations_id) REFERENCES recommendations (name)
);

create table wound_dressings_to_continue
(
  wound_id int,
  dressings_id varchar(50),
  CONSTRAINT wound_dressings_to_continue_pk PRIMARY KEY (wound_id, dressings_id),
  CONSTRAINT FK_wound_dressings_to_continue
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_dressings_continue
      FOREIGN KEY (dressings_id) REFERENCES dressings (name)
);

create table wound_dressings_to_discontinue
(
  wound_id int,
  dressings_id varchar(50),
  CONSTRAINT wound_dressings_to_discontinue_pk PRIMARY KEY (wound_id, dressings_id),
  CONSTRAINT FK_wound_dressings_to_discontinue
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_dressings_discontinue
      FOREIGN KEY (dressings_id) REFERENCES dressings (name)
);

create table wound_dressings_to_start
(
  wound_id int,
  dressings_id varchar(50),
  CONSTRAINT wound_dressings_to_start_pk PRIMARY KEY (wound_id, dressings_id),
  CONSTRAINT FK_wound_dressings_to_start
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_dressings_start
      FOREIGN KEY (dressings_id) REFERENCES dressings (name)
);

create table wound_blister
(
  wound_id int,
  blister_id varchar(50),
  CONSTRAINT wound_blister_pk PRIMARY KEY (wound_id, blister_id),
  CONSTRAINT FK_wound_blister
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_blister
      FOREIGN KEY (blister_id) REFERENCES blister (name)
);

create table wound_arterials
(
  wound_id int,
  arterial varchar(50),
  CONSTRAINT wound_arterials_pk PRIMARY KEY (wound_id, arterial),
  CONSTRAINT FK_wound_arterials
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_arterial
      FOREIGN KEY (arterial) REFERENCES arterial (name)
);

create table wound_locations
(
  wound_id int,
  location varchar(50),
  CONSTRAINT wound_location_pk PRIMARY KEY (wound_id, location),
  CONSTRAINT FK_wound_location
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_location
      FOREIGN KEY (location) REFERENCES location (name)
);

create table wound_descriptions
(
  wound_id int,
  wound_description varchar(50),
  CONSTRAINT wound_description_pk PRIMARY KEY (wound_id, wound_description),
  CONSTRAINT FK_wound_descriptions
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_description
      FOREIGN KEY (wound_description) REFERENCES wound_description (name)
);

create table wound_objectives
(
  wound_id int,
  wound_objective_id varchar(50),
  CONSTRAINT wound_objective_pk PRIMARY KEY (wound_id, wound_objective_id),
  CONSTRAINT FK_wound_objectivess
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_wound_objective
      FOREIGN KEY (wound_objective_id) REFERENCES wound_objective (name)
);

create table wound_exudates
(
  wound_id int,
  exudate_id varchar(50),
  CONSTRAINT wound_exudates_pk PRIMARY KEY (wound_id, exudate_id),
  CONSTRAINT FK_wound_exudate
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_exudate
      FOREIGN KEY (exudate_id) REFERENCES exudate (name)
);

create table wound_periwound
(
  wound_id int,
  periwound_id varchar(50),
  CONSTRAINT wound_periwound_pk PRIMARY KEY (wound_id, periwound_id),
  CONSTRAINT FK_wound_periwound
      FOREIGN KEY (wound_id) REFERENCES wounds (id),
  CONSTRAINT FK_periwound
      FOREIGN KEY (periwound_id) REFERENCES periwound (name)
);
CREATE TABLE "myflix"."movie"(
	"id_movie" uuid,
	"name" text,
	"year" int,
	PRIMARY KEY("id_movie"))
WITH default_time_to_live = 0 AND CUSTOM_PROPERTIES = {
	'capacity_mode':{
		'throughput_mode':'PAY_PER_REQUEST'
	}, 
	'encryption_specification':{
		'encryption_type':'AWS_OWNED_KMS_KEY'
	}
};

CREATE TABLE "myflix"."actor"(
	"id_actor" uuid,
	"name" text,
	"birth_date" bigint,
	PRIMARY KEY("id_actor"))
WITH default_time_to_live = 0 AND CUSTOM_PROPERTIES = {
	'capacity_mode':{
		'throughput_mode':'PAY_PER_REQUEST'
	}, 
	'encryption_specification':{
		'encryption_type':'AWS_OWNED_KMS_KEY'
	}
};

CREATE TABLE "myflix"."character"(
	"id_movie" uuid,
	"id_actor" uuid,
	"name" text,
	PRIMARY KEY(("id_movie", "id_actor")))
WITH default_time_to_live = 0 AND CUSTOM_PROPERTIES = {
	'capacity_mode':{
		'throughput_mode':'PAY_PER_REQUEST'
	}, 
	'encryption_specification':{
		'encryption_type':'AWS_OWNED_KMS_KEY'
	}
};

CREATE TABLE "myflix"."watch"(
	"id_customer" uuid,
	"id_movie" uuid,
	"date" bigint,
	PRIMARY KEY(("id_customer", "id_movie", "date")))
WITH default_time_to_live = 0 AND CUSTOM_PROPERTIES = {
	'capacity_mode':{
		'throughput_mode':'PAY_PER_REQUEST'
	}, 
	'encryption_specification':{
		'encryption_type':'AWS_OWNED_KMS_KEY'
	}
};

CREATE TABLE "myflix"."customer"(
	"id_customer" uuid,
	"name" text,
	"birth_date" bigint,
	PRIMARY KEY("id_customer"))
WITH default_time_to_live = 0 AND CUSTOM_PROPERTIES = {
	'capacity_mode':{
		'throughput_mode':'PAY_PER_REQUEST'
	}, 
	'encryption_specification':{
		'encryption_type':'AWS_OWNED_KMS_KEY'
	}
};

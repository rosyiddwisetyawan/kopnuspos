-- Database: postgres

-- DROP DATABASE IF EXISTS postgres;

CREATE DATABASE postgres
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_Indonesia.1252'
    LC_CTYPE = 'English_Indonesia.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE postgres
    IS 'default administrative connection database';
	
-- Table: public.tbl_task

-- DROP TABLE IF EXISTS public.tbl_task;

CREATE TABLE IF NOT EXISTS public.tbl_task
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    judul character varying(200) COLLATE pg_catalog."default",
    deskripsi character varying(200) COLLATE pg_catalog."default",
    waktu timestamp with time zone,
    CONSTRAINT tbl_task_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_task
    OWNER to postgres;
	

-- Table: public.tbl_user

-- DROP TABLE IF EXISTS public.tbl_user;

CREATE TABLE IF NOT EXISTS public.tbl_user
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    username character varying(200) COLLATE pg_catalog."default",
    password character varying(200) COLLATE pg_catalog."default",
    CONSTRAINT tbl_user_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_user
    OWNER to postgres;
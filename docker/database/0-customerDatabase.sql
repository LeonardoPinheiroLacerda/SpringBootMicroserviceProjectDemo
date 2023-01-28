CREATE USER customer 
    WITH 
    PASSWORD 'unidunite' 
    CREATEDB;

CREATE DATABASE customer
    WITH
    OWNER = customer
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    CONNECTION LIMIT = -1;
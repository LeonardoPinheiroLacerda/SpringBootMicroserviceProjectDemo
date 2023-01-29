CREATE USER fraud 
    WITH 
    PASSWORD 'unidunite' 
    CREATEDB;

CREATE DATABASE fraud
    WITH
    OWNER = fraud
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    CONNECTION LIMIT = -1;
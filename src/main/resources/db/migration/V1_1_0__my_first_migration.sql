-- Create schema

CREATE SCHEMA wedding AUTHORIZATION databaseUser;

CREATE TABLE IF NOT EXISTS Person (

    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    rsvp INT

);
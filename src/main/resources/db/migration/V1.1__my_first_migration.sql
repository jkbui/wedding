-- Create schema

CREATE SCHEMA wedding AUTHORIZATION databaseUser;

CREATE TABLE IF NOT EXISTS Person (

    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    rsvp INT

);
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE products(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(50),
    description VARCHAR(100),
    price REAL,
    category VARCHAR(50),
    stock INTEGER,
    image_url VARCHAR
);
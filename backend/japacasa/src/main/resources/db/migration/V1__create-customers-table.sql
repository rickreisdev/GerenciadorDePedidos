CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE customers(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(100),
    phone VARCHAR(40),
    created_at DATE
);
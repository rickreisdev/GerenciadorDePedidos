CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE address(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    street VARCHAR(100),
    number VARCHAR(10),
    neighborhood VARCHAR(100),
    extra_info VARCHAR(100),
    zip_code VARCHAR(10),
    customer_id UUID,
    FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
);
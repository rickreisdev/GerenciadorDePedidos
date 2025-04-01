CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE orders(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    order_date DATE,
    total REAL,
    delivery_price REAL,
    status VARCHAR(20),
    payment_method VARCHAR(30),
    customer_id UUID,
    address_id UUID,
    FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE,
    FOREIGN KEY (address_id) REFERENCES address(id) ON DELETE CASCADE
);
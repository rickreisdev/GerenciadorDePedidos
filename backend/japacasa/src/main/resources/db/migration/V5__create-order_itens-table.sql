CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE order_itens(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    order_id UUID,
    product_id UUID,
    quantity INTEGER,
    sub_total REAL,
    FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE,
    FOREIGN KEY (product_id) REFERENCES products(id) ON DELETE CASCADE
);
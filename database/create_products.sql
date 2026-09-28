CREATE TABLE products (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    marketplace_product_id TEXT UNIQUE NOT NULL,
    price NUMERIC(12,2) NOT NULL CHECK (price >= 0),
    product_name TEXT NOT NULL,
    listed_at TIMESTAMPTZ,
    created_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,
    category TEXT NOT NULL,
    description TEXT,
    quantity INTEGER NOT NULL CHECK (quantity >= 0)
);
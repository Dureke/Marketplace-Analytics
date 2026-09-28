CREATE TABLE sales (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    product_id BIGINT NOT NULL REFERENCES products(id),
    num_sold INTEGER NOT NULL CHECK (num_sold > 0),
    sold_at TIMESTAMPTZ NOT NULL,
    sale_price NUMERIC(12,2) NOT NULL CHECK (sale_price >= 0)
)
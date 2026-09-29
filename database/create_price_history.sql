CREATE TABLE price_history (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    product_id BIGINT NOT NULL REFERENCES products(id),
    price NUMERIC(12,2) NOT NULL CHECK (price >= 0),
    recorded_at TIMESTAMPTZ NOT NULL
);
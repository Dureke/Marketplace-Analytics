## Sales Design

| Item             | Required | SQL Type                                        |
| ---------------- | -------- | ----------------------------------------------- |
| id (primary key) | yes      | BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY |
| sale_price       | yes      | NUMERIC(12,2) NOT NULL CHECK (sale_price >= 0)  |
| sold_at          | yes      | TIMESTAMPTZ NOT NULL                            |
| num_sold         | yes      | INTEGER NOT NULL CHECK (num_sold > 0)           |
| product_id      | yes      | BIGINT NOT NULL REFERENCES products(id)         |
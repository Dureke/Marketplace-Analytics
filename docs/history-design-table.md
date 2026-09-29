## Price History Design

| Item             | Required | SQL Type                                        |
| ---------------- | -------- | ----------------------------------------------- |
| id (primary key) | yes      | BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY |
| product_id       | yes      | BIGINT NOT NULL REFERENCES products(id)         |
| recorded_at      | yes      | TIMESTAMPTZ NOT NULL                            |
| price            | yes      | NUMERIC(12,2) NOT NULL CHECK (price >= 0)       |
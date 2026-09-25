## PRODUCTS TABLE

| Item                   | Required | SQL Type                                        |
| ---------------------- | -------- | ----------------------------------------------- |
| id (primary key)       | yes      | BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY |
| marketplace_product_id | yes      | TEXT UNIQUE NOT NULL                            |
| price                  | yes      | NUMERIC(12,2) NOT NULL CHECK (price >= 0)       |
| product_name           | yes      | TEXT NOT NULL                                   |
| listed_at              | no       | TIMESTAMPTZ            |
| created_at             | yes      | TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP  |
| category               | yes      | TEXT NOT NULL                                   |
| description            | no       | TEXT                                            |
| quantity               | yes      | INTEGER NOT NULL CHECK (quantity >= 0)          |
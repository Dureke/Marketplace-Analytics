INSERT INTO price_history (
    product_id,
    price,
    recorded_at
)
VALUES (
    1,
    19.99,
    CURRENT_TIMESTAMP
);

INSERT INTO price_history (
    product_id,
    price,
    recorded_at
)
VALUES (
    999999,
    19.99,
    CURRENT_TIMESTAMP
);

INSERT INTO price_history (
    product_id,
    price,
    recorded_at
)
VALUES (
    1,
    -10.00,
    CURRENT_TIMESTAMP
);

SELECT * FROM price_history;
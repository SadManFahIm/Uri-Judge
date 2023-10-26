SELECT id, name
FROM customers c
WHERE NOT EXISTS (
    SELECT 1
    FROM locations l
    WHERE c.id = l.id_customers
);

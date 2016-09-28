-- #1
SELECT * FROM northwind.customers;

-- #2
SELECT DISTINCT
country_region FROM customers;

--#3
SELECT * FROM northwind.customers
WHERE last_name >= 'Bl';

--#4
SELECT * FROM northwind.orders
LIMIT 0, 10;

--#5
SELECT * FROM northwind.customers
WHERE zip_postal_code = '1010'
OR zip_postal_code = '3012'
OR zip_postal_code = '99999'
OR zip_postal_code = '12209'
OR zip_postal_code = '05023';

--#6
SELECT * FROM northwind.orders
WHERE ship_country_region IS NOT NULL;

--#7
SELECT * FROM northwind.customers
ORDER BY country_region, city;

--#8
INSERT INTO customers (company, last_name, first_name, email_address, city)
VALUES ('Company DD', 'Martin', 'Thomas', 't360@hotmail.com', 'Detroit');

--#9
UPDATE orders
SET ship_zip_postal_code = '97201'
WHERE ship_city = 'Portland';

--#10
DELETE FROM northwind.order_details
WHERE quantity = 1;

--#11
SELECT AVG(quantity)
FROM order_details;

SELECT MAX(quantity)
FROM order_details;

SELECT MIN(quantity)
FROM order_details;

--#12
SELECT AVG(quantity)
FROM order_details
group by order_id;

SELECT MAX(quantity)
FROM order_details
group by order_id;

SELECT MIN(quantity)
FROM order_details
group by order_id;

--#13 Find the CustomerID that placed order id 65
SELECT id, customer_id FROM northwind.orders
WHERE id = 65;

--#14 Hint: this is three separate queries.

--#15 Get employees’ firstname for all employees who have NO (i.e. NULL) notes.


--#16 Get ship city for all orders for which the customer’s first name is Francisco


--#17


--#18


--#19
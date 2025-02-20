-- Que-1
select p.category,SUM(od.price * od.quantity) from products as p 
JOIN orderdetails as od ON p.productid = od.productid
group by p.category;

-- Que-2
select sum(o.totalamount) as total,customers.customername from orders as o 
JOIN customers ON customers.customerid = o.customerid 
group by customers.customername
order by total DESC LIMIT 5;

-- Que-3
select EXTRACT(MONTH FROM Orderdate) as m from orders;

with monthsales as (
select EXTRACT(MONTH FROM Orderdate) as m,
sum(totalamount) as r from orders 
group by m
),
salesgrowth as(
select m,
	r,
	lag(r) Over(order by m) as pmr
	from monthsales
)
select m,r,pmr,Round(((r-pmr)/pmr)*100,2) AS growthrate
from salesgrowth

-- Que-4
select c.customerId,c.customername, AVG(o.totalamount) AS average_order_value
from orders o
JOIN customers as c ON o.customerid = c.customerid
Group by c.customerId,c.customername order by average_order_value

-- que-5
select p.productname from products as p JOIN orderdetails as o
ON p.productid = o.orderid where 
o.quantity < p.stockquantity

-- que-6
select COUNT(o.productid) as count,p.productname as p from  orderdetails o
JOIN products as p ON o.productid = p.productid
group by p.productid order by count desc limit 1;

-- que-7

select *from products
select *from orderdetails
select *from customers;
select *from orders;
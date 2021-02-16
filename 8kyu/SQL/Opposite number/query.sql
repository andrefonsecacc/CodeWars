-- You will be given a table: "opposite", with a column: "number". Return a table with a column: "res".
--SELECT
--CASE
--WHEN number > 0 THEN number*(-1)
--ELSE number*-1
--END AS res
--FROM opposite

SELECT 
number * (-1) as res
FROM
opposite
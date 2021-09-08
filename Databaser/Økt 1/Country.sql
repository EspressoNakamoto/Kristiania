SELECT *
FROM city;

SELECT *
FROM city
WHERE CountryCode = "NOR";

SELECT Name, Population
FROM city
WHERE CountryCode = "NOR";

SELECT count(*)
FROM country;

SELECT sum(Population) as WorldPopulation
FROM country;

SELECT sum(Population)
FROM country
WHERE Continent = "Asia";

SELECT Name, SurfaceArea
FROM country
ORDER BY SurfaceArea ASC;

SELECT Name, LifeExpectancy, Population
FROM country
ORDER BY LifeExpectancy DESC, Population ASC;

SELECT *
from country;
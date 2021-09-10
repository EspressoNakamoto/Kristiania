SELECT Name, Population / SurfaceArea AS PopulationDensity
FROM country
ORDER BY PopulationDensity DESC;

SELECT Continent, SUM(Population) AS ContinentPopulation
FROM country
GROUP BY Continent
ORDER BY ContinentPopulation DESC;

SELECT SUM(Population)
FROM country;

SELECT Code, Name, IndepYear
FROM country
WHERE IndepYear IS NOT NULL
ORDER BY IndepYear, Name;

SELECT Code
FROM country
WHERE Code LIKE '_W_';

SELECT Name
FROM country
WHERE Name LIKE 'N%' 
	OR Name LIKE 'O%' 
	OR Name LIKE 'P%'
ORDER BY Name;

SELECT *
FROM countrylanguage
WHERE IsOfficial = 'T' 
	AND Percentage > 99
ORDER BY Percentage DESC, Language ASC;

SELECT Code, Name, Continent
FROM country
WHERE Continent IN ('North America', 'South America')
ORDER BY Code;

SELECT Continent, COUNT(*) AS NumberOfCountries
FROM country
GROUP BY Continent;

SELECT Continent, COUNT(*) AS NumberOfCountries
FROM country
GROUP BY Continent
HAVING NumberOfCountries >= 30
ORDER BY NumberOfCountries DESC;
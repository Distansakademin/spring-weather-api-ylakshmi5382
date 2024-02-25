-- Create the weather database
CREATE DATABASE IF NOT EXISTS weather;

-- Use the weather database
USE weather;

-- Create the weathertoday table
CREATE TABLE weathertoday (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  country VARCHAR(255) NOT NULL,
  city VARCHAR(255) NOT NULL,
  todayTempurature DECIMAL(5, 2) NOT NULL,
  UNIQUE KEY (country, city)
);

-- Sample data (replace with your actual data source)
DECLARE countries VARCHAR(255)[] := ('USA', 'Canada', 'France', 'Germany', 'Italy', 'Spain', 'China', 'Japan', 'India', 'Australia');

-- Insert data with conditional logic to ensure distinctness
INSERT INTO weathertoday (id, country, city, todayTempurature)
SELECT @i + 1 AS id, c.country, c.city, FLOOR(RAND() * 40 - 10) AS temp
FROM (
  SELECT DISTINCT country, city
  FROM (
    -- Generate 100 random combinations of country and city
    SELECT c1.country, c2.city
    FROM countries c1
    CROSS JOIN (
      SELECT city FROM (
        SELECT DISTINCT city FROM weathertoday -- Exclude existing cities
      ) AS existing_cities
      UNION ALL
      SELECT DISTINCT city FROM (
        SELECT SUBSTRING_INDEX(city, ',', 1) AS city
        FROM weathertoday WHERE city LIKE '%,' -- Extract cities with comma separation (if applicable)
      ) AS extracted_cities
    ) AS c2
    ORDER BY RAND()
    LIMIT 100
  ) AS combined_data
) AS distinct_data
JOIN countries c ON c.country = distinct_data.country
ORDER BY RAND()
LIMIT 10; -- Insert only 10 distinct entries

SET @i := @i + 1;
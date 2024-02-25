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
DECLARE country_names VARCHAR(255)[] := ('USA', 'Canada', 'France', 'Germany', 'Italy', 'Spain', 'China', 'Japan', 'India', 'Australia');
DECLARE city_names VARCHAR(255)[][2] := (
    ('New York', 'Los Angeles'),
    ('Toronto', 'Vancouver'),
    ('Paris', 'Lyon'),
    ('Berlin', 'Munich'),
    ('Rome', 'Milan'),
    ('Madrid', 'Barcelona'),
    ('Beijing', 'Shanghai'),
    ('Tokyo', 'Osaka'),
    ('Delhi', 'Mumbai'),
    ('Sydney', 'Melbourne')
);

-- Loop through countries and cities to insert data

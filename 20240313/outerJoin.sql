CREATE TABLE right_table (
id INT PRIMARY KEY,
text_r VARCHAR(10),
foreign_key INT
);

CREATE TABLE left_table (
id INT PRIMARY KEY,
text_l VARCHAR(10),
foreign_key INT
);

SELECT text_l, text_r 
FROM left_table l 
JOIN right_table r ON l.foreign_key = r.foreign_key;

SELECT text_l, text_r 
FROM left_table l 
JOIN right_table r ON l.foreign_key = r.foreign_key;

SELECT text_l, text_r 
FROM left_table l 
LEFT OUTER JOIN right_table r ON l.foreign_key = r.foreign_key;

SELECT text_l, text_r 
FROM left_table l 
FULL OUTER JOIN right_table r ON l.foreign_key = r.foreign_key;


INSERT INTO right_table VALUES(1, 'aaa', 1);
INSERT INTO right_table VALUES(2, 'bbb', 2);
INSERT INTO right_table VALUES(3, 'ddd', 4);
INSERT INTO right_table VALUES(4, 'fff', 6);

INSERT INTO left_table VALUES(1, 'AAA', 1);
INSERT INTO left_table VALUES(2, 'CCC', 3);
INSERT INTO left_table VALUES(3, 'DDD', 4);
INSERT INTO left_table VALUES(4, 'EEE', 5);
INSERT INTO left_table VALUES(5, 'GGG', 7);

SELECT * FROM right_table;
SELECT * FROM left_table;

DELETE FROM right_table;
DELETE FROM left_table;

DROP TABLE right_table;
DROP TABLE left_table;
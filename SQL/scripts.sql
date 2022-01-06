INSERT INTO post(body, title)
VALUES ('test title 1', 'test body 1'),
       ('test title 2', 'test body 2'),
       ('test title 3', 'test body 3'),
       ('test title 4', 'test body 4'),
       ('test title 5', 'test body 5'),
       ('test title 6', 'test body 6'),
       ('test title 7', 'test body 7'),
       ('test title 8', 'test body 8'),
       ('test title 9', 'test body 9'),
       ('test title 10', 'test body 10');


INSERT INTO owners(name)
VALUES ('Nick Adams'),
       ('Jackie Dallas'),
       ('Ian McConihay'),
       ('Adamina Flores');


INSERT INTO car(description, make, model)
VALUES ('New', 'Chevy', 'Corvette'),
       ('used', 'Ford', 'Mustang'),
       ('slightly used', 'Tesla', 'Model 3'),
       ('old', 'Honda', 'Accord');


INSERT INTO owners_vehicle(owner_id, vehicle_id)
VALUES (1, 4),
       (2, 2),
       (3, 1),
       (4, 3);

-- Insert doctors into the doctor table
INSERT INTO doctor (name, specialization, contact_number, email)
VALUES
    ('Dr. S. Akhil Kumar', 'Cardiologist', '1234567890', 'akhil.kumar@hm.com'),
    ('Dr. K. Manish Ram Kumar', 'Dermatologist', '2345678901', 'manish.ramkumar@hm.com'),
    ('Dr. K. Sai Teja', 'Neurologist', '3456789012', 'sai.teja@hm.com'),
    ('Dr. K. Likitha', 'Pediatrician', '4567890123', 'likitha@hm.com'),
    ('Dr. A. Ravi Kumar', 'Cardiologist', '5678901234', 'ravi.kumar@hm.com'),
    ('Dr. M. Sree Lakshmi', 'Dermatologist', '6789012345', 'sree.lakshmi@hm.com'),
    ('Dr. P. Rohit Sharma', 'Neurologist', '7890123456', 'rohit.sharma@hm.com'),
    ('Dr. J. Priya', 'Pediatrician', '8901234567', 'priya@hm.com'),
    ('Dr. V. Rakesh', 'Cardiologist', '9012345678', 'rakesh@hm.com'),
    ('Dr. N. Divya', 'Dermatologist', '0123456789', 'divya@hm.com'),
    ('Dr. C. Rajesh', 'Neurologist', '1123456789', 'rajesh@hm.com');


INSERT INTO availability_schedules (doctor_id, date, slot_time, booked)
VALUES
    -- Dr. S. Akhil Kumar (Cardiologist)
    (1, '2024-07-12', '10:00 AM - 11:00 AM', false),
    (1, '2024-07-12', '12:00 PM - 01:00 PM', false),
    (1, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (1, '2024-07-12', '04:00 PM - 05:00 PM', false),

    (1, '2024-07-13', '10:00 AM - 11:00 AM', false),
    (1, '2024-07-13', '12:00 PM - 01:00 PM', false),
    (1, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (1, '2024-07-13', '04:00 PM - 05:00 PM', false),

    (1, '2024-07-14', '10:00 AM - 11:00 AM', false),
    (1, '2024-07-14', '12:00 PM - 01:00 PM', false),
    (1, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (1, '2024-07-14', '04:00 PM - 05:00 PM', false),

    -- Dr. K. Manish Ram Kumar (Dermatologist)
    (2, '2024-07-12', '12:00 PM - 01:00 PM', false),
    (2, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (2, '2024-07-12', '04:00 PM - 05:00 PM', false),

    (2, '2024-07-13', '12:00 PM - 01:00 PM', false),
    (2, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (2, '2024-07-13', '04:00 PM - 05:00 PM', false),

    (2, '2024-07-14', '12:00 PM - 01:00 PM', false),
    (2, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (2, '2024-07-14', '04:00 PM - 05:00 PM', false),

    -- Dr. K. Sai Teja (Neurologist)
    (3, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (3, '2024-07-12', '04:00 PM - 05:00 PM', false),
    (3, '2024-07-12', '06:00 PM - 07:00 PM', false),

    (3, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (3, '2024-07-13', '04:00 PM - 05:00 PM', false),
    (3, '2024-07-13', '06:00 PM - 07:00 PM', false),

    (3, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (3, '2024-07-14', '04:00 PM - 05:00 PM', false),
    (3, '2024-07-14', '06:00 PM - 07:00 PM', false),

    -- Dr. K. Likitha (Pediatrician)
    (4, '2024-07-12', '08:00 AM - 09:00 AM', false),
    (4, '2024-07-12', '10:00 AM - 11:00 AM', false),
    (4, '2024-07-12', '12:00 PM - 01:00 PM', false),
    (4, '2024-07-12', '02:00 PM - 03:00 PM', false),

    (4, '2024-07-13', '08:00 AM - 09:00 AM', false),
    (4, '2024-07-13', '10:00 AM - 11:00 AM', false),
    (4, '2024-07-13', '12:00 PM - 01:00 PM', false),
    (4, '2024-07-13', '02:00 PM - 03:00 PM', false),

    (4, '2024-07-14', '08:00 AM - 09:00 AM', false),
    (4, '2024-07-14', '10:00 AM - 11:00 AM', false),
    (4, '2024-07-14', '12:00 PM - 01:00 PM', false),
    (4, '2024-07-14', '02:00 PM - 03:00 PM', false),

    -- Dr. A. Ravi Kumar (Cardiologist)
    (5, '2024-07-12', '10:00 AM - 11:00 AM', false),
    (5, '2024-07-12', '12:00 PM - 01:00 PM', false),
    (5, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (5, '2024-07-12', '04:00 PM - 05:00 PM', false),

    (5, '2024-07-13', '10:00 AM - 11:00 AM', false),
    (5, '2024-07-13', '12:00 PM - 01:00 PM', false),
    (5, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (5, '2024-07-13', '04:00 PM - 05:00 PM', false),

    (5, '2024-07-14', '10:00 AM - 11:00 AM', false),
    (5, '2024-07-14', '12:00 PM - 01:00 PM', false),
    (5, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (5, '2024-07-14', '04:00 PM - 05:00 PM', false),

    -- Dr. M. Sree Lakshmi (Dermatologist)
    (6, '2024-07-12', '12:00 PM - 01:00 PM', false),
    (6, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (6, '2024-07-12', '04:00 PM - 05:00 PM', false),

    (6, '2024-07-13', '12:00 PM - 01:00 PM', false),
    (6, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (6, '2024-07-13', '04:00 PM - 05:00 PM', false),

    (6, '2024-07-14', '12:00 PM - 01:00 PM', false),
    (6, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (6, '2024-07-14', '04:00 PM - 05:00 PM', false),

    -- Dr. P. Rohit Sharma (Neurologist)
    (7, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (7, '2024-07-12', '04:00 PM - 05:00 PM', false),
    (7, '2024-07-12', '06:00 PM - 07:00 PM', false),

    (7, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (7, '2024-07-13', '04:00 PM - 05:00 PM', false),
    (7, '2024-07-13', '06:00 PM - 07:00 PM', false),

    (7, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (7, '2024-07-14', '04:00 PM - 05:00 PM', false),
    (7, '2024-07-14', '06:00 PM - 07:00 PM', false),

    -- Dr. J. Priya (Pediatrician)
    (8, '2024-07-12', '08:00 AM - 09:00 AM', false),
    (8, '2024-07-12', '10:00 AM - 11:00 AM', false),
    (8, '2024-07-12', '12:00 PM - 01:00 PM', false),
    (8, '2024-07-12', '02:00 PM - 03:00 PM', false),

    (8, '2024-07-13', '08:00 AM - 09:00 AM', false),
    (8, '2024-07-13', '10:00 AM - 11:00 AM', false),
    (8, '2024-07-13', '12:00 PM - 01:00 PM', false),
    (8, '2024-07-13', '02:00 PM - 03:00 PM', false),

    (8, '2024-07-14', '08:00 AM - 09:00 AM', false),
    (8, '2024-07-14', '10:00 AM - 11:00 AM', false),
    (8, '2024-07-14', '12:00 PM - 01:00 PM', false),
    (8, '2024-07-14', '02:00 PM - 03:00 PM', false),

    -- Dr. V. Rakesh (Cardiologist)
    (9, '2024-07-12', '10:00 AM - 11:00 AM', false),
    (9, '2024-07-12', '12:00 PM - 01:00 PM', false),
    (9, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (9, '2024-07-12', '04:00 PM - 05:00 PM', false),

    (9, '2024-07-13', '10:00 AM - 11:00 AM', false),
    (9, '2024-07-13', '12:00 PM - 01:00 PM', false),
    (9, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (9, '2024-07-13', '04:00 PM - 05:00 PM', false),

    (9, '2024-07-14', '10:00 AM - 11:00 AM', false),
    (9, '2024-07-14', '12:00 PM - 01:00 PM', false),
    (9, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (9, '2024-07-14', '04:00 PM - 05:00 PM', false),

    -- Dr. N. Divya (Dermatologist)
    (10, '2024-07-12', '12:00 PM - 01:00 PM', false),
    (10, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (10, '2024-07-12', '04:00 PM - 05:00 PM', false),

    (10, '2024-07-13', '12:00 PM - 01:00 PM', false),
    (10, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (10, '2024-07-13', '04:00 PM - 05:00 PM', false),

    (10, '2024-07-14', '12:00 PM - 01:00 PM', false),
    (10, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (10, '2024-07-14', '04:00 PM - 05:00 PM', false),

    -- Dr. C. Rajesh (Neurologist)
    (11, '2024-07-12', '02:00 PM - 03:00 PM', false),
    (11, '2024-07-12', '04:00 PM - 05:00 PM', false),
    (11, '2024-07-12', '06:00 PM - 07:00 PM', false),

    (11, '2024-07-13', '02:00 PM - 03:00 PM', false),
    (11, '2024-07-13', '04:00 PM - 05:00 PM', false),
    (11, '2024-07-13', '06:00 PM - 07:00 PM', false),

    (11, '2024-07-14', '02:00 PM - 03:00 PM', false),
    (11, '2024-07-14', '04:00 PM - 05:00 PM', false),
    (11, '2024-07-14', '06:00 PM - 07:00 PM', false)
    ;




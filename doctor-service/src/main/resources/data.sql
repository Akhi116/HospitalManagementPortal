-- Insert doctors into the doctor table
INSERT INTO doctor (name, specialization, contact_number, email, password)
VALUES
    ('Dr. S. Akhil Kumar', 'Cardiologist', '1234567890', 'akhil.kumar@hm.com', 'Akhil890'),
    ('Dr. K. Manish Ram Kumar', 'Dermatologist', '2345678901', 'manish.ramkumar@hm.com', 'Manish901'),
    ('Dr. K. Sai Teja', 'Neurologist', '3456789012', 'sai.teja@hm.com', 'Sai012'),
    ('Dr. K. Likitha', 'Pediatrician', '4567890123', 'likitha@hm.com', 'Likitha123'),
    ('Dr. A. Ravi Kumar', 'Cardiologist', '5678901234', 'ravi.kumar@hm.com', 'Ravi234'),
    ('Dr. M. Sree Lakshmi', 'Dermatologist', '6789012345', 'sree.lakshmi@hm.com', 'Sree345'),
    ('Dr. P. Rohit Sharma', 'Neurologist', '7890123456', 'rohit.sharma@hm.com', 'Rohit456'),
    ('Dr. J. Priya', 'Pediatrician', '8901234567', 'priya@hm.com', 'Priya567'),
    ('Dr. V. Rakesh', 'Cardiologist', '9012345678', 'rakesh@hm.com', 'Rakesh678'),
    ('Dr. N. Divya', 'Dermatologist', '0123456789', 'divya@hm.com', 'Divya789'),
    ('Dr. C. Rajesh', 'Neurologist', '1123456789', 'rajesh@hm.com', 'Rajesh789'),
    ('Dr. A. Suman', 'Endocrinologist', '2233445566', 'suman@hm.com', 'Suman566'),
    ('Dr. B. Reena', 'Oncologist', '3344556677', 'reena@hm.com', 'Reena677'),
    ('Dr. C. Vikram', 'Psychiatrist', '4455667788', 'vikram@hm.com', 'Vikram788'),
    ('Dr. D. Sneha', 'Gastroenterologist', '5566778899', 'sneha@hm.com', 'Sneha899'),
    ('Dr. M. Anjali', 'Cardiologist', '6677889900', 'anjali@hm.com', 'Anjali900'),
    ('Dr. N. Arjun', 'Dermatologist', '7788990011', 'arjun@hm.com', 'Arjun011'),
    ('Dr. P. Megha', 'Neurologist', '8899001122', 'megha@hm.com', 'Megha122'),
    ('Dr. S. Ramesh', 'Pediatrician', '9900112233', 'ramesh@hm.com', 'Ramesh233');



INSERT INTO availability_schedules (doctor_id, date, slot_time, booked)
VALUES
    -- Dr. S. Akhil Kumar (Cardiologist)
        (1, '2024-07-20', '10:00 AM - 11:00 AM', false),
        (1, '2024-07-20', '12:00 PM - 01:00 PM', false),
        (1, '2024-07-20', '02:00 PM - 03:00 PM', false),
        (1, '2024-07-20', '04:00 PM - 05:00 PM', false),

        (1, '2024-07-21', '10:00 AM - 11:00 AM', false),
        (1, '2024-07-21', '12:00 PM - 01:00 PM', false),
        (1, '2024-07-21', '02:00 PM - 03:00 PM', false),
        (1, '2024-07-21', '04:00 PM - 05:00 PM', false),

        (1, '2024-07-22', '10:00 AM - 11:00 AM', false),
        (1, '2024-07-22', '12:00 PM - 01:00 PM', false),
        (1, '2024-07-22', '02:00 PM - 03:00 PM', false),
        (1, '2024-07-22', '04:00 PM - 05:00 PM', false),

        -- Dr. K. Manish Ram Kumar (Dermatologist)
        (2, '2024-07-20', '12:00 PM - 01:00 PM', false),
        (2, '2024-07-20', '02:00 PM - 03:00 PM', false),
        (2, '2024-07-20', '04:00 PM - 05:00 PM', false),

        (2, '2024-07-21', '12:00 PM - 01:00 PM', false),
        (2, '2024-07-21', '02:00 PM - 03:00 PM', false),
        (2, '2024-07-21', '04:00 PM - 05:00 PM', false),

        (2, '2024-07-22', '12:00 PM - 01:00 PM', false),
        (2, '2024-07-22', '02:00 PM - 03:00 PM', false),
        (2, '2024-07-22', '04:00 PM - 05:00 PM', false),

        -- Dr. K. Sai Teja (Neurologist)
            (3, '2024-07-20', '02:00 PM - 03:00 PM', false),
            (3, '2024-07-20', '04:00 PM - 05:00 PM', false),
            (3, '2024-07-20', '06:00 PM - 07:00 PM', false),

            (3, '2024-07-21', '02:00 PM - 03:00 PM', false),
            (3, '2024-07-21', '04:00 PM - 05:00 PM', false),
            (3, '2024-07-21', '06:00 PM - 07:00 PM', false),

            (3, '2024-07-22', '02:00 PM - 03:00 PM', false),
            (3, '2024-07-22', '04:00 PM - 05:00 PM', false),
            (3, '2024-07-22', '06:00 PM - 07:00 PM', false),

            -- Dr. K. Likitha (Pediatrician)
            (4, '2024-07-20', '08:00 AM - 09:00 AM', false),
            (4, '2024-07-20', '10:00 AM - 11:00 AM', false),
            (4, '2024-07-20', '12:00 PM - 01:00 PM', false),
            (4, '2024-07-20', '02:00 PM - 03:00 PM', false),

            (4, '2024-07-21', '08:00 AM - 09:00 AM', false),
            (4, '2024-07-21', '10:00 AM - 11:00 AM', false),
            (4, '2024-07-21', '12:00 PM - 01:00 PM', false),
            (4, '2024-07-21', '02:00 PM - 03:00 PM', false),

            (4, '2024-07-22', '08:00 AM - 09:00 AM', false),
            (4, '2024-07-22', '10:00 AM - 11:00 AM', false),
            (4, '2024-07-22', '12:00 PM - 01:00 PM', false),
            (4, '2024-07-22', '02:00 PM - 03:00 PM', false),

            -- Dr. A. Ravi Kumar (Cardiologist)
            (5, '2024-07-20', '10:00 AM - 11:00 AM', false),
            (5, '2024-07-20', '12:00 PM - 01:00 PM', false),
            (5, '2024-07-20', '02:00 PM - 03:00 PM', false),
            (5, '2024-07-20', '04:00 PM - 05:00 PM', false),

            (5, '2024-07-21', '10:00 AM - 11:00 AM', false),
            (5, '2024-07-21', '12:00 PM - 01:00 PM', false),
            (5, '2024-07-21', '02:00 PM - 03:00 PM', false),
            (5, '2024-07-21', '04:00 PM - 05:00 PM', false),

            (5, '2024-07-22', '10:00 AM - 11:00 AM', false),
            (5, '2024-07-22', '12:00 PM - 01:00 PM', false),
            (5, '2024-07-22', '02:00 PM - 03:00 PM', false),
            (5, '2024-07-22', '04:00 PM - 05:00 PM', false),

            -- Dr. M. Sree Lakshmi (Dermatologist)
            (6, '2024-07-20', '12:00 PM - 01:00 PM', false),
            (6, '2024-07-20', '02:00 PM - 03:00 PM', false),
            (6, '2024-07-20', '04:00 PM - 05:00 PM', false),

            (6, '2024-07-21', '12:00 PM - 01:00 PM', false),
            (6, '2024-07-21', '02:00 PM - 03:00 PM', false),
            (6, '2024-07-21', '04:00 PM - 05:00 PM', false),

            (6, '2024-07-22', '12:00 PM - 01:00 PM', false),
            (6, '2024-07-22', '02:00 PM - 03:00 PM', false),
            (6, '2024-07-22', '04:00 PM - 05:00 PM', false),

            -- Dr. P. Rohit Sharma (Neurologist)
            (7, '2024-07-20', '02:00 PM - 03:00 PM', false),
            (7, '2024-07-20', '04:00 PM - 05:00 PM', false),
            (7, '2024-07-20', '06:00 PM - 07:00 PM', false),

            (7, '2024-07-21', '02:00 PM - 03:00 PM', false),
            (7, '2024-07-21', '04:00 PM - 05:00 PM', false),
            (7, '2024-07-21', '06:00 PM - 07:00 PM', false),

            (7, '2024-07-22', '02:00 PM - 03:00 PM', false),
            (7, '2024-07-22', '04:00 PM - 05:00 PM', false),
            (7, '2024-07-22', '06:00 PM - 07:00 PM', false),

            -- Dr. J. Priya (Pediatrician)
            (8, '2024-07-20', '08:00 AM - 09:00 AM', false),
            (8, '2024-07-20', '10:00 AM - 11:00 AM', false),
            (8, '2024-07-20', '12:00 PM - 01:00 PM', false),
            (8, '2024-07-20', '02:00 PM - 03:00 PM', false),

            (8, '2024-07-21', '08:00 AM - 09:00 AM', false),
            (8, '2024-07-21', '10:00 AM - 11:00 AM', false),
            (8, '2024-07-21', '12:00 PM - 01:00 PM', false),
            (8, '2024-07-21', '02:00 PM - 03:00 PM', false),

            (8, '2024-07-22', '08:00 AM - 09:00 AM', false),
            (8, '2024-07-22', '10:00 AM - 11:00 AM', false),
            (8, '2024-07-22', '12:00 PM - 01:00 PM', false),
            (8, '2024-07-22', '02:00 PM - 03:00 PM', false),

            -- Dr. V. Rakesh (Cardiologist)
            (9, '2024-07-20', '10:00 AM - 11:00 AM', false),
            (9, '2024-07-20', '12:00 PM - 01:00 PM', false),
            (9, '2024-07-20', '02:00 PM - 03:00 PM', false),
            (9, '2024-07-20', '04:00 PM - 05:00 PM', false),

            (9, '2024-07-21', '10:00 AM - 11:00 AM', false),
            (9, '2024-07-21', '12:00 PM - 01:00 PM', false),
            (9, '2024-07-21', '02:00 PM - 03:00 PM', false),
            (9, '2024-07-21', '04:00 PM - 05:00 PM', false),

            (9, '2024-07-22', '10:00 AM - 11:00 AM', false),
            (9, '2024-07-22', '12:00 PM - 01:00 PM', false),
            (9, '2024-07-22', '02:00 PM - 03:00 PM', false),
            (9, '2024-07-22', '04:00 PM - 05:00 PM', false),

             -- Dr N.Divya (Dermatologist)
            (10, '2024-07-20', '12:00 PM - 01:00 PM', false),
            (10, '2024-07-20', '02:00 PM - 03:00 PM', false),
            (10, '2024-07-20', '04:00 PM - 05:00 PM', false),

            (10, '2024-07-21', '12:00 PM - 01:00 PM', false),
            (10, '2024-07-21', '02:00 PM - 03:00 PM', false),
            (10, '2024-07-21', '04:00 PM - 05:00 PM', false),

            (10, '2024-07-22', '12:00 PM - 01:00 PM', false),
            (10, '2024-07-22', '02:00 PM - 03:00 PM', false),
            (10, '2024-07-22', '04:00 PM - 05:00 PM', false),

               -- C. Rajesh (Neurologist)
            (11, '2024-07-20', '08:00 AM - 09:00 AM', false),
            (11, '2024-07-20', '10:00 AM - 11:00 AM', false),
            (11, '2024-07-20', '12:00 PM - 01:00 PM', false),
            (11, '2024-07-20', '02:00 PM - 03:00 PM', false),

            (11, '2024-07-21', '08:00 AM - 09:00 AM', false),
            (11, '2024-07-21', '10:00 AM - 11:00 AM', false),
            (11, '2024-07-21', '12:00 PM - 01:00 PM', false),
            (11, '2024-07-21', '02:00 PM - 03:00 PM', false),

            (11, '2024-07-22', '08:00 AM - 09:00 AM', false),
            (11, '2024-07-22', '10:00 AM - 11:00 AM', false),
            (11, '2024-07-22', '12:00 PM - 01:00 PM', false),
            (11, '2024-07-22', '02:00 PM - 03:00 PM', false),

           -- Dr. A. Suman (Endocrinologist)
        (12, '2024-07-20', '10:00 AM - 11:00 AM', false),
        (12, '2024-07-20', '12:00 PM - 01:00 PM', false),
        (12, '2024-07-20', '02:00 PM - 03:00 PM', false),
        (12, '2024-07-20', '04:00 PM - 05:00 PM', false),

        (12, '2024-07-21', '10:00 AM - 11:00 AM', false),
        (12, '2024-07-21', '12:00 PM - 01:00 PM', false),
        (12, '2024-07-21', '02:00 PM - 03:00 PM', false),
        (12, '2024-07-21', '04:00 PM - 05:00 PM', false),

        (12, '2024-07-22', '10:00 AM - 11:00 AM', false),
        (12, '2024-07-22', '12:00 PM - 01:00 PM', false),
        (12, '2024-07-22', '02:00 PM - 03:00 PM', false),
        (12, '2024-07-22', '04:00 PM - 05:00 PM', false),

               -- Dr. B. Reena (Oncologist)
               (13, '2024-07-20', '12:00 PM - 01:00 PM', false),
               (13, '2024-07-20', '02:00 PM - 03:00 PM', false),
               (13, '2024-07-20', '04:00 PM - 05:00 PM', false),
               (13, '2024-07-21', '12:00 PM - 01:00 PM', false),
               (13, '2024-07-21', '02:00 PM - 03:00 PM', false),
               (13, '2024-07-21', '04:00 PM - 05:00 PM', false),
               (13, '2024-07-22', '12:00 PM - 01:00 PM', false),
               (13, '2024-07-22', '02:00 PM - 03:00 PM', false),
               (13, '2024-07-22', '04:00 PM - 05:00 PM', false),

               -- Dr. C. Vikram (Psychiatrist)
               (14, '2024-07-20', '02:00 PM - 03:00 PM', false),
               (14, '2024-07-20', '04:00 PM - 05:00 PM', false),
               (14, '2024-07-20', '06:00 PM - 07:00 PM', false),
               (14, '2024-07-21', '02:00 PM - 03:00 PM', false),
               (14, '2024-07-21', '04:00 PM - 05:00 PM', false),
               (14, '2024-07-21', '06:00 PM - 07:00 PM', false),
               (14, '2024-07-22', '02:00 PM - 03:00 PM', false),
               (14, '2024-07-22', '04:00 PM - 05:00 PM', false),
               (14, '2024-07-22', '06:00 PM - 07:00 PM', false),

               -- Dr. D. Sneha (Gastroenterologist)
               (15, '2024-07-20', '10:00 AM - 11:00 AM', false),
               (15, '2024-07-20', '12:00 PM - 01:00 PM', false),
               (15, '2024-07-20', '02:00 PM - 03:00 PM', false),
               (15, '2024-07-20', '04:00 PM - 05:00 PM', false),
               (15, '2024-07-21', '10:00 AM - 11:00 AM', false),
               (15, '2024-07-21', '12:00 PM - 01:00 PM', false),
               (15, '2024-07-21', '02:00 PM - 03:00 PM', false),
               (15, '2024-07-21', '04:00 PM - 05:00 PM', false),
               (15, '2024-07-22', '10:00 AM - 11:00 AM', false),
               (15, '2024-07-22', '12:00 PM - 01:00 PM', false),
               (15, '2024-07-22', '02:00 PM - 03:00 PM', false),
               (15, '2024-07-22', '04:00 PM - 05:00 PM', false),

               -- Dr. M. Anjali (Cardiologist)
               (16, '2024-07-20', '08:00 AM - 09:00 AM', false),
               (16, '2024-07-20', '10:00 AM - 11:00 AM', false),
               (16, '2024-07-20', '12:00 PM - 01:00 PM', false),
               (16, '2024-07-20', '02:00 PM - 03:00 PM', false),
               (16, '2024-07-21', '08:00 AM - 09:00 AM', false),
               (16, '2024-07-21', '10:00 AM - 11:00 AM', false),
               (16, '2024-07-21', '12:00 PM - 01:00 PM', false),
               (16, '2024-07-21', '02:00 PM - 03:00 PM', false),
               (16, '2024-07-22', '08:00 AM - 09:00 AM', false),
               (16, '2024-07-22', '10:00 AM - 11:00 AM', false),
               (16, '2024-07-22', '12:00 PM - 01:00 PM', false),
               (16, '2024-07-22', '02:00 PM - 03:00 PM', false),

               -- Dr. N. Arjun (Dermatologist)
               (17, '2024-07-20', '12:00 PM - 01:00 PM', false),
               (17, '2024-07-20', '02:00 PM - 03:00 PM', false),
               (17, '2024-07-20', '04:00 PM - 05:00 PM', false),
               (17, '2024-07-21', '12:00 PM - 01:00 PM', false),
               (17, '2024-07-21', '02:00 PM - 03:00 PM', false),
               (17, '2024-07-21', '04:00 PM - 05:00 PM', false),
               (17, '2024-07-22', '12:00 PM - 01:00 PM', false),
               (17, '2024-07-22', '02:00 PM - 03:00 PM', false),
               (17, '2024-07-22', '04:00 PM - 05:00 PM', false),

               -- Dr. P. Megha (Neurologist)
               (18, '2024-07-20', '02:00 PM - 03:00 PM', false),
               (18, '2024-07-20', '04:00 PM - 05:00 PM', false),
               (18, '2024-07-20', '06:00 PM - 07:00 PM', false),
               (18, '2024-07-21', '02:00 PM - 03:00 PM', false),
               (18, '2024-07-21', '04:00 PM - 05:00 PM', false),
               (18, '2024-07-21', '06:00 PM - 07:00 PM', false),
               (18, '2024-07-22', '02:00 PM - 03:00 PM', false),
               (18, '2024-07-22', '04:00 PM - 05:00 PM', false),
               (18, '2024-07-22', '06:00 PM - 07:00 PM', false),

               -- Dr. S. Ramesh (Pediatrician)
               (19, '2024-07-20', '10:00 AM - 11:00 AM', false),
               (19, '2024-07-20', '12:00 PM - 01:00 PM', false),
               (19, '2024-07-20', '02:00 PM - 03:00 PM', false),
               (19, '2024-07-20', '04:00 PM - 05:00 PM', false),
               (19, '2024-07-21', '10:00 AM - 11:00 AM', false),
               (19, '2024-07-21', '12:00 PM - 01:00 PM', false),
               (19, '2024-07-21', '02:00 PM - 03:00 PM', false),
               (19, '2024-07-21', '04:00 PM - 05:00 PM', false),
               (19, '2024-07-22', '10:00 AM - 11:00 AM', false),
               (19, '2024-07-22', '12:00 PM - 01:00 PM', false),
               (19, '2024-07-22', '02:00 PM - 03:00 PM', false),
               (19, '2024-07-22', '04:00 PM - 05:00 PM', false);









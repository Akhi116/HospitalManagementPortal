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
    ('Dr. C. Rajesh', 'Neurologist', '1123456789', 'rajesh@hm.com'),
    ('Dr. T. Suresh', 'Pediatrician', '2123456789', 'suresh@hm.com'),
    ('Dr. L. Anusha', 'Cardiologist', '3123456789', 'anusha@hm.com'),
    ('Dr. R. Praveen', 'Dermatologist', '4123456789', 'praveen@hm.com'),
    ('Dr. S. Meena', 'Neurologist', '5123456789', 'meena@hm.com'),
    ('Dr. V. Arun', 'Pediatrician', '6123456789', 'arun@hm.com'),
    ('Dr. K. Jyothi', 'Cardiologist', '7123456789', 'jyothi@hm.com'),
    ('Dr. R. Karthik', 'Dermatologist', '8123456789', 'karthik@hm.com'),
    ('Dr. M. Swathi', 'Neurologist', '9123456789', 'swathi@hm.com'),
    ('Dr. A. Vinod', 'Pediatrician', '1023456789', 'vinod@hm.com');


INSERT INTO availability_schedules (doctor_id, day_of_week, date, start_time, end_time)
VALUES
    -- Example for Dr. S. Akhil Kumar (Cardiologist)
    (1, 'Monday', '2024-07-01', '10:00:00', '16:00:00'),
    (1, 'Tuesday', '2024-07-02', '10:00:00', '16:00:00'),
    (1, 'Wednesday', '2024-07-03', '10:00:00', '16:00:00'),
    (1, 'Thursday', '2024-07-04', '10:00:00', '16:00:00'),
    (1, 'Friday', '2024-07-05', '10:00:00', '16:00:00'),

    -- Example for Dr. K. Manish Ram Kumar (Dermatologist)
    (2, 'Tuesday', '2024-07-02', '12:00:00', '18:00:00'),
    (2, 'Wednesday', '2024-07-03', '12:00:00', '18:00:00'),
    (2, 'Thursday', '2024-07-04', '12:00:00', '18:00:00'),


    -- Example for Dr. K. Sai Teja (Neurologist)
    (3, 'Monday', '2024-07-01', '14:00:00', '20:00:00'),
    (3, 'Tuesday', '2024-07-02', '14:00:00', '20:00:00'),
    (3, 'Wednesday', '2024-07-03', '14:00:00', '20:00:00'),

    -- Example for Dr. K. Likitha (Pediatrician)
    (4, 'Monday', '2024-07-01', '08:00:00', '14:00:00'),
    (4, 'Tuesday', '2024-07-02', '08:00:00', '14:00:00'),
    (4, 'Wednesday', '2024-07-03', '08:00:00', '14:00:00'),
    (4, 'Thursday', '2024-07-04', '08:00:00', '14:00:00'),
    (4, 'Friday', '2024-07-05', '08:00:00', '14:00:00'),


    -- Example for Dr. A. Ravi Kumar (Cardiologist)
    (5, 'Wednesday', '2024-07-03', '09:00:00', '15:00:00'),
    (5, 'Thursday', '2024-07-04', '09:00:00', '15:00:00'),
    (5, 'Friday', '2024-07-05', '09:00:00', '15:00:00'),

    -- Example for Dr. M. Sree Lakshmi (Dermatologist)
    (6, 'Monday', '2024-07-01', '10:00:00', '16:00:00'),
    (6, 'Tuesday', '2024-07-02', '10:00:00', '16:00:00'),
    (6, 'Wednesday', '2024-07-03', '10:00:00', '16:00:00'),

    -- Example for Dr. P. Rohit Sharma (Neurologist)
    (7, 'Tuesday', '2024-07-02', '11:00:00', '17:00:00'),
    (7, 'Wednesday', '2024-07-03', '11:00:00', '17:00:00'),
    (7, 'Thursday', '2024-07-04', '11:00:00', '17:00:00'),

    -- Example for Dr. J. Priya (Pediatrician)
    (8, 'Monday', '2024-07-01', '08:00:00', '14:00:00'),
    (8, 'Tuesday', '2024-07-02', '08:00:00', '14:00:00'),
    (8, 'Wednesday', '2024-07-03', '08:00:00', '14:00:00'),
    (8, 'Thursday', '2024-07-04', '08:00:00', '14:00:00'),
    (8, 'Friday', '2024-07-05', '08:00:00', '14:00:00'),

    -- Example for Dr. V. Rakesh (Cardiologist)
    (9, 'Monday', '2024-07-01', '12:00:00', '18:00:00'),
    (9, 'Tuesday', '2024-07-02', '12:00:00', '18:00:00'),
    (9, 'Wednesday', '2024-07-03', '12:00:00', '18:00:00'),
    (9, 'Thursday', '2024-07-04', '12:00:00', '18:00:00'),
    (9, 'Friday', '2024-07-05', '12:00:00', '18:00:00'),

    -- Example for Dr. N. Divya (Dermatologist)
    (10, 'Tuesday', '2024-07-02', '09:00:00', '15:00:00'),
    (10, 'Wednesday', '2024-07-03', '09:00:00', '15:00:00'),
    (10, 'Thursday', '2024-07-04', '09:00:00', '15:00:00'),


    -- Example for Dr. C. Rajesh (Neurologist)
    (11, 'Monday', '2024-07-01', '10:00:00', '16:00:00'),
    (11, 'Tuesday', '2024-07-02', '10:00:00', '16:00:00'),
    (11, 'Wednesday', '2024-07-03', '10:00:00', '16:00:00'),
    (11, 'Thursday', '2024-07-04', '10:00:00', '16:00:00'),
    (11, 'Friday', '2024-07-05', '10:00:00', '16:00:00'),

    -- Example for Dr. T. Suresh (Pediatrician)
    (12, 'Monday', '2024-07-01', '14:00:00', '20:00:00'),
    (12, 'Tuesday', '2024-07-02', '14:00:00', '20:00:00'),
    (12, 'Wednesday', '2024-07-03', '14:00:00', '20:00:00'),

    -- Example for Dr. L. Anusha (Cardiologist)
    (13, 'Tuesday', '2024-07-02', '10:00:00', '16:00:00'),
    (13, 'Wednesday', '2024-07-03', '10:00:00', '16:00:00'),
    (13, 'Thursday', '2024-07-04', '10:00:00', '16:00:00'),

    -- Example for Dr. R. Praveen (Dermatologist)
    (14, 'Wednesday', '2024-07-03', '12:00:00', '18:00:00'),
    (14, 'Thursday', '2024-07-04', '12:00:00', '18:00:00'),
    (14, 'Friday', '2024-07-05', '12:00:00', '18:00:00'),


    -- Example for Dr. S. Meena (Neurologist)
    (15, 'Monday', '2024-07-01', '09:00:00', '15:00:00'),
    (15, 'Tuesday', '2024-07-02', '09:00:00', '15:00:00'),
    (15, 'Wednesday', '2024-07-03', '09:00:00', '15:00:00'),

    -- Example for Dr. V. Arun (Pediatrician)
    (16, 'Tuesday', '2024-07-02', '08:00:00', '14:00:00'),
    (16, 'Wednesday', '2024-07-03', '08:00:00', '14:00:00'),
    (16, 'Thursday', '2024-07-04', '08:00:00', '14:00:00'),
    (16, 'Friday', '2024-07-05', '08:00:00', '14:00:00'),


    -- Example for Dr. K. Jyothi (Cardiologist)
    (17, 'Wednesday', '2024-07-03', '11:00:00', '17:00:00'),
    (17, 'Thursday', '2024-07-04', '11:00:00', '17:00:00'),
    (17, 'Friday', '2024-07-05', '11:00:00', '17:00:00'),

    -- Example for Dr. R. Karthik (Dermatologist)
    (18, 'Monday', '2024-07-01', '12:00:00', '18:00:00'),
    (18, 'Tuesday', '2024-07-02', '12:00:00', '18:00:00'),
    (18, 'Wednesday', '2024-07-03', '12:00:00', '18:00:00'),
    (18, 'Thursday', '2024-07-04', '12:00:00', '18:00:00'),
    (18, 'Friday', '2024-07-05', '12:00:00', '18:00:00'),

    -- Example for Dr. M. Swathi (Neurologist)
    (19, 'Tuesday', '2024-07-02', '09:00:00', '15:00:00'),
    (19, 'Wednesday', '2024-07-03', '09:00:00', '15:00:00'),
    (19, 'Thursday', '2024-07-04', '09:00:00', '15:00:00'),

    -- Example for Dr. A. Vinod (Pediatrician)
    (20, 'Monday', '2024-07-01', '14:00:00', '20:00:00'),
    (20, 'Tuesday', '2024-07-02', '14:00:00', '20:00:00'),
    (20, 'Wednesday', '2024-07-03', '14:00:00', '20:00:00');

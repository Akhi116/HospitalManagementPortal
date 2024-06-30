CREATE TABLE doctor (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR(255),
    specialization VARCHAR(255),
    contact_number VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE availability_schedules (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    doctor_id INTEGER NOT NULL,
    date DATE NOT NULL,
    day_of_week VARCHAR(255) NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    FOREIGN KEY (doctor_id) REFERENCES doctor(id) ON DELETE CASCADE
);

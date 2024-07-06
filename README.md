# Hospital Management Portal

## Overview

The Hospital Management Portal is a comprehensive system designed to manage hospital operations efficiently. The portal includes services for managing patients, doctors, appointments, and medical records. The architecture is based on microservices and uses Java 17, Spring Boot, and JMS for inter-service communication.

## Services

### Patient Service
The Patient Service handles all operations related to patient management. It supports CRUD operations for patient details and allows patients to book appointments.

**Features:**
- Add, update, delete, and retrieve patient details
- Search and filter patients based on name, ID, or medical condition
- Book appointments with doctors

### Doctor Service
The Doctor Service manages doctor-related operations and availability schedules. It allows doctors to set their availability and handles booking appointments with patients.

**Features:**
- Add, update, delete, and retrieve doctor details
- writes prescription for patients

### Appointment Service
The Appointment Service is responsible for managing appointment details. It stores information about appointments, including patient and doctor details, and the appointment time and date.

**Features:**
- Store and manage appointment details
- Update appointment statuses
- Ensure availability and prevent double-booking

### Medical Service
The Medical Service manages the medical history of patients. It stores and retrieves detailed medical records for patients.

**Features:**
- Add, update, delete, and retrieve medical records
- Maintain a detailed history of patient health status

## Inter-Service Communication
We use Java Message Service (JMS) for communication between the microservices. This ensures smooth and reliable data exchange between the different components of the system.

## Technologies Used
- **Java 17**: For backend development
- **Spring Boot**: For building and running microservices
- **JMS**: For messaging and inter-service communication

## Setup and Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/hospital-management-portal.git
    ```
2. Navigate to each service directory and build the services using Maven:
    ```bash
    mvn clean install
    ```
3. Run each service:
    ```bash
    mvn spring-boot:run
    ```

## Usage
- **Patient Service**: Access the patient service endpoints to manage patient details and book appointments.
- **Doctor Service**: Use the doctor service endpoints to manage doctor availability and writes the prescription for patient.
- **Appointment Service**: Interact with the appointment service to handle appointment data.
- **Medical Service**: Access medical records through the medical service endpoints.

# Pet Management System 🐶🐕🐩🦮🐺🐾

## Introduction 🐶🐾

The Pet Management System is a software application designed to manage information about pets. It allows users to keep track of various details related to pets, such as their names, breeds, ages, and descriptions. This system is ideal for pet owners, veterinarians, or anyone who needs to organize and retrieve information about pets.

## Features 🦴🐩‍🍼

- **Add a Pet:** Add new pets to the system with details like name, breed, age, and description.

- **View Pet Details:** Retrieve and view information about existing pets.

- **Update Pet Information:** Modify details of a pet, such as updating their age or description.

- **Delete a Pet:** Remove a pet from the system.

## 💻 Technologies Used

- **Backend:** java,Spring Framework,Spring Boot,Spring Data JPA
- **Database:** h2
## 🛠 Setup Instructions
## 🚀 Getting Started

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/nivi0304/pet-management-system.git
# CRUD Performance Features

1. **Efficient Data Creation**
   - Quickly create new records with minimal latency.

2. **Optimized Data Retrieval**
   - Retrieve data with high-speed read operations, ensuring rapid access to information.

3. **Batch Operations Support**
   - Perform CRUD operations on multiple records simultaneously for improved efficiency.
## Key Features
 This application provides several features for maintaining records:
 * **Features:**
    * Creating data for pet name,age,automated id,breed and description.
    * Displaying all records for viewers.
    * Updating records for dogs using id.
    * Deleting the pet records.
## Usage
- `GET localhost:8080/records`: Displays all the details of records.
- `POST localhost:8080/allrecords`: Creating records for pets including id which is auto-generated,name,age,breed and descrpition.
- `PUT localhost:8080/append`: Update individual records using id.
- `DELETE localhost:8080/drop`: Delete records by id.

### API
- Endpoint: `/records`
  - Description: Displays all the details of records. .
  - Method: GET

- Endpoint: `/allrecords`
  - Description:  Creating records for pets including id which is auto-generated,name,age,breed and descrpition.
  - Method: POST
 
  - Endpoint: `/append/{id}`
  - Description:Update individual records using id .
  - Method: PUT

- Endpoint: `/drop/{id}`
  - Description: Delete records by id. 
  - Method: DELETE 
 





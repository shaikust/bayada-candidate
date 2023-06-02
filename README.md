# bayada-candidate

## Architecture

This project follows the <a href="https://reflectoring.io/spring-hexagonal/">hexagonal architecture</a> (also known as ports and adapters architecture).

The hexagonal architecture separates the application into three main layers:

- Domain Layer: Contains the core business logic and domain objects. The `com.bayada.candidate.domain` package in this project represents the domain layer.

- Application Layer: Implements the use cases and orchestrates the interaction between the domain layer and the infrastructure layer.

- Infrastructure Layer: Handles external dependencies and provides implementations for ports and adapters. It includes components for data access, external services integration, etc.

## Database

This project utilizes MongoDB Atlas as the database.


## postman-collections
![Screenshot (106)](https://github.com/Bayada-tsg/bayada-candidate/assets/73517233/7e83adc2-a1b2-4cc2-a67d-ef981e3007f6)

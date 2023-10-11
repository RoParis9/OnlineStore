# E-Commerce Application

Welcome to the E-Commerce Application project! This README provides an overview of the project, its current status, and a to-do list of tasks.

## Project Overview

The E-Commerce Application is built using Spring Boot and is designed to be an e-commerce platform where users can browse, purchase products, and manage their orders.

## Current Status

### What's Done

- [x] Entity Creation: User, Product, Category
- [x] Spring Security: JWT security configuration for user authentication
- [x] Database Connection: Connection to PostgreSQL database
- [x] Entity Migrations: Database migrations using Flyway
- [x] User Registration: Basic user registration functionality
- [x] User Authentication: Basic user login functionality
- [x] User Roles: Role-based access control for users
- [x] Entity Creation: Order and Cart entities
- [x] Entity Migrations: Migrations for Order and Cart entities

### What's Pending

- [ ] Cart and Order Functionality: Implement shopping cart and order management
- [ ] Product and Category CRUD: Implement CRUD operations for products and categories
- [ ] Unit Testing: Initial unit tests for some components
- [ ] Integration Testing: Write integration tests to ensure system-wide functionality

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository: `git clone <repository_url>`
2. Configure the database: Update `application.properties` with your database configuration.
3. Run the command `docker-compose up -d` to start your postgres instance
4. Run the application: Use `./mvnw spring-boot:run` or your preferred method.
5. Access the application: Open a web browser and go to `http://localhost:8080`.

## Contributing

We welcome contributions! If you'd like to contribute to the project, please follow our [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE).

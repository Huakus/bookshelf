# Library Management System

This is a Library Management System API built with Java and Spring Boot. The system allows for the management of books, users, and loans. It provides the ability for users to borrow and return books, for librarians to add and remove books, and also to view and manage loans.

## Models

The application includes the following models:

- `Book`: Represents a book in the library. Includes properties for title, author, ISBN, and a status indicating whether the book is available or currently on loan.
- `User`: Represents a user of the library. This can be either a reader or a librarian. Includes properties for name, email, password, and role.
- `Loan`: Represents a loan of a book to a user. Includes properties for the book, the user, and the start and end dates of the loan.

## Features

  * User registration and login system, with role-based access (reader, librarian)
  * CRUD operations for books (only accessible by librarians)
  * Ability to borrow and return books (readers)
  * Viewing and managing loans (librarians)

## Technologies Used

  * Java
  * Spring Boot
  * Spring Web
  * Spring Security
  * Spring Data JPA
  * Spring Boot Actuator
  * Spring HATEOAS
  * MySQL
  * Spring Boot DevTools

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You will need the following tools:

  * Java Development Kit (JDK)
  * MySQL
  * An IDE like IntelliJ IDEA or Eclipse

### Installing

  * Clone the repository
  * Open the project in your preferred IDE
  * Configure your MySQL username and password in the `application.properties` file
  * Run the project

## Running the tests

Explain how to run the automated tests for this system.

## Deployment

Add additional notes about how to deploy this on a live system.

## Built With

  * Spring Boot - The web framework used
  * Maven - Dependency Management
  * MySQL - Used to generate RSS Feeds

## Contributing

Please read CONTRIBUTING.md for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

  * Joaquín Senn

## License

This project is licensed under the MIT License - see the LICENSE.md file for details

## Acknowledgments

  * Hat tip to anyone whose code was used
  * Inspiration
  * etc
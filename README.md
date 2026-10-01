# Marketplace Analytics
Marketplace Analytics is a full-stack application for importing, storing, and analyzing marketplace sales and product data.

This is a personal coding project to explore coding concepts and tools used in modern coding industries. 

## How to Use
### Local Development
Clone the repository:

> git clone https://github.com/Dureke/Marketplace-Analytics.git

Open the project directory in VS Code.

Additional setup instructions will be added as the backend, database,
and frontend components are implemented.

#### Backend Setup

The backend requires:

- Java 21
- Maven
- Spring Boot 4.1.1

Verify Java and Maven are installed:

```
java -version
javac -version
mvn -v
```

Spring Boot does not need to be installed separately. Maven downloads the required Spring Boot dependencies based on `backend/pom.xml`.

To build the backend:
```
cd backend
mvn clean package
```

To run the backend:

```
mvn spring-boot:run
```

A successful startup should display a message similar to:

```
Started MarketplaceAnalyticsApplication
```

#### Database Setup

To set up PostgreSQL, ensure [version 18.6](https://www.postgresql.org/download/windows) is installed.

Once installed, run the command:
```
psql -U postgres
```

Then, create a database for the project:
```
CREATE DATABASE marketplace_analytics;
```

To exit, use the command `\q`. Now, you can sign in using the command:

```
psql -U postgres -d marketplace_analytics
```

## Tools Used
This is a list of resources used in the project. Entries marked with (*) have not been implemented yet but will in a future version.
- Java 21
- Maven
- Python*
- React*
- PostgreSQL 18.6
- Docker*
- Spring Boot 4.1.1
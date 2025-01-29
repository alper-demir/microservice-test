# Social Media Microservice Architecture

## Project Overview

This is a Spring Boot-based microservice application designed for a social media platform. The project demonstrates a robust microservice architecture using Spring Cloud, Eureka for service discovery, and API Gateway for routing.

## Architecture Components

### Services
- **Eureka Server**: Service discovery and registration
- **API Gateway**: Centralized routing and load balancing
- **User Service**: Manages user-related operations
- **Post Service**: Handles post-related functionalities
- **Comment Service**: Manages comments on posts

### Technology Stack
- Java 17
- Spring Boot
- Spring Cloud
- Eureka Server
- API Gateway
- Maven

## Project Structure
```
social-media-microservice/
│
├── eureka-server/         # Service discovery server
├── gateway/               # API Gateway
├── user-service/          # User management microservice
├── post-service/          # Post management microservice
└── comment-service/       # Comment management microservice
```

## Prerequisites
- Java Development Kit (JDK) 17
- Maven

## Running the Application

### Start Services in Order
1. **Eureka Server**
   ```
   cd eureka-server
   mvn spring-boot:run
   ```
   - Runs on `http://localhost:8761`
   - Provides service registry and discovery

2. **Microservices**
   For each service (user-service, post-service, comment-service):
   ```
   cd <service-directory>
   mvn spring-boot:run
   ```

3. **API Gateway**
   ```
   cd gateway
   mvn spring-boot:run
   ```
   - Runs on `http://localhost:8080`
   - Routes requests to appropriate microservices

## Service Discovery
- All services register themselves with the Eureka Server
- API Gateway uses service names for dynamic routing

## Configuration
- Service-specific configurations are in `application.properties` or `application.yml`
- Eureka and Gateway configurations are centralized

## Monitoring
- Access Eureka Dashboard: `http://localhost:8761`
- View registered services and their status

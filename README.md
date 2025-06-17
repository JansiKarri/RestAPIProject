📦 Orders Management API - Spring Boot Project

This is a RESTful Orders Management API built using Java and Spring Boot. It allows users to perform Create, Read, Update, and Delete (CRUD) operations on order records via HTTP endpoints.

🛠️ Technologies Used
- Java
- Spring Boot
- Spring Web (REST API)
- MySQL Database
- Maven
- Postman (for API testing)

📚 Project Structure
com.example.orders  
├── controller  
│   └── OrdersController.java  
├── models  
│   └── Orders.java  
├── service  
│   ├── OrdersService.java  
│   └── OrdersServiceImpl.java  
├── repository  
│   └── OrdersRepository.java  
└── resources  
    ├── application.properties  

🚀 Features
- Add a single order
- Add multiple orders
- Retrieve all orders
- Retrieve order by ID
- Update an order by ID
- Delete an order by ID
- RESTful API design with appropriate HTTP methods

📩 Sample Endpoints
- `POST /api/v1/insert` – Add a single order  
- `POST /api/v1/addall` – Add multiple orders  
- `GET /api/v1/getall` – View all orders  
- `GET /api/v1/getbyid/{id}` – View an order by ID  
- `PUT /api/v1/update/{id}` – Update order by ID  
- `DELETE /api/v1/deletebyid/{id}` – Delete order by ID  



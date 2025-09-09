## E-Commerce Backend API

A robust and scalable e-commerce backend API built with Java and Spring Boot. This project provides a complete set of features for managing products, users, orders, shopping carts, and categories in an online store.

## 🚀 Technologies Used

- **Java 17**
- **Spring Boot 3.3.4**
- **Spring Data JPA** (for database interaction)
- **Spring Web** (for building REST APIs)
- **Hibernate Validator** (for request validation)
- **ModelMapper** (for object mapping)
- **Lombok** (for reducing boilerplate code)
- **MySQL** (database)
- **Maven** (build tool & dependency management)
- **RESTful Web Services**

## 📋 Prerequisites

Before running this application, ensure you have the following installed on your system:

- **JDK 17** or later
- **Maven 3.6** or later
- **MySQL** 5.7 or later (or 8.0)
- An IDE like **IntelliJ IDEA**, **VS Code**, or **Eclipse** (recommended)


## 📦 Project Structure

src/main/java/com/nakserver/app/
├── App.java # Main application class
├── config/ # Configuration classes
├── controller/ # REST controllers
├── dto/ # Data Transfer Objects
├── enums/ # Enumeration types
├── exceptions/ # Custom exception handling
├── model/ # Entity models
├── repository/ # Data access layer
├── request/ # Request objects
├── response/ # Response objects
└── service/ # Business logic layer


## ⚙️ Configuration & Setup

1.  **Clone the Repository**
    ```bash
    git clone git@github.com:nawabnak-coder/e-commerce.git
    cd e-commerce
    ```

2.  **Database Setup**
    - Create a MySQL database named `ecommerce_db` (or any name you prefer).
    - Update the `src/main/resources/application.properties` file with your database credentials.

    ```properties
    # application.properties
    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db?useSSL=false&serverTimezone=UTC
    spring.datasource.username=your_mysql_username
    spring.datasource.password=your_mysql_password
    
    # Hibernate settings
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    spring.jpa.properties.hibernate.format_sql=true
    ```

3.  **Build the Project**
    ```bash
    mvn clean install
    ```

4.  **Run the Application**
    You can run the application using Maven:
    ```bash
    mvn spring-boot:run
    ```
    Or by running the main class `ECommerceApplication` (likely located in `src/main/java/com/nakserver/app/ECommerceApplication.java`) directly from your IDE.

    The application will start on `http://localhost:8080`.



## 📚 API Documentation
User Endpoints

    GET /api/v1/users - Get all users

    GET /api/v1/users/{id} - Get user by ID

    POST /api/v1/users - Create a new user

    PUT /api/v1/users/{id} - Update user

    DELETE /api/v1/users/{id} - Delete user

Product Endpoints

    GET /api/v1/products - Get all products

    GET /api/v1/products/{id} - Get product by ID

    POST /api/v1/products - Create a new product

    PUT /api/v1/products/{id} - Update product

    DELETE /api/v1/products/{id} - Delete product

Cart Endpoints

    GET /api/v1/carts/{userId} - Get user's cart

    POST /api/v1/carts/{userId}/items - Add item to cart

    PUT /api/v1/carts/items/{itemId} - Update cart item

    DELETE /api/v1/carts/items/{itemId} - Remove item from cart

Order Endpoints

    GET /api/v1/orders - Get all orders

    GET /api/v1/orders/{id} - Get order by ID

    POST /api/v1/orders - Create a new order

    PUT /api/v1/orders/{id}/status - Update order status

Category Endpoints

    GET /api/v1/categories - Get all categories

    POST /api/v1/categories - Create a new category


## 🧪 Testing

Run the test suite with:
```bash

mvn test
```



## 🛠️ Building for Production

To create a production-ready JAR file:

```bash
mvn clean package

The executable JAR file will be created in the target/ directory. You can run it with:
bash

java -jar target/e-commerce-1.0-SNAPSHOT.jar

```

## 🤝 Contributing

[Explain your contribution guidelines here.]

   1 Fork the Project

   2 Create your Feature Branch ```bash (git checkout -b feature/AmazingFeature)```

   3 Commit your Changes ```bash (git commit -m 'Add some AmazingFeature')```

   4 Push to the Branch ```bash (git push origin feature/AmazingFeature)```

   5 Open a Pull Request

## License
📄 License
This project is open source and available under the [Apache2 License](LICENSE).


## Contact
👥 Contact

Md Nawab Ali Khan - nawabnak@gmail.com

Project Link: https://github.com/nawabnak-coder/e-commerce

## 🆘 Support

If you have any questions or issues, please open an issue in the repository or contact the development team.

## Happy Coding! 🎉

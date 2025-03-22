# 🚀 Spring Boot Kafka with Docker

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.7-green) ![Kafka](https://img.shields.io/badge/Kafka-3.5-orange) ![Docker](https://img.shields.io/badge/Docker-✔️-blue)

## 📜 Overview
This project demonstrates **Apache Kafka integration** with a **Spring Boot application** running inside a **Docker container**.

## 🔥 Features
✅ Spring Boot 3.2.7  
✅ Kafka Producer & Consumer  
✅ Dockerized Microservice  
✅ Maven Build System  

## 📂 Project Structure
```
├── src/main/java/com/example/kafka
│   ├── KafkaProducer.java
│   ├── KafkaConsumer.java
│   ├── KafkaConfig.java
│   ├── Application.java
│
├── src/main/resources/
│   ├── application.properties
│
├── Dockerfile
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites
- Java 17+
- Apache Kafka
- Docker
- Maven

## 🛠 Setup & Run

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/your-username/kafka-spring-boot.git
cd kafka-spring-boot
```

### 2️⃣ Build the Application
```sh
mvn clean package
```

### 3️⃣ Run Kafka using Docker
```sh
docker run -d --name kafka -p 9092:9092 -e KAFKA_ZOOKEEPER_CONNECT=localhost:2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 -e KAFKA_LISTENERS=PLAINTEXT://0.0.0.0:9092 wurstmeister/kafka
```

### 4️⃣ Run the Spring Boot Application in Docker
```sh
docker build -t spring-kafka-app .
docker run -d -p 8080:8080 spring-kafka-app
```

### 5️⃣ Send a Test Message
```sh
curl -X POST http://localhost:8080/publish -H "Content-Type: application/json" -d '{"message":"Hello Kafka"}'
```

## 📢 Kafka Consumer Logs
Check the console logs to verify the message consumption.

## 📜 License
This project is licensed under the **MIT License**.



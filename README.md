# 💬 WhatsApp Chatbot Backend Simulation

A backend simulation of a WhatsApp chatbot built with **Java 21** and **Spring Boot**. This project exposes a REST API that simulates receiving WhatsApp messages, processes them, logs them, and returns predefined responses.

---

## 🚀 Features

- REST API endpoint (`POST /webhook`)
- Accepts JSON request body
- Returns predefined chatbot responses
- Logs incoming messages to the console
- Simple DTO-based request and response handling
- Tested using Postman

---

## 🛠️ Tech Stack

| Component | Technology |
|----------|------------|
| Language | Java21 |
| Framework | Spring Boot |
| Build Tool | Maven |
| IDE | IntelliJ IDEA |
| API Testing | Postman |

---

## 📁 Project Structure

```
src
├── controller
│   └── WebhookController.java
├── dto
│   ├── WebhookRequest.java
│   └── WebhookResponse.java
└── WhatsappChatbotApplication.java
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 21+
- Maven
- IntelliJ IDEA (Recommended)

### Run the Project

```bash
git clone https://github.com/srujan214/whatsapp-chatbot.git
cd whatsapp-chatbot
mvn spring-boot:run
```

Application starts at:

```
http://localhost:8080
```

---

## 📡 API Endpoint

### POST `/webhook`

### Request

```json
{
  "sender": "Srujan",
  "message": "Hi"
}
```

### Response

```json
{
  "reply": "Hello"
}
```

---

## 🤖 Supported Messages

| User Message | Bot Reply |
|--------------|-----------|
| Hi | Hello |
| Hello | Hello |
| Bye | Goodbye |
| Any other message | Sorry, I didn't understand that. |

---

# 📷 Output Screenshots

### Postman Request

> Add your Postman request screenshot here.

```
images/postman-request.png
```

### Postman Response

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/1d6971c2-7ec3-475b-b1e5-ab7581fce0d2" />




## 🎯 Future Improvements

- Database integration (MySQL)
- Real WhatsApp Cloud API integration
- AI chatbot responses
- Docker support
- Unit testing
- Authentication & Security

---

## 👨‍💻 Author

**Srujan A Naik**

GitHub: https://github.com/srujan214

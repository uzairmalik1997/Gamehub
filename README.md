# GameHub - Large Scale Multi-Structure Database Project

GameHub is a web application designed to manage videogame information, user reviews, and social interactions.  
The project demonstrates the use of **multi-structure databases** by integrating **MongoDB** (document database) and **Neo4j** (graph database).

The system is implemented using **Java 17** and **Spring Boot**, following a **client-server architecture**.

---

# Features

### User Features
- Browse videogames
- Search games by **name, genre, and score**
- View detailed game information
- Write reviews with ratings and comments
- Like other users’ reviews
- Add or remove games from personal game lists
- Follow and unfollow other users
- View friends’ game lists
- View basic statistics

### Administrator Features
- Create and delete games
- Delete reviews
- Perform advanced analytics queries

---

# System Architecture

The application follows a **Client-Server architecture**.

## Backend
- Java 17
- Spring Boot
- REST APIs
- MVC pattern (Controller, Service, Repository)

## Databases
Two database technologies are used:

### MongoDB
Used for storing main application data:
- Games
- Reviews
- Users

Optimized for **read-heavy operations** using:
- Embedded documents
- Indexing
- Aggregation pipelines

### Neo4j
Used for managing **social relationships**:
- User → Follow → User
- User → Add → Game
- User → Like → Review

Graph queries enable efficient retrieval of:
- Friend networks
- Recommended users
- Suggested games

---

# Dataset

The application uses datasets collected from Kaggle:

- Steam Games Dataset (~83k documents)
- Metacritic Reviews Dataset (~284k documents)
- Generated Users Dataset (~133k users)

These datasets simulate a **large-scale environment**.

---

# Key Database Design Concepts

## MongoDB
Collections:
- `games`
- `reviews`
- `users`

Design strategies:
- Embedded top reviews inside game documents
- Compound indexing
- Aggregation queries
- Read-oriented optimization

## Neo4j
Nodes:
- User
- Game
- Review

Relationships:
- `FOLLOW`
- `ADD`
- `LIKE`

Graph queries allow efficient traversal of social relationships.

---

# Technologies Used

- Java 17
- Spring Boot
- MongoDB
- Neo4j
- Maven
- Postman
- Faker (for user data generation)

---

# Example Queries

### MongoDB
- Search games by genre
- Retrieve top reviews
- Aggregation statistics

### Neo4j
- Suggested friends
- Suggested games
- Retrieve friends' game lists









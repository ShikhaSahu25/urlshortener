# Scalable URL Shortener

A production-ready URL shortener service like Bitly, built using Java, Spring Boot, PostgreSQL, and Redis. Supports caching, TTL, and basic analytics.

## Features

- Generate short URLs for given long URLs
- Redirect short URLs to original URLs
- Redis caching for fast resolution
- PostgreSQL for persistent storage
- TTL support for short URLs
- Basic stats endpoint (click counts)

## Tech Stack

- Java 17
- Spring Boot 3
- PostgreSQL
- Redis
- Docker
- Swagger
- JUnit 5

## Getting Started

### Prerequisites
- Java 17+
- Docker
- Maven

### Setup

1. Clone the repo
   ```bash
   git clone https://github.com/your-username/url-shortener.git
   cd url-shortener

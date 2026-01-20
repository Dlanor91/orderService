# 🚀 API REST Java 17 + Spring Boot + PostgreSQL

Proyecto base para construir una **API REST profesional**, moderna y escalable usando **Java 17**, **Spring Boot 3** y **PostgreSQL**.

Este repositorio está pensado como **base sólida de aprendizaje y producción**, evitando boilerplate innecesario y siguiendo buenas prácticas reales de backend.

---

## 🧱 Stack tecnológico

* **Java 17** (LTS)
* **Spring Boot 3.x**
* **Spring Web** – API REST
* **Spring Data JPA (Hibernate 6)** – Persistencia
* **PostgreSQL** – Base de datos relacional
* **Lombok** – Reducción de código repetitivo
* **Bean Validation (Jakarta Validation)**
* **Springdoc OpenAPI** – Swagger / OpenAPI

---

## 📂 Estructura del proyecto

```
src/main/java/com/rony/tuapp
├── controller   # Endpoints REST
├── service      # Lógica de negocio
├── repository   # Acceso a datos (JPA)
├── entity       # Entidades JPA
├── dto          # Objetos de transferencia
├── exception    # Manejo de errores
├── config       # Configuración general
└── OrderServiceApplication.java
```

Esta estructura permite crecer hacia **arquitectura limpia, hexagonal o microservicios** sin refactors traumáticos.

---

## ⚙️ Configuración

### 📌 Requisitos

* Java 17+
* Maven 3.5.9
* PostgreSQL 17
---

## ▶️ Ejecución

Desde la raíz del proyecto:

```bash
mvn spring-boot:run
```

La aplicación quedará disponible en:

```
http://localhost:8091
```

---

## 📑 Documentación API (Swagger)

Una vez levantada la aplicación:

```
http://localhost:8091/swagger-ui.html
```

Generado automáticamente con **Springdoc OpenAPI**.

---

## 🧠 Buenas prácticas aplicadas

* Separación clara de capas
* Configuración por YAML
* Dependencias mínimas necesarias
* Preparado para perfiles (`dev`, `test`, `prod`)
* Compatible con Docker, CI/CD y microservicios

---

## 📚 Referencias oficiales

* Spring Boot Docs: [https://docs.spring.io/spring-boot/docs/current/reference/html/](https://docs.spring.io/spring-boot/docs/current/reference/html/)
* Spring Data JPA: [https://spring.io/projects/spring-data-jpa](https://spring.io/projects/spring-data-jpa)
* PostgreSQL JDBC: [https://jdbc.postgresql.org/](https://jdbc.postgresql.org/)
* Springdoc OpenAPI: [https://springdoc.org/](https://springdoc.org/)

---

## 🧑‍💻 Autor

Proyecto creado por Ronald Lima como base de estudio y evolución profesional en backend Java.
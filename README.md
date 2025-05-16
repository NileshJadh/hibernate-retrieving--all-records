# Hibernate Query Example - Retrieving All Records

This project demonstrates the use of Hibernate ORM to retrieve all records from a database table (`students`) using HQL.

---

## **Overview**

- **Entity**: `Student` class represents the `students` table in the database.
- **Query**: Uses HQL (`FROM Student`) to fetch all records.
- **Database**: Hibernate is configured via `hibernate.cfg.xml` to connect to the database.

---

## **Technologies Used**

- Java
- Hibernate ORM
- JPA Annotations
- Relational Database (MySQL/PostgreSQL)
- Maven (optional)

---

## **How It Works**

1. **Entity Mapping**:
   - The `Student` entity is mapped to the `students` table using JPA annotations.

2. **Session and Query Execution**:
   - A Hibernate session is opened, and an HQL query is executed to fetch all records.

3. **Result Processing**:
   - The results are retrieved as a `List<Student>` and iterated to print each record.

4. **Session Closure**:
   - The session and session factory are closed properly to release resources.


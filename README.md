# 20230323-Java-SRE

## Key Review Topics

## Java

### Object Oriented Programming
- **Classes vs Objects**
- **Primitives vs Non-Primitives**
- **Inheritance**
  - **Method Overriding**
- **Encapsulation**
  - **public**
  - **private**
  - protected
  - default
- **Polymorphism**
  - **Method Overloading**
- **Abstraction**
  - **Interfaces**
  - Abstract Classes
- **Static**
- **JVM**
- **Garbage Collection**
  - **Stack**
  - **Heap**

### Data Structures
- **Array**
- **ArrayList**
- **LinkedList**
- **Stack**
- **Queue**
- **Map**
- **HashMap**
- Deque
- PriorityQueue
- Set
- HashSet
- TreeSet
- TreeMap

### General Programming
- **Exceptions**
  - **Checked vs Unchecked Exceptions**
  - throws Clause
  - try-with-resources
    - AutoCloseable
- I/O Streams
- Functional Programming
  - Lambdas
  - Pure Functions
  - Side Effects
  - Functional Interfaces
  - Stream
  - map, filter, reduce, forEach
  - java.util.function

### Multithreading
- **Thread Class vs Runnable Interface**
- **Thread Safety**
- **synchronized and volatile Keywords**
- Thread States
- java.util.concurrent Classes
- Deadlock vs Livelock
- Atomic Classes
- ArrayBlockingQueue

### Design Patterns
- **Factory Design Pattern**
- **Observer Design Pattern (Pub/Sub)**
- **Singleton Design Pattern**
- **Producer Consumer Design Pattern**
- **Facade Design Pattern**
- Builder Design Pattern
- Strategy Design Pattern

### Unit Testing
- **JUnit**
- **Test Driven Development**
- Assertion Methods

### Maven
- **pom.xml**
- **Dependencies**
- **Maven Build Lifecycle**
- Project Coordinates
- Plugins
- Goals
- Phases

## Databases

### SQL
- **Relational Databases**
- **PostgreSQL**
- **Primary Keys**
- **Foreign Keys**
- **One To One Relationships**
- **One To Many Relationships**
- **Many To Many Relationships**
- **Database Normalization**
  - **1NF**
  - **2NF**
  - **3NF**
- **ACID**
  - **Transactions**
  - **Rollbacks**
- **DDL**
  - **CREATE**
  - **DROP**
  - ALTER
  - RENAME
- **DML (SQL Queries)**
  - **SELECT**
  - **WHERE**
  - **ORDER BY**
  - **GROUP BY**
  - **JOINS**
  - **Aggregate Functions**
  - HAVING
  - LIMIT
  - OFFSET
  - AS

### NoSQL
- **Non-Relational Databases**
- MongoDB/DocumentDB
- DynamoDB

## Spring Boot

### Spring Framework
- **Spring Beans**
  - Bean Scopes
  - Lazy/Eager Instantiation
  - Spring Bean Lifecycle
- **Application Context**
- **Dependency Injection**
- **application.properties / application.yml**
- **Spring Profiles**

### Spring Annotations
- **@Bean**
- **@Configuration**
- **@Controller**
- **@RestController**
- **@Service**
- **@Repository**
- **@Autowired**
- **@Value**
- **@GetMapping**
- **@PostMapping**
- **@PutMapping**
- **@DeleteMapping**
- **@PathVariable**
- **@RequestBody**
- **@RequestParam**
- **@OneToMany**
- **@JoinColumn**
- **@Id**
- **@Entity**
- **@Table**
- **@Column**
- **@Query**
- **@Transactional**
- @Component
- @ControllerAdvice
- @RestControllerAdvice
- @Qualifier
- @Scope
- @Primary
- @CrossOrigin
- @RequestMapping
- @ResponseBody
- @Valid
- @CookieValue
- @OneToOne
- @ManyToMany
- @PreAuthorize
- @Profile

### Spring Web
- **MVC Design Pattern**
- **Data Transfer Object (DTO)**
- JSR-303
- DispatcherServlet
- ViewResolver
- HandlerMapping
- ServletRequest
- ServletResponse
- Filters

### Spring Data JPA
- **Hibernate**
- **JPQL**
- **Lazy vs Eager FetchType**
- **JpaRepository**
- CrudRepository
- PagingAndSortingRepository
- Data Access Object (DAO)

### Aspect Oriented Programming
- **Global Exception Handling**
- Cross Cutting Concerns
- Join Points
- Advice
  - Before
  - After
  - AfterThrowing
  - AfterReturning
  - Around
- Aspects

### Spring Security
- **Authentication vs Authorization**
- **Authorities**
- **Roles**
- **Sessions**
- **Security Filter Chain**
- **HttpSecurity**
  - **MvcMatchers**
  - AntMatchers
- **UserDetails**
- **UserDetailsService**
- **OAuth2.0**
  - **OAuth Workflow**
  - **Authorization Server**
  - **Resource Server**
  - **Client**
  - **Resource Owner**
  - **Authorization Code**
  - **Scope**
  - **Redirect URI**
  - **Access Token**
  - Refresh Token
- **Open ID Connect (OIDC)**
  - **ID Token**
- Principal

## Web
- **HTTP**
- **HTTPS**
- **JSON**
- **CORS**
- **Cookies**
- **JWT**
- **Stateful**
- **Stateless**
- Local Storage
- Session Storage
- XSS
- CSRF
- XML
- Web Sockets

### HTTP Request
- **HTTP Methods**
  - **GET**
  - **POST**
  - **PUT**
  - **DELETE**
  - PATCH
  - HEAD
  - OPTIONS
- **Request Body**
  - **HTTP Headers**
    - **Authorization**
    - **Content-Type**
- **Query Parameters**
- Idempotency
- Safety

### HTTP Response
- **Status Code**
  - 1xx (Informational)
  - **2xx (Successful)**
    - **200 OK**
    - **201 Created**
    - 204 No Content
  - **3xx (Redirectional)**
    - **307 Temporary Redirect**
    - **308 Permanent Redirect**
  - **4xx (Client Error)**
    - **400 Bad Request**
    - **401 Unauthorized**
    - **403 Forbidden**
    - **404 Not Found**
    - 405 Method Not Allowed
    - 418 I'm a teapot
  - **5xx (Server Error)**
    - **500 Internal Server Error**
    - 502 Bad Gateway
    - 504 Gateway Timeout
- **Response Body**

### REST
- **6 Architectural Constraints of REST**
- **URL Naming Conventions**
- **URL Hierarchy**
- **URL Versioning**
- Other Alternatives
  - SOAP
  - GraphQL
  - gRPC
  - Web Sockets

### HTML
- **Head vs Body Tag**
- **Inline vs Block Elements**
- **HTML Attributes**
- **Anchor Tags**
  - _blank
  - _self
  - Bookmark
- **Images**
- Semantic HTML
- h1-h6
- Meta Tags
- SEO

### CSS
- **Styling**
- **CSS Selectors**

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
- Internationalization (i18n)

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
- **CSS Box Model**
- **Flex Box**
- **Absolute vs Relative Units**
- Pseudo Classes and Selectors
- Flex Grid
- Transitions

### JavaScript
- **Variable Scopes**
- **Objects**
- **Truthy/Falsy**
- **Null and Undefined**
- **Closures**
- **Higher Order Functions**
- **Spread and Rest Operators**
- Variable Hoisting
- Template Literals
- Prototypes
- Optional Chaining Operator
- Nullish Coallescing Operator
- Node.js
- TypeScript

#### DOM
- **Document Object Model**
- **Events**
- document.getElement
- document.createElement
- HTML Forms
- innerHTML and innerText
- XSS

#### Asynchronous JavaScript
- **JavaScript Event Loop**
- **Promises**
- **AJAX**
- setTimeout/setInterval/clearInterval
- async and await

### React
- **Client Side Rendering**
- **Server Side Rendering**
- **Virtual DOM**
- **Babel**
- **ReactDOM**
- **React Components**
- **Component Lifecycle**
- **React Rendering Process**
- **state and props**
- **React Context**
- Vite
- Rollup
- ESBuild
- Controlled vs Uncontrolled Components

#### React Hooks
- **useState**
- **useEffect**
- **useContext**
- useRef
- useReducer

#### React Router DOM
- **Client Side Routing**
- **Routes**
- History API
- useNavigate
- useParams
- useLocation

#### Redux
- **Flux Design Pattern**
- **Redux Toolkit**
- **Redux Store**
- **RTK Query**

## AWS
- **AWS Global Infrastructure**
- **Availability Zones**
- **Regions**
- **IAM**
  - **Users**
  - **Roles**
  - **Policies**
- **AWS Organizations**
  - Consolidated Billing
- **AWS Accounts**
- **Pricing**
- **CloudWatch**
  - **CloudWatch Logs**
  - **CloudWatch Alarms**
  - **CloudWatch Dashboards**
- **CloudTrail**
- **SQS**
- **SNS**
- **Migration and Adoption**
- **AWS Well Architected Framework**
- **Scalability**
- **Elasticity**
- **Availability**
- **AWS Outposts**

### Compute
- **EC2**
  - **AMI**
  - **Instance Types**
  - **Tenancy**
  - **EBS**
  - **Instance Stores**
  - User Data
- **ECS**
- **EKS**
- **Serverless Computing**
  - **Lambda**
    - **Lambda Triggers**
    - AWS Step Functions
  - **Fargate**
  - **API Gateway**
- **Auto Scaling**
- Elastic Beanstalk

### Storage
- **S3**
  - **Buckets**
  - **Objects**
  - **Object Versioning**
  - **Storage Classes**
  - **Bucket Policies**
  - **Bucket Lifecycle Policies**
- **CloudFront**
- EFS
- FSx

### Databases
- **RDS**
  - **RDS Standby**
  - **RDS Read Replicas**
- **Amazon Aurora**
- **DynamoDB**
  - Read/Write Capacity Units
- DocumentDB
- ElastiCache
- AWS Database Migration Service

### Networking
- **VPC**
- **IGW**
- **NAT**
- **Public and Private Subnets**
- **VPC Endpoints**
- **VPC Peering**
- **Security Groups**
- **NACLs**
- **AWS Direct Connect**
- **Amazon Route 53**

### Security
- **KMS**
- **Secrets Manager**
- **Principals**
- **Least Privilege**
- **Service Control Policies**
- AWS Shield
- Trusted Advisor

## DevOps
- **Continuous Integration**
- **Continous Deployment**
- **CI/CD Pipelines**
- **Environments**
  - **dev**
  - **prod**
  - **staging**
  - uat

### GitHub
- **Git**
- **Git Commands**
- **Git Branching**
- **Version Control**
- **Pull Requests**
- **GitHub Actions**
  - **Workflows**
- GitHub Issues

### Containerization

#### Docker
- **Docker**
- **Containers vs VMs**
- **Dockerfile**
- **Docker Images**
- **Docker Commands**
- **DockerHub**
- Docker Compose

#### Kubernetes
- **K8s**
- **Pods**
- **Nodes**
- **Control Plane**
- **Deployments**
- **Services**
- **Self Healing**
- **kubectl**
- **Load Balancing**

## Microservices
- **Microservices vs Monolith**
- **Resiliency**

### Cloud Native Design Patterns
- **API Gateway**
- **Client Breaker**
  - **Cascading Failures**
  - **Exponential Backoff**
- **Service Discovery**
- **Message Queues**
  - **Pub/Sub**
- **Sidecar**
- Retry
- Request Metering

### Spring Cloud
- **Spring Cloud Gateway**
  - **Routing**
  - **Common Responsibilities**
- **Eureka Client**
- **Eureka Server**
- **Resilience4J Circuit Breaker**
- **RabbitMQ**

## SRE
- **Reliability**
- **SLIs**
- **SLOs**
- **SLA**
- **Error Budgets**
- **Alerting**
- **PagerDuty**

### Observability
- **Monitoring vs Observability**
- **Logs**
- **Traces**
- **Metrics**
- **Unknown Unknowns**
- **Telemetry**
- **OpenTelemetry**
  - **Spans**
  - **Context**
  - **Scope**
  - **Automatic Instrumentation**
  - **Manual Instrumentation**
  - OpenTelemetry Collector
- **Honeycomb**

### Chaos Engineering
- **Hypothesis**
- **Experiments**
- **Validation**
- **Game Day Scenarios**
- Chaos Monkey
- AWS FIS
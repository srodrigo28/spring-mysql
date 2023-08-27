# Crud Java Spring Boot
* Link de referência Michele Brito
```
https://www.youtube.com/watch?v=wlYvA2b1BWI
```

https://www.javadevjournal.com/spring-boot/spring-boot-mysql/#google_vignette

### Postgres properties
```
spring.datasource.url= jdbc:postgresql://localhost:5432/banco_app
spring.datasource.username=postgres
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
```

### Mysql properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/banco_app
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update

#spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
```

### Mavem
```
https://mvnrepository.com/
```

### Points urls

* Post
```
http://localhost:8080/api/produtos
```

* Get
```
http://localhost:8080/api/produtos
```
### JSON Post

{
    "nome": "notebook",
    "quantidade": 20,
    "valor": 2000
}
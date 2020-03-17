# docker-springboot-poc
This project consists of connectivity of dockerized spring-boot with oracle as well as h2 db

## For In-memory database (h2 is our case)

### pom.xml
	<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>

### application.properties
```
 spring.datasource.url=jdbc:h2:mem:dockerdb
 spring.datasource.driverClassName=org.h2.Driver
 spring.datasource.username=tanuj
 spring.datasource.password=1234
 spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
 spring.h2.console.enabled=true
 spring.h2.console.settings.web-allow-others=true
 server.port=9999
 ```
---

## For Oracle

### pom.xml
	<dependency>
			<groupId>com.oracle.ojdbc</groupId>
			<artifactId>ojdbc8</artifactId>
			<scope>runtime</scope>
		</dependency>

    
### application.properties
```
 spring.datasource.url=jdbc:oracle:thin:@192.168.99.100:1521:ORCLCDB
 spring.datasource.username=dummy
 spring.datasource.password=dummy
 spring.datasource.driver.class.name=oracle.jdbc.driver.OracleDriver
 spring.jpa.hibernate.ddl-auto=update
```

# Jasper
>Spring Boot Web Application with JSP
```
-Add dependenties to pom.xml
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <scope>provided</scope>
</dependency>
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>
-Add to application.properties
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
-Create file structure:
scr/main/webapp/WEB-INF/jsp/contact.jsp


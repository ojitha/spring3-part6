# spring3-part6

A Spring 3 example demonstrating Aspect-Oriented Programming (AOP) with various types of advice (Before, After, AfterReturning, Around) using AspectJ.

## Components

- Generic `Hello<T>` interface with `HelloService` implementation
- `LoggerAspect` providing logging functionality through AOP
- `Message` class for data transfer
- Spring configuration using both XML and annotations

## Technologies

- Spring Framework 3
- AspectJ
- Log4j
- JUnit

## Project Structure

```
src/
├── main/java/
│   └── au/com/ojitha/blogspot/example/part6/
│       ├── Hello.java
│       ├── HelloService.java
│       ├── LoggerAspect.java
│       └── Message.java
└── test/
    └── java/
        └── au/com/ojitha/blogspot/example/part6/
            └── HelloServiceConfigurationTests.java
```

## Configuration

The application is configured using Spring XML configuration in `META-INF/spring/app-context.xml` with:
- AspectJ auto-proxy support
- Component scanning for package `au.com.ojitha.blogspot.example.part6`

## Testing

The project includes unit tests demonstrating the AOP functionality with the `HelloService`.
## Resources
- https://medium.com/@tareq23/creating-spring-beans-using-xml-configuration-within-the-spring-inversion-of-control-ioc-067613d7c5c7

## Adding Spring-Context to project
```bash
implementation("org.springframework:spring-context:7.0.0-M9")
```

## Bean configuration
- Bean configuration is a way to instruct Spring to look for bean definitions and dependencies
- Two types of configuration
	1. XML - A xml configuration file placed in src/main/resources/\*.xml, having all required bean definitions and dependencies.
	2. Annotation (Java config) - A class annotated as `@Configuration` having bean definitions and methods returning beans using `@Bean`

		```Java
		// Get beans using application context
		ApplicationContext context = new ClassPathXmlApplicationContext("<beans.xml>"); // using xml
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class); // using annotation
		Object object = context.getBean("unique bean id defined in xml");
		```

## Dependency Injection
- Way of injecting POJO's where ever required
- Two types
	1. Setter injection - uses setters to inject into the bean and setter has to be defined for which ever property is being injected
	2. Constructor injection - uses class constructor to inject and constructor must be defined with the injecting property

## Annotations
1. `@Autowired` - (property level) looks for the class name specified and tries to inject an instance of that class.
2. `@Component` - (class level) Basic annotation instructing Spring to consider bean creation
3. `@Repository` - (class/interface level) `@Componenet` + ability to handle database operations.
4. `@Service` - (class/interface) `@Component` + defines business logic
5. `@Controller` - (class) `@Component` + handles web layer, returns views/json using `@ResponseBody`
6. `@Configuration` - (class) `@Component` + defines any other configuration, including other `@Bean` definitions
7. `@Qualifier("<name of the bean>")` - used to resolve ambiguity when multiple beans are created of the same class
8. `@ComponentScan("<package name>)`- level at which the spring should scan for `@Component` annotations (should be annotated to `@Configuration` class when using annotation based configuration).
## Bean vs Component
| Aspect        | @Bean                                  | @Component                       |
| ------------- | -------------------------------------- | -------------------------------- |
| Bean Creation | Manual in a `@Configuration` method    | Automatic via classpath scanning |
| Control       | More, as we can modify at method level | Less                             |

## Spring with JPA, H2 Database
- Add Spring JPA, Jakarta Persistence and H2 Gradle dependencies
```gradle
// https://mvnrepository.com/artifact/com.h2database/h2
implementation("com.h2database:h2:2.2.224")
// https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core
implementation("org.hibernate.orm:hibernate-core:6.1.0.Final")
// https://mvnrepository.com/artifact/org.springframework.data/spring-data-jpa
implementation("org.springframework.data:spring-data-jpa:3.5.4")
// https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api
implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
```

- Create `AppConfig.java` to hold database configs
- Use services just like others, by getting the service bean from `ApplicationContext` and calling methods on it.
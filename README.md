# 8th Homework of the Java Test Automation Course (2nd block) - Solvd Laba
This repository stores the 8th homework given by our mentor in the 2nd block of 
the Java Test Automation Course at Solvd Laba. It consists in apply different
design patterns such as Decorator, Factory Method, Listener, Proxy, Facade,
Builder, Abstract Factory and Strategy and also apply SOLID principles in our
project.

## Explanation

To fulfill the requirements of the homework, I've applied the SOLID principles
in my project, and also I've created examples for the required design patterns
in the package "design_patterns". I haven't applied the MVC architecture within
the package since the project itself already adheres to it.

Design patterns:
Factory Method:
To implement this pattern I created an abstract class named Computer acting as 
the Creator. It has an abstract method known as "factory method" and a field of the
IOperativeSystem datatype. Then, I created two Concrete Creators that extend 
Computer, each implementing the factory method to return their respective 
operative systems.
Abstract Factory:
For this pattern I created an Abstract Factory named RestaurantFactory
that has two implementations, also known as Concrete Factories. The 
RestaurantFactory abstract class has two abstract methods that return as datatype
two different interfaces and each Concrete Factory must implement these methods
to return their respective implementations of those interfaces. In this case, I
created a vegan restaurant and a regular restaurant, the vegan one will return
only vegan food while the regular restaurant will return normal food.
Decorator:
I implemented this pattern by simulating a base SMSNotifier that implements the 
INotifier interface which will be stored in a field of the Base Decorator named 
BaseNotifierDecorator, which implements the INotifier interface as well 
acting as a wrapper. Then, all the implementations of BaseNotifierDecorator
must override the necessary methods from the parent, calling the parent's method
before their specific behavior. Additionally, they create a constructor calling 
the parent's constructor to attach as many behaviors as needed.
Facade:
To give an example of this pattern I created a burger library example and 
in the facade class named BurgerRestaurant I provided behaviour and functionality to the
library, so it now works as an interface to a complex set of classes.
Proxy:
For this pattern I attempted to simulate the real life internet behavior. I created an
Internet interface with a connectTo(url) method, and a RealInternet class 
implements it. But the key of this pattern is in the ProxyInternet class, which
acts as a proxy, caches non visited websites and restricts the access to some
websites.
Listener/Observer:
This pattern was implemented in an easy way. A class named GamesCompany acts
as the publisher, it has methods to add and remove subscribers from a list and
to notify them about something. There is also an interface for the subscribers
named ISubscriber that has the method update. This method will be executed for
each subscriber in the GamesCompany class when it executes the notifySubscribers
method.
Strategy:
To make this pattern I created a Context class named WebsiteService, which has a
LoginStrategy interface as a field. This LoginStrategy interface is implemented
by two classes named FacebookLogin and GoogleLogin, allowing us to switch between the
different strategies at runtime.

Applying SOLID principles:

Single Responsibility Principle: In order to accomplish this principle, I've
created two util classes named JsonParser and XmlParser to change these parser
methods from the Main class to their respective classes. This was the only 
violation of this principle I noticed, since the Main class should have only
the responsibility of initializing the application and managing the code flow.
Open Closed Principle: This principle states that the classes should be open
for extension but closed for modification. I haven't made changes explicitly to 
adhere to this principle since all classes are extensible without modifying them.
Liskov Substitution Principle: It states that base types should be replaceable
by subtypes without problem. Since I am already using interfaces to achieve
abstraction in my program (for instance, in the case of the DAOs for the different
implementations), I consider that this principle is being followed.
Interface Segregation Principle: It states that many specific interfaces are
better than a general interface. To adhere to this principle I had to split
a lengthy interface named IBaseDAO into smaller interfaces named IGetEntity,
IUpdateEntity, IRemoveEntity and IInsertEntity.
Dependency Inversion Principle: It states that we must depend on abstractions
and not on concrete classes. This principle is already being followed since the use
of interfaces for AnimalRoomDAO, DepartmentDAO and ZooDAO allows us to switch 
between both JDBC and MyBatis databases implementations.

Other good practices:
"YAGNI" is another good practice I've applied since I removed unnecessary
methods from the program.

## What did I learn?

In this homework I've learned a lot about different design patterns and how to
apply them, and about the SOLID principles to make my code maintainable.

## Technologies

- Java
- Maven
- MySQL
- JDBC
- MyBatis
- XML, XSD, SAX Parser
- Jackson

## Set-Up

To run this project you will need an updated version of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
You will need an IDE to open the project folder and, finally, run the 
Main.java file to see the program output.

## Author

- [@Nazareno Bucciarelli](https://github.com/nazabucciarelli)

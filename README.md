# Welcome to the Mercedes Java Project! 
This project is a Java implementation focusing on Mercedes-related functionalities. 
Whether you're interested in exploring Mercedes car models, services, or any other aspect, this project has you covered.

***Decorator Pattern***:
The Decorator Pattern is used to add new functionality to an object dynamically without altering its structure.
We created "MercedesInterface" with method ChooseMercedes().
We had 3 types of Mercedes complications as a BasicMercedes,SportMercedes,LuxuryMercedes and the main point is to tunning car by decorating it.

***Adapter Pattern***:
The Adapter Pattern is used to allow the interface of an existing class to be used as another interface.
It involves a single class called Adapter, which is responsible for joining functionalities of independent or incompatible interfaces.We created a 2 interfaces that called "AmericanSocket" and "Eurosocket" that has an own methods and "Charger" class creates eurosocket by basic and we can turn any socket by the client need it can be American or Euro as well.

***Observer Pattern***:
The Observer Pattern is used to define a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified and updated automatically.
In this pattern, there are subject and observer objects.We used an observer pattern so that people who subscribed to the update and are interested in new Mercedes models could immediately find out about its release and could also, if they wished, unsubscribe from updates and not receive notifications about new models.With Observer and Observed interfaces.

***Factory Pattern***:
The Factory Pattern provides an interface for creating instances of a class, but allows subclasses to alter the type of instances that will be created.
In general, a factory class creates objects based on certain conditions or parameters, encapsulating the object creation logic and allowing the client code to use the factory to create objects without specifying their concrete types.
Our factory has CarHandsFabric main interface and CarHand interfaces that has a method to create car by country hand, if user is from a left sided driving country,so we create left handed car and its same for right side.

***Singleton Pattern***:
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance.
The class usually provides a static method to access the instance and prevents any other class from instantiating it.
We use the singleton pattern to illustrate that it doesn’t matter where the car’s service center is located, they are still a franchise of the main Mercedes center.

***Strategy Pattern***:
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the client to choose the appropriate algorithm at runtime.
In this pattern, you have a strategy interface that defines a set of algorithms. Concrete strategy classes implement these algorithms. A context class, which uses a strategy, can switch between different strategies dynamically.
Each of these patterns addresses specific design problems and promotes flexibility, reusability, and maintainability in software development.
Strategy contains CarBody interface and CarConfiguration class, and two MercedesAclass and MercedesGclass bodies that implement CarBody, also CarConfiguration has description of body type of a car.

# Features:
**Car Models:** Explore different Mercedes car models and their specifications.
**Services:** Perform various services for Mercedes vehicles, such as maintenance, repairs, etc.
**Java Implementation:** The project is written entirely in Java, making it platform-independent and easy to understand.


We certainly used all six patterns: Singelton,Strategy,Observer,Factory,Decorator,Adapter.
The main goal was to understand the importance of all patterns and SOLID, OPP principes.
This project is a team work that consist of 2 members, sincerely : Abay Dyussembayev and Shakhnur Aubakirov.

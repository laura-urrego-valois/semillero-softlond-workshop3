# Workshop 3 of the Semillero Softlond Backend Frontend

## Exercises to practice the knowledge acquired in handling inheritance and polymorphism in Java.

1. Geometric Shapes: Create a class hierarchy representing different geometric shapes such as circles, triangles, and squares. Use an interface to define common methods like area and perimeter calculation. Each shape should have its own implementation of these methods.

2. Notification System: Design a notification system capable of handling various types of notifications, such as emails, text messages, and push notifications. Create an interface defining a send method and abstract classes for each notification type. Then implement concrete classes for each notification type.

3. Bank and Accounts: Develop a banking system that includes an interface to represent bank accounts and methods for depositing and withdrawing money. Create an abstract class implementing common account logic and then implement concrete classes for different account types, such as savings accounts and checking accounts.

4. Card Game: Create a card game where you can represent different types of cards (e.g., poker cards) using a class hierarchy and an interface. The interface could define methods like showCard and numericValue. Then implement classes for different card types and for the deck.

5. Online Store: Build a basic system for an online store. Create an interface to represent products and methods like calculatePrice and showDetails. Implement abstract classes for different product categories (electronics, clothing, books, etc.) and concrete classes for specific products in each category.

6. Animals and Sounds: Create a class hierarchy representing different types of animals, such as dogs, cats, and birds. Each animal class should have a method makeSound() that prints the characteristic sound of the animal. Then create an array of animals and iterate through the array, calling the makeSound() method on each one. This demonstrates how polymorphism allows treating objects of different classes uniformly.

7. Geometric Shapes and Areas: Use the geometric shapes class hierarchy you created in the previous exercise (with interfaces and abstract classes). Add a method calculateArea() to the interface of shapes and then implement this method in the concrete classes. Create an array of shapes and calculate the area of each one using polymorphism.

8. Employees and Salaries: Create a class hierarchy to represent different types of employees, such as salaried and hourly employees. Each class should have a method to calculate the salary. Use polymorphism to calculate the salary of different types of employees in an array.

9. Musical Instruments: Design a class hierarchy for musical instruments, such as guitars, pianos, and violins. Each instrument should have a play() method that prints how it sounds. Then create a method that takes an array of instruments and makes them play using polymorphism.

10. Figures on a Canvas: Create an interface called Drawable with a draw() method and an abstract class Figure that implements this interface. Then implement different classes of figures (circles, rectangles, etc.) that extend the Figure class. Create a Canvas class with an array of Drawable objects and, using polymorphism, call the draw() method on each object. 

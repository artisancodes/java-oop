# Java OOP

### What is OOP?
OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or methods that perform operations on data, while object-oriented
programming is about creating objects that contain both data and methods.

Advantages:
- OOP is faster and easier to execute
- OOP provides a clear structure for the programs
- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
- OOP makes it possible to create full reusable applications with less code and shorter development time.

## Java Classes/Objects
Everything in Java is associated with classes and objects, along with its attributes and methods.
In real life, a car is an object. The car has **attributes**, such as weight and color, and **methods**, such as 
drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

## Java Class Attributes/Methods
Attributes in a class define the data, while methods define the behaviors.

### Java Class Attributes
The snippet code below, creates a class called "Main" with two attributes: **x** and **y**:
```
public class Main {
    int x = 5;
    int y = 3; 
}
```
Another term for class attributes is **fields**.

### Accessing Attributes
You can access attributes by creating an object of the class, and by using the dot syntax(.);
```
public class Main {
    int x;
    
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.x);
    }
}
```

### Modify Attributes
You can also modify/override attributes value:
```
public class Main {  
    int x = 10;
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.x = 50; // x is now 50
        System.out.println(obj.x);
    }
}
```

If you don't want the ability to override existing values, declare the attribute as **final**:
```
public class Main {  
    final int x = 10;
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.x = 50; // will generate an error: cannot assign a value to a final variable
        System.out.println(obj.x);
    }
}
```
The **final** keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

#### Static vs. Public
You will often see Java programs that have either **static** or **public** attributes and methods:
- Static Methods can be accessed without creating an object.
- Public Methods can be only accessed by objects.

## Java Constructors
A constructor in Java is a **special method** that is used to initialize objects. The constructor is called when an 
object of a class is created. It can be used to set initial values for object attributes.
 ```
 public class Main {

    // Create a class attribute
    int x;

    // Create a class constructor for the Main class
    public Main() {
        // Set the initial value for the class attribute x
        x = 5;
    }
    
    ...
 ```

The constructor name must **match the class name**, and it cannot have a **return type**. All classes have constructor by
default: if you do not create a class constructor yourself, Java creates one for you. However then you are not able to 
set initial values for object attributes.

### Constructor Parameters
Constructors can also take parameters, which is used to initialize attributes.

## Java Modifiers
The **public** keyword is an **access modifier**, meaning that is used to set the access level for classes, attributes, 
methods and constructors.

### Access Modifiers

We divide modifiers into two groups:
- **Access Modifiers** - controls the access level
- **Non-Access Modifiers** - dot not control access level, but provides other functionality

For **classes**, you can use either **public** or default:
- **public**: The class is accessible by any other class
- default: The class is only accessible by classes in the same package

For **attributes. methods and constructors**, you can use the one of the following:
- **public**: The code is accessible for all classes
- **private**: The code is only accessible within the declared class
- **default**: The code is only accessible in the same package
- **protected**: The code is accessible in the same package and **subclasses**

### Non-Access Modifiers
For **classes**, you can use either **final** or **abstract**:
- **final**: The class cannot be inherited by other classes
- **abstract**: The class cannot be used to create objects

For **attributes and methods**, you can use the one of the following:
- **final**: Attributes and methods cannot be overridden/modified
- **static** Attributes and methods belongs to the class, rather than on object
- **abstract**: Can only be used in an abstract class, and can only be used on methods. The **method** does not have 
a body. The **body** is provided by the subclass(inherited from)
- **transient**: Attributes and methods are skipped when serializing the object containing them
- **synchronized**: Methods can only be accessed by one thread at a time.
- **volatile**: The value of an attribute is not cached thread-locally, and is always read from the "main memory".

## Java Encapsulation
The meaning of **Encapsulation**, is to make sure the "sensitive" data is hidden from users. To achieve this, you must:
- declare class variables/attributes as **private**
- provide public **get** and **set** methods to access and update the value of a **private** variable.

### Why Encapsulation
- Better control of class attributes and methods
- Class attributes can be made **read-only** (get method), or **write-only** (set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increasing security data

## Java Inheritance
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept"
into two groups:
- **subclass** (child) - the class that inherits from another class
- **superclass** (parent) - the class being inherited from
To inherit from a class, use the **extends** keyword.

### Why and When to use Inheritance?
- It is useful for code reusability: reuse attributes and methods of an existing class when  you create a new class.

## Java Polymorphism
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

**Inheritance** lets us inherit attributes and methods from another class. **Polymorphism** uses those methods to perform
different tasks. This allows us to perform a single action in different ways.


## Java Inner Classes
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes
that belong together, which makes your code more readable and maintainable.

## Java Abstraction
Data **abstraction** is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either **abstract classes** or **interfaces**.

The **abstract** keyword is a non-access modifier, use for classes and methods:
- **Abstract class**: is a restricted class that cannot be used to create objects (to access it, it must be inherited 
from another class).
- **Abstract method**: can only be used in an abstract class, and it does not have a body. The body is provided by the
subclass (inherited from).

An abstract class can have both abstract and regular methods.
```
abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("ZzZ");
    }
}
```

From the example above, it is not possible to create an object of the Animal class:
```
// will generate an error
Animal animal = new Animal();
```

To access the abstract class, it must be inherited from another class.


### Why and When to use Abstract classes and methods?
To achieve security - hide certain details and only show the important details of an object. So, considering using abstract
classes and inheritance when your problem males the evidence "A is a B".

E.g. "Dog is an Animal", "Mercedes is a Car", etc.

```
public abstract class Vehicle {
    protected abstract void start();
    protected abstract void stop;
    protected abstract void drive();
    protected abstract void changeGear();
    protected abstract void reverse();
    
    // standard getters and setters
}
```

```
public Car extends Vehicle {}
```

## Java Interface
Another way to achieve **abstraction** in Java, is with Interfaces.
An Interface is a completely **abstract class** that is used to group related methods with empty bodies:
```
interface Animal {
    public void animalSound();
    public void run();
}
```

**Notes on Interfaces:**
- Like **abstract classes**, interfaces **cannot** be used to create objects.
- Interface methods do not have a body.
- On implementation of an interface, you must override all of its methods.
- Interface methods are by default **abstract** and public.
- Interface attributes are by default **public**, **static** and **final**.
- An interface cannot contain a constructor.

### Why and When to use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).
2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved
with interfaces, because the class can **implement** multiple interfaces.

So, consider using the interface when your problem makes the statement "A is capable of [doing this]".
```
public interface Sender {
    void send (File fileToBeSent)
}
```
Sender is an interface with a method send(). Hence, "Sender is capable of sending a file".

```
public class ImageSender implements Sender {
    @Override
    public void send (File fileToBeSent) {
        // image sending implementation code.
    }
}
```
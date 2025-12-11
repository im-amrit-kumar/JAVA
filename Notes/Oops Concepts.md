Object-Oriented Programming (OOP) Concepts – Detailed Explanation

Object-Oriented Programming is a programming paradigm based on the idea of organizing software around objects rather than functions. It aims to increase reusability, modularity, scalability, and maintainability.

OOP has four core concepts:

Encapsulation

Abstraction

Inheritance

Polymorphism

Additionally, some also include:

Class & Object

Message Passing

Dynamic Binding

Below is a detailed breakdown.

1.Class and Object

Class

A class is a blueprint or template that defines the structure and behavior of objects.
It contains:

Data (variables, attributes)

Functions (methods)

Example (Java):

class Car {

    String color;
    
    void start() {
    
        System.out.println("Car starts");
        
    }
    
}

Object

An object is an instance of a class. It occupies memory and represents a real-world entity.

Example:

Car c = new Car();




2.Encapsulation (Data Hiding)

Encapsulation means wrapping data and methods into a single unit (class) and restricting access to some components to protect the data.

Why Encapsulation?

Prevents unauthorized access.

Increases security of data.

Makes code modular and easier to maintain.

How it is implemented?

Use private variables.

Access them using public getters and setters.

Example:

class Student {

    private int age;
    

    public void setAge(int a) {
    
        age = a;
        
    }
    

    public int getAge() {
    
        return age;
        
    }
    
}




3.Abstraction (Showing Only Essentials)

Abstraction means showing only the necessary details while hiding the internal implementation.

Purpose

Reduces complexity.

Focuses on what an object does, not how it does.

How to implement abstraction?

Abstract classes

Interfaces

Example:

abstract class Animal {

    abstract void sound(); // no implementation
    
}


class Dog extends Animal {

    void sound() {
    
        System.out.println("Bark");
        
    }
    
}

Dog knows how to bark, but the user doesn’t need to know the internal logic.




4.Inheritance (Code Reusability)

Inheritance allows a class to acquire properties and behaviors of another class.

Types of Inheritance

Single Inheritance – one parent, one child

Multilevel Inheritance – parent → child → grandchild

Hierarchical Inheritance – one parent, multiple children

Multiple Inheritance

Supported in C++ (through classes)

Not supported in Java (through interfaces only)

Example:

class Vehicle {

    void start() { System.out.println("Vehicle starts"); }
    
}


class Car extends Vehicle {

    void honk() { System.out.println("Car honks"); }
    
}



5.Polymorphism (Many Forms)

Polymorphism allows one name, multiple behaviors.

Types of Polymorphism

(A) Compile-Time Polymorphism (Method Overloading)

Decided at compile time.

Example:

class MathOp {

    int add(int a, int b) { return a + b; }
    
    int add(int a, int b, int c) { return a + c + b; }
    
}


(B) Run-Time Polymorphism (Method Overriding)

Decided at runtime.

Example:

class Animal {

    void sound() { System.out.println("Animal Sound"); }
    
}


class Cat extends Animal {

    void sound() { System.out.println("Meow"); }
    
}

When calling sound() on an object of type Animal, the behavior depends on the actual object type.




6.Dynamic Binding (Late Binding)

Method call is resolved at runtime, not compile time.

It is used in:

Method overriding

Polymorphism

Example:

Animal obj = new Dog();

obj.sound();  // resolves at runtime




7.Message Passing

Objects communicate with each other by sending and receiving messages (method calls).

Example:

obj1.deposit(100);

obj2.withdraw(50);

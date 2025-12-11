# Object-Oriented Programming (OOP) Concepts & Operators — Reference

## Overview
This document contains an extracted, consolidated reference on core Object-Oriented Programming (OOP) concepts and a concise guide to **Operators and Their Hierarchy (Precedence)** commonly used in languages such as C, C++ and Java.

**Source (extracted):** :contentReference[oaicite:0]{index=0}

---

## Object-Oriented Programming (OOP) Concepts

Object-Oriented Programming is a programming paradigm based on organizing software around **objects** rather than functions. It aims to improve reusability, modularity, scalability, and maintainability.

OOP has four core concepts:

- **Encapsulation**
- **Abstraction**
- **Inheritance**
- **Polymorphism**

Additional related concepts:

- Class & Object  
- Message Passing  
- Dynamic Binding

### 1. Class and Object

**Class**  
A class is a blueprint or template that defines the structure (data) and behavior (methods) of objects.

A class typically contains:
- Data (variables, attributes)
- Functions (methods)

**Example (Java):**
```java
class Car {
    String color;

    void start() {
        System.out.println("Car starts");
    }
}
```

Object  
An object is an instance of a class. It occupies memory and represents a real-world entity.

Example:
```java
Car c = new Car();
```

### 2. Encapsulation (Data Hiding)

Encapsulation means wrapping data and methods into a single unit (class) and restricting access to some components to protect the data.

**Why Encapsulation?**
- Prevents unauthorized access.
- Increases security of data.
- Makes code modular and easier to maintain.

**How it is implemented?**
- Use private variables.
- Expose controlled access through public getters and setters.

**Example:**
```java
class Student {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}
```

### 3. Abstraction (Showing Only Essentials)

Abstraction means showing only necessary details while hiding internal implementation.

**Purpose**
- Reduces complexity.
- Focuses on what an object does, not how it does it.

**How to implement abstraction?**
- Abstract classes
- Interfaces

**Example:**
```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

### 4. Inheritance (Code Reusability)

Inheritance allows a class to acquire properties and behaviors of another class.

**Types of Inheritance**
- Single Inheritance — one parent, one child
- Multilevel Inheritance — parent → child → grandchild
- Hierarchical Inheritance — one parent, multiple children
- Multiple Inheritance — supported in C++ (via classes); not supported in Java classes (interfaces provide multiple-type behavior)

**Example:**
```java
class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    void honk() { System.out.println("Car honks"); }
}
```

### 5. Polymorphism (Many Forms)

Polymorphism allows one name to represent multiple behaviors.

**Types of Polymorphism**

**Compile-Time Polymorphism (Method Overloading)** — resolved at compile time.
```java
class MathOp {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```

**Run-Time Polymorphism (Method Overriding)** — resolved at runtime.
```java
class Animal {
    void sound() { System.out.println("Animal Sound"); }
}
class Cat extends Animal {
    void sound() { System.out.println("Meow"); }
}
```

### 6. Dynamic Binding (Late Binding)

Method calls are resolved at runtime rather than compile time. Dynamic binding is used with method overriding and polymorphism.

Example:
```java
Animal obj = new Dog();
obj.sound();  // resolves at runtime to Dog.sound()
```

### 7. Message Passing

Objects communicate by sending and receiving messages (method calls).

Example:
```java
account.deposit(100);
account.withdraw(50);
```

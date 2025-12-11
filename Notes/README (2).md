# C++ vs Java – Differences

1. **Paradigm**  
C++: Supports both procedural and object-oriented programming (multi-paradigm).  
Java: Purely object-oriented (almost everything is inside a class).

2. **Compilation & Execution**  
C++: Compiled directly to machine code → faster execution.  
Java: Compiled to bytecode → executed by JVM (Java Virtual Machine).

3. **Memory Management**  
C++: Manual memory management using new and delete.  
Java: Automatic garbage collection (no manual memory freeing).

4. **Platform Dependency**  
C++: Platform-dependent (compiled separately for each OS).  
Java: Platform-independent due to JVM ("Write Once, Run Anywhere").

5. **Pointers**  
C++: Supports pointers fully.  
Java: Does not allow direct pointer manipulation.

6. **Inheritance**  
C++: Supports multiple inheritance.  
Java: Does NOT support multiple inheritance with classes (uses interfaces instead).

7. **Performance**  
C++: Generally faster due to direct machine code execution.  
Java: Slightly slower because it runs on a virtual machine.

8. **Memory Access**  
C++: Allows low-level system access.  
Java: Restricts low-level access for safety and security.

9. **Templates vs Generics**  
C++: Uses templates (compile-time polymorphism).  
Java: Uses generics (type-erased at runtime).

10. **Standard Libraries**  
C++: Rich libraries for system-level programming.  
Java: Rich libraries for networking, GUI, database, and enterprise applications.

11. **Applications**  
C++: System software, game engines, embedded systems, performance-critical applications.  
Java: Web apps, mobile apps (Android), enterprise software, distributed systems.

12. **Exception Handling**  
C++: Exceptions optional; no requirement to handle or declare them.  
Java: Strong exception-handling model; checked exceptions must be handled.

13. **Code Example Difference**

### C++:
```cpp
#include <iostream>
using namespace std;

int main() {
    cout << "Hello World";
    return 0;
}
```

### Java:
```java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

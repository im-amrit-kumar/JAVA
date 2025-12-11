# Variables and Their Rules

## What Is a Variable?

A variable is a named storage location in a program that holds a value.  
The value stored in a variable can change during program execution.

### Examples:
- **In C/C++:** `int age = 20;`
- **In Java:** `String name = "Amrit";`

A variable always has:
- Name  
- Data Type  
- Value  
- Memory Location  

---

## Types of Variables (General Across Languages)

### 1. Local Variables
- Declared inside a function or block.  
- Scope is limited to that block.

### 2. Global / Instance Variables
- Available to the entire program or throughout a class.

### 3. Static Variables
- Preserve their value between function calls.

### 4. Constant Variables
- Values cannot be changed once assigned.

---

## Rules for Naming Variables

Variable naming rules are mostly the same in C, C++, Java, Python, etc.

### 1. A variable name must begin with:
- A letter (A–Z, a–z)  
- or underscore (_)  

**Correct:**  
```
age
_name
totalMarks
```

**Incorrect:**  
```
1age     // cannot start with a number
@value   // special character not allowed
```

---

### 2. After the first character, variables may include:
- Letters (A–Z, a–z)  
- Digits (0–9)  
- Underscore (_)  

**Correct:**  
```
mark1
value_2
total_sum
```

---

### 3. No spaces allowed in variable names

**Incorrect:**  
```
total marks
```

**Correct:**  
```
totalMarks   // camelCase
total_marks  // snake_case
```

---

### 4. Variable names are case-sensitive

Examples:
```
age
Age
AGE
```
These are three different variables.

---

### 5. No special characters allowed

Not allowed:
```
#sum
@data
%value
```

---

### 6. Cannot use reserved keywords

Examples of invalid names:
```
int
class
float
return
```

---

### 7. Variable names should be meaningful

**Correct:**  
```
studentAge
totalAmount
temperature
```

**Incorrect (allowed but bad practice):**  
```
a
x1
temp2
```

---

### 8. Length of variable name
Most languages allow long names, but short, meaningful names are recommended.

---

## Examples

### C++ Example
```cpp
int age = 21;
float salary = 25000.50;
string name = "Amrit";
```

### Java Example
```java
int count = 10;
double price = 99.99;
String city = "Mumbai";
```

### Python Example
```python
name = "AK"
marks = 89
is_active = True
```

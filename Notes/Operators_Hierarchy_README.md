# Operators and Their Hierarchy (Precedence)

Operators are symbols that perform operations on variables and values.  
Operator hierarchy means the order in which operators are evaluated in an expression.

Understanding precedence ensures that complex expressions are executed correctly.

---

# 1. Types of Operators

Most programming languages (C, C++, Java) classify operators as:

- Arithmetic Operators  
- Relational Operators  
- Logical Operators  
- Assignment Operators  
- Unary Operators  
- Bitwise Operators  
- Conditional (Ternary) Operator  
- Increment & Decrement Operators  
- Miscellaneous Operators (sizeof, new, delete, instanceof, etc.)

---

# 2. Operator Hierarchy (Highest to Lowest Precedence)

This is the general precedence used in C, C++, Java.

---

## (1) Highest Precedence – Unary Operators

| Operators | Meaning |
|----------|---------|
| ++a, --a | Pre-increment, pre-decrement |
| a++, a-- | Post-increment, post-decrement |
| +, -, !, ~ | Unary plus/minus, logical NOT, bitwise NOT |
| * (dereference) | Pointer dereference (C/C++) |
| & (address-of) | Memory address |

---

## (2) Arithmetic Operators

### Multiplicative
| Operators | Meaning |
|----------|----------|
| * / % | Multiply, divide, modulus |

### Additive
| Operators | Meaning |
|----------|----------|
| + - | Addition, subtraction |

Note: Multiplication has higher precedence than addition.

---

## (3) Shift Operators

| Operators | Meaning |
|----------|----------|
| << >> >>> | Left shift, right shift, unsigned right shift |

---

## (4) Relational Operators

| Operators | Meaning |
|----------|----------|
| < <= > >= | Comparison |
| == != | Equality, inequality |

Note: `< >` is evaluated before `== !=`.

---

## (5) Bitwise Operators

| Operators | Meaning |
|----------|----------|
| & | Bitwise AND |
| ^ | Bitwise XOR |
| \| | Bitwise OR |

Precedence:  
`&` > `^` > `|`

---

## (6) Logical Operators

| Operators | Meaning |
|----------|----------|
| && | Logical AND |
| \|\| | Logical OR |

`&&` has higher precedence than `||`.

---

## (7) Conditional Operator

| Operator | Meaning |
|----------|----------|
| ?: | Ternary operator |

Example:
```cpp
result = (a > b) ? a : b;
```

---

## (8) Assignment Operators (Lowest Precedence)

| Operators | Meaning |
|----------|----------|
| = += -= *= /= %= <<= >>= &= ^= \|= | Assignment / compound assignment |

These are evaluated last.

---

# 3. Summary Table (Highest → Lowest Precedence)

| Level | Operators | Category |
|-------|-----------|----------|
| 1 | (), [], ., ->, function call | Parentheses & Access |
| 2 | ++ -- (prefix), ! ~, unary + -, *(pointer), &(address) | Unary |
| 3 | * / % | Multiplicative |
| 4 | + - | Additive |
| 5 | << >> >>> | Shift |
| 6 | < <= > >= | Relational |
| 7 | == != | Equality |
| 8 | & | Bitwise AND |
| 9 | ^ | Bitwise XOR |
| 10 | \| | Bitwise OR |
| 11 | && | Logical AND |
| 12 | \|\| | Logical OR |
| 13 | ?: | Ternary |
| 14 | = += -= *= /= %= <<= >>= &= ^= \|= | Assignment |

---

# 4. Associativity of Operators

When two operators have the same precedence, associativity decides the evaluation order.

## Left-to-Right Associativity

- + - * / %  
- < > <= >=  
- == !=  
- & ^ \|  
- && \|\|  

## Right-to-Left Associativity

- = += -= *= /=  
- ?:  
- ++ -- (prefix and postfix)

Example:
```cpp
a = b = c = 5; // evaluated right-to-left
```

---

# 5. Important Examples

### Example 1
```cpp
int x = 10 + 20 * 5;
```
Evaluation:
- 20 * 5 → 100  
- 10 + 100 → 110  

---

### Example 2
```cpp
int x = 10 > 5 && 3 <= 1;
```
Evaluation:
- 10 > 5 → true  
- 3 <= 1 → false  
- true && false → false  

---

### Example 3
```cpp
int x = 5, y = 10;
int z = x < y ? x : y;
```
Result:  
`z = 5`

---


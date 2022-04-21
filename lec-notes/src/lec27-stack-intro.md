---
title: Lecture 31
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

# Stacks

---

### Abstract Data Type

* Model of a data structure 
    * NOT the actual implementation
* Describes:
    * set of data values
    * the operations that can be performed
    * what the operations do (not how they do them...)
* Language independent
    * Helpful for approach/algorithm

---

### Stack

* Collection of objects
* Last in - first out (LIFO)
* Primary operations:
    * push (add to top)
    * pop (remove from top)

---

### Real life examples:

* Piles of items at grocery stores
* Shopping cart corral
* Stack of plates
* Pez dispenser

---

### When to use?

* Depends on the problem
* Not useful for all problems
* But -- Really useful for some problems
* Something to consider before you start coding
    * algorithm stage -- which ADT makes sense to use

---

### Application:  Post-Fix Notation

* Infix:
    * what you're used to
    * <operand><operator><operand>
    * relies on order of operations and parentheses
    * Ex: 3 + 2 * 4
* Postfix:
    * <operator><operator><operand>
    * Ex: 3 2 4 * +

---

### Application:  Post-Fix Notation

* Computer has to parse math expressions
* Postfix is easier
* How could we write parser to turn expression into code?

---

---

### Coding Applications - Others

* Reversing a string
* Back button in browser
* Undo/redo
* Balanced parentheses
* Maze solving
* Function call stack


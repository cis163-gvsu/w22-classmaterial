---
title: Lecture 16
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

# Anonymous Classes, Lambdas

---

### Inner Classes

* Sometimes, we just need a class for one small purpose
* Standard option:  private inner class ButtonListener
    * Quite a bit of code
    * Potentially hard to read

---

### Anonymous Classes

* A class without a name
* define class directly where it's needed and instantiated
* better, but still quite a bit of code

---

### Lambda Expressions

* A lot of times, the purpose of class is to implement simple
  interface with one method
* Example `Comparable`, `ActionListener`, etc.
* Because interface has only one function
    * No need to explicitly specify
    * It can infer

---

### Lambda Expressions

* Compact way of passing around behavior
* Lambda functions allow for brief, clean implementation of
  interface with one function
* Make code easier to read

---

### Lambdas - Format

* Single expression, one argument:

```
ActionListener oneArgHello = event -> System.out.println("hello");
```

* Multiple expressions, enclose expressions in bracket
* No arguments, use empty `()` for arg (aka in place of event)
* Multiple arguments, use `(x,y)` for arg


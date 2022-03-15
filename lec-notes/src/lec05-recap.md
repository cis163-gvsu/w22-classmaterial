---
title: Recap
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

### Static vs Non-static Methods

* Also called "class methods"
* Invoked through the class name
* Don't need to have object instantiated
* Example:  `sqrt` method in `Math` class

---

### Static Methods

* add `static` modifier in method declaration
* cannot access instance variables
* can reference static variables

---

### Static Variables

Other variable types:
* local variable:  variables declared inside a method (disappear after method ends)
* instance variable:  each instance of class has it's own copy

Static variable:
* shared among all instances of the class

---

### Static Variables

* use `static` modifier
* also called "class variables"
* changing it changes for all
* local variables cannot be static
* constants (declared with `final` are also often `static`)

---

### "this" Reference

* `this` is a reference to object through which method was invoked
* often used when coonstructors have parameters with same name as instance variables

---



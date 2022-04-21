---
title: Lecture 06
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

# Inheritance

---

### Motivation

* Physically, items often share common aspects
* Example:
    * cars, semis, motorcycles are all road vehicles
    * all have wheels (different #s)
    * some have windows, ...

---

### Motivation

* Coding each separately would repeat any common aspects
* Logically different -> makes sense to code as different things
* How can we represent and capitalize on logical relationship?

---

### Inheritance - Basic Idea

* Represent connections between classes via inheritance
* parent/super/base class
* child/sub class
* allows for code/software reuse

---

### Is-a vs has-a

* "has-a" relationship represents variables in classes
* "is-a" relationship signals potential child
* Example:
    * mustang is a car
    * car is a road vehicle
    * car has windows, trunk
* Example:
    * horse is a mammal
    * dog is a mammal
* If X is derived from Y, should be able to say X is a Y

---

### Implementation

* In Java, denoted with `extends` keyword

```
public class Car extends Vehicle
{
    //code here
}
```

---

### What happens

* child inherits methods and variables from parent
* parent gets nothing from child
* private methods/variables cannot be referenced
    * still exist
* constructors not inherited

---

### Constructors

* What if you need/want to use parent constructor?
* `super` reference -> references parent
* could just set same variables, but better practice to let parent class handle
* call to super should be first line
* no call -> automatically calls parent with no parameters
* no explicit parent -> implicit is `Object`

---

### Single vs Multiple

* Java only allows single inheritance
* One class can't inherit from 2 parents (multiple inheritance)
* But, multiple classes can inherit from same parent (siblings)

---

### Overriding Methods

* Defining method with same name overrides parent
* Very common
* Examples:
    * `toString`
    * `equals`
* Not the same as method overloading

---

### Final keyword

* `final` methods cannot be overridden
* `final` classes cannot be inherited from

---

### Abstract Classes

* Sometimes parent classes are for organization and structure
* May want to represent higher level thing that isn't actually
  an object we want to instantiate
* Example 1:
    * Parent class = Animal
    * Child classes = Dog, Cat, Lion
* Example 2:
    * Parent class = Vehicle
    * Child class = Car, Semi, Motorcycle

---

### Abstract Classes

* Solution:  abstract class
* Cannot be instantiated
* Use `abstract` keyword

```
abstract class Animal {
}
```

---

### Abstract Methods

* Method without implementation (body)
* Used in abstract classes
* Forces child classes to implement
* Declare with a method prototype

```
public abstract void makeNoise();
```

---

### Abstract Classes (cont.)

* If child does not implement all `abstract` methods -> child must be abstract
* Have no use until extended by another class
* Can have concrete methods as well
* Can still have constructors


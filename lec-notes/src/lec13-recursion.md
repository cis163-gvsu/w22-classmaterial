---
title: Lecture 15
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

# Recursion

---

### What is recursion?

* Method of solving a problem
    * breaks a problem into smaller forms
      of the same problem
    * solve by using functions that call themselves
* Not the only way of implementing, one choice

---

### Recursive function

* Base case:
    * specific results for one or more inputs
* Recursive case:
    * compute the result by combining one
      or more calls to the same function
      with inputs reduced somehow
---

### When to Use Recursion

* Depends on the problem
* Some problems are naturally recursive
    * bunny modeling (Fibonacci) is described
      recursively -> makes sense to implement recursivelt
* For some problems, far easier to implement with recursion
* Can produce far more elegant and easier to understand code
* Don't have to, can always express iteratively (but may be difficult/messy)

---

### Recursion - Common Mistakes

* Forget the base case
* Forget to reduce input when calling recursively

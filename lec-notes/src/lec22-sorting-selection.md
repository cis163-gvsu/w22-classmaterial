---
title: Lecture 25
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

# Sorting

---

### Sorting

* sorting = process of arranging group of items into ascending/descending order based on some criteria
* examples:
    * alphabetize list of names
    * sort list of numbers from highest to lowest
    * sort people by height
    * sort people by age

---

### Sorting

* We've been using Collections.sort() or a lambda function
* How do we actually describe an algorithm used to sort?
* Is there more than one?

---

### Activity

* Need 5 volunteers

---

### Selection Sort

* Goes through list positions one by one
* Selects value that should go there
* More formally:
    * go through list to find smallest value
    * swap that value with value in first spot
    * scan rest of list to find next smallest value
    * swap that value with value in second spot
    * continue with remaining spots for each position in the list

---

### Selection Sort - Complexity

* Think about the work it does:
    * How many times does it go through the list?
    * For each pass, how many elements does it look at?



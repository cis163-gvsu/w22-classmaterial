---
title: Lecture 25
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

# Sorting

---

### Recall:  Selection Sort

* go through list to find smallest value
* swap that value with value in first spot
* scan rest of list to find next smallest value
* swap that value with value in second spot
* continue with remaining spots for each position in the list

---


### Insertion Sort

* Breaks list into to parts (sorted and not sorted)
* Goes through values
* For each value, inserts into the right spot in the sorted list
* Move onto next value, repeating process

---

### Insertion Sort - Complexity

* How many times do we go look at a value?
* For each value, how much work does it take (how many spots do we consider) to find the right spot?

---

### Bubble Sort

* Make passes through list
* On each pass, swap out of order elements

---

### Bubble Sort - Complexity

* How many passes through list are made?
* How much work does each pass take?
* Can we stop early if not all passes needed?

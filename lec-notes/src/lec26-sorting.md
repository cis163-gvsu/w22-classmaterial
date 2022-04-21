---
title: Lecture 25
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

# Sorting

---

### Merge Sort

* divide and conquer algorithm
* recursive
* process:
    * divide array into 2 halves
    * **recursively** sort each half (by calling mergesort on each half)
    * merge sorted halves (take 2 sorted lists and combine into one sorted list)

---

---

### Merge Sort - Complexity

* Tree like, recursive halving/combining
* How much work at each step of tree?

---

### Quick Sort

* divide and conquer algorithm
* recursive
* process:
    * choose pivot (often leftmost or rightmost element)
    * place:
        * everything less than pivot to it's left
        * everything greater than pivot to it's right
        * pivot in between
    * repeat process for left chunk and right chunk (use quicksort to sort each chunk)

---

### Quick Sort

* How to move elements to correct side of pivot?
* Start scanning from both sides
    * Scan from left -> until find entry > pivot
    * Scan from <- right until find entry < pivot
    * Swap entries
* Stop once scan indices cross and swap pivot element into place 
    * leftmost pivot, swap pivot with rightmost in left subarray
    * rightmost pivot, swap pivot with leftmost in right subarray

---

---

### Quick Sort - Complexity

* Recursive halving of problems - how many levels?
* How much work at each level

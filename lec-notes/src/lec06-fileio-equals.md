---
title: Recap
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

### Casting Objects

* We often write `equals` methods for classes
* Typically `public boolean equals(Object obj)`
* method can take in any object, not just type invoking it
* need to cast to the correct type

---

### Casting Objects

* How do we know it is of correct type?
  * first need to check
  * `obj instanceof Car` - will be true/false
* Once we know it is of correct type, cast it
  * `Car c = (Car) obj;`

---

### Input/Output

* 3 standard ("system") I/O "streams"
  * standard input: `System.in`
  * standard output: `System.out`
  * standard error: `System.err`
* stream:  think like a river or other flowing water

---

### Output options

* `print(...)`:  options for most different types
* `println(...)`:  prints whole line

---

### Input options

* `Scanner`:  a parser
  * multiple constructors that allow inputStream, String, File
  * `next()` - tokenized by default whitespace
  * `nextLine()` - grabs whole line
  * `nextInt()`, `nextDouble()`
  * `hasNext()` - see if there is another token
  * `hasNextLine()` - is there another line
  * ways to use other delimiters

---

### File Input

```
Scanner fileReader = new Scanner(new File(filename));
```

* works just like `Scanner` from `System.in`
* should put in try/catch in case file doesn't exist

---

### File Output

```
PrintWriter out = new PrintWriter(
                  new BufferedWriter(
                  new FileWriter(filename)));
```

* nest in try/catch
* has all same methods as print stream (aka, `System.out`)

---

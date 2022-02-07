---
title: Lecture 08
theme: solarized
revealOptions:
    transition: 'none'
    controls: false
---

# GUIs

---

### GUI Breakdown

* Composed of 3 objects
    * Components
    * Events
    * Listeners

---

### Components

* Defines screen element
* Used to display info + allow users to interact with program
* Examples:
    * buttons
    * text fields
    * labels
    * scroll bars
* Containers = special component to hold/organize other components

---

### Events

* Object that represents some occurence
* Often correspond to actioins like mouse click, typing
* components generate events to indicate user action
* Examples:
    * button generates event to indicate pushed
* Event-driven -> program oriented around GUI responding to user events

---

### Listeners

* Object that waits for events to occur
* Responds when event occurs

---

### Typical GUI

* Typically use predefined components and events
* Typically write listener classes to perform desired actions
* GUI Steps:
    * instantiate and setup components
    * implement listener class that specifies what to do when event occurs
    * specify relationship between components and listeners
* Mainly in `java.awt` and `javax.swing`

---

### Specifics - Frame

* Container to display GUI app (window / title bar)
* JFrame class
* Heavyweight -> managed by OS

---

### Specifics - Panel

* Container that cannot be displayed separately
* Must be a part of another container
* Role -> organize components
* JPanel class
* Lightweight -> managed by program

---

### Specifics

* Labels -> `JLabel` (display text, image, etc)
* Buttons -> `JButton` (push generates action event)
* Checkbox -> `JCheckBox`
* Radio button -> `JRadioButton`
* Slider selection -> `JSlider` (drag left-right to select number)
* Drop-down selection -> `JComboBox`
* `Timer` (in `javax.swing`) -> no visual representation, simply generates action event at specified interval

---

### Layout Managers

* determine how components in container are arranged
* do not need to specify
    * default is FlowLayout
* Set by:

```
JPanel panel = new JPanel();
panel.setLayout(new GridLayout())
```

---

### Layout Managers - Choices

* `BorderLayout` -> 5 areas (N, S, E, W, center)
* `BoxLayout` -> single row/column
* `CardLayout` -> only one component visible at a time
* `FlowLayout` -> left-to-right, add rows as needed
* `GridLayout` -> grid of rows, columns
* `GridBagLayout` -> like grid, but components can span multiple cells
* **See book (ch06) for details on each or Google "Java Visual Guide to Layout Managers"**

---

### Mouse Events

* listen by implementing `MouseListener` and/or `MouseMotionListener`
* Events:
    * mousePressed, mouseClicked, mouseReleased, mouseEntered, mouseExited (`MouseListener`)
    * mouseDragged, mouseMoved (`MouseMotionListener`)
* Often don't care about all
    * need to implement empty for each

---

### Key Events

* generated when keyboard key is pressed
    * program responds immediately (no need to press enter)
* listen by implementing `KeyListener`
* Events:
    * keyPressed, keyReleased, keyTyped

---

### Misc

* Dialog Boxes
    * basically popups
    * use `JOptionPane` and its methods:
        * `showInputDialog`
        * `showMessageDialog`
        * `showConfirmDialog`

---

### Misc

* File Choosers
    * `JFileChooser`
    * special dialog box to let user select file

* Color Choosers
    * `JColorChooser`
    * special dialog box to let user pick color

* Other enhancements exist - font changes, borders, tool tips

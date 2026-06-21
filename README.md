# 🧮 Algorithm Visualizer

> An interactive **Java (Swing)** desktop app that brings classic **algorithms and data structures** to life with animated, step-by-step visualizations — built to make DSA easier to learn and teach.

![Java](https://img.shields.io/badge/Java-Swing-007396?logo=openjdk&logoColor=white)
![Platform](https://img.shields.io/badge/Platform-Desktop-blue)
![Stars](https://img.shields.io/github/stars/AbdulHannan031/Algorithm-Visualizer?style=social)

---

## 📋 Overview

**Algorithm Visualizer** is a desktop GUI application that animates how common algorithms and data structures work internally. Instead of reading pseudocode, you *watch* elements compare, swap, push, pop, and link in real time — making it a great learning aid for students and a handy teaching tool for instructors.

## ✨ Visualizations Included

- 🔵 **Bubble Sort** — animated comparisons & swaps
- 🟢 **Selection Sort** — step-by-step minimum selection
- 📚 **Stack** — push / pop (LIFO) operations
- 🎟️ **Queue** — enqueue / dequeue (FIFO) operations
- 🔗 **Singly Linked List** — insert / delete / traverse
- 🔗🔗 **Doubly Linked List** — bidirectional insert / delete / traverse

…all wrapped in a clean Swing GUI with a loading screen and an intuitive menu.

## 🛠️ Tech Stack

- **Language:** Java
- **GUI:** Java Swing (AWT)
- **Build:** Standard JDK / IntelliJ IDEA project

## 🚀 Getting Started

### Option A — Run the prebuilt JAR (fastest)
> Requires **Java (JRE/JDK) 8+** installed.
```bash
java -jar "executable file/Algorithm visualizer.jar"
```

### Option B — Run from source
```bash
git clone https://github.com/AbdulHannan031/Algorithm-Visualizer.git
cd Algorithm-Visualizer/src
javac *.java -d ../build
java -cp ../build Main
```
Or simply open the project in **IntelliJ IDEA** and run `Main`.

## 🎮 How to Use

1. Launch the app — the menu lists the available algorithms & data structures
2. Pick a visualization (e.g. *Bubble Sort* or *Queue*)
3. Add/generate data and press play to watch the operation animate step by step

## 📂 Project Structure

```
Algorithm-Visualizer/
├── src/
│   ├── Main.java                  # App entry point + menu
│   ├── bubblesort.java            # Bubble sort visualization
│   ├── selectionsort.java         # Selection sort visualization
│   ├── stack.java                 # Stack visualization
│   ├── QueueVisualizationGUI.java # Queue visualization
│   ├── doublylinklist.java        # Doubly linked list visualization
│   ├── gui.java / loading.java    # Shared GUI + loading screen
└── executable file/
    └── Algorithm visualizer.jar   # Prebuilt runnable JAR
```

## 🗺️ Roadmap

- [ ] Add more sorts (Insertion, Merge, Quick)
- [ ] Add speed control & step/pause buttons
- [ ] Add tree & graph visualizations (BST, BFS/DFS)
- [ ] Add screenshots / demo GIF to the README

## 👤 Author

**Abdul Hannan** — [@AbdulHannan031](https://github.com/AbdulHannan031)

If this helped you learn DSA, please drop a ⭐ — it helps others find it!

# 🧠 Data Structures & Algorithms (DSA) Playlist Solutions

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Platform-LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black" alt="LeetCode" />
  <img src="https://img.shields.io/badge/Platform-CSES-blue?style=for-the-badge" alt="CSES" />
  <img src="https://img.shields.io/badge/Problems_Solved-25+-brightgreen?style=for-the-badge" alt="Problems Solved" />
  <img src="https://img.shields.io/badge/Code_Quality-Pattern--Oriented-blueviolet?style=for-the-badge" alt="Pattern Oriented" />
</p>

A curated collection of optimal solutions to Data Structures and Algorithms problems from **LeetCode**, **CSES**, and competitive programming sheets. Every solution is written in **Java** with an emphasis on algorithmic patterns, clean code, edge-case handling, and optimal time & space complexity.

---

## 📌 Repository Overview

This repository documents my structured DSA preparation and problem-solving journey. Rather than memorizing individual solutions, the focus is on **identifying reusable patterns** (e.g., Two Pointers, Monotonic Stacks, Binary Search on Answer, Cyclic Sort) to build deep intuition for technical interviews and competitive programming.

---

## 📊 Progress & Problem Statistics

| Category | Easy | Medium | Hard | Total |
| :--- | :---: | :---: | :---: | :---: |
| 🔢 **Arrays & Math** | 3 | 2 | 0 | **5** |
| 🔍 **Binary Search** | 0 | 4 | 0 | **4** |
| 🔄 **Sorting & Indexing** | 1 | 0 | 1 | **2** |
| 🗂️ **HashMaps & Strings** | 4 | 1 | 0 | **5** |
| 🔗 **Linked Lists** | 0 | 2 | 1 | **3** |
| 📚 **Stacks & Queues** | 1 | 3 | 2 | **6** |
| **Total** | **9** | **12** | **4** | **25** |

---

## 📂 Repository Structure

```text
DSA/
├── Arrays/
│   ├── Basic Problems.java        # Array manipulation, digit math & number operations
│   ├── Advanced Problems.java     # CSES math, combinatorics & recursion
│   ├── Search.java                # Binary search, rotated search & search-on-answer
│   └── Sorting.java               # Cyclic sort & in-place array hashing
├── HashMaps/
│   └── Questions.java             # Frequency maps, isomorphic mapping & anagram grouping
├── LinkedList/
│   └── Questions.java             # Cycle detection, k-group reversal & list interleaving
└── Stacks and Queues/
    ├── Stack.java                 # Bracket sequence validation & simulation
    └── Monotonic Stack.java       # Next greater element, stock span & histogram areas
```

---

## 📑 Problem Index by Topic

### 1. Arrays & Mathematics
| # | Problem | Platform | Difficulty | Core Pattern | Solution File |
| :---: | :--- | :---: | :---: | :--- | :--- |
| 66 | [Plus One](https://leetcode.com/problems/plus-one/) | LeetCode | `Easy` | Array & Digit Carry | [`Arrays/Basic Problems.java`](./Arrays/Basic%20Problems.java) |
| 754 | [Reach a Number](https://leetcode.com/problems/reach-a-number/) | LeetCode | `Medium` | Math & Parity Analysis | [`Arrays/Basic Problems.java`](./Arrays/Basic%20Problems.java) |
| — | [Number Spiral](https://cses.fi/problemset/task/1071) | CSES | `Easy` | Grid Pattern & Algebra | [`Arrays/Advanced Problems.java`](./Arrays/Advanced%20Problems.java) |
| — | [Two Knights](https://cses.fi/problemset/task/1072) | CSES | `Medium` | Combinatorics & Complementary Counting | [`Arrays/Advanced Problems.java`](./Arrays/Advanced%20Problems.java) |
| — | [Tower of Hanoi](https://cses.fi/problemset/task/1068) | CSES | `Easy` | Divide & Conquer / Recursion | [`Arrays/Advanced Problems.java`](./Arrays/Advanced%20Problems.java) |

### 2. Binary Search
| # | Problem | Platform | Difficulty | Core Pattern | Solution File |
| :---: | :--- | :---: | :---: | :--- | :--- |
| 34 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | LeetCode | `Medium` | Boundary Binary Search | [`Arrays/Search.java`](./Arrays/Search.java) |
| 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | LeetCode | `Medium` | Modified Binary Search on Sorted Half | [`Arrays/Search.java`](./Arrays/Search.java) |
| 540 | [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/) | LeetCode | `Medium` | Binary Search via Index Parity | [`Arrays/Search.java`](./Arrays/Search.java) |
| 875 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | LeetCode | `Medium` | Binary Search on Answer Space | [`Arrays/Search.java`](./Arrays/Search.java) |

### 3. Sorting & In-Place Placement
| # | Problem | Platform | Difficulty | Core Pattern | Solution File |
| :---: | :--- | :---: | :---: | :--- | :--- |
| 41 | [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | LeetCode | `Hard` | Cyclic Sort / In-place Hashing ($O(n)$ time, $O(1)$ space) | [`Arrays/Sorting.java`](./Arrays/Sorting.java) |
| 645 | [Set Mismatch](https://leetcode.com/problems/set-mismatch/) | LeetCode | `Easy` | Cyclic Sort for Duplicates & Missing | [`Arrays/Sorting.java`](./Arrays/Sorting.java) |

### 4. HashMaps & Hashing
| # | Problem | Platform | Difficulty | Core Pattern | Solution File |
| :---: | :--- | :---: | :---: | :--- | :--- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | LeetCode | `Easy` | One-pass Complement Lookup | [`HashMaps/Questions.java`](./HashMaps/Questions.java) |
| 350 | [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/) | LeetCode | `Easy` | Frequency Counting Map | [`HashMaps/Questions.java`](./HashMaps/Questions.java) |
| 205 | [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/) | LeetCode | `Easy` | Dual Bi-directional HashMaps | [`HashMaps/Questions.java`](./HashMaps/Questions.java) |
| 290 | [Word Pattern](https://leetcode.com/problems/word-pattern/) | LeetCode | `Easy` | Bi-directional Character-to-String Mapping | [`HashMaps/Questions.java`](./HashMaps/Questions.java) |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | LeetCode | `Medium` | Canonical String Key Hashing | [`HashMaps/Questions.java`](./HashMaps/Questions.java) |

### 5. Linked Lists
| # | Problem | Platform | Difficulty | Core Pattern | Solution File |
| :---: | :--- | :---: | :---: | :--- | :--- |
| 142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | LeetCode | `Medium` | Floyd's Cycle-Finding (Tortoise & Hare) | [`LinkedList/Questions.java`](./LinkedList/Questions.java) |
| 25 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | LeetCode | `Hard` | In-place Sublist Reversal & Pointers | [`LinkedList/Questions.java`](./LinkedList/Questions.java) |
| 143 | [Reorder List](https://leetcode.com/problems/reorder-list/) | LeetCode | `Medium` | Midpoint Detection, Reversal & Interleaving | [`LinkedList/Questions.java`](./LinkedList/Questions.java) |

### 6. Stacks & Monotonic Stacks
| # | Problem | Platform | Difficulty | Core Pattern | Solution File |
| :---: | :--- | :---: | :---: | :--- | :--- |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | LeetCode | `Easy` | LIFO Bracket Sequence Matching | [`Stacks and Queues/Stack.java`](./Stacks%20and%20Queues/Stack.java) |
| 32 | [Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/) | LeetCode | `Hard` | Index-tracking Stack for Valid Substrings | [`Stacks and Queues/Stack.java`](./Stacks%20and%20Queues/Stack.java) |
| 735 | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/) | LeetCode | `Medium` | Stack-based State Simulation | [`Stacks and Queues/Stack.java`](./Stacks%20and%20Queues/Stack.java) |
| 84 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | LeetCode | `Hard` | Monotonic Increasing Stack ($O(n)$) | [`Stacks and Queues/Monotonic Stack.java`](./Stacks%20and%20Queues/Monotonic%20Stack.java) |
| 503 | [Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/) | LeetCode | `Medium` | Monotonic Stack on Circular Array ($2n$) | [`Stacks and Queues/Monotonic Stack.java`](./Stacks%20and%20Queues/Monotonic%20Stack.java) |
| 901 | [Online Stock Span](https://leetcode.com/problems/online-stock-span/) | LeetCode | `Medium` | Monotonic Stack with Span Compression | [`Stacks and Queues/Monotonic Stack.java`](./Stacks%20and%20Queues/Monotonic%20Stack.java) |

---

## 🎯 Key Algorithmic Patterns Mastered

- **Monotonic Stack**: Efficiently finding the next/previous smaller or greater element in $O(n)$ time without nested $O(n^2)$ loops (applied in Histogram, Stock Span, Next Greater Element).
- **Binary Search on Answer**: Transforming an optimization problem into a monotonic feasibility check ($T/F$ predicate space), e.g., Koko Eating Bananas.
- **Cyclic Sort**: In-place array arrangement in $O(n)$ time and $O(1)$ extra space when elements are within $[1, n]$ range (applied in First Missing Positive).
- **Two Pointers & Fast-Slow Pointers**: Cycle detection, cycle entry finding, and palindrome/midpoint processing in singly-linked lists.
- **Bi-directional Hashing**: Enforcing strict one-to-one (bijection) mappings for isomorphic strings and patterns.

---

## 🛠️ How to Compile & Run

Each file contains complete, standalone solution classes or runnable mains. You can compile and test any file using standard Java tooling:

```bash
# Navigate to the topic folder
cd "Arrays"

# Compile any Java file
javac "Basic Problems.java"

# Or run directly with modern JDK (Java 11+)
java "Advanced Problems.java"
```

---

## 🚀 Goal & Roadmap

- [x] Arrays, Searching (Binary Search) & Sorting (Cyclic Sort)
- [x] HashMaps, Sets & Frequency Hashing
- [x] Singly Linked Lists, Reversals & Cycle Detection
- [x] Stacks, Queue Simulation & Monotonic Stacks
- [ ] Two Pointers & Sliding Window Problems
- [ ] Trees (Binary Trees, BST, Traversals & Construction)
- [ ] Graphs (BFS, DFS, Dijkstra, Topological Sort)
- [ ] Dynamic Programming (1D, 2D, Knapsack & Subsequences)

---

<p align="center">
  <i>Maintained with ❤️ by <b>Nitin Kumar</b> — Continuously updated as new topics and problems are solved!</i>
</p>

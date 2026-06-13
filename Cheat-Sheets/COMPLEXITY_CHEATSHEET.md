# ⚡ Time & Space Complexity Cheat Sheet

> Quick reference for interviews — know these cold.

---

## 📊 Big-O Hierarchy (Fastest → Slowest)

```
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ) < O(n!)
 ↑                                                            ↑
Best                                                        Worst
```

---

## 🗃️ Data Structures

| Data Structure | Access | Search | Insert | Delete | Space |
|----------------|:------:|:------:|:------:|:------:|:-----:|
| Array | **O(1)** | O(n) | O(n) | O(n) | O(n) |
| Dynamic Array | **O(1)** | O(n) | O(1)* | O(n) | O(n) |
| Singly Linked List | O(n) | O(n) | **O(1)** | **O(1)** | O(n) |
| Doubly Linked List | O(n) | O(n) | **O(1)** | **O(1)** | O(n) |
| Stack | O(n) | O(n) | **O(1)** | **O(1)** | O(n) |
| Queue | O(n) | O(n) | **O(1)** | **O(1)** | O(n) |
| Hash Table | — | **O(1)** | **O(1)** | **O(1)** | O(n) |
| Binary Search Tree | O(log n) | O(log n) | O(log n) | O(log n) | O(n) |
| AVL Tree | O(log n) | O(log n) | O(log n) | O(log n) | O(n) |
| Heap (Binary) | O(1) top | O(n) | O(log n) | O(log n) | O(n) |
| Trie | — | O(m) | O(m) | O(m) | O(n·m) |
| Segment Tree | — | O(log n) | O(log n) | O(log n) | O(n) |

*amortized

---

## 🔃 Sorting Algorithms

| Algorithm | Best | Average | Worst | Space | Stable |
|-----------|:----:|:-------:|:-----:|:-----:|:------:|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | ❌ |
| Insertion Sort | **O(n)** | O(n²) | O(n²) | O(1) | ✅ |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | ✅ |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | ❌ |
| Counting Sort | O(n+k) | O(n+k) | O(n+k) | O(k) | ✅ |
| Radix Sort | O(nk) | O(nk) | O(nk) | O(n+k) | ✅ |

---

## 🕸️ Graph Algorithms

| Algorithm | Time | Space | Use Case |
|-----------|:----:|:-----:|----------|
| BFS | O(V+E) | O(V) | Shortest path (unweighted) |
| DFS | O(V+E) | O(V) | Connectivity, cycles, topological sort |
| Dijkstra | O((V+E) log V) | O(V) | Shortest path (weighted, no neg) |
| Bellman-Ford | O(V·E) | O(V) | Shortest path (with neg edges) |
| Floyd-Warshall | O(V³) | O(V²) | All-pairs shortest path |
| Prim's MST | O(E log V) | O(V) | Minimum spanning tree |
| Kruskal's MST | O(E log E) | O(V) | Minimum spanning tree |
| Topological Sort | O(V+E) | O(V) | DAG ordering |
| Union Find | O(α(n)) | O(n) | Connected components |

---

## 🧮 DP Patterns Complexity

| Pattern | Time | Space | Optimizable? |
|---------|:----:|:-----:|:------------:|
| 1D DP (Fibonacci style) | O(n) | O(n) | ✅ → O(1) |
| 2D DP (Grid) | O(m·n) | O(m·n) | ✅ → O(n) |
| Knapsack 0/1 | O(n·W) | O(n·W) | ✅ → O(W) |
| LCS | O(m·n) | O(m·n) | ✅ → O(n) |
| LIS | O(n log n) | O(n) | ❌ |
| Matrix Chain | O(n³) | O(n²) | ❌ |

---

## 🔑 Interview Rules of Thumb

```
Input Size → Suggested Complexity
─────────────────────────────────
n ≤ 10        →  O(n!) or O(2ⁿ)   — Brute force / backtracking ok
n ≤ 20        →  O(2ⁿ)            — Bitmask DP
n ≤ 100       →  O(n³)            — Cubic DP, Floyd-Warshall
n ≤ 1,000     →  O(n²)            — Nested loops
n ≤ 10,000    →  O(n²) careful    — Might TLE, optimize
n ≤ 100,000   →  O(n log n)       — Sort, heap, binary search
n ≤ 1,000,000 →  O(n) or O(n log n) — Linear or near-linear only
```

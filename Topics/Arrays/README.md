# 📦 Topic Name

## 📖 Theory
(Topic ka explanation)

## ✅ Problems Solved

| # | Problem | Difficulty | Status |
|---|---------|------------|--------|
| 1 | Problem Name | 🟢 Easy | ✅ |

## 🔑 Key Patterns
- Pattern 1
- Pattern 2


# 📦 Arrays

> *"Master arrays, and you've laid the foundation for everything else."*

---

## 📖 Theory

An **array** is a contiguous block of memory storing elements of the same type. It's the most fundamental data structure — direct index access in O(1) makes it irreplaceable.

| Operation | Time Complexity |
|-----------|:--------------:|
| Access by index | O(1) |
| Search (unsorted) | O(n) |
| Search (sorted, binary) | O(log n) |
| Insert at end | O(1) amortized |
| Insert at index | O(n) |
| Delete at index | O(n) |
| Space | O(n) |

---

## 🔑 Key Patterns Used in Arrays

| Pattern | When to Use |
|---------|-------------|
| **Two Pointers** | Sorted array, pair sum, palindrome |
| **Sliding Window** | Subarray sum, max/min in window |
| **Prefix Sum** | Range queries, subarray sum |
| **Binary Search** | Sorted array searches |
| **Kadane's Algorithm** | Maximum subarray sum |
| **Dutch National Flag** | Sort 0s, 1s, 2s |

---

## ✅ Problems Solved

| # | Problem | Difficulty | Pattern | Link | Solution |
|---|---------|------------|---------|------|----------|
| 1 | Two Sum | 🟢 Easy | HashMap | [LC #1](https://leetcode.com/problems/two-sum/) | [Solution](./TwoSum.java) |
| 2 | Best Time to Buy & Sell Stock | 🟢 Easy | Sliding Window | [LC #121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Solution](./BestTimeToBuySell.java) |
| 3 | Contains Duplicate | 🟢 Easy | HashSet | [LC #217](https://leetcode.com/problems/contains-duplicate/) | [Solution](./ContainsDuplicate.java) |
| 4 | Product of Array Except Self | 🟡 Medium | Prefix Product | [LC #238](https://leetcode.com/problems/product-of-array-except-self/) | [Solution](./ProductExceptSelf.java) |
| 5 | Maximum Subarray | 🟡 Medium | Kadane's | [LC #53](https://leetcode.com/problems/maximum-subarray/) | [Solution](./MaxSubarray.java) |
| 6 | 3Sum | 🟡 Medium | Two Pointers | [LC #15](https://leetcode.com/problems/3sum/) | [Solution](./ThreeSum.java) |
| 7 | Container With Most Water | 🟡 Medium | Two Pointers | [LC #11](https://leetcode.com/problems/container-with-most-water/) | [Solution](./ContainerWithMostWater.java) |
| 8 | Search in Rotated Sorted Array | 🟡 Medium | Binary Search | [LC #33](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [Solution](./SearchRotatedArray.java) |
| 9 | Trapping Rain Water | 🔴 Hard | Two Pointers | [LC #42](https://leetcode.com/problems/trapping-rain-water/) | [Solution](./TrappingRainWater.java) |
| 10 | Median of Two Sorted Arrays | 🔴 Hard | Binary Search | [LC #4](https://leetcode.com/problems/median-of-two-sorted-arrays/) | [Solution](./MedianTwoArrays.java) |

---

## 🏆 Interview Must-Know

- [ ] Kadane's Algorithm (Max Subarray)
- [ ] Two Sum variants (sorted / unsorted)
- [ ] Sliding Window (fixed and variable)
- [ ] Dutch National Flag (sort 0,1,2)
- [ ] Merge Intervals
- [ ] Next Permutation
- [ ] Rotate Array
- [ ] Spiral Matrix

---

## 📝 Notes

```
✦ When stuck on O(n²) → think Two Pointers or HashMap
✦ Subarray problem? → think Sliding Window or Prefix Sum
✦ Sorted array? → think Binary Search immediately
✦ Always handle: empty array, single element, all same elements
```

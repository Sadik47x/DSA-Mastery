# 🪟 Sliding Window Pattern

---

## 📖 Theory

The **Sliding Window** technique is used to reduce nested loops into a single loop, bringing time complexity from O(n²) to O(n).

A **window** is a subarray/substring that slides over the data structure. The window expands and contracts based on conditions.

### Two Types:
| Type | Window Size | Use Case |
|------|-------------|----------|
| **Fixed Window** | Constant (k) | Max sum of k elements, anagram detection |
| **Variable Window** | Dynamic | Longest substring with k distinct chars |

---

## 🔍 How to Recognize This Pattern

Ask yourself:
- Does the problem involve a **subarray** or **substring**?
- Does it ask for **maximum/minimum/longest/shortest**?
- Does the input involve **contiguous elements**?

If YES to all → **Sliding Window is likely the pattern.**

---

## 📐 Templates

### Fixed Window Template
```java
public int fixedWindow(int[] arr, int k) {
    int windowSum = 0, maxSum = 0;

    // Build first window
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }
    maxSum = windowSum;

    // Slide window
    for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k];  // add new, remove old
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}
```

### Variable Window Template
```java
public int variableWindow(String s, int k) {
    int left = 0, maxLen = 0;
    Map<Character, Integer> freq = new HashMap<>();

    for (int right = 0; right < s.length(); right++) {
        // Expand window
        freq.merge(s.charAt(right), 1, Integer::sum);

        // Shrink window if condition violated
        while (freq.size() > k) {
            char c = s.charAt(left++);
            freq.merge(c, -1, Integer::sum);
            if (freq.get(c) == 0) freq.remove(c);
        }

        // Update answer
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}
```

---

## 🧩 Practice Problems

| # | Problem | Difficulty | Window Type | Status |
|---|---------|------------|-------------|--------|
| 1 | Maximum Average Subarray I | 🟢 Easy | Fixed | ✅ |
| 2 | Best Time to Buy and Sell Stock | 🟢 Easy | Variable | ✅ |
| 3 | Longest Substring Without Repeating | 🟡 Medium | Variable | ✅ |
| 4 | Fruit Into Baskets | 🟡 Medium | Variable | ✅ |
| 5 | Permutation in String | 🟡 Medium | Fixed | ✅ |
| 6 | Minimum Window Substring | 🔴 Hard | Variable | 🔄 |
| 7 | Sliding Window Maximum | 🔴 Hard | Fixed | 🔄 |

---

## ⏱️ Complexity

| | Fixed Window | Variable Window |
|-|:------------:|:---------------:|
| Time | O(n) | O(n) |
| Space | O(1) | O(k) |

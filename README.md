# 🧠 Data Structures & Algorithms

A clean, well-organized collection of LeetCode-style solutions in **Java** and **JavaScript**, grouped by topic with time/space complexity annotations on every solution.

> Solutions are written for clarity first, then optimized. Each file is self-contained with problem statement, approach explanation, and runnable tests.

---

## 📋 Table of Contents

- [Progress Tracker](#-progress-tracker)
- [How to Run](#-how-to-run)
- [Solutions](#-solutions)
  - [Arrays & Strings](#-arrays--strings)
  - [Trees & Graphs](#-trees--graphs)
  - [Dynamic Programming](#-dynamic-programming)
  - [Linked Lists](#-linked-lists)
  - [Sorting & Searching](#-sorting--searching)
- [Complexity Cheat Sheet](#-complexity-cheat-sheet)

---

## 📊 Progress Tracker

| Topic | Easy | Medium | Hard | Total |
|-------|------|--------|------|-------|
| Arrays & Strings | ✅ | ✅ | ✅ | 3 / 3 |
| Trees & Graphs | ✅ | ✅ | ✅ | 3 / 3 |
| Dynamic Programming | ✅ | ✅ | ✅ | 3 / 3 |
| Linked Lists | ✅ | ✅ | ✅ | 3 / 3 |
| Sorting & Searching | ✅ | ✅ | ✅ | 3 / 3 |
| **Total** | **5** | **5** | **5** | **15 problems** |

**Languages:** Java · JavaScript &nbsp;|&nbsp; **Total files:** 30

---

## ▶️ How to Run

### JavaScript

No setup required — Node.js only.

```bash
node javascript/arrays-strings/twoSum.js
```

Run all JavaScript solutions at once:

```bash
find javascript -name "*.js" | xargs -I {} node {}
```

### Java

Requires JDK 11+. Compile and run with assertions enabled:

```bash
# Single file
javac java/arrays-strings/TwoSum.java
java -ea -cp java/arrays-strings TwoSum

# All files (from repo root)
find java -name "*.java" | while read f; do
  dir=$(dirname "$f")
  file=$(basename "$f" .java)
  javac "$f" && java -ea -cp "$dir" "$file"
done
```

> The `-ea` flag enables Java assertions used in the test blocks.

---

## 📁 Solutions

### 🔢 Arrays & Strings

| Difficulty | Problem | Java | JavaScript |
|------------|---------|------|------------|
| 🟢 Easy | [Two Sum](https://leetcode.com/problems/two-sum/) | [TwoSum.java](java/arrays-strings/TwoSum.java) | [twoSum.js](javascript/arrays-strings/twoSum.js) |
| 🟡 Medium | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [LongestSubstringWithoutRepeatingChars.java](java/arrays-strings/LongestSubstringWithoutRepeatingChars.java) | [longestSubstringWithoutRepeatingChars.js](javascript/arrays-strings/longestSubstringWithoutRepeatingChars.js) |
| 🔴 Hard | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | [MedianOfTwoSortedArrays.java](java/arrays-strings/MedianOfTwoSortedArrays.java) | [medianOfTwoSortedArrays.js](javascript/arrays-strings/medianOfTwoSortedArrays.js) |

### 🌲 Trees & Graphs

| Difficulty | Problem | Java | JavaScript |
|------------|---------|------|------------|
| 🟢 Easy | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | [MaxDepthBinaryTree.java](java/trees-graphs/MaxDepthBinaryTree.java) | [maxDepthBinaryTree.js](javascript/trees-graphs/maxDepthBinaryTree.js) |
| 🟡 Medium | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | [NumberOfIslands.java](java/trees-graphs/NumberOfIslands.java) | [numberOfIslands.js](javascript/trees-graphs/numberOfIslands.js) |
| 🔴 Hard | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | [BinaryTreeMaxPathSum.java](java/trees-graphs/BinaryTreeMaxPathSum.java) | [binaryTreeMaxPathSum.js](javascript/trees-graphs/binaryTreeMaxPathSum.js) |

### 🧮 Dynamic Programming

| Difficulty | Problem | Java | JavaScript |
|------------|---------|------|------------|
| 🟢 Easy | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | [ClimbingStairs.java](java/dynamic-programming/ClimbingStairs.java) | [climbingStairs.js](javascript/dynamic-programming/climbingStairs.js) |
| 🟡 Medium | [Coin Change](https://leetcode.com/problems/coin-change/) | [CoinChange.java](java/dynamic-programming/CoinChange.java) | [coinChange.js](javascript/dynamic-programming/coinChange.js) |
| 🔴 Hard | [Edit Distance](https://leetcode.com/problems/edit-distance/) | [EditDistance.java](java/dynamic-programming/EditDistance.java) | [editDistance.js](javascript/dynamic-programming/editDistance.js) |

### 🔗 Linked Lists

| Difficulty | Problem | Java | JavaScript |
|------------|---------|------|------------|
| 🟢 Easy | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | [ReverseLinkedList.java](java/linked-lists/ReverseLinkedList.java) | [reverseLinkedList.js](javascript/linked-lists/reverseLinkedList.js) |
| 🟡 Medium | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | [AddTwoNumbers.java](java/linked-lists/AddTwoNumbers.java) | [addTwoNumbers.js](javascript/linked-lists/addTwoNumbers.js) |
| 🔴 Hard | [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | [MergeKSortedLists.java](java/linked-lists/MergeKSortedLists.java) | [mergeKSortedLists.js](javascript/linked-lists/mergeKSortedLists.js) |

### 🔍 Sorting & Searching

| Difficulty | Problem | Java | JavaScript |
|------------|---------|------|------------|
| 🟢 Easy | [Binary Search](https://leetcode.com/problems/binary-search/) | [BinarySearch.java](java/sorting-searching/BinarySearch.java) | [binarySearch.js](javascript/sorting-searching/binarySearch.js) |
| 🟡 Medium | [Sort Colors](https://leetcode.com/problems/sort-colors/) | [SortColors.java](java/sorting-searching/SortColors.java) | [sortColors.js](javascript/sorting-searching/sortColors.js) |
| 🔴 Hard | [Find Minimum in Rotated Sorted Array II](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/) | [FindMinRotatedSortedArrayII.java](java/sorting-searching/FindMinRotatedSortedArrayII.java) | [findMinRotatedSortedArrayII.js](javascript/sorting-searching/findMinRotatedSortedArrayII.js) |

---

## ⚡ Complexity Cheat Sheet

### Common Time Complexities (fastest → slowest)

| Notation | Name | Example |
|----------|------|---------|
| O(1) | Constant | HashMap lookup, array index access |
| O(log n) | Logarithmic | Binary search |
| O(n) | Linear | Single loop, sliding window |
| O(n log n) | Linearithmic | Merge sort, heap sort |
| O(n²) | Quadratic | Nested loops, bubble sort |
| O(2ⁿ) | Exponential | Recursive Fibonacci (naive) |

### Data Structure Complexities

| Structure | Access | Search | Insert | Delete |
|-----------|--------|--------|--------|--------|
| Array | O(1) | O(n) | O(n) | O(n) |
| HashMap | O(1) | O(1) | O(1) | O(1) |
| Binary Search Tree | O(log n) | O(log n) | O(log n) | O(log n) |
| Heap (Min/Max) | O(1) top | O(n) | O(log n) | O(log n) |
| Linked List | O(n) | O(n) | O(1) head | O(1) with ref |
| Stack / Queue | O(1) top | O(n) | O(1) | O(1) |

### Sorting Algorithms

| Algorithm | Best | Average | Worst | Space | Stable? |
|-----------|------|---------|-------|-------|---------|
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | ✅ |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | ❌ |
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ |

---

*Solutions added progressively. Each new problem follows the same structure: problem statement → approach → complexity → solution → tests.*

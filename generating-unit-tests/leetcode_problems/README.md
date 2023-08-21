

Median of two sorted arrays
================================================================
From https://leetcode.com/problems/median-of-two-sorted-arrays/

> Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Tabnine's solution:
```python
class TabnineSolution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        n1, n2 = len(nums1), len(nums2)
        if n1 > n2:
            return self.findMedianSortedArrays(nums2, nums1)
        i, j = 0, 0
        while i < n1 and j < n2:
            if nums1[i] < nums2[j]:
                i += 1
            elif nums1[i] > nums2[j]:
                j += 1
            else:
                return (nums1[i] + nums2[j]) / 2.0
        if i == n1:
            return nums2[j]
        else:
            return nums1[i]
```

This solution is cleary incorrect. It will only return the median if the sorted arrays contain the same value. 
If the sorted arrays don't contain the same value then the highest counted index of the largest array will be 
returned once the count for the smallest array is reached.

Tabnine's unit test:
```python
import unittest
class TabnineTestTabnineSolution(unittest.TestCase):

    def test_find_median_sorted_arrays(self):
        assert 2 == TabnineSolution().findMedianSortedArrays([1, 3], [2])
        assert 2.5 == TabnineSolution().findMedianSortedArrays([1, 2], [3, 4])

if __name__ == '__main__':
    unittest.main()
```

Result of running the code as is:
```powershell
(venv) PS C:\Users\djkno\projects\openai-tests\unit-tests-and-code-assistants> python .\leetcode_problems\median_two_strings.py
F
======================================================================
FAIL: test_find_median_sorted_arrays (__main__.TabnineTestTabnineSolution)
----------------------------------------------------------------------
Traceback (most recent call last):
  File "C:\Users\djkno\projects\openai-tests\unit-tests-and-code-assistants\leetcode_problems\median_two_strings.py", line 63, in test_find_median_sorted_arrays
    assert 2 == TabnineSolution().findMedianSortedArrays([1, 3], [2])
AssertionError

----------------------------------------------------------------------
Ran 1 test in 0.000s

FAILED (failures=1)
```

Actual solution:
```python
# from https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/3922746/most-optimal-solution-using-binary-search-with-explanation/
class Solution:
    def findMedianSortedArrays(self, nums1, nums2) -> float:
        n1, n2 = len(nums1), len(nums2)
        if n1 > n2:
            return self.findMedianSortedArrays(nums2, nums1)
        n = n1 + n2
        left = (n1 + n2 + 1) // 2
        low, high = 0, n1
        
        while low <= high:
            mid1 = (low + high) // 2
            mid2 = left - mid1
            
            l1 = float('-inf') if mid1 == 0 else nums1[mid1 - 1]
            l2 = float('-inf') if mid2 == 0 else nums2[mid2 - 1]
            r1 = float('inf') if mid1 == n1 else nums1[mid1]
            r2 = float('inf') if mid2 == n2 else nums2[mid2]
            
            if l1 <= r2 and l2 <= r1:
                if n % 2 == 1:
                    return max(l1, l2)
                else:
                    return (max(l1, l2) + min(r1, r2)) / 2.0
            elif l1 > r2:
                high = mid1 - 1
            else:
                low = mid1 + 1
        return 0.0
```

Using the actual solution we can successfully run the tabnine generated unit tests.

```python
# write a unit tests for the above solution
import unittest
class TestSolution(unittest.TestCase):

    def test_find_median_sorted_arrays(self):
        assert 2 == Solution().findMedianSortedArrays([1, 3], [2])
        assert 2.5 == Solution().findMedianSortedArrays([1, 2], [3, 4])
    
    # write a failure path test for the above solution
    def test_find_median_sorted_arrays_failure(self):
        assert 0.0 == Solution().findMedianSortedArrays([], [])

if __name__ == '__main__':
    unittest.main()
```
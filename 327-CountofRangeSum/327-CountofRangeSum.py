# Last updated: 31/08/2026, 15:02:15
1class Solution:
2    def countRangeSum(self, nums: List[int], lower: int, upper: int) -> int:
3        psum = [0]
4        for num in nums:
5            psum.append(psum[-1] + num)
6
7        result, slist = 0, SortedList()
8        for pval in reversed(psum):
9            result += slist.bisect_right(pval + upper) - slist.bisect_left(pval + lower)
10            slist.add(pval)
11
12        return result
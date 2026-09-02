# Last updated: 02/09/2026, 13:37:17
1class Solution(object):
2    def bestHand(self, ranks, suits):
3        s1=set(ranks)
4        s2=set(suits)
5        if len(s2)==1:
6            return "Flush"
7        r="n"
8        for i in s1:
9            if ranks.count(i)>=3:
10                return "Three of a Kind"
11            if ranks.count(i)==2:
12                r="Pair"
13        if r!="n":
14            return r
15        return "High Card"
16        
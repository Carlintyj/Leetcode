class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x >= 0:
            ans = int(str(x)[::-1])
            if ans >= 2**31-1:
                return 0
            else:
                return ans
        else:
            ans = int(str(x * -1)[::-1]) * -1
            if ans < -2**31:
                return 0
            else:
                return ans
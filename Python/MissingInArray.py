class Solution:
    def missingNumber(self, arr):
        # code here
        iCount = 0
        aCount = 0
        n = len(arr)
        
        for i in range(0, n+1):
            j = i+1
            if(i < n):
                aCount += arr[i]
            iCount += j
        
        return (iCount - aCount)

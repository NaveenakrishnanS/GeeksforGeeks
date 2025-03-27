
class Solution:
    def get_min_max(self, arr):
        min = 0
        max = 0
        for i in range(0,len(arr)):
            value = arr[i]
            if(value > max):
                max = value
            if(value < min or min == 0):
                min = value
        return [min,max]
    

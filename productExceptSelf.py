 def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = len(nums)
        answer = [0]*l
        answer[0]=1
        for i in range(1,l):
            answer[i] = answer[i-1]*nums[i-1]
            
        R = 1
        for i in reversed(range(l)):
            answer[i] = answer[i]*R
            R*=nums[i]
        return answer
        
        #tc --> o(n)
        #sc ---> o(1)

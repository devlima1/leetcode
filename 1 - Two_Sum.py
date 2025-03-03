class Solution(object):
    # Brute Force O(N²)
    # def twoSum(self, nums, target):
    #     for i in range(len(nums)):
    #         for j in range(i + 1, len(nums)):
    #             if nums[i] + nums[j] == target:
    #                 return [i, j]
    #     return None

    # Two Pointer O(N log N) -> é necessário que o array esteja ordenado
    # def twoSum(self, nums, target):
    #     l, r = 0, len(nums) - 1

    #     while(l < r):
    #         curSum = nums[l] + nums[r]

    #         if curSum == target:
    #             return [l, r]
    #         elif curSum > target:
    #             r -= 1
    #         else:
    #             l += 1
    #     return None

    #HashMap O(N)
    def twoSum(self, nums, target):
        hashmap = {}

        for index, num in enumerate(nums):
            if target - num in hashmap:
                return [index, hashmap[target - num]]
            hashmap[num] = index
        return None

# Exemplo de uso
if __name__ == "__main__":
    solution = Solution()
    nums = [2, 7, 11, 15]
    target = 9
    print(solution.twoSum(nums, target))
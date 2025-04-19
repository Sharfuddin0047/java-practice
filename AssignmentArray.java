public class AssignmentArray {
    /*Given an integer array nums, return true if any value appears at least twice in the 
array, and return false if every element is distinct. */
    public static boolean leastTwice(int arr[]){
        int count =0;
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            for(int j=0; j<arr.length; j++){
                if(arr[j] == temp){
                    count+=1;
                }
            }
            if (count >=2){
                return true;
                
            }else{
                count = 0;
            }

        }
        
            return false;
        
    }

    // Question 2
   /*  There is an integer array nums sorted in ascending order (with distinct values). 
Prior to being passed to your function, nums is possibly rotated at an unknown 
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
example, [0,1,2,4,5,6,7] might be rotated
 at pivot index 3 and 
become [4,5,6,7,0,1,2]. 
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums. 
You must write an algorithm with O(log n) runtime complexity. */
    public static int target(int arr[] , int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    /* Question 3
     * You are given an array prices where prices[i] is the price of a given stock on 
the ith day. 
Return the maximum profit you can achieve from this transaction. If you cannot 
achieve any profit, return 0.
     */

    public static int stockPrice(int prices[]){
        int buyPrice = prices[0];
        int maxProfit = 0;
        int day = 0;
        
        for(int j=1; j<prices.length; j++){
            buyPrice = Math.min(buyPrice, prices[j]);
            if( buyPrice == prices[j]){
                day = j;
            }
        }
        System.out.println(buyPrice);
        for(int i=day+1; i<prices.length; i++){
            if(buyPrice < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i]-buyPrice);
                
            }
        }
        if(maxProfit !=0){
            return maxProfit;
        }else{
            return 0;
        }
    }
//     Given n non-negative integers representing an elevation map where the width of 
// each bar is 1, compute how much water it can trap after raining. 

    public static int trappedRain(int height[]){
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int trappedRainWater = 0;
        left[0] = height[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        right[n-1] = height[n-1];
        for(int j=n-2; j>=0; j--){
            right[j] = Math.max(right[j+1], height[j]);
        }

        for(int k=0; k<n; k++){
            int totalHeight = Math.min(left[k],right[k]);
            int trappedWater = totalHeight - height[k];
            trappedRainWater = trappedRainWater + trappedWater;  
        }
        return trappedRainWater;
    }
    /*Given an integer array nums, return all the triplets [nums[i], nums[j],   
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
Notice that the solution set must not contain duplicate triplets. */
   

    public static void main(String[] args) {
        // Solution 1
        // int arr[] = {1,1,1,3,3,4,3,2,4,2};
        // int arr[] = {1, 2, 3, 1};
        // System.out.println(leastTwice(arr));

        // Solution 2
        // int arr[] = {4,5,6,7,0,1,2};
        // int target = 0;
        // System.out.println(target(arr, target));

        // Solution 3
        // int prices[] = {7, 6, 4, 3, 1};
        // System.out.println(stockPrice(prices));

        // Solution 4 
        // int height[] = {4, 2, 0, 3, 2, 5};
        // System.out.println(trappedRain(height));
    }
}

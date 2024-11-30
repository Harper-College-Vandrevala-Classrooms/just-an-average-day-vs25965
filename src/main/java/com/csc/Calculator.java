package com.csc;

import java.util.Arrays;

public class Calculator {
  
  public int maximumUsingForLoop (int[] nums) 
    {
      if (nums.length == 0)
      {
        return -1;
      }
      else{
        int max = nums[0];
       for( int i = 1; i < (nums.length); i++ )
       {
         if (nums[i] > max)
         {
           max = nums[i];
         }
       }
       return max;

      }
      
    }
    public int minimumUsingForLoop(int[] nums)
    {
      if (nums.length == 0)
      {
        return -1;
      }
      else{
        int min = nums[0];
       for( int i = 1; i < (nums.length); i++ )
       {
         if (nums[i] < min)
         {
           min = nums[i];
         }
       }
       return min;

      }
    }
    public int sumUsingForLoop(int[] nums)
    {
      if (nums.length == 0)
      {
        return -1;
      }
      else
      {
        int sum = nums[0];
        for( int i = 1; i < (nums.length); i++ )
        {
          sum += nums[i];
        }
        return sum;
      }
    }
    public  int averageUsingForLoop(int[] nums)
    {
      if (nums.length == 0)
      {
        return -1;
      }
      else
      {
      int ave = (sumUsingForLoop(nums) / nums.length) ;
      return ave;
      }
    }
    public  int minimumUsingStream(int[] nums) 
    { 
      int min;
      min = Arrays.stream(nums).min().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
      return min;
      
    }
    public int maximumUsingStream(int[] nums) 
    {  
      int max;
      max = Arrays.stream(nums).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
      return max;
    }
    public int sumUsingStream(int[] nums)
    { 
      if (nums.length == 0)
      {
        return -1;
      }
      else
      {
      int sum = Arrays.stream(nums).sum(); // does not use throwException b/c int contrast to the other streams it has a meaningful default value(0)
      return sum;
      }
    }
    public int averageUsingStream(int[] nums) 
    {
      double ave_s = Arrays.stream(nums).average().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
      int ave =(int) ave_s; //truncate double to return int
      return ave;
    }
     
  
}

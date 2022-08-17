package com.SWE_Solutions;

public class BBWISE {

    public String sumOfSeries(double [] nums){
      
      double sum = (float)0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
      }
      
      String output = String.format("%.2f", sum);
      return output;
    }
    
    public static void main(String [] args){
      double nums [] = {1,5,8,4,8.4,5,9,7,51,3};
      BBWISE b = new BBWISE();
      System.out.println(b.sumOfSeries(nums));
    }
}

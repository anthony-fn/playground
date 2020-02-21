package com.anthony.playground.basics;

public class ArrayCombine {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        boolean found = false;
        for( int i = 0; i < nums.length - 1; i ++ )
        {
            int first = nums[i];

            if( first > target ){
                continue;
            }

            for( int j = i + 1; j < nums.length; j ++ )
            {
                int second = nums[j];
                if( target == (first + second ) ){
                    result[0] = first;
                    result[1] = second;
                    found = true;
                    break;
                }
            }

            if(found){
                break;
            }
        }
        return result;
    }

    public static void main( String [] args )
    {
        System.out.println("Start");
    }
}

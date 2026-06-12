/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Solution set may contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4] 
Output: [[0,1,-1]],[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The triplets are [0,1,-1],[-1,0,1] and [-1,-1,2].

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 */
import java.util.*;
class ThreeSum
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,k,n,t=0,sum;
        System.out.println("Enter the size of array");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(i=0; i<n; i++)
            a[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    sum=a[i]+a[j]+a[k];
                    if(sum==0)
                    {
                        t=1;
                        if(i!=j&&i!=k&&j!=k)
                        {
                            System.out.println("Elements "+a[i]+","+a[j]+" and "+a[k]+" gives 0");
                            break;
                        }
                    }
                }
            }
        }
        if(t==0)
            System.out.println("Not a single occurance possible");
    }
}
/*
   Output:
Enter the size of array
6
Enter the elements of array
-1 0 1 2 -1 -4
Elements -1,0 and 1 gives 0
Elements -1,2 and -1 gives 0
Elements 0,1 and -1 gives 0
   */
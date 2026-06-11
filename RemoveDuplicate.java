/*
Given an integer array , remove the duplicates in-place such that each unique element appears only once.

Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
import java.util.*;
class RemoveDuplicate
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,k=1,temp;
        System.out.println("Enter size of array");
        n=in.nextInt();
        if (n==0) 
        {
            System.out.println("Invalid Input");
            return;
        }
        int c[]=new int[n];
        System.out.println("Enter elements of array");
        for(i=0;i<n;i++)
            c[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(c[j]>c[j+1])
                {
                    temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        for (i=1;i<n;i++) {
            if (c[i]!=c[k-1]) 
            {
                c[k]=c[i];
                k++;
            }
        }
        System.out.print("Count= "+k+", Sorted array:");
        for(i=0;i<k;i++)
            System.out.print(c[i]+ " ");
        for(i=k;i<n;i++)
            System.out.print("_ ");
    }
}
/*
Output:
Enter size of array
10
Enter elements of array
1
7
8
2
3
1
0
7
8
8
Count= 6, Sorted array:0 1 2 3 7 8 _ _ _ _ 
 */
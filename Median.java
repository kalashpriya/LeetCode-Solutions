/*
Median of Two Sorted Arrays
Hard
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/
import java.util.*;
class Median
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,m,n,s,mid,temp;
        double median;
        System.out.println("Enter size of first array");
        m=in.nextInt();
        int a[]=new int[m];
        System.out.println("Enter elements of first array");
        for(i=0;i<m;i++)
        a[i]=in.nextInt();
        System.out.println("Enter size of second array");
        n=in.nextInt();
        int b[]=new int[n];
        System.out.println("Enter elements of second array");
        for(i=0;i<n;i++)
        b[i]=in.nextInt();
        s=m+n;
        int c[]=new int[s];
        for(i=0;i<m;i++)
        c[i]=a[i];
        for(j=0;j<n;j++)
        c[i++]=b[j];
        for(i=0;i<s;i++)
        {
            for(j=0;j<s-1-i;j++)
            {
                if(c[j]>c[j+1])
                {
                    temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        System.out.print("Merged and sorted array:");
        for(i=0;i<s;i++)
        System.out.print(c[i]+ " ");
        mid=s/2;
        if(s%2==0)
        median= (c[mid]+c[mid-1])/2.0;
        else
        median=c[mid];
        System.out.println(", Median="+median);
    }
}
/*
 * Output:
Enter size of first array
2
Enter elements of first array
1
4
Enter size of second array
2
Enter elements of second array
3
2
Merged and sorted array:1 2 3 4 , Median=2.5
 */
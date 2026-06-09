import java.util.*;
class TwoSum
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,t,sum,x,y;
        System.out.println("Enter the size of array");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++)
        a[i]=in.nextInt();
        System.out.println("Enter the target");
        t=in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum=a[i]+a[j];
                if(sum==t)
                {
                    System.out.println("Elements of "+i+ " and "+j+" gives "+t);
                }
            }
        }
    }
}
/*
Output:
Enter the size of array
4
Enter the elements of array
1
2
7
8
Enter the target
9
Elements of 0 and 3 gives 9
Elements of 1 and 2 gives 9
*/

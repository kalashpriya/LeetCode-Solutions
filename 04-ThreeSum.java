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

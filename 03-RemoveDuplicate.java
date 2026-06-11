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

import java.util.Scanner;

public class p4 {public static void main(String[] args) {
    int i,n,sum=0;
    int [] a;
    System.out.println("enter value  of n");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a=new int[n];
    System.out.println("read array values..");
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
     for(i=0;i<n;i++)
    {
      sum+=a[i];
    }
    System.out.println("sum of array is:"+sum);


}
    
}

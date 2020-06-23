package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3],c[][]=new int[3][3],i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            a[i][j]=sc.nextInt();
            }
    }
         for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            b[i][j]=sc.nextInt();
            }
    }
          for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            c[i][j]=a[i][j]+b[i][j];
            }
    }
          System.out.println();
           for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            System.out.print(c[i][j]+ " ");
            }
            System.out.println();
    }
          
    }
    
}

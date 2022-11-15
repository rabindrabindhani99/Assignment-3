import java.util.Scanner;

public class Assignment3_5
{
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
        int[][] arr1 =new int[3][4];
        int[][] arr2 =new int[3][4];

        //First array
        System.out.println("Enter the elements for 1st 3x4 array:");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        //1st array display
        System.out.println("The 1st 3x4 array is:");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        //Second array
        System.out.println("Enter the elements for 2nd array:");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        //Second array display
        System.out.println("The 2nd 3x4 array is:");
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        //summation of two arrays
        int[][] sum =new int[3][4];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        //sum of the arrays displays
        System.out.println("The sum of two 3x4 arrays is:");
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 4; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        //Subtraction of two arrays
        int[][] sub=new int[3][4];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                sub[i][j]=arr1[i][j]-arr2[i][j];
            }
        }

        //Subtraction of the arrays displays
        System.out.println("The subtraction of two 3x4 arrays is:");
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 4; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

        //Multiplication of two arrays
        int[][] mul=new int[3][4];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                mul[i][j]=0;
                for (int k=0;k<4;k++)
                {
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        //Multiplication of the arrays displays
        System.out.println("The Multiplication of two 3x4 arrays is:");
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 4; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}

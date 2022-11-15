import java.util.Scanner;

public class Assignment3_3
{
    public static void main( String[] args ) {
        int temp=0;
        int arr[]=new int[10];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i< 10;i++)
        {
            System.out.println("Enter the "+(i+1)+ " number into the array:");
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered numbers are: ");
        for(int i=0;i< 10;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nArray after arranging: ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSecond Smallest no is: "+arr[1]);
        System.out.println("Third Largest no is: "+arr[7]);
        int product=arr[1]*arr[7];
        System.out.println("Product of 2nd smallest and third largest no is:"+product);
    }
}

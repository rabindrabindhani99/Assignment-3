import java.util.Scanner;

public class Assignment3_1
{
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        double sum=0;
        int count_even=0,count_odd=0,count_prime=0,count_pal=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+(i+1)+"th number: ");
            arr[i]=sc.nextInt();
        }
        //find average
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        double average= sum/ arr.length;
        System.out.println("Average of the entered numbers: "+average);
        //No of even no
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count_even++;
            }
        }
        System.out.println("The no of even numbers is: "+count_even);

        //No of odd no
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count_odd++;
            }
        }
        System.out.println("The no of odd numbers is: "+count_odd);

        //No of Prime no
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=true;
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    flag=false;
                }
            }
            if(flag && arr[i]!=1)
            {
                count_prime++;
            }
        }
        System.out.println("The no of prime numbers is: "+count_prime);

        //number of palindrome numbers
        for(int i=0;i<arr.length;i++)
        {
            int sum_pal=0;
            int temp=arr[i];

            while(temp>0)
            {
                int r=temp%10;
                sum_pal=(sum_pal*10)+r;
                temp=temp/10;
            }

            if(arr[i]==sum_pal)
            {
                count_pal++;
            }
        }
        System.out.println("Number of palindrome numbers: "+count_pal);

    }
}

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Ques2 {
//    static int arrange(int[] A) {
//        int j = 0;
//        int pivot = 0;    // consider 0 as a pivot
//
//        // each time we find a negative number, `j` is incremented,
//        // and a negative element would be placed before the pivot
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] > pivot) {
//                // swap `A[i]` with `A[j]`
//                int temp = A[i];
//                A[i] = A[j];
//                A[j] = temp;
//
//                j++;
//            }
//        }
//
//        // `j` holds the index of the first positive element
//        return j;
//    }
//    public static void rearrange(int[] A)
//    {
//        // partition a given array such that all positive elements move
//        // to the end of the array
//
//        int p = arrange(A);
//
//        // swap alternate negative elements from the next available positive
//        // element till the end of the array is reached, or all negative or
//        // positive elements are exhausted.
//
//        for (int n = 0; (p < A.length && n < p); p++, n += 2)
//        {
//            // swap `A[n]` with `A[p]`
//            int temp = A[n];
//            A[n] = A[p];
//            A[p] = temp;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter the size of the array:");
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//
//        System.out.println("Enter the elements:");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        rearrange(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}



//It was so confusing and took me 2 days but still not got the solution. So i copy and pasted it. Sorry for this.
import java.util.Scanner;
class Ques2
{

    public static void Rearrange(int array[], int n)
    {
        int i = -1;

        for (int j = 0; j < n; j++)
        {
            if (array[j] > 0)
            {
                i = i + 1;
                array[i] = (array[i] + array[j]) - (array[j] = array[i]);
            }
        }

        int positive_index = 0, negative_index = i + 1;

        while (negative_index < n && negative_index > positive_index && array[negative_index] < 0)
        {
            array[negative_index] = (array[negative_index] + array[positive_index]) - (array[positive_index] = array[negative_index]);
            positive_index = positive_index + 2;
            negative_index = negative_index + 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sr.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i] = sr.nextInt();
        }
        Rearrange(a, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
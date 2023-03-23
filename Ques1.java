import java.util.Scanner;

public class Ques1 {
    static void FirstRepeatingElement(int[] arr){
        int[] arr2=new int[100001];
        int i=0;
int coun = -1;

        for(i=0;i<arr.length;i++){
            arr2[arr[i]]++;
        }
        for(i=0;i<arr2.length;i++){

            if (arr2[i]>1){
                System.out.println("Repetation of first element:"+arr2[i]);
                coun++;
                break;
            }
        }
        if (coun<0){
            System.out.println("Repetation:-1");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        FirstRepeatingElement(arr);
    }
}

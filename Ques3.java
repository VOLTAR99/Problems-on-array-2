import java.util.*;
public class Ques3
{

    static int findPlatforms(int n, int arrival[],int departure[])
    {
        int res=1;
        for(int i=0; i<=n-1; i++)
        {
            int count=1;
            for(int j=i+1; j<=n-1; j++)
            {
                if((arrival[i]>=arrival[j] && arrival[i]<=departure[j]) || (arrival[j]>=arrival[i] && arrival[j]<=departure[i]))
                {
                    count++;
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }
    public static void main (String args[])
    {Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the time of arrivals:");
        int[] arrival = new int[n];
        for(int i=0;i<n;i++) {
            arrival[i]=sc.nextInt();
        }
        int[] departure = new int[n];
        System.out.println("Enter the time for departure:");
        for(int i=0;i<n;i++) {
            departure[i]=sc.nextInt();
        }
        n=arrival.length;
        int totalCount = findPlatforms(n, arrival, departure);
        System.out.println("Minimum number of Platforms required: "+totalCount);
    }
} 
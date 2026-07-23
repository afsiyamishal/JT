package Day23;

public class SlidingWindow {

    public static void main(String[] args){

        int arr[]={1,12,-5,-6,50,3};

        int k=4;

        int sum=0;

        for(int i=0;i<k;i++)
            sum+=arr[i];

        int max=sum;

        for(int i=k;i<arr.length;i++){

            sum=sum-arr[i-k]+arr[i];

            if(sum>max)
                max=sum;
        }

        System.out.println("Maximum Sum = "+max);

    }
}
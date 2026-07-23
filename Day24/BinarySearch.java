package Day24;

public class BinarySearch {

    public static void main(String[] args){

        int arr[]={1,3,5,6};

        int target=5;

        int low=0,high=arr.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid]==target){

                System.out.println("Found at "+mid);
                return;

            }

            if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;

        }

        System.out.println("Insert Position = "+low);

    }
}
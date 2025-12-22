package sortings;

public class insertionsort {
    //function call
    public static void insertion_sort(int arr[]){
        //outer loop for current position
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev= i-1;
            //thhis is loop is finding the crrt postion to insert the element
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //after finding the coort position now we have to insert the element on curr position
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        //function 
        insertion_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

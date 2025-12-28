package sortingassignment;

public class pinsertionsort {
    //function to implement insertion sort
    public static void insertion(int array[]){
        int n=array.length;
        //outer loop
        for(int i=0;i<n;i++){
            int currentposition= array[i];
            int prev= i-1;
            //finding the crrt position to insertion
            while (prev>=0 && array[prev]>currentposition) {
                array[prev+1]=array[prev];
                prev--;
                
            }
            array[prev+1]=currentposition;
        }
    }
    public static void main(String[] args) {
        int array []={3,6,2,1,8,7,4,5,3,1};
        //function call
        insertion(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

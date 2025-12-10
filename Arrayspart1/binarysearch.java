package Arrayspart1;

public class binarysearch {
    //function to find the key in the sorted array using binary search
    public static int binary(int numbers[],int key){
        //initializing the index start and end
        int start=0; 
        int end= numbers.length-1;
      
       while(start<=end){
          int mid =(start + end)/2;
        if(numbers[mid]==key){
            return mid;
        }
        //
        if(numbers[mid]<key){//left
            start=mid+1;
            
        }else{//right
            end = mid-1;
            
        }
       }
       return -1;//if key not found
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};
        int key=8;
        System.out.println("the key at index :"+" "+binary(numbers, key));
    }
}

package Arrayspart1;

public class basic {
    public static void main(String[] args) {
        //here basic initialization of an array
        int arr[]={2,3,4,5,6,6};
       for(int i=0;i<arr.length;i++){
        if(i==4){
            break;
        }
        System.out.println(arr[i]);
       }
    }
}

package sortingassignment;
public class pbubblesort {

    //function to implement bubble sorting
    public static void bubble(int array[]){
        //outer loop for current position
        for(int i=0;i<array.length;i++){
            //inner loop for comparison
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array []={3,6,2,1,8,7,4,5,3,1};
        //function call
        bubble(array);
        //printing the array
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
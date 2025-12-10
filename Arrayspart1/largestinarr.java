package Arrayspart1;
public class largestinarr {

    //function to find largest in the array
    public static int largest(int numbers[]){
        //suppose first element of an array is largest
      int   largest = numbers[0];
        for(int i=0;i<numbers.length;i++){
            //largest<numbers[i]// second appraoche
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }

   
    public static void main(String[] args) {
        int numbers[]={2,4,14,10,3,16};
    
        //function call
        int result= largest(numbers);
        System.out.println("the max element from the array is "+" "+result);

        
    }
}
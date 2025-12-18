package sortings;



public class sortedbubble {
    //here we are optimizing the time complexity of a bubble sort 
    //function to optimize bubble sort ==>
        public static void optimize(int numbers[]){
          
            for(int i=0;i<numbers.length-1;i++){
                //har start ke paas me swap ku reset karna hai 
                  boolean swap = false;
                //inner loop
                for(int j=0;j<numbers.length-1-i;j++){
                    if(numbers[j]>numbers[j+1]){
                        int temp= numbers[j];
                        numbers[j]=numbers[j+1];
                        numbers[j+1]=temp;
                        swap=true;
                    }
                }
                 if(!swap){
                break;
            }
            }
         
           
        }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        //function call
        optimize(numbers);
        //printing the array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}

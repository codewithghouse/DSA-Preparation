package sortings;

public class selectionsort {
    //selection sort function
    public static void selection_sort(int numbers[]){
        //outer loop for cp
        for(int i=0;i<numbers.length;i++){
            int mp=i;
            //inner loop
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[mp]>numbers[j]){
                    mp=j;
                }
            }
            //inner loop ke bahar swapping 
            int temp=numbers[mp];
            numbers[mp]=numbers[i];
            numbers[i]=temp;

        }
    }
   
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        //function call
        selection_sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}

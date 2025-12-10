package Arrayspart1;

public class pairsinarray {
    //function to print the pairs in array
    public static void pairs(int numbers[]){
        //outer loop for cuurent position // 2,4,6,8,10
        for(int i=0;i<numbers.length;i++){
            int curr= numbers[i];//2,4,6,8,10 
            ///inner loop for pairing the other elements with curr element 
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        //function call
        pairs(numbers);

    }
}

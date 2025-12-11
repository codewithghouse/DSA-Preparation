package Arrayspart1;

public class reversearray {
    //unction to reverse an array
    public static void reverse(int numbers[]){
        //declaring thee var 
        int first=0;
        int last=numbers.length-1;
        while ((first<last)) {
            //first is index value and numbers[first] is the value of index containinf element 10 suppose
            int temp =numbers[last];
           numbers[last] = numbers[first];
            numbers[first]= temp;
            //index increasing and decreasing
            first++;
            last--;
            
        }
    }
    public static void main(String[] args) {
        //array
        int numbers[]={2,4,6,8,10};
        //fuunction call
        reverse(numbers);
        
        for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
        }

    }
    
}

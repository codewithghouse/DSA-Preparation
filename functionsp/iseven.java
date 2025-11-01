package functionsp;

public class iseven {
    // method to check if a number is even or else

    public static boolean isEven(int a ){
       
        if(a%2 !=0){
            System.out.println("the number is not a even number");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int a= 9;
        System.out.println(isEven(a));
        
    }
}

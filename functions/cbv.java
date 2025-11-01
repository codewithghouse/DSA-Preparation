package functions;

public class cbv {
    //here is the example of call by value
    // changing the value of a
    public static void swap(int a){
         a =10;
         System.out.println("inside the swap function == a = "+a);

    }

    public static void main(String[] args) {
        int a=5;
        System.out.println("a = "+a);
        swap(a);

    }
}


package functionsp;

public class palli {
    // method to check if a number is palli or not
    public static void ispalli(int n){
        int n1=n;
        int palli=0;
        while (n>0) {
            int ld= n%10; // taking last digit
            palli = (palli*10) +ld; // storing ld
            n=n/10; // removing last digit
        }
        if(n1==palli){
            System.out.println("the number is pallidrome "+ n+" "+palli);
        }else{
            System.out.println("the number is not a pallidrome");
        }
    }
    public static void main(String[] args) {
        int n=1456;
        ispalli(n);

    }
}

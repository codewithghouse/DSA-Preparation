package operators;

public class unary {
    public static void main(String[] args) {
        int a=9;
        int b =++a;
        System.out.println("pre increament example");
        System.out.println(a);
        System.out.println(b);
        System.out.println("---------");
        System.out.println("post increament example");
        int c= 10;
        int d=c++;
        System.out.println(c);
        System.out.println(d);
        System.out.println("-----------");
        System.out.println("pre decreament example");
        int e= 10;
        int f= --e;
        System.out.println(e);
        System.out.println(f);
        System.out.println("----------");
        System.out.println("post decreament example");
        int g = 10;
        int h =g--;
        System.out.println(g);
        System.out.println(h);
        System.out.println("unary examples are done :)");
    }
}

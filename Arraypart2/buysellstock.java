package Arraypart2;

public class buysellstock {
    //function to predict maximum profit
    public static int profit(int price[]){
        int n=price.length;
        int buyprice=Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<n;i++){
           
            if(buyprice<price[i]){
                //here profit[i]==sellingprice
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
                System.out.println(maxprofit);
            }else{
                buyprice=price[i];
                
            }
           
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        //function call
       System.out.println("the maxximum profit is "+profit(price));
    }
}

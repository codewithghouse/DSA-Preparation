package Arraypart2;

import practice.table;

public class traprainwater {
    public static int trapwater(int height[]){
        int n=height.length;
        //step 1 calculating the lm array 
        int leftmax[]=new int[n];
        leftmax[0]=height[0]; //kyunki iske left me koe dusra bar nhi hai to wo khud hojayega
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //step 2 calculating right max array 
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1]; //last elemtn ku eqal banare kyunki uske bad koe bar nhi hai 
        //i is startng from 5 i=5 means index 5 
        for( int i=n-2;i>=0;i--){
       rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //step 3 //loop --> min of lm ,rm to find water level ==w
        int trapwater=0;
        for(int i=0;i<n;i++){
        //water level ==> math.mix(lm,rm);
        int waterlevel= Math.min(leftmax[i],rightmax[i]);
        //fianllly trapwater == waterlevel -height[i] barki height se minus karre
        //har bar trap water plus karte jaare
        trapwater+=waterlevel-height[i];
        }        return trapwater;
    }
    public static void main(String[] args) {
        //this hieght array is given in the question
        int height[]={4,2,0,6,3,2,5};
        //function call
        System.out.println("the total trapwater is:"+trapwater(height));
    }
}
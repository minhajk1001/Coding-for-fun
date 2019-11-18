
package bucc;

import static bucc.CardsPrint.BLACK;
import static bucc.CardsPrint.RED;

public class CardsPrint {
    public static final String RED = "\u001B[31m";
    public static final String BLACK = "";
    public String type, color, sign;
    public int arr[];
    public CardsPrint(int dealt){
        /*
        * determine color and sign
        */
        if(dealt>-1 && dealt<14){
            this.color = RED;
            sign = " ◆ ";
        }
        if(dealt>13 && dealt<27){
            this.color = BLACK;
            sign = " ♠ ";
        }
        if(dealt>26 && dealt<40){
            this.color = RED;
            sign = " ❤ ";
        }
        if(dealt>39 && dealt<53){
            this.color = BLACK;
            sign = " ♣ ";
        }
        classification(dealt);
    }
    public void classification(int dealt){
        if(dealt % 13 == 1 ){
            type = "A";
            arr = array(1);
        }
        if(dealt % 13 == 2 ){
            type = "K";
            arr = array(2);
        }
        if(dealt  % 13 == 3 ){
            type = "Q";
            arr = array(3);
        }
        if(dealt  % 13 == 4 ){
            type = "J";
            arr = array(4);
        }
        if(dealt % 13 == 5 ){
            type = "2";
            arr = array(5);
        }
        if(dealt % 13 == 6 ){
            type = "3";
            arr = array(6);
        }
        if(dealt % 13 == 7 ){
            type = "4";
            arr = array(7);
        }
        if(dealt % 13 == 8 ){
            type = "5";
            arr = array(8);
        }
        if(dealt % 13 == 9 ){
            type = "6";
            arr = array(9);
        }
        if(dealt % 13 == 10 ){
            type = "7";
            arr = array(10);
        }
        if(dealt % 13 == 11 ){
            type = "8";
            arr = array(11);
        }
        if(dealt % 13 == 12 ){
            type = "9";
            arr = array(12);
        }
        if(dealt % 13 == 0 ){
            type = "10";
            arr = array(0);
        }
          cardPrinting(sign,color,arr);
    }
    public void cardPrinting(String sign, String color, int arr[]){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==arr[0] && j==arr[1])||(i==arr[2] && j==arr[3])||(i==arr[4] && j==arr[5])||(i==arr[6] && j==arr[7])||(i==arr[8] && j==arr[9])||(i==arr[10] && j==arr[11])||(i==arr[12] && j==arr[13])||(i==arr[14] && j==arr[15])||(i==arr[16] && j==arr[17])||(i==arr[18] && j==arr[19])){
                        System.out.print(color + sign + color);
                    }else
                        System.out.print("  ");
                    if(i==8 && j==4){
                        System.out.print(color + type + color);
                    }
                }
                System.out.println();
            }
            System.out.println(color + "-------------" + color);
        }
    
        public int[] array(int cardno){
            int a[] = new int[1];
            if(cardno == 1 || cardno ==2 || cardno == 3 || cardno ==4){
                int arr[] =  {1,1,7,3,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
                return arr;
            }
            if(cardno == 5){
                int arr[] =  {1,2,7,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
                return arr;
            }
            if(cardno == 6){
                int arr[] =  {1,2,7,2,4,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
                return arr;
            }
            if(cardno == 7){
                int arr[] =  {1,1,1,2,7,1,7,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
                return arr;
            }
            if(cardno == 8){
                int arr[] =  {1,1,1,2,7,1,7,2,4,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
                return arr;
            }
            if(cardno == 9){
                int arr[] =  {1,1,1,2,7,1,7,2,4,1,4,2,-1,-1,-1,-1,-1,-1,-1,-1};
                return arr;
            }
            if(cardno == 10){
                int arr[] =  {1,1,1,2,7,2,4,1,4,2,2,2,7,1,-1,-1,-1,-1,-1,-1};
                return arr;
            }
            if(cardno == 11){
                int arr[] =  {1,1,1,2,7,2,4,1,4,2,2,2,7,1,6,2,-1,-1,-1,-1};
                return arr;
            }
            if(cardno == 12){
                int arr[] =  {1,0,1,2,7,2,7,0,4,2,1,1,4,1,7,1,4,0,-1,-1};
                return arr;
            }
            if(cardno == 0){
                int arr[] =  {1,0,1,3,3,0,3,3,2,2,7,3,5,0,5,3,7,0,6,2};
                return arr;
            }
            return a;
        }

}

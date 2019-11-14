
package bucc;
public class CardPrint {
    public static final String RED = "\u001B[31m";
    public static final String BLACK = "";
    public String type, color, sign;
    int typ ;
    public CardPrint(int dealt){
        /*
        * determine color and sign
        */
        if(dealt>0 && dealt<14){
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
        /*
        * card Identifire
        */
        if((dealt -1 ) % 13 == 0 ){
            type = "A";
            face(sign,color);
        }
        if((dealt -2 ) % 13 == 0 ){
            type = "K";
            face(sign,color);
        }
        if((dealt -3 ) % 13 == 0 ){
            type = "Q";
            face(sign,color);
        }
        if((dealt -4 ) % 13 == 0 ){
            type = "J";
            face(sign,color);
        }
        if((dealt -5 ) % 13 == 0 ){
            type = "2";
            card02(sign,color);
        }
        if((dealt -6 ) % 13 == 0 ){
            type = "3";
            card03(sign,color);
        }
        if((dealt -7 ) % 13 == 0 ){
            type = "4";
            card04(sign,color);
        }
        if((dealt -8 ) % 13 == 0 ){
            type = "5";
            card05(sign,color);
        }
        if((dealt -9 ) % 13 == 0 ){
            type = "6";
            card06(sign,color);
        }
        if((dealt -10 ) % 13 == 0 ){
            type = "7";
            card07(sign,color);
        }
        if((dealt -11 ) % 13 == 0 ){
            type = "8";
            card08(sign,color);
        }
        if((dealt -12 ) % 13 == 0 ){
            type = "9";
            card09(sign,color);
        }
        if(dealt % 13 == 0 ){
            type = "10";
            card10(sign,color);
        }
    }
    public void face(String sign, String color){ 
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==1)||(i==7 && j==3)){
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
    public void card02(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==2)||(i==7 && j==2)){
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
    public void card03(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==2)||(i==7 && j==2)||(i==4 && j==2)){
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
    public void card04(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==1)||(i==1 && j==2)||(i==7 && j==1)||(i==7 && j==2)){
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
    public void card05(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==1)||(i==1 && j==2)||(i==7 && j==1)||(i==7 && j==2)||(i==4 && j==2)){
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
    public void card06(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==1)||(i==1 && j==2)||(i==7 && j==1)||(i==7 && j==2)||(i==4 && j==1)||(i==4 && j==2)){
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
    public void card07(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==1)||(i==1 && j==2)||(i==7 && j==1)||(i==7 && j==2)||(i==4 && j==1)||(i==4 && j==2)||(i==2 && j==2)){
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
    public void card08(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==1)||(i==1 && j==2)||(i==7 && j==1)||(i==7 && j==2)||(i==4 && j==1)||(i==4 && j==2)||(i==2 && j==2)||(i==6 && j==2)){
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
    
        public void card09(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==0)||(i==1 && j==2)||(i==7 && j==0)||(i==7 && j==2)||(i==4 && j==0)||(i==4 && j==2)||(i==1 && j==1)||(i==4 && j==1)||(i==7 && j==1)){
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
        public void card10(String sign, String color){
            System.out.println(color + "-------------" + color);
            for(int i=0; i<9; i++){
                System.out.print(color + "|" + color);
                if(i==0)
                    System.out.print(color + type + color);
                for(int j=0; j<5; j++){
                    if((i==1 && j==0)||(i==1 && j==3)||(i==3 && j==0)||(i==3 && j==3)||(i==2 && j==2)||(i==6 && j==2)||(i==5 && j==0)||(i==5 && j==3)||(i==7 && j==0)||(i==7 && j==3)){
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
    }


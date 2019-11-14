
package bucc;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Bucc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prompt prompt = new Prompt();
        String color = "";
        String sign = "";
        try{
            int dealt = sc.nextInt();
            int array[] = new int[dealt];
            for(int i=0; i<dealt; i++){
                int randomValue = ThreadLocalRandom.current().nextInt(1, 52);
                array[i] = randomValue;
                boolean decision = true;
                for(int j=0; j<i; j++){
                    if(array[i] == array[j]){
                        decision = false;
                        break;
                    }
                }
                if(decision){
                    CardPrint cardPrint = new CardPrint(randomValue);
                }  
                else
                    i--;
            }
        }
        catch(Exception e){
            System.out.println("Wrong Input");
        }
    }
    
}

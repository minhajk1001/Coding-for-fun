package bucc;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Bucc {

    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        String color = "";
        String sign = "";
        while (true) {
            try {
                Scanner sc_dealt = new Scanner(System.in);
                prompt.howManyCards();
                int dealt = sc_dealt.nextInt();
                prompt.imSuffling();
                int array[] = new int[dealt];
                for (int i = 0; i < dealt; i++) {
                   int randomValue = ThreadLocalRandom.current().nextInt(1, 53);
                    array[i] = randomValue;
                    boolean decision = true;
                    for (int j = 0; j < i; j++) {
                        if (array[i] == array[j]) {
                            decision = false;
                            break;
                        }
                    } 
                    if (decision) {
                        CardsPrint cardsPrint = new CardsPrint(randomValue);
                    } else {
                        i--;
                    }
                }
            } catch (Exception e) {
                Prompt.wrongInput();
            }
            try{
                Scanner sc_run = new Scanner(System.in);
                Prompt.playAgainOrExit();
                int decision = sc_run.nextInt();
                if(decision == 2){
                    prompt.welcome();
                    break;
                }
            }
            catch(Exception e){
                Prompt.wrongInput();
            }
        }
    }

}

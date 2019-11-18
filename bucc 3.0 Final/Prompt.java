
package bucc;
public class Prompt {
    public Prompt(){
        System.out.println("...I am Elliot or You can call me Mr.Robot");
        System.out.println("...Today You Gonna Play a Thriller Game with me.\n");
        System.out.println("...Game Instructions");
        System.out.println("-> I Have a Standard Deck of Cards of 52 Cards");
        System.out.println("-> You Have to Decide How Many Cards You want to dealt From the deck.");
        System.out.println("Ready?");
        System.out.println(".....................................................................");
        System.out.println("............................. GAME STARTS ...........................\n");
    }
    public void howManyCards(){
        System.out.print("...Enter How Many Cards You Want to Dealt from The Deck.\nEnter: ");
    }
    public void imSuffling(){
        System.out.println("\n...I'm Suffleing The Cards....");
        System.out.println("...Now Check Your Cards Bro.\n");
    }
    public static void wrongInput(){
        System.out.println("Wrong Input!");
    }
    public static void playAgainOrExit(){
        System.out.print("...Want to play again?\n1. Yes\n2. No More Today Bro. Im tried!\nEnter:");
    }
    public void welcome(){
        System.out.println("\n...It Was Fun to Play with you.");
        System.out.println("...Hope to See You Soon");
        System.out.println("...Have a nice day. Good Bye! :)\n");
    }
}

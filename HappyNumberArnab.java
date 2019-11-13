
package arnab;
public class HappyNumberArnab {
    public static void main(String[] args) {
        String s = "7";
        int ss = Integer.parseInt(s);
        int k = 0;
        while(true){
            char ch[] = s.toCharArray();
            if(ch.length == 1 && k!= 0){
                int y = Integer.parseInt(s);
                if(y == ss)
                    System.out.println("Happy Number");
                else
                    System.out.println("Not Happy Number");
                break;
            }
            int sum = 0;
            for(int i=0; i<ch.length; i++){
                String f = ch[i] + "";
                int l = Integer.parseInt(f);
                l = l*l;
                sum += l;
                s = sum + "";
            }
            k++;
        }
    }
}

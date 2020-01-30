import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int len = s1.length();
                len = 15-len;
                String s =s1;
                for (int c= 0;c<len;c++){
                    s = s + " ";
                }
                int x=sc.nextInt();
                String s2 = Integer.toString(x);
                len = s2.length();
                if (len<2){
                    s = s+"00"+s2;
                }
                else if (len<3){
                    s = s+"0"+s2;
                }
                else if (len<1){
                    s = s+"000";
                }
                else {
                    s = s+s2;
                }
                System.out.println(s);
                
                //Complete this line
            }
            System.out.println("================================");

    }
}




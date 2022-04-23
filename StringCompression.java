import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            StringCom(str);
        }    
    }

    private static void StringCom(String str) {
        char n = str.charAt(0);
        System.out.print(n);
        int count = 0;
        int k = 0;
        while(k<str.length()){
        for (int i = k; i < str.length(); i++) {
           char t = str.charAt(i);
           k++;
            if(n==t){
                count++;
            }
            else{
                break;
            }
        }
            
             n = str.charAt(count);
            System.out.print(count);
            System.out.print(n);
            count = 0;
            
            
    
    }
}
}

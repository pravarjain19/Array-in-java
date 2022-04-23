import java.util.Scanner;

public class substringPallendrome {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
               for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j <= str.length(); j++) {
                    String a = str.substring(i, j);
                    if(ispal(a) == true){
                        System.out.println(a);
                    }
                    
                    
                    
                       
                        

                    


                       
                }
                
                
            }
        }
    }

    private static boolean ispal(String a) {
                    int s =0 ;
                    int l = a.length()-1;
                    while(s<=l){
                        if(a.charAt(s) == a.charAt(l)){
                               
                            s++;
                            l--;
                            

                        }
                        else{
                            return false;
                        }
                       
                    } 
        return true;
    }
}

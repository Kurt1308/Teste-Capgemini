
package testecapgemini;

public class TesteCapgemini {

    public static void main(String[] args) {
        
        int n = 6;

        for(int i = 1; i <= n; i++) {
            for(int k = n-i; k > 0; k--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
                System.out.println("");
        }

    }
 
}

package testecapgeminiq3;

import java.util.Scanner;

public class TesteCapgeminiQ3 {

    static void contarSubString(String s)
{
  int res = 0;
 
  for (int i = 0; i < s.length(); i++)
  {
    int x = 0;
    for (int j = i; j < s.length(); j++)
    {
      int temp = 1 << s.charAt(j) - 'a';
 
      x ^= temp;
      if ((x & (x - 1)) == 0)
        res++;
    }
  }
  System.out.print(res/2);
}
    
public static void main(String[] args)
{
    
                String resposta;
                String str;
                Scanner teclado = new Scanner(System.in);
                do{
                System.out.print("Digite um palavra: ");
                str = teclado.next();
                contarSubString(str);
                System.out.println("");
                System.out.println("Quer continuar? [sim/não] ");
                resposta = teclado.next();
                } while (resposta.equals("sim"));
                
    }
}
 
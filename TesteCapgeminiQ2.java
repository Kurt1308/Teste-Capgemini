
package testecapgeminiq2;

import java.util.Scanner;

public class TesteCapgeminiQ2 {

    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);
        int tamanho;
        
        
        do {
            System.out.println("Digite sua senha: ");
            nome = teclado.next();
            tamanho = nome.length();
            if (tamanho == 1) {
                System.out.println("Adicione mais 5 caracteres em sua senha. Ex: " + nome + "A&2yt");
            } else if (tamanho == 2) {
                System.out.println("Adicione mais 4 caracteres em sua senha. Ex: " + nome + "A&2y");
            } else if (tamanho == 3) {
                System.out.println("Adicione mais 3 caracteres em sua senha. Ex: " + nome + "A&2");
            } else if (tamanho == 4) {
                System.out.println("Adicione mais 2 caracteres em sua senha. Ex: " + nome + "A&");
            } else if (tamanho == 5) {
                System.out.println("Adicione mais 1 caracteres em sua senha. Ex: " + nome + "3");
            } else if (tamanho > 6) {
                int dif = tamanho - 6;
                System.out.println("Senha ultrapassou 6 caracteres. Reduza sua senha em " + dif);
            }
        }while ((tamanho)!=6);
        System.out.println("Senha forte!");
        
    }
}
        


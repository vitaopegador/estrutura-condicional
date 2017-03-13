
package br.com.satc.exemplo1;

import java.util.Scanner;

/**...4 linhas */
public class Main {
    
    public static void main(String[] args) {
     // IF
     // switch case
     Scanner entrada = new Scanner (System.in);
         System.out.println("Qual a sua idade: ");
         int idade = entrada.nextInt();
          if (idade <= 13) {
              System.out.println("Criança");
              }else if ((idade>13) && (idade < 18)){
              System.out.println("Adolecente");
         }else if ((idade>=18) && (idade <=26)){
             System.out.println("Jovem Adulto");
         } else if ((idade>26) && (idade <65)){
             System.out.println("Adulto");
         }else{
              System.out.println("Idoso");
         }
    }
    
}


package br.com.satc.atividades;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        NumberFormat nf = new DecimalFormat ("0.00");
        
        System.out.println("Informe a sua primeira nota");
        float Nota1 = input.nextFloat();
        System.out.println("Informe sua Segunda nota");
        float Nota2 = input.nextFloat();
        System.out.println("Informe sua terceira nota");
        float Nota3 = input.nextFloat();
        float media = ((Nota1+Nota2+Nota3)/3);
        System.out.println("qual media minima para a aprovação?");
        float medmin = input.nextFloat();
        if  (medmin < media){ 
            System.out.println("Voçe foi reprovado");
        }
         else
            {
            System.out.println("Voçe foi aprovado");
            }    
          System.out.println(nf.format(media));
        
    

  
    
    }
}

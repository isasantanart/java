/******************************************************************************

Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
*******************************************************************************/
import java.util.Scanner;
public class Rev006
{ 
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
        int f, c;
        
        System.out.println ("Informe a temperatura em Farenheint: ");
        f = ler.nextInt ();
        
        c = (5 *(f-32)/9);
        
        System.out.println (" A temperaturam em celsius vai ser de: " + c );
    }
}
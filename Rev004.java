/******************************************************************************

Faça um Programa que converta metros para centímetros.
*******************************************************************************/
import java.util.Scanner;
public class Rev004
{
    public static void main (String [] arg ) {
        Scanner ler = new Scanner (System.in);
        int cm, m;
         
         System.out.println ("Informe os metros: ");
         m = ler.nextInt ();
         
         
         cm= m*100;
         
         System.out.println ("O valor em centimetros será :" + cm);
         
    
    }
         
}
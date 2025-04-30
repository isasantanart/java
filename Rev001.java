/******************************************************************************

Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
*******************************************************************************/
import java.util.Scanner;
public class Rev001{
     
    public static void main (String [] args) {
    Scanner ler = new Scanner (System.in);
    int numero;
    
    System.out.println ("Informe o numero");
    numero = ler.nextInt();
    
    System.out.println ("O numero informado foi" + numero );
        
    }
}
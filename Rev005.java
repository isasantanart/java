/******************************************************************************

Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
*******************************************************************************/
import java.util.Scanner;
public class Rev005
{
public static void main (String [] args ) {
    Scanner ler = new Scanner (System.in);
    double vh, ht, s;
    
    System.out.println("Informe o valor ganhado por hora: ");
    vh = ler.nextInt ();
    
    System.out.println ("Informe a quantidade de horas trabalhadas: ");
    ht = ler.nextInt ();
    
    s = vh*ht;
    
    System.out.println ("O seu salario será: " + s);
  }
}
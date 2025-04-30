/******************************************************************************

Faça um Programa que peça dois números e imprima a soma.

*******************************************************************************/
 import java.util.Scanner;
 public class Rev002
 {
     

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n1, n2, soma;
    System.out.println("Informe o primeiro numero: ");
    n1 = ler.nextInt();
    
    System.out.println("Informe o segundo numero: ");
    n2 = ler.nextInt();
    
    soma = n1 + n2;
    System.out.println ("A soma dos dois numeros é igual: "+ soma );
	}
	
	
}

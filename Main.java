/******************************************************************************
Exemplo: Utilizando Array e visualizando a saída de dados 
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	  int [] numeros = new int[5];
	  
	  numeros [0] = 10;
	  numeros [1] = 20;
	  numeros [2] = 30;
	  numeros [3] = 40;
	  numeros [4] = 50;
	  
	  for (int i=0; i< numeros.length; i++) {
	      System.out.println("0 " + (i+1)+ "° número é: " + numeros [i]);
	  }
	}
}

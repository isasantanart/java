
/******************************************************************************
Faça um programa que leia uma matriz [5,5]de inteiros e verifique se existem elementos repetidos.
Mostrar a matriz e os números repetidos.
*******************************************************************************/
import java.util.Scanner;
public class Matriz3
{
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //criando matriz 3x4 vazia     
    int [][] matriz = new int [3][4];
    
       System.out.println("Matriz 3x4:");
    //tamanho da matriz principal (linha) matriz.length 
    for (int i = 0; i < matriz.length; i++) { 
        //tamanho da matriz (coluna) matriz[i].length 
         for (int j = 0; j < matriz[i].length; j++) { 
             //saida da matriz (matriz [i][j])
             System.out.print ("Entre com a posição [" + i + "][ " + j + "] "); 
             matriz[i][j] = ler.nextInt();
         }
    }
    
    // Imprimindo a matriz 
    System.out.println("Matriz 3x4:");
    //tamanho da matriz principal (linha) matriz.length 
    for (int i = 0; i < matriz.length; i++) { 
        //tamanho da matriz (coluna) matriz[i].length 
         for (int j = 0; j < matriz[i].length; j++) { 
             //saida da matriz (matriz [i][j])
             System.out.print (matriz [i][j] + " "); 
             
         }    
         //quebra de linha apos cada linha da matriz 
        System.out.println(); 
    
    }
}
}
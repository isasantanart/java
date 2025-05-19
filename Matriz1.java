/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Matriz1
{
    public static void main(String[] args) {
    //criando matriz 3x3 vazia     
    int [][] matriz = new int [3][3];
    
    //Atribuindo valores manualmente 
    matriz[0][0] = 5;
    matriz[0][1] = 3;
    matriz[0][2] = 2;
    
    matriz[1][0] = 4;
    matriz[1][1] = 3;
    matriz[1][2] = 6;
    
    matriz[2][0] = 7;
    matriz[2][1] = 8;
    matriz[2][2] = 1;
    
    // Imprimindo a matriz 
    System.out.println("Matriz 3x3:");
    for (int i = 0; i < matriz.length; i++) { //tamanho da matriz principal (linha) matriz.length 
         for (int j = 0; j < matriz[i].length; j++) { //tamanho da matriz (coluna) matriz[i].length 
             System.out.print (matriz [i][j] + " "); //saida da matriz (matriz [i][j])
             
         }     
        System.out.println(); //quebra de linha apos cada linha da matriz 
    
    }
}
}
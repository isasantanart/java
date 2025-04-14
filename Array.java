/******************************************

ler o nome e idade de 5 pessoas

*******************************************/
import java.util.Scanner;
public class Array
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] idades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nPessoas maiores de idade:");

        for (int i = 0; i < 5; i++) {
            if (idades[i] >= 18) {
                System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i]);
            }
        }
    }
}
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1: Jogador 1 digita a palavra
        System.out.print("Jogador 1, digite a palavra secreta: ");
        String palavraSecreta = scanner.nextLine().toLowerCase();
        StringBuilder palavraExibida = new StringBuilder("_".repeat(palavraSecreta.length()));

        // Passo 2: Jogador 2 (adivinhar a palavra)
        System.out.print("Jogador 2, digite seu nome: ");
        String nomeJogador2 = scanner.nextLine();

        int tentativas = 5;
        boolean ganhou = false;

        // Passo 3: Jogo
        while (tentativas > 0) {
            System.out.println("\nPalavra: " + palavraExibida);
            System.out.println("Tentativas restantes: " + tentativas);
            exibirDesenhoForca(5 - tentativas);

            // Pedir uma letra
            System.out.print("Digite uma letra: ");
            char letra = scanner.nextLine().toLowerCase().charAt(0);

            boolean letraEncontrada = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraExibida.setCharAt(i, letra);
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                tentativas--;
            }

            // Verificar se o jogador 2 ganhou
            if (palavraExibida.toString().equals(palavraSecreta)) {
                ganhou = true;
                break;
            }
        }

        // Resultado final
        if (ganhou) {
            System.out.println("\nParabéns, " + nomeJogador2 + "! Você acertou a palavra: " + palavraSecreta);
        } else {
            System.out.println("\n" + nomeJogador2 + ", você perdeu! A palavra era: " + palavraSecreta);
            exibirDesenhoForca(5);  // Mostrar o desenho completo de derrota
        }

        scanner.close();
    }

    // Método para exibir o desenho da forca com base nas tentativas
    public static void exibirDesenhoForca(int tentativas) {
        switch (tentativas) {
            case 0:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |  (ツ)");
                System.out.println("                |  -|-");
                System.out.println("                |  /'\\");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 1:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |  (ツ)");
                System.out.println("                |  -|-");
                System.out.println("                |  /");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 2:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |  (ツ)");
                System.out.println("                |  -|-");
                System.out.println("                |");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 3:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |  (ツ)");
                System.out.println("                |  -|");
                System.out.println("                |");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 4:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |  (ツ)");
                System.out.println("                |  -");
                System.out.println("                |");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 5:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |");
                System.out.println("                |");
                System.out.println("                |");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
        }
    }
}
import java.util.Scanner;

public class Main {
    private static final int tamanhoTabuleiro = 3;
    private static char[][] tabuleiro = new char[tamanhoTabuleiro][tamanhoTabuleiro];
    private static char simboloJogador = 'X';

    public static void main(String[] args) {
        montarTabuleiro();
        boolean jogadorVenceu = false;

        while (true) {
            mostrarTabuleiro();
            fazerJogada();
            jogadorVenceu = verificarVencedor();

            if (jogadorVenceu || tabuleiroEstaPreechido()) {
                mostrarTabuleiro();

                if (jogadorVenceu) {
                    System.out.println("Jogador " + simboloJogador + " venceu!");
                } else {
                    System.out.println("O jogo terminou em empate!");
                }

                break;
            }

            simboloJogador = (simboloJogador == 'X') ? 'O' : 'X';
        }
    }

    private static void montarTabuleiro() {
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private static void mostrarTabuleiro() {
        System.out.println("  0 1 2");

        for (int i = 0; i < tamanhoTabuleiro; i++) {
            System.out.print(i + " ");

            for (int j = 0; j < tamanhoTabuleiro; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }

            System.out.println();
        }
    }

    private static void fazerJogada() {
        Scanner scanner = new Scanner(System.in);
        int linha, coluna;

        while (true) {
            System.out.println("Jogador " + simboloJogador + ", digite a posição da linha e coluna (separadas por espaço): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();

            if (linha >= 0 && linha < tamanhoTabuleiro && coluna >= 0 && coluna < tamanhoTabuleiro && tabuleiro[linha][coluna] == '-') {
                tabuleiro[linha][coluna] = simboloJogador;
                break;
            } else {
                System.out.println("Esta posição está fora do limite ou já está ocupada. Tente novamente.");
            }
        }
    }

    private static boolean verificarVencedor() {
        // Verifica as linhas e colunas
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            if (
                    (tabuleiro[i][0] == simboloJogador && tabuleiro[i][1] == simboloJogador && tabuleiro[i][2] == simboloJogador) ||
                            (tabuleiro[0][i] == simboloJogador && tabuleiro[1][i] == simboloJogador && tabuleiro[2][i] == simboloJogador)
            ) {
                return true;
            }
        }

        // Verifica as diagonais
        if (
                (tabuleiro[0][0] == simboloJogador && tabuleiro[1][1] == simboloJogador && tabuleiro[2][2] == simboloJogador) ||
                        (tabuleiro[0][2] == simboloJogador && tabuleiro[1][1] == simboloJogador && tabuleiro[2][0] == simboloJogador)
        ) {
            return true;
        }

        return false;
    }

    private static boolean tabuleiroEstaPreechido() {
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;
    }
}
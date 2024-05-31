public class ExpressoesOperadores {
    public ExpressoesOperadores() {
// switch case
        int escolha = 1;

        switch (escolha) {
            case 1: {
                System.out.println("escolha 1");
                break;
            }
            case 2: {
                System.out.println("escolha 2");
                break;
            }
            case 3: {
                System.out.println("escolha 3");
                break;
            }
            default: {
                throw new IllegalArgumentException("Opção inválida");
            }
        }

        // laços de repetição

        // while - laço pré-testado
        int qtdVezes = 1;

        while (qtdVezes < 10) {
            System.out.println("While -> Executando a " + qtdVezes + "ª vez");
            qtdVezes++;
        }

        // do while - testa a condição depois da execução - pós-testado
        qtdVezes = 1;
        do {
            System.out.println("DoWhile -> Executando a " + qtdVezes + "ª vez");
            qtdVezes++;
        } while (qtdVezes < 10);

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println("For -> Executando a " + i + "ª vez");

            if (i == 5) {
                System.out.println("Quebrou");
                break;
            }
        }
    }
}

import javax.swing.*;

public class EntradaDados {
    public EntradaDados() {
        // Entrada de dados via JOptionPane

        String nome;
        int idade;

        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));

        JOptionPane.showMessageDialog(null, "Olá " + nome );
    }
}

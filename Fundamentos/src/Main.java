public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Letícia");
        pessoa.setIdade(19);

        pessoa.mostrarInformacoes();
        System.out.println(pessoa.toString());

        PessoaJuridica pessoaPJ = new PessoaJuridica();
        pessoaPJ.setNome("João");
        pessoaPJ.setIdade(20);
        pessoaPJ.setCnpj("789798798798");
        pessoaPJ.setInscricaoEstadual("abc12345465");

        pessoaPJ.mostrarInformacoes();
        System.out.println(pessoaPJ.toString());
    }
}
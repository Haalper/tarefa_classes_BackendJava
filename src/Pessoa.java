public class Pessoa {
    // Atributos da classe Pessoa
    String nome;
    int idade;
    String endereco;

    // Método para imprimir informações da pessoa
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }

    public static void main(String[] args) {
        // criando instância da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Definindo os valores dos atributos
        pessoa.nome = "Lucas";
        pessoa.idade = 40;
        pessoa.endereco = "Rua das Pedras, 700";

        // Este método imprime as informações da pessoa
        pessoa.imprimirInformacoes();
    }
}

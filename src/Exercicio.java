import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        String nome;
        String profissao;
        String nomeValidacao = "RODRIGO";
        Integer idade;

        System.out.println("\n");
        System.out.println("--------BEM VINDO A PAGINA DE CADASTRO---------");

        System.out.println("Primeiro, digite o seu nome: (Nao pode ser o nome 'Rodrigo')");
        Scanner scNome = new Scanner(System.in);
        nome = scNome.nextLine();
        while (nome.toUpperCase().equals(nomeValidacao) || nome.isBlank()) {
            System.out.println("Eu te falei que nao poder ser 'Rodrigo'. Nem pode ser nome em branco.");
            System.out.println("Digite um nome valido:");
            nome = scNome.nextLine();
        }
        System.out.println("Opa, " + nome + "... um bonito nome, hein!");
        System.out.println();

        System.out.println("Agora digite sua idade:");
        Scanner scIdade = new Scanner(System.in);
        idade = scIdade.nextInt();
        System.out.println();

        System.out.println("Por ultimo, qual a sua profissao?");
        Scanner scProfissao = new Scanner(System.in);
        profissao = scProfissao.nextLine();
        System.out.println();

        System.out.println("--------RELATORIO DO CADASTRO--------");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: "+idade);
        System.out.println("Profissao: "+profissao);
    }
}

import PrimeiraClasse.Pokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Olá Mundo!");
        System.out.println("Meu nome é Beltrano. Estou aprofundando em programação Java.");
        System.out.println("Por isso, estou testando este programa pelo terminal.");
        System.out.println("Aqui, imprimindo a soma (2 + 2) = " + (2 + 2));
        System.out.println("Sem os parênteses, será concatenado 2 + 2 = " + 2 + 2 + " como se fossem dus strings.");
        System.out.println("");
        System.out.println("Criando a primeira classe instanciando um objeto");
        Pokemon pokemon = new Pokemon(1, "Ricardo");


        Pokemon pokemon1 = new Pokemon();
        System.out.print("Digite um número referente ao ID do Pokemon: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        System.out.print("Digite o nome do Pokemon: ");
        String name = input.next();
        pokemon1.setId(id);
        pokemon1.setName(name);
        System.out.println("Valores inseridos de forma direta no código:");
        System.out.println("--------------------------------------------------");
        System.out.println("ID digitado é: " + pokemon.getId());
        System.out.println("Nome digitado é: " + pokemon.getName());
        System.out.println("");

        System.out.println("Valores inseridos pelo terminal, executando o arquivo Main.class:");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ID digitado é: " + pokemon1.getId());
        System.out.println("Nome digitado é: " + pokemon1.getName());

        System.out.println(String.format("""
                Testando o text format do Java:
                Podemos imprimir um texto com esta formatação e também concatenar a variáveis que
                porventura estamos manipulando.
                Então, temos o seguinte:
                ID e nome do primeiro Pokemon: %d e %s
                ID e nome do segundo Pokemon: %d e %s
                """,pokemon.getId(),pokemon.getName(),pokemon1.getId(),pokemon1.getName()));

        boolean sameName;
        if (pokemon.getName().equals(pokemon1.getName())) {
            sameName = true;

        } else {
            sameName = false;
        }
        System.out.println("Status verificador de igualdade: "+ sameName);



    }
}
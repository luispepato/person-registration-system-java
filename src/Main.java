import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        int[] idades = new int[10];

        int contador = 0;
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar nova pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                nomes[contador] = sc.nextLine();

                System.out.print("Digite a idade: ");
                idades[contador] = sc.nextInt();
                sc.nextLine();

                contador++;

            } else if (opcao == 2) {
                for (int i = 0; i < contador; i++) {
                    System.out.printf("Nome: %s | Idade: %d%n", nomes[i], idades[i]);
                }

            } else if (opcao == 3) {
                System.out.println("Saindo...");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
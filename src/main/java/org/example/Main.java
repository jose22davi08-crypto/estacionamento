package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Veiculo fiat = new Veiculo()
        int opcao = 0;
        do{
            System.out.println("\n--- Menu do Estacionamento ---");
            System.out.println("1. Resgistrar Entrada");
            System.out.println("2. Resgistrar Saída");
            System.out.println("3. Exibir Vagas Livres");
            System.out.println("4. Sair");
            System.out.println("\nEscolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Usuário digitou a opção:" + opcao);
        } while (opcao != 4);
        System.out.println("Usuário saiu do sistema.");
    }
}

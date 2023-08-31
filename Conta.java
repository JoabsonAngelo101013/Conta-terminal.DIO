import java.util.Scanner;

public class Conta {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número da Conta:");
        String Número = scanner.nextLine();

        System.out.println("Numero da Agência:");
        String Agência = scanner.nextLine();

        System.out.println("Nome de Usuario: ");
        String Nome = scanner.nextLine();

        double Saldo = 1000;


        System.out.println("Olá " + Nome);
        System.out.println("Obrigado por Criar uma Conta em nosso banco!");
        System.out.println("Sua Agência é: " + Agência);
        System.out.println("Sua Conta é: " + Número);
        System.out.println("Saldo Disponivel é: R$" + Saldo);
        System.out.println("Já está Disponivel para Saque.");
        System.out.println("Tenha um excelente dia!");


    }

}

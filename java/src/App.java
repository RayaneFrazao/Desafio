import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        String nome = "";

        String profissao = "";

        float[] salario = new float[12];

        float[] imposto = new float[salario.length];

        for (int i = 0; i < salario.length; i++) {
            System.out.println("Digite seu " + (i + 1) + "º salario");
            salario[i] = leitor.nextFloat();
        }
        for (int i = 0; i < imposto.length; i++) {
            if (salario[i] <= 2000.00) {
                imposto[i] = 0;

            } else if (salario[i] <= 3000.00) {
                imposto[i] = (salario[i] / 100) * 8;

            } else if (salario[i] <= 4500.00) {
                imposto[i] = (salario[i] / 100) * 18;

            } else if (salario[i] >= 4500.00) {
                imposto[i] = (salario[i] / 100) * 28;
            }
        }
        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("Pra sair digite 0");
            System.out.println("1 mostrar salario ");
            System.out.println("2 Pra mostrar os dados cadastrais ");
            System.out.println("3 mostrar o valor do imposto ");
            System.out.println("4  cadastrar usúario ");
            System.out.println("5 profissão");

            int numero = leitor.nextInt();
            leitor.nextLine();
            
            if (numero == 0) {
                System.exit(0);
            } else if (numero == 1) {
                System.out.println("Salário anual: ");
                for (int i = 0; i < salario.length; i++) {
                    System.out.println(salario[i]);
                }
                System.out.println();
                System.out.println();
            } else if (numero == 2) {
                System.out.println("Dados cadastrais: ");
                System.out.println("nome: " + nome);
                System.out.println("profissão: " + profissao);
                System.out.println();
                System.out.println();
            } else if (numero == 3) {
                System.out.println("Imposto mensal: ");
                for (int i = 0; i < imposto.length; i++) {
                    System.out.println(imposto[i]);
                }
            } else if (numero == 4) {
                System.out.println("Escreva  nome: ");
                nome = leitor.nextLine();

                System.out.println("Escreva profissão: ");
                profissao = leitor.nextLine();
            } else {
                System.out.println("Opção invalida");
            }
        }
    }


        
    }


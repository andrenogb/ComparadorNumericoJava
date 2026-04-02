import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero1;
        int numero2;
        int opcao;

        for (; ; ) {
            System.out.println("********** Bem vindo ao comparador de numeros inteiros **********\n");
            System.out.println("Digite 2 numeros e vamos comparar eles!");

            System.out.println("Digite o primeiro numero.");
            numero1 = leitor.nextInt();

            System.out.println("Digite o segundo numero.");
            numero2 = leitor.nextInt();

            if (numero1 == numero2) {

                System.out.println("Os numeros digitados sao iguais");
            } else if (numero1 > numero2) {
                System.out.println(numero1 + " é diferente de " + numero2 + ".");
                System.out.println(numero1 + " é maior que  " + numero2 + ".");
            } else {
                System.out.println(numero2 + " é diferente de " + numero1 + ".");
                System.out.println(numero2 + " é maior que  " + numero1 + ".");
            }

            System.out.println("Deseja comparar mais algum numero?");
            System.out.println("Se sim, digite 1");
            System.out.println("Se nao, digite 2");
            opcao = leitor.nextInt();

            if (opcao != 1) {
                System.out.println("Fechando o programa... obrigado!");
                break;
            }


        }
        leitor.close();

    }
}

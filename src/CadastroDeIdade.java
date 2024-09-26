import java.util.Scanner;

public class CadastroDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas no grupo: ");
        int quantidadePessoas = scanner.nextInt();

        int[] idades = new int[quantidadePessoas];

        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int maioresDeIdade = 0;
        int menoresDeIdade = 0;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            idades[i] = idade;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (idade >= 18) {
                maioresDeIdade++;
            } else {
                menoresDeIdade++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maiores de idade (18 anos ou mais): " + maioresDeIdade);
        System.out.println("Quantidade de pessoas menores de idade (menores de 18 anos): " + menoresDeIdade);
    }

}

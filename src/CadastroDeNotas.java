import java.util.Scanner;

public class CadastroDeNotas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a quantidade de alunos: ");
            int quantidadeAlunos = scanner.nextInt();

            double[] notas = new double[quantidadeAlunos];

            int aprovados = 0;
            int reprovados = 0;
            double somaNotas = 0;

            for (int i = 0; i < quantidadeAlunos; i++) {
                double nota;

                while (true) {
                    System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 10): ");
                    nota = scanner.nextDouble();

                    if (nota >= 0 && nota <= 10) {
                        break;
                    } else {
                        System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                    }
                }

                notas[i] = nota;
                somaNotas += nota;

                if (nota >= 6) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }

            double media = somaNotas / quantidadeAlunos;

            // Passo 4: Exibir resultados
            System.out.println("\nResultados:");
            System.out.println("Média da turma: " + media);
            System.out.println("Quantidade de alunos aprovados: " + aprovados);
            System.out.println("Quantidade de alunos reprovados: " + reprovados);
        }
    }



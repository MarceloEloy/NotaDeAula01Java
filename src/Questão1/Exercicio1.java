package Questão1;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        String aluno = "Aluno";
        Scanner notas = new Scanner(System.in);
        System.out.println("Quantidade de notas para serem registradas: ");
        int quantidade = notas.nextInt();
        int[] notasAluno = new int[quantidade];
        for(int i = 0; i < quantidade; i++){
            System.out.printf("Qual o valor da %s° nota?%n", i+1);
            notasAluno[i] = notas.nextInt();
            if(i == quantidade - 1){
                int media = 0;
                for (int k = 0; k < quantidade; k++){
                   media += notasAluno[k];
                }
                media = media/quantidade;
                if(media >= 70){
                    String aprovacao = "Aprovado";
                    System.out.printf("Média do aluno %s é %s, e ele está %s%n", aluno, media, aprovacao);
                } else if (media < 70 && media > 40) {
                    String aprovacao = "na final";
                    System.out.printf("Média do aluno %s é %s, e ele está %s%n", aluno, media, aprovacao);
                }
                else {
                    String aprovacao = "Reprovado";
                    System.out.printf("Média do aluno %s é %s, e ele está %s%n", aluno, media, aprovacao);
                }
            }
        }
    }
}

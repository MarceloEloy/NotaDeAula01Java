package Questão2;
import java.util.Scanner;
public class Produto {
    public Produto(int codigo, int estoque, double tamanho, double valor, String nome, String cor){
        this.valor = valor +0.0;
        this.codigo = codigo;
        this.estoque = estoque;
        this.cor = cor;
        this.nome = nome;
        this.tamanho = tamanho+0.0;
    }
    int codigo,estoque;
    double tamanho, valor;
    String nome, cor;
    public void pagamento(int dinheiro){
        Scanner escolha = new Scanner(System.in);
        System.out.println("[1]Pix; [2]Débito; [3]Crédito (5% de desconto);");
        switch (escolha.nextInt()){
            case 1:
                if(dinheiro >= this.valor)
                    System.out.println("Transação aceita!");
                else{
                    System.out.println("Transação recusada!");
                }
                break;
            case 2:
                if(dinheiro == this.valor)
                    System.out.println("Transação aceita!");
                else if(dinheiro > this.valor){
                    double troco = (dinheiro - this.valor);
                    System.out.printf("Transação aceita!, valor do troco %sR$n", troco);
                }
                else{
                    System.out.println("Transação recusada!");
                }
                break;
            case 3:
                double cashback = (this.valor * 0.05);
                if(dinheiro >= this.valor)
                    System.out.printf("Transação aceita!, desconto de 5 por cento aplicado, cashback de %s%n", cashback);
                else{
                    System.out.println("Transação recusada!");
                }
                break;
        }
    }
}

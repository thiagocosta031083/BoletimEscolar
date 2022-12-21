
package boletimescolar;

import java.util.Scanner;


public class DadosBoletim {
     //Tipos de Dados: 
    //String = Texto entre aspas
    //Int = número inteiro 
    //Float = número com decimal 
    //Doble = Numero com decimal e dupla precisão
    //Criar uma classe que declare umauble =  variavel para nome de um carro, tipo string, sua velocidade máxima o tipo Int aceleração de 0 a 100 e preço com Double,
    // Criar uma classe principal para escrever essas informações
    //Variáveis se da atraves de uma declaração: Escopo (public), tipo (String), nome (Carro ="Fusca");
    public float notahtml;
    public float notacss;
    public float notajs;
    public float notaphp;
    public float notamysql;
    public float notajava;
    public float media;
    public double frequencia;
    Scanner ler = new Scanner(System.in);

    public void calcularMedia(){
        
        System.out.println("Digite a nota de html: ");
        notahtml = ler.nextFloat();
        System.out.println("Digite a nota de css: ");
        notacss = ler.nextFloat();
        System.out.println("Digite a nota de js: ");
        notajs = ler.nextFloat();
        System.out.println("Digite a nota de php: ");
        notaphp = ler.nextFloat();
        System.out.println("Digite a nota de mysql: ");
        notamysql = ler.nextFloat();
        System.out.println("Digite a nota de java: ");
        notajava = ler.nextFloat();
        System.out.println("Digite a frequencia: ");
        frequencia = ler.nextFloat();
        ler.close();
        media = (notahtml+notacss+notajs+notaphp+notamysql+notajava)/6;
    }
    public void mostrarResultado(){//public void significa que o método é vazio
        System.out.println("A média foi de: "+media);
        if (media>=7.0&&frequencia>0.6){
            System.out.println("O Aluno foi Aprovado. PARABÉNS!");
        } else{
            System.out.println("O Aluno foi Reprovado. QUE PENA!");
    }
   
    }
}

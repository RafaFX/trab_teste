import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Scanner ler = new Scanner(System.in); 

        String nomeAluno;

        System.out.println("Qual o nome do aluno?");

        nomeAluno = ler.nextLine();

        aluno.setNome(nomeAluno);
        

        System.out.println(aluno.getNome());

        List<Integer> notas = new ArrayList<>();

        
        System.out.println("Qual a primeira nota do aluno: "+aluno.getNome()+"?");

        int nota1;

        nota1 = ler.nextInt();

        System.out.println("Qual a segunda nota do aluno: "+aluno.getNome()+"?");

        int nota2;

        nota2 = ler.nextInt();

        System.out.println("Qual a terceira nota do aluno: "+aluno.getNome()+"?");

        int nota3;

        nota3 = ler.nextInt();

        System.out.println("Qual a quarta nota do aluno: "+aluno.getNome()+"?");

        int nota4;

        nota4 = ler.nextInt();

        notas.addAll(Arrays.asList(nota1,nota2,nota3,nota4));
            
        aluno.setNota(notas);

        System.out.println(aluno.getNota());

        aluno.fazMedia();
    }

}
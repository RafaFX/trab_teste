import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        final Scanner ler = new Scanner(System.in); 

        String nomeAluno;

        System.out.println("Qual o nome do aluno?");

        nomeAluno = ler.nextLine();

        aluno.setNome(nomeAluno);
        

        System.out.println(aluno.getNome());

        List<Integer> notas = new ArrayList<>();


        for(int i = 0; i <= 3; i++){
            
            System.out.println("Qual as 4 notas do aluno: "+aluno.getNome()+"?");

            int nota;

            nota = ler.nextInt();

            notas.add(nota);

            aluno.setNota(notas);
        }

        System.out.println(aluno.getNota());

        aluno.fazMedia();
    }

}
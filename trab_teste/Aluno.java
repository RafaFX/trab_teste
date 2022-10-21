import java.util.List;




public class Aluno {

    private String nome;

    private List<Integer> nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integer> getNota() {
        return nota;
    }

    public void setNota(List<Integer> nota) {
        this.nota = nota;
    }

    public void fazMedia(){
        int nota1 = this.nota.get(0);

        int nota2 = this.nota.get(1);

        int nota3 = this.nota.get(2);

        int nota4 = this.nota.get(3);

        System.out.println(nota1);

        System.out.println(nota2);

        System.out.println(nota3);

        System.out.println(nota4);

        int media = (nota1 + nota2 + nota3 + nota4)/4;

        if(media >= 7){
            System.out.println("O Aluno passou pela média");
        }
        if(media > 3 && media < 7 ){
            System.out.println("O Aluno está em exame pela média");
        }
        if(media < 3){
            System.out.println("O Aluno reprovou pela média");
        }

    }



}
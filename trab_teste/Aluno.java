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

        System.out.println(getNota().get(0));

        int media = (getNota().get(0) + getNota().get(1) + getNota().get(2) + getNota().get(3))/4;

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
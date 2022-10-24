package divisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("Digite o número que deseja saber os divisores: ");
        
        try (Scanner ler = new Scanner(System.in)) {
            int num;

            num = ler.nextInt();

            final List<Integer> listaDivisores = new ArrayList();

            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    listaDivisores.add(i);
                }
            }

            System.out.println("Essa é a lista de divisores do número: "+num+" = "+listaDivisores);
        }
    }
}
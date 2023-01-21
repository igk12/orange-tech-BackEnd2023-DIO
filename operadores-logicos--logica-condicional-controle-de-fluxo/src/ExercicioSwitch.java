import java.util.Scanner;

/**
 * ExercicioSwitch
 * Com Switch use String para a partir do dia da semana, exibir o numero. 
 * Fazer no switch outro exemplo, se uma variável inteira for entre 1 e 3, exibir o texto "Certo".
 * Se 4 exibir "Errado", 5 "Talvez" e outro valor "Valor indefinido".
 */
public class ExercicioSwitch {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);


        //Exemplo exibir o número dia da Semana

        System.out.println("Digite o dia da semana.");
        System.out.println("Obs.: Sem acento e o feira. Exemplo corretos 'Segunda', 'Terca', 'Sabado'");
        String diaSemana = scanner.next();

        switch (diaSemana) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terca":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            
            default:
                System.out.println("O valor digitado está incorreto, favor tente novamente");
                break;
        }

        System.out.println();
        //Exemplo se uma variável inteira for entre 1 e 3...
        System.out.println();

        System.out.println("Informe um número");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Certo");
                break;
        
            case 2:
                System.out.println("Certo");
                break;
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }
}
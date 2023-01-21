import java.util.Scanner;

/*
 * exibir o nome do mês do ano de acordo com seu número. 
 * evitar o efeito "flecha". 
 * fazer outro if que verifique se o mês é julho, dezembro ou janeiro, para assim exibir o texto "Férias".
 */
/**
 * MesDoAno
 */
public class MesDoAno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        System.out.println("Informe o mês do Ano");
        int mesAno = scanner.nextInt();

       //Impressão buscando a informação via Array
       System.out.println("O mês escolhido foi " + mes[mesAno-1]);

        //Defini se o mês escolhido é geralmente um mês de férias
       if (mes[mesAno-1] == "Janeiro" || mes[mesAno-1] == "Julho" || mes[mesAno-1] == "Dezembro"){
            System.out.println("O mês de " + mes[mesAno-1] + ", geralmente é um mês de Férias");
            System.out.println();
       }

       //Usando o IF para exibir o mês, conforme solicitado na lição. 
        if(mesAno == 1){
            System.out.println("O mês é Janeiro");
        }else if(mesAno == 2){
            System.out.println("O mês é Fevereiro");
        }else if(mesAno == 3){
            System.out.println("O mês é Março");
        }else if(mesAno == 4){
            System.out.println("O mês é Abril");
        }else if(mesAno == 5){
            System.out.println("O mês é Maio");
        }else if(mesAno == 6){
            System.out.println("O mês é Junho");
        }else if(mesAno == 7){
            System.out.println("O mês é Julho");
        }else if(mesAno == 8){
            System.out.println("O mês é Agosto");
        }else if(mesAno == 9){
            System.out.println("O mês é Setembro");
        }else if(mesAno == 10){
            System.out.println("O mês é Outubro");
        }else if(mesAno == 11){
            System.out.println("O mês é Novembro");
        }else if(mesAno == 12){
            System.out.println("O mês é Dezembro");
        }else{
            System.out.println("Favor digitar um número entre 1 e 12");
        }
   }
    
    
}



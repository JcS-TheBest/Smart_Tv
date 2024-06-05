
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();

        
        
       

        smartTv.ligar();
            System.out.println("Tv ligada?" + smartTv.ligada);

        smartTv.desligar();
            System.out.println("Tv ligada?" + smartTv.ligada);


        System.out.println("Volume atual: " + smartTv.volume);
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
             System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(25);
        System.out.println("Canal atual: " + smartTv.canal);




        Scanner coletor = new Scanner(System.in);
    
        System.out.println("Digite seu nome: ");
        String nome = coletor.next(); 
        
    }

}
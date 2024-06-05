public class SmartTv {

    boolean ligada=false;
    int canal = 1;
    int volume = 1;

    public void ligar(){
        ligada = true;
    }

    
    public void desligar(){
        ligada = false;
    }

    public void baixarVolume (){
        volume--;
        System.out.println("Baixando o volume para: " + volume);
    }

    
    public void aumentarVolume (){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void baixarCanal(){
        canal--;
        System.out.println("Você está no canal: " + canal );
    }

     
    public void aumentarCanal(){
        canal++;
        System.out.println("Você está no canal: " + canal );
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    

}



    
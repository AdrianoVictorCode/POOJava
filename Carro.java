public class Carro {
    String modelo;
    double velocidade;
    int aceleracao;
    int marcha;
    boolean ligar;
    int direcao;

    public Carro(){
        this.modelo = "Carro";
        this.ligar = false;
        this.velocidade = 180.0f;
        this.marcha = 0;
        this.direcao = 3;
    }


    public void acelerar (){
        if (ligar == true){
            if (marcha >= 0 && marcha <=6 ){
                if (marcha == 0){
                    this.aceleracao = 0;
                    System.out.println("Neutro !");
                    System.out.println("Engate a Marcha");
                }
                if (marcha == 1){
                    this.aceleracao = 20; 
                }
                if (marcha == 2){
                    this.aceleracao = 40; 
                }
                if (marcha == 3){
                    this.aceleracao = 80; 
                }
                if (marcha == 4){
                    this.aceleracao = 120; 
                }
                if (marcha == 5){
                    this.aceleracao = 180; 
                }
                if (marcha == 6){
                    this.aceleracao = 10;
                }
            }
        }
    }

    public void desacelerar(){
        if (ligar == true){
            if (marcha > 0 && marcha <=6 ){
                if (marcha == 1){
                    this.aceleracao = 10; 
                }
                if (marcha == 2){
                    this.aceleracao = 30; 
                }
                if (marcha == 3){
                    this.aceleracao = 50; 
                }
                if (marcha == 4){
                    this.aceleracao = 100; 
                }
                if (marcha == 5){
                    this.aceleracao = 140; 
                }
                if (marcha == 6){
                    this.aceleracao = 10;
                    System.out.println("Ré");
                }
                if (marcha == 0){
                    System.out.println("Neutro!");
                }
            }
        }
    }

    public void posicao(){
        if (ligar == true){
            if (marcha > 0 && marcha < 7){
                switch (direcao){
                    case 1:
                        System.out.println("Direcao: Direita");
                        break;
                    case 2:
                        System.out.println("Direcao: Esquerda");
                        break;
                    case 3:
                        System.out.println("Direcao: Centro");
                        break;
                    default:
                        System.out.println("Direcao: Invalido");
                }
            }
        }
    }

    public void posicaoMarcha (){
        switch (marcha){
            case 0:
                System.out.println("Centro");
                break;
            case 1: 
                System.out.println("Para cima");
                break;
            case 2:
                System.out.println("Para baixo");
                break;
            case 3: 
                System.out.println("Para cima");
                break;
            case 4:
                System.out.println("Para baixo");
                break;
            case 5:
                System.out.println("Para cima");
                break;
            case 6: 
                System.out.println("Para baixo");
                break;
            default:
                System.out.println("Marcha inexistente!");
        }
    }



    public void ligar(){
          this.ligar = true;
    }

    public void desligar (){
            this.ligar = false;
    }
    public void status (){
    System.out.println("Modelo: "+modelo);
    System.out.println("Velocidade Máxima: "+velocidade);
    System.out.println("Aceleracao: "+aceleracao);
    if (aceleracao > 0){
        System.out.println("Marcha: "+marcha);
    }
    else {
        System.out.println("Parado !");
    }
    if (ligar == true){
        System.out.println("Motor Ligado");
    }
        else {
        System.out.println("Motor desligado");
    }
}

}

public class ObjCarro {
    public static void main(String[] args) {
        Carro nc1 = new Carro();
        nc1.modelo = "Fox 2010";
        nc1.marcha =6;
        nc1.direcao = 1;
        nc1.ligar();
        nc1.desacelerar();
        nc1.status();
        nc1.posicao();

        Carro nc2 = new Carro();
        nc2.modelo = "Opala 2009";
        nc2.marcha = 5;
        nc2.direcao = 3;
        nc2.ligar();
        nc2.acelerar();
        nc2.status();
        nc2.posicao();

        Carro nc3 = new Carro();
        nc3.modelo = "Chevette 2007";
        nc3.marcha = 6;
        nc3.direcao = 2;
        nc3.desligar();
        nc3.acelerar();
        nc3.status();
        nc3.posicao();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Masculino rMasculino1 = new Masculino("Azul", "G", "Polo", 145.0f);
        Masculino rMasculino2 = new Masculino("Azul", "G", "Polo", 60.0f);
        Masculino rMasculino3 = new Masculino("Verde", "M", "Street", 80.0f);
        Feminino rFeminino1 = new Feminino("Amarelo", "M", "Babylook", 230.f);
        Feminino rFeminino2 = new Feminino("Amarelo", "M", "Babylook", 230.f);
        Infantil rInfantil = new Infantil("Rosa", "P", "Baby", 80.0f);

        Caixa compCaixa = new Caixa();
        compCaixa.AdicionarRoupa(rMasculino1);
        compCaixa.AdicionarRoupa(rMasculino2);
        compCaixa.AdicionarRoupa(rMasculino3);
        compCaixa.AdicionarRoupa(rInfantil);

        Caixa compCaixa2 = new Caixa();
        compCaixa2.AdicionarRoupa(rMasculino1, rFeminino1, rInfantil);
        compCaixa2.AdicionarRoupa(rMasculino3, rFeminino2, rInfantil);

        System.out.println("Roupas Infantis: \n"+compCaixa2.verificaCarrinho(rFeminino1));
        System.out.println("Roupas Infantis: \n"+compCaixa2.verificaCarrinho(rInfantil));
        System.out.println("O total de compras foi de R$: "+compCaixa2.FecharCompra());

    }
}

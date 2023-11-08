public class App {
    public static void main(String[] args) throws Exception {
        produtos p1 = new produtos("Bola de Futebol", 80, 10);
        produtos p2 = new produtos("Bola de Futebol", 80, 10);
        produtos p3 = new produtos("Bola de Futebol", 80, 10);
        cliente c1 = new cliente("Alfredo", 01);
        carrinho ca1 = new carrinho();

        ca1.addCliente(c1);
        ca1.addProdutoAoCarrinho(c1, p1);
           ca1.addProdutoAoCarrinho(c1, p2);
           ca1.addProdutoAoCarrinho(c1, p3);
        ca1.finalizarCompra(c1);
        System.out.println(ca1.finalizarCompra(c1));
    }
}

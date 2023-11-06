import java.util.ArrayList;

public class hotel {
    private ArrayList <quarto> quartosDoHotel;
    private ArrayList <cliente> clientes;
    public hotel(){
        this.quartosDoHotel = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void addQuartoPadrao (quarto quarto){
        if (quarto.getTipoQuarto().equals("padrão")){
            quartosDoHotel.add(quarto);
        }
    }

    public void addQuartoLuxo (quarto quarto){
        if (quarto.getTipoQuarto().equals("luxo")){
            quartosDoHotel.add(quarto);
        }
    }
    public void addQuartoSuite (quarto quarto){
        if (quarto.getTipoQuarto().equals("suíte")){
            quartosDoHotel.add(quarto);
        }
    }

    public void addCliente (cliente CLiente){
        clientes.add(CLiente);
    }

    public void reservarQuarto (cliente Cliente, quarto Quarto, int dias){
        boolean clienteEncontrado = false;
        boolean quartoEncontrado = false;

        for (cliente c: clientes){
            if (c.equals(Cliente)) {
                clienteEncontrado = true;
               break;
            }
        }

        for (quarto q: quartosDoHotel){
            if (q.equals(Quarto)){
                quartoEncontrado = true;
                break;
            }
        }

        if (quartoEncontrado && clienteEncontrado) {
            if (Quarto.getDisponivel()) {
            double totalReserva = Quarto.getValorQuarto()*dias;
            System.out.println("Quarto Reservado, total da reserva: "+totalReserva);
            Quarto.setDisponivel(false);
            }
            else{
                System.out.println("Cliente encontrado e Quarto encontrado, porém indisponível");
            }
        }
        else{
            System.out.println("Cliente não encontrado ou quarto não encontrado");
        }


    }
    
    public void quartosDisponiveis(){
       for (quarto quarto: quartosDoHotel){
        if (quarto.getDisponivel()) {
           System.out.println(quarto);
        }
       }
    }

}

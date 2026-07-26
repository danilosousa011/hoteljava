import java.util.ArrayList;

public class Hotel {

    private ArrayList<Quarto> quartos;
    private ArrayList<Reserva> reservas;

    public Hotel() {

        quartos = new ArrayList<>();
        reservas = new ArrayList<>();

        quartos.add(new Quarto(101, "Standard", 120.00));
        quartos.add(new Quarto(102, "Standard", 120.00));
        quartos.add(new Quarto(201, "Luxo", 250.00));
        quartos.add(new Quarto(202, "Suíte", 400.00));
    }

    public void listarQuartosDisponiveis() {

        System.out.println("\nQUARTOS DISPONÍVEIS:");

        for (Quarto quarto : quartos) {

            if (quarto.isDisponivel()) {
                System.out.println(quarto);
            }

        }

    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void listarReservas() {

        System.out.println("\nRESERVAS:");

        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
            return;
        }

        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }

    }

    public Quarto buscarQuarto(int numero) {

        for (Quarto quarto : quartos) {

            if (quarto.getNumero() == numero) {
                return quarto;
            }

        }

        return null;
    }

}
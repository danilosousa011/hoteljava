public class Reserva {

    private Hospede hospede;
    private Quarto quarto;

    public Reserva(Hospede hospede, Quarto quarto) {
        this.hospede = hospede;
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    @Override
    public String toString() {
        return "Hóspede: " + hospede.getNome() +
                " | Quarto: " + quarto.getNumero() +
                " (" + quarto.getTipo() + ")";
    }
}
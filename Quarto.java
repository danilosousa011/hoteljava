public class Quarto {

    private int numero;
    private String tipo;
    private double preco;
    private boolean disponivel;

    public Quarto(int numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void ocupar() {
        disponivel = false;
    }

    public void liberar() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return "Quarto: " + numero +
                " | Tipo: " + tipo +
                " | Preço: R$" + preco +
                " | " + (disponivel ? "Disponível" : "Ocupado");
    }
}
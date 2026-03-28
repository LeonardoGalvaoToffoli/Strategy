public class Pedido {
    private FreteStrategy frete;

    public Pedido(FreteStrategy frete) {
        this.frete = frete;
    }
    public double calcularTotalComDesconto(double valorPedido) {
        double desconto = frete.calcular(valorPedido);
        return valorPedido - desconto;
    }
}

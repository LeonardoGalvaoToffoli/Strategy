public class FreteRetirada implements FreteStrategy {
    @Override
    public double calcular(double valorPedido) {
        return valorPedido;
    }
}

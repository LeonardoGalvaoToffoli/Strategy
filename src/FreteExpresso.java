public class FreteExpresso implements FreteStrategy {
    @Override
    public double calcular(double valorPedido) {
        return  -valorPedido*0.1;
    }
}

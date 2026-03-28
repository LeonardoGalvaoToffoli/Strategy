void main(){
    FreteStrategy frete = new FreteExpresso(); // FreteNormal() ou FreteRetirada()

    Pedido pedido = new Pedido(frete);

    double total = pedido.calcularTotalComDesconto(100.0);

    System.out.println("Total: " + total);

}
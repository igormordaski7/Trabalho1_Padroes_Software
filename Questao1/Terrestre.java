// A classe Terrestre herda o método da classe Transporte (Utilização de herança)
public class Terrestre implements Transporte{

    // Implementação específica para transporte terrestre com o acrescento da variavel "distancia" no cálculo
    @Override
    public double calcularTarifa(double valorBase, double distancia) {
        return valorBase + (distancia * 2.5); // Cálculo baseado em quilômetros ($2,50 por km)
    }
}

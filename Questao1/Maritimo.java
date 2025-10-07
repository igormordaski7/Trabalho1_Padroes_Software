// A classe Maritimo herda o método da classe Transporte (Utilização de herança)
public class Maritimo implements Transporte{

    // Implementação específica para transporte maritimo com o acrescento da variavel "volume" no cálculo
    @Override
    public double calcularTarifa(double valorBase, double volume) {
        return valorBase + (volume * 5); // Cálculo baseado em volume (R$5 por m³)
    }
}

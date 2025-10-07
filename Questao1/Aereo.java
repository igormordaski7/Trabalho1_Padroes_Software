// A classe Aereo herda o método da classe Transporte (Utilização de herança)

public class Aereo implements Transporte{

    // Implementação específica para transporte aereo com o acrescento da variavel "peso" no cálculo
    @Override
    public double calcularTarifa(double valorBase, double peso) {
        return valorBase + (peso * 10); // Cálculo baseado em peso (R$10 por kg)
    }
}

/*  Questão 1 – Sistema de cálculo de tarifas para transportes
    Padrões aplicados: Interfaces + Polimorfismo + Herança
    Justificativa: O enunciado pede uma forma genérica de tratar diferentes tipos de transporte (terrestre, aéreo e marítimo),
    mas cada um possui regras específicas de cálculo. Para atender a esse requisito, foi utilizada uma 
    interface "Transporte", que define o contrato genérico para todos os tipos de transporte. Dessa forma, o sistema pode trabalhar 
    de forma uniforme com qualquer modalidade, aplicando o conceito de polimorfismo.

    As classes concretas (Terrestre, Aéreo e Marítimo) implementam essa interface, 
    garantindo o mesmo método de cálculo, mas com comportamentos distintos para cada modalidade.
    Isso também aproveita o conceito de herança.*/

public class Main {

    public static void main(String[] args) {
        
        // Utilização de polimorfismo, ou seja, todas as classes utilizam o mesmo método, porém com comportamentos diferentes.
        Transporte terrestre = new Terrestre();
        Transporte aereo = new Aereo();
        Transporte maritimo = new Maritimo();
        System.out.println("--------------------------------------");

        // Cada chamada do método calcularTarifa() executa a lógica específica de sua classe.
        System.out.println("Tarifa Terrestre: " + terrestre.calcularTarifa(500, 50));

        System.out.println("--------------------------------------");

        System.out.println("Tarifa Aereo: " + aereo.calcularTarifa(1000, 20));

        System.out.println("--------------------------------------");

        System.out.println("Tarifa Maritimo: " + maritimo.calcularTarifa(700, 50));
        
        System.out.println("--------------------------------------");
    }
}

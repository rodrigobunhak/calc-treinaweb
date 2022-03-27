package app;

import factory.FabricaCalculosMatematicos;
import interfaces.CalculadorMatematico;

public class Programa {
  
  public static void main(String[] args) {
    String calculo = "/";
    int numero1 = 4;
    int numero2 = 0;

    FabricaCalculosMatematicos fabrica = new FabricaCalculosMatematicos();
    CalculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);
    
    if (calculador != null) {
      System.out.println(calculador.calcular());
    } else {
      System.out.println("Calculo invalido.");
    }
  }

}

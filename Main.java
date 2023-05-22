abstract class Veiculo {
    public abstract void acelerar();
}

class Carro extends Veiculo {
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}

class Moto extends Veiculo {
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
}

public class PolimorfismoExemplo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Moto();

        veiculo1.acelerar();  // Saída: O carro está acelerando!
        veiculo2.acelerar();  // Saída: A moto está acelerando!
    }
}

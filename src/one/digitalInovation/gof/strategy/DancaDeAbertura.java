package one.digitalInovation.gof.strategy;

public class DancaDeAbertura implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Executando danca de abertura para batalha de robos");
    }
}

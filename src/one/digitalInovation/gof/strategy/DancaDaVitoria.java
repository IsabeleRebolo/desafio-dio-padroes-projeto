package one.digitalInovation.gof.strategy;

public class DancaDaVitoria implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Executando danca da vitória da batalha");
    }
}

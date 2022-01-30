package one.digitalInovation.gof;

import one.digitalInovation.gof.facade.Facade;
import one.digitalInovation.gof.singleton.SingletonEager;
import one.digitalInovation.gof.singleton.SingletonLazy;
import one.digitalInovation.gof.singleton.SingletonLazyHolder;
import one.digitalInovation.gof.strategy.*;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		System.out.println("\n---Teste do singleton---\n");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		System.out.println("\n\n\n---Teste do robo de batalha---\n");
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento dancaAbertura = new DancaDeAbertura();
		Comportamento dancaVitoria = new DancaDaVitoria();

		Robo robo = new Robo();
		robo.setComportamento(dancaAbertura);
		robo.mover();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.setComportamento(dancaVitoria);
		robo.mover();
		
		// Facade
		System.out.println("\n\n\n---Teste da facade---\n");
		Facade facade = new Facade();
		facade.migrarCliente("23456728743", "Venilton", "14801788");
	}

}

package br.com.estudos.padroes.modelos;

import org.junit.Test;

public class DuckTest {
	
	@Test
	public void criaMallardDuck() {
		Duck mallard = new MallarDuck();
		mallard.performFly();
		mallard.performQuack();
	}
	@Test
	public void criaPatoModeloComVooFoguete() {
		Duck modelo = new ModelDuck();
		modelo.performFly();
		modelo.setFlyBehavior(new FlyRocketPowered());
		modelo.performFly();
	}

}

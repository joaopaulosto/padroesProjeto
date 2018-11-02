package br.com.estudos.padroes.modelos;

import br.com.estudos.padroes.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}

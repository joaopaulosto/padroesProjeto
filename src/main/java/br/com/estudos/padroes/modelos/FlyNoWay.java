package br.com.estudos.padroes.modelos;

import br.com.estudos.padroes.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly");

	}

}

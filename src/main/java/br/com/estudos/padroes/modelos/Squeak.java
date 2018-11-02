package br.com.estudos.padroes.modelos;

import br.com.estudos.padroes.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

	public void quack() {
		System.out.println("Squeak");
	}

}

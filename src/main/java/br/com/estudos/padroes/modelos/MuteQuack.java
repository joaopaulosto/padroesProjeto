package br.com.estudos.padroes.modelos;

import br.com.estudos.padroes.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< Silence >>");
	}

}

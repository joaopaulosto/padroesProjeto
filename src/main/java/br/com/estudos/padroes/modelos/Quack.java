package br.com.estudos.padroes.modelos;

import java.awt.Toolkit;

import br.com.estudos.padroes.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("Quack");
		Toolkit.getDefaultToolkit().beep();
		Toolkit.getDefaultToolkit().beep();
	}

}

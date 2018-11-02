package br.com.estudos.padroes.modelos;

import br.com.estudos.padroes.interfaces.FlyBehavior;
import br.com.estudos.padroes.interfaces.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public abstract void display();

	public void performFly() {
		this.flyBehavior.fly();
	}

	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

}

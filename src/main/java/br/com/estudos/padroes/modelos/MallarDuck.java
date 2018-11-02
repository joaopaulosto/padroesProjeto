package br.com.estudos.padroes.modelos;

public class MallarDuck extends Duck {

	public MallarDuck() {
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck!");
	}

}

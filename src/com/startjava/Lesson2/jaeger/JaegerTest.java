package com.startjava.Lesson2.jaeger;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger tom = new Jaeger("Tom", "Gipsy Danger", 10, 20);
		Jaeger jerry = new Jaeger("Jerry", "Gipsy Avenger", 11, 22);

		System.out.println("Tom model: " + tom.getModelName());
		System.out.println("Jerry model: " + jerry.getModelName());
		System.out.println("Tom speed: " + tom.getSpeed());
		System.out.println("Jerry speed: " + jerry.getSpeed());
		
		System.out.println("Tom upgrade");

		tom.setSpeed(15);
		tom.setArmor(25);
		System.out.println("Tom speed now: " + tom.getSpeed());
		System.out.println("Tom armor now: " + tom.getArmor());

		System.out.println("Training for Tom: ");
		tom.drift();
		tom.move();
		tom.useVortexCannon();

		System.out.println("Training for Jerry: ");
		jerry.drift();
		jerry.scanKaiju();
		jerry.useVortexCannon();
	}
}
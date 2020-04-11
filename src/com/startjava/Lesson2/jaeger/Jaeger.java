package com.startjava.Lesson2.jaeger;

public class Jaeger {
	private String name;
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String name, String modelName, int speed, int armor) {
		this.name = name;
		this.modelName = modelName;
		this.speed = speed;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public boolean drift() {
		System.out.println(name + " drift");
		return true;
	}

	public void move() {
		System.out.println(name + " move");
	}

	public String scanKaiju() {
		System.out.println(name + " scanKaiju");
		return "scanKaiju";
	}

	public void useVortexCannon() {
		System.out.println(name + " useVortexCannon");
	}
}
public class Wolf {
	private String name;
	private char sex;
	private int age;
	private float weight;
	private String color;

	public String getName() {
		return name;
	}

	public char getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}

	public String getColor() {
	return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}	
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move() {
		System.out.println("Method move");
	}

	public void sit() {
		System.out.println("Method sit");
	}

	public void run() {
		System.out.println("Method run");
	}

	public void howl() {
		System.out.println("Method howl");
	}

	public void hunt() {
		System.out.println("Method hunt");
	}
}
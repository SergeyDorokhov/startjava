public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.name = "Killer";
		wolf.sex = 'M';
		wolf.age = 10;
		wolf.weight = 20;
		wolf.color = "grey";

		System.out.println("Name is: " + wolf.name);
		System.out.println("Sex is: " + wolf.sex);
		System.out.println("Age is: " + wolf.age);
		System.out.println("Weight is: " + wolf.weight);
		System.out.println("Color is: " + wolf.color);

		wolf.move();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}
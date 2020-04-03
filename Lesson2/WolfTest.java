public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setName("Killer");
		wolf.setSex('M');
		wolf.setAge(10);
		wolf.setWeight(20f);
		wolf.setColor("grey");

		System.out.println("Name is: " + wolf.getName());
		System.out.println("Sex is: " + wolf.getSex());
		System.out.println("Age is: " + wolf.getAge());
		System.out.println("Weight is: " + wolf.getWeight());
		System.out.println("Color is: " + wolf.getColor());

		wolf.move();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}
public class JaegerTest {
	public static void main(String[] args) {
		Jaeger tom = new Jaeger();
		Jaeger jerry = new Jaeger();

		tom.setName("Tom");
		tom.setModelName("Gipsy Danger");
		tom.setSpeed(10);
		tom.setArmor(20);

		jerry.setName("Jerry");
		jerry.setModelName("Gipsy Avenger");
		jerry.setSpeed(11);
		jerry.setArmor(22);

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
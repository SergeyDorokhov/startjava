public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		boolean isMan = true;
		float height = 1.75f;
		char firstLetter = 'M';

		if (age > 20) {
			System.out.println("Не проходишь по возрасту");
		}
		if (isMan == true) {
			System.out.println("Это мужчина");
		}
		if (isMan != true) {
			System.out.println("Это не мужчина");
		}
		if (height < 1.80) {
			System.out.println("Подходит в танкисты");
		} else {
			System.out.println("Не подходит в танкисты");
		}
		if (firstLetter == 'M') {
			System.out.println("Это Марфа");
		} else if (firstLetter == 'I') {
			System.out.println("Кто это?");
		} else {
			System.out.println("Не знаю, кто ты");
		}
	}
}
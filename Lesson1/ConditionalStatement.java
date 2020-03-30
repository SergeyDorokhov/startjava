public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		boolean isMan = true;
		float height = 1.75f;
		char firstLetter = 'M';

		if (age > 20) {
			System.out.println("Уже старый");
		}
		if (isMan == true) {
			System.out.println("Это мужчина");
		}
		if (isMan != true) {
			System.out.println("Это не мужчина");
		}
		if (height < 1.80) {
			System.out.println("Подойдет в танкисты");
		} else {
			System.out.println("Не подойдет в танкисты");
		}
		if (firstLetter == 'M') {
			System.out.println("Это Марфа");
		} else if (firstLetter == 'I') {
			System.out.println("Это не Марфа");
		} else {
			System.out.println("Не знаю, кто это");
		}
	}
}
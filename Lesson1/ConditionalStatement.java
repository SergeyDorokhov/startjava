public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		boolean isMan = true;
		float height = 1.75f;
		char firstLetter = 'M';

		if (age > 20) {
			System.out.println("�� ��������� �� ��������");
		}
		if (isMan == true) {
			System.out.println("��� �������");
		}
		if (isMan != true) {
			System.out.println("��� �� �������");
		}
		if (height < 1.80) {
			System.out.println("�������� � ��������");
		} else {
			System.out.println("�� �������� � ��������");
		}
		if (firstLetter == 'M') {
			System.out.println("��� �����");
		} else if (firstLetter == 'I') {
			System.out.println("��� ���?");
		} else {
			System.out.println("�� ����, ��� ��");
		}
	}
}
public class Client {
//����� �������� ������ � ����
private static int waitTime;
//������� ����� � ������� 
private static double money;
private static int quality;
public static int count;
public static String name;

public static boolean toBuy(int prQuality, double price, int time) {
	return ((prQuality>=quality)&&(price<=money)&&(time<=waitTime));
		}

public static void payAdvance(Order order,double advance) {
	order.setAdvance(advance);
	money=money-advance;	
	}

public static void payRemain(Order order) {
	//������ ������
	//������ ���������� ������� �� ������
	order.setRemain(money);
	Salesman.installProduct(order);
	}

public static void happyClient() {
	//������� ���������� �������� � �� ��������
	System.out.print("i'm happy");
}
}
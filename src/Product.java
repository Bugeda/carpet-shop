//���������� � �������
public class Product {
	//���-�� ������
	public static int quality;
	//���� ������
	public static int price;
	
	//������� ���� �� ������
	private static int existCount;
	//����� �������� ������� ��������� �� ������
	private static int delivery;
	//����� �� ������������ 1-� ��. �������
	private static int createTime;
	
	private static int getExistCount() {
		return existCount;
	}		
	public int getTermOfDelivery(int count) {
		if (count<=getExistCount())
				return delivery;
		else return delivery+createTime*(count-getExistCount());
	}
	
	public int getQuality() {
		return quality;
		}	
}

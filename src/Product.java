//���������� � �������
public class Product {
	public int id;
	public String title;
	public int productId;
	public int quality;
	public double price;
	private int existCount;
	private int deliveryTime;
	private double deliveryPrice;
	private int createTime;
	
	public int getExistCount() {
		return existCount;
		}		
	public Product(int idProduct,String prTitle,int count, double prPrice, int prQuality){
		id=idProduct;
		title=prTitle;
		existCount=count;
		price=prPrice;
		quality=prQuality;
		}
	
	public int getTermOfDelivery(int count) {
		if (count<=getExistCount())
				return deliveryTime;
		else return deliveryTime+createTime*(count-getExistCount());
		}
	public double getPriceOfDelivery() {
		return deliveryPrice;
		}

	
}

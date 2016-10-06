package sam.demo.model;

public class MobilePackage {
	private float price;//套餐费用
	private int shortMessage;//短信条数
	private String music;//彩铃
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getShortMessage() {
		return shortMessage;
	}
	public void setShortMessage(int shortMessage) {
		this.shortMessage = shortMessage;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
}

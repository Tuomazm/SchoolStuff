
public class TestMain {

	public static void main (String[] args) {
		
		PicPlayer picPlayer = new JPEG();
		picPlayer.show("Kärpät-logo");
		
		picPlayer = new PNG();
		picPlayer.show("Kärppien mestaruuskuva vm. 2019");
		
	}
}

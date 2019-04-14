import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean keepBrowsing = true;
		String controlInput = "";
		int imgNum = 0;
		
		List<Image> images = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			images.add(new ProxyImage("IMG" + i));
		}
		System.out.println("Here are the images:\n");
		images.forEach(image -> image.showData());
		
		System.out.println("\nNow you can browse the images.\n\n"
				+ "With the letter w, you can see previous\n"
				+ "With the letter e, you can see next\n"
				+ "With the letter q, you can quit the browsing mode.\n");
		
		while(keepBrowsing) {
			Image nowShowing = images.get(imgNum);
			nowShowing.displayImage();
			System.out.println("\nYour input:");
			controlInput = scanner.nextLine();
			switch (controlInput) {
				case "w":
					if(imgNum == 0) {
						imgNum = 9;
					}else {
						imgNum--;
					}				
					break;
				case "e":
					if(imgNum == 9) {
						imgNum = 0;
					}else{
						imgNum++;
					}
					break;
				case "q":
					keepBrowsing = false;
					System.out.println("The program is closed.");
					break;
				default:
					System.out.println("Choose either q, w, or e");
					break;
			}
		}
	}
}

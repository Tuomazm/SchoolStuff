
public class Memory {
	
	public void load(long position, byte[] data) { 
		System.out.println("Hello from MEMORY");
		System.out.println("This is the position: " + position + " aka BOOT_ADDRESS");
		System.out.println("...And this is the byte at 0: " + data[0]);
	}	
}


public class HardDrive {

	public byte[] read(long lba, int size) {
		System.out.println("READ CALLED FROM HARDDRIVE");
		byte[] b = new byte[size];
		
		System.out.println("THIS IS LBA FROM HD: " + lba);
		System.out.println("SIZE AKA SECTOR_SIZE: " + size);
		b[0] = (byte) lba;
		
		return b;
	}

}

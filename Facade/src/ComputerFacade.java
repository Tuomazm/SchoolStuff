
public class ComputerFacade {

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    private long BOOT_ADDRESS;
    private long BOOT_SECTOR;
    private int SECTOR_SIZE;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
        BOOT_ADDRESS = 11;
        BOOT_SECTOR = 127;
        SECTOR_SIZE = 64;
    }

    public void start() {
    	System.out.println("START called from ComputerFacade");
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
	
}

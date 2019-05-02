
public class CPU {

	  public void freeze() { 
		  System.out.println("CPU FROZEN");
	  }
	  
	  public void jump(long position) {
		  System.out.println("CPU JUMPED to " + position + " aka BOOT_ADDRESS");
	  }
	  
	  public void execute() { 
		  System.out.println("CPU EXECUTED");
	  }
	  
}

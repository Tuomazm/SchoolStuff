
public class Pointer {
		
	private int value;
	private int maxValue;
		
	public Pointer(int maxVal) {
		this.maxValue = maxVal;
		this.value = 0;
	}
	
	public void next() {
		if(this.value == this.maxValue) {
			this.value = 0;
		}else {
			this.value++;
		}
	}
		
	public int getValue() {
		return value;
	}
		
	public void setValue(int newValue) {
		if(newValue <= 0 || newValue > this.maxValue) {
			return;
		}
		this.value = newValue;
	}
	
	public String toString() {
		if(this.value < 10) {
			return "0" + this.value;
		}
		return "" + this.value;
	}
		
}



import java.util.ArrayList;
import java.util.List;

public class Jasper {

	private List <Vaate> vaatteet;
	private AbstractFactory vaatetehdas;
	
	public Jasper(AbstractFactory vaatetehdas) {
		this.vaatetehdas = vaatetehdas;
	}
	
	public void setTehdas(AbstractFactory vaatetehdas) {
		this.vaatetehdas = vaatetehdas;
	}
	
	public void luoVaatekerrasto() {
		this.vaatteet = new ArrayList<>();
		vaatteet.add(vaatetehdas.createTuote("lippis", vaatetehdas.getClass().getName()));
		vaatteet.add(vaatetehdas.createTuote("kengät", vaatetehdas.getClass().getName()));
		vaatteet.add(vaatetehdas.createTuote("t-paita", vaatetehdas.getClass().getName()));
		vaatteet.add(vaatetehdas.createTuote("farkut", vaatetehdas.getClass().getName()));
	}
	
	public void luetteleVaatteet() {
		vaatteet.forEach(e -> System.out.println(e));
	}
}

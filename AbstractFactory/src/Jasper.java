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
		vaatteet.add(vaatetehdas.createFarkut(vaatetehdas.getClass().getName()));
		vaatteet.add(vaatetehdas.createKengät(vaatetehdas.getClass().getName()));
		vaatteet.add(vaatetehdas.createLippis(vaatetehdas.getClass().getName()));
		vaatteet.add(vaatetehdas.createPaita(vaatetehdas.getClass().getName()));
	}
	
	public void luetteleVaatteet() {
		vaatteet.forEach(e -> System.out.println(e));
	}
}

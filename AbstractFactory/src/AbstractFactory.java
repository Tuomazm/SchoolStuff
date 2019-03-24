
public interface AbstractFactory {
	
	public Vaate createLippis(String valmistaja);
	public Vaate createFarkut(String valmistaja);
	public Vaate createPaita(String valmistaja);
	public Vaate createKengät(String valmistaja);
	
}

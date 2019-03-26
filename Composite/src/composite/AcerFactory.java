package composite;

import java.util.Random;

public class AcerFactory extends AbstractFactory{

	private Random rand;

	public AcerFactory(){
		rand = new Random();
	}
	
	@Override
	public Laiteosa luoEmolevy() {
		Laiteosa emolevy = new Emolevy(rand.nextInt(100) + lisaaKate());
		emolevy.addLaiteosa(new Muistipiiri(rand.nextInt(100) + lisaaKate()));
		emolevy.addLaiteosa(new Prosessori(rand.nextInt(100) + lisaaKate()));
		emolevy.addLaiteosa(new Verkkokortti(rand.nextInt(50) + lisaaKate()));
		emolevy.addLaiteosa(new Näytönohjain(rand.nextInt(100) + lisaaKate()));
		return emolevy;
	}
	
	@Override
	public Laiteosa luoKotelo() {
		Laiteosa kotelo = new Kotelo(rand.nextInt(100) + lisaaKate());
		return kotelo;
	}
	
	@Override
	public Tietokone kasaaTietokone() {
		Tietokone kone = new Tietokone();
		kone.addLaiteosa(luoKotelo());
		kone.addLaiteosa(luoEmolevy());
		return kone;
	}
		
	@Override
	public double lisaaKate() {
		return 100;
	}
}

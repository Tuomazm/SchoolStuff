package composite;

import java.util.Random;

public abstract class AbstractFactory {

	private Random rand;

	public AbstractFactory() {
		rand = new Random();
	}

	public Tietokone kasaaTietokone() {
		Tietokone kone = new Tietokone();
		kone.addLaiteosa(luoKotelo());
		kone.addLaiteosa(luoEmolevy());
		return kone;
	}

	private Laiteosa luoKotelo() {
		Laiteosa kotelo = new Kotelo(rand.nextInt(100) + lisaaKate());
		return kotelo;
	}

	private Laiteosa luoEmolevy() {
		Laiteosa emolevy = new Emolevy(rand.nextInt(100) + lisaaKate());
		emolevy.addLaiteosa(new Muistipiiri(rand.nextInt(100) + lisaaKate()));
		emolevy.addLaiteosa(new Prosessori(rand.nextInt(100) + lisaaKate()));
		emolevy.addLaiteosa(new Verkkokortti(rand.nextInt(50) + lisaaKate()));
		emolevy.addLaiteosa(new Näytönohjain(rand.nextInt(100) + lisaaKate()));
		return emolevy;
	}
	
	public abstract double lisaaKate();

}

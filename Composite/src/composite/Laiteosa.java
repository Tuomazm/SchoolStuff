package composite;

import java.util.List;

public interface Laiteosa {
	
	public double getHinta();
	public void addLaiteosa(Laiteosa osa);
	public List<Laiteosa> getLaiteosat();
	
}

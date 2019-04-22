
public class PicAdapter implements PicPlayer{

	private PicPlayer picPlayer;
	
	public PicAdapter(PicPlayer pPlayer) {
		picPlayer = pPlayer;
	}
	
	@Override
	public void show(String fileName) {
		picPlayer.show(fileName);
	}
}

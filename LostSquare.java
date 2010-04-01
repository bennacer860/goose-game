
public class LostSquare extends Square{

	public LostSquare(String name) {
		super(name);
	}

	void processPlayer(Player aPlayer){
		aPlayer.setStatut(0);
		aPlayer.printout();
	}
	
}

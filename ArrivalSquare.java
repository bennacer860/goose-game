
public class ArrivalSquare extends Square{
	Game game;
	
	
	//constructor
	public ArrivalSquare(String name,Game game) {
		super(name);
		this.game=game;
	}
	
	//modification from the superClass Square

	void goForward(Player aPlayer,int nb){
    	this.goBack(aPlayer, nb);
	}
	
	
	void processPlayer(Player aPlayer){
		//set the winner of the game
		
		aPlayer.status=1;
		this.game.winner=true;
		aPlayer.printout();
	}
	
	
}

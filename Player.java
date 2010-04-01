import java.util.*;

public class Player {
	//the player's name
	String name;
	//-1 lost  0 in the game   1 winner
	int status;
	//square where the player actually is 
	Square square;
	
	public Player(String name,Square square){
		this.name=name;
		this.status=0;
		this.square=square;
	}
	
	
	//name getter 
	String getName(){
		return this.name;
	}
	
	int getStatus(){
		return this.status;
	}
	
	//setter
	void setStatut(int status){
		this.status=status;
	}
	
	void setSquare(Square aSquare){
		this.square=aSquare;
	}
	
	void printout(){
		System.out.println("the player:"+this.name+" have the status :"+this.status);
		System.out.println("i am in "+this.square.getName());
		System.out.print("\n");
	}
	
	
	//play method
	void play(){

		this.square.goForward(this, this.throwDice());
	}

	int throwDice(){
		Random generator = new Random();
		int dice = generator.nextInt(6) + 1;
		System.out.println("my dice is:"+dice);
		return dice;
	}
	
	
}

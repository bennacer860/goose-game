
public class Square {
    String name;
	Square next;
	Square precedent;
	
	//contructor
	public Square(String name){
		this.name=name;
		this.next=null;
		this.precedent=null;
	}
	
	//getter
	String getName(){
		return this.name;
	}
	
	//setter
	void setNext(Square next){
		this.next=next;
	}
	
	void setPrecedent(Square precedent){
		this.precedent=precedent;
	}
	
	
	void processPlayer(Player aPlayer){
		aPlayer.printout();
		aPlayer.setSquare(this);
	}
	
	
	
	//moves a player by a certain number of squares
	
	void goForward(Player aPlayer,int nb){
		
		if(nb>0){
			aPlayer.square=this.next;
			this.next.goForward(aPlayer, nb-1);
		}
		else
		    this.processPlayer(aPlayer);	
	}
	
    void goBack(Player aPlayer,int nb){
    	if(nb>0){
			aPlayer.square=this.precedent;
			this.precedent.goBack(aPlayer, nb-1);
		}
		else
		    this.processPlayer(aPlayer);	
	}
    
  	
}

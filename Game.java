

public class Game {

	int nbPlayers;
	boolean winner;
     Player[] players=new Player[nbPlayers];
	
     	//contructor
     	public Game(int n){
     		
		this.winner=false;
		this.nbPlayers=n;
		players=new Player[nbPlayers];	
		
		//initialize square
		DepartureSquare departure=new DepartureSquare("departure");
		Square neuterSquare1 = new Square("neuter1");
		Square neuterSquare2 = new Square("neuter2");
		Square neuterSquare3 = new Square("neuter3");
		Square neuterSquare4 = new Square("neuter4");
		Square neuterSquare5 = new Square("neuter5");
		Square neuterSquare6 = new Square("neuter6");
		ArrivalSquare arrival=new ArrivalSquare("arrival",this); 
		
		
		
		//organizing the squares
		departure.setNext(neuterSquare1);
		
		neuterSquare1.setPrecedent(departure);
		neuterSquare1.setNext(neuterSquare2);
		
		neuterSquare2.setPrecedent(neuterSquare1);
		neuterSquare2.setNext(neuterSquare3);
		
		neuterSquare3.setPrecedent(neuterSquare2);
		neuterSquare3.setNext(neuterSquare4);
		
		neuterSquare4.setPrecedent(neuterSquare3);
		neuterSquare4.setNext(neuterSquare5);
		
		neuterSquare5.setPrecedent(neuterSquare4);
		neuterSquare5.setNext(neuterSquare6);
		
		neuterSquare6.setPrecedent(neuterSquare5);
		neuterSquare6.setNext(arrival);
		
		arrival.setPrecedent(neuterSquare6);

		
		//initialize the players	
		Player p1=new Player("p"+1,departure);
		players[0]=p1;
		Player p2=new Player("p"+2,departure);
		players[1]=p2;
		
		
		
		
		//the actual game
	    int i=0;
	    for(i=0;i<players.length && !this.winner;i++){	
		    System.out.print(i+":");
	    	this.players[i].play();
	    	
	    	//if we arrive at the end of the array we loop around
	    	if(i==(players.length)-1)
	    		i=-1;
	    	
	    	if(this.winner){
	    		this.findWinner();
	    		System.exit(0);
	    	}
		}
	   
		
		
	}
	
	
	void findWinner(){
		int i;
		for(i=0;i<this.players.length;i++)
			if(this.players[i].getStatus()==1)
				System.out.println("<b>THE WINNER IS "+this.players[i].getName()+"<b>");
	}
	
	
	
	public static void main(String args[]) {
		Game g=new Game(2);	
	    //System.out.print(g.players.length);
	}
}
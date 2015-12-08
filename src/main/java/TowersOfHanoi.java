package main.java;

public class TowersOfHanoi {
	private Stack Pile_de_Gauche = null;
	private Stack Pile_du_Milieu = null;
	private Stack Pile_de_Droite = null;
	private int numberOfDiscs = 0;

	public TowersOfHanoi(int discnbr){

		Pile_de_Gauche = new Stack(discnbr);
		Pile_du_Milieu = new Stack(discnbr);
		Pile_de_Droite = new Stack(discnbr);
		numberOfDiscs = discnbr;
		
		for(int i = numberOfDiscs; i>0; i--){
			Pile_de_Gauche.push((i*2)-1);
		}
	}
   
	public void resoudrehanoi(int number, Stack from, Stack via, Stack to) {
		if (number > 0){
			resoudrehanoi(number - 1, from, to, via);
			deplacerDisk(from,to);
			resoudrehanoi(number - 1, via, from, to);
		}
	}
	
	public void deplacerDisk(Stack from, Stack to){
		to.push(from.head());
		from.pop();
		printStacks();
	}
	

	public void printStacks(){

		for(int i=numberOfDiscs-1; i>=0; i--){
			//Pile gauche
			if(Pile_de_Gauche.getTheArray()[i] != null){
				System.out.print( new String(new char[numberOfDiscs-((Pile_de_Gauche.getTheArray()[i]-1)/2)]).replace("\0", " ") );
				System.out.print(new String(new char[Pile_de_Gauche.getTheArray()[i]]).replace("\0", "*"));
				System.out.print( new String(new char[numberOfDiscs-((Pile_de_Gauche.getTheArray()[i]-1)/2)]).replace("\0", " ") );
			}
			else{
				System.out.print( new String(new char[numberOfDiscs*2+1]).replace("\0", " ") );
			}
			
			System.out.print("||");
			
			//Pile millieu
			if(Pile_du_Milieu.getTheArray()[i] != null){
				System.out.print( new String(new char[numberOfDiscs-((Pile_du_Milieu.getTheArray()[i]-1)/2)]).replace("\0", " ") );
				System.out.print(new String(new char[Pile_du_Milieu.getTheArray()[i]]).replace("\0", "*"));
				System.out.print( new String(new char[numberOfDiscs-((Pile_du_Milieu.getTheArray()[i]-1)/2)]).replace("\0", " ") );
			}
			else{
				System.out.print( new String(new char[numberOfDiscs*2+1]).replace("\0", " ") );
			}
			
			System.out.print("||");
			
			//Pile droite
			if(Pile_de_Droite.getTheArray()[i] != null){
				System.out.print( new String(new char[numberOfDiscs-((Pile_de_Droite.getTheArray()[i]-1)/2)]).replace("\0", " ") );
				System.out.print(new String(new char[Pile_de_Droite.getTheArray()[i]]).replace("\0", "*"));
				System.out.print( new String(new char[numberOfDiscs-((Pile_de_Droite.getTheArray()[i]-1)/2)]).replace("\0", " ") );
			}
			else{
				System.out.print( new String(new char[numberOfDiscs*2+1]).replace("\0", " ") );
			}
			
			System.out.print("||");
			System.out.println();
		}
		System.out.println( new String(new char[((numberOfDiscs*2)+3)*3]).replace("\0", "-"));
		
	}
	
	public Stack get_Pile_de_Gauche() {
		return Pile_de_Gauche;
	}

	public Stack get_Pile_du_Milieu() {
		return Pile_du_Milieu;
	}

	public Stack get_Pile_de_Droite() {
		return Pile_de_Droite;
	}
}

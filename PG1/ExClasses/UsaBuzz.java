package aula;

public class UsaBuzz {
	public static void main(String[] args) {
		
		Buzz n1 = new Buzz();
		Buzz n2 = new Buzz();
		Buzz n3 = new Buzz();
                
                n1.id = 1;
		n2.id = 2;
		n3.id = 3;
		
		n1.frases(6);
                n2.UsarAsas();
                n3.OnOffBracos();
                n1.UsarCapacete();
	}
}
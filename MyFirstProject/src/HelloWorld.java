
public class HelloWorld {
	
	public static void main (String [] args) {
		
		HelloWorld HWins = new HelloWorld();
		HWins.Mydisplay();
		
		
		}
	
	public void Mydisplay() {
		System.out.println ("default display");
								
	}
	
	public void Mydisplay(String ArgName) {
		System.out.println (ArgName);
								
	}
	
	public void Mydisplay(String ArgName, int ArgAge) {
		System.out.println (ArgName);
		System.out.println (ArgAge);
								
	}

}

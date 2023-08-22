class SomaDoisNumeros{
	private int num1 = 0;
	private int num2 = 0;
	
	SomaDoisNumeros(int n1,int n2){
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public int soma() {
		return num1 + num2;
	}
}
public class SomarDoisNumeros {
    
    public static void main(String args[]) {
        
    	SomaDoisNumeros soma = new SomaDoisNumeros(10,5);
    	
    	System.out.println("Soma: " + soma.soma());
    }
}
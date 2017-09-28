package metodos;

public class MetodosSimples {
	private int a,b;
	
	public MetodosSimples(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int soma(){
		return a+b;
	}
	
	public int subtracaoAB(){
		return a-b;
	}
	
	public int multiplicacao(){
		return a*b;
	}
}

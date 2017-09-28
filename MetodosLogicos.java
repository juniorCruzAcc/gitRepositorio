package metodos;

public class MetodosLogicos {
	int a,b;
	
	public MetodosLogicos(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public boolean igual(){
		if(a==b)
			return true;
		else
			return false;
	}
	
	public boolean maior(){
		if(a>b)
			return true;
		else
			return false;
	}
	
	public boolean menor(){
		if(a<b)
			return true;
		else
			return false;
	}
}

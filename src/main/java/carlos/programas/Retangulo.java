package carlos.programas;

public class Retangulo {

	private Float base;
	private Float altura;
	
	public Retangulo() {
	}
	
  public Retangulo(float base,float altura) {
	  super();
	this.base = base;
	this.altura = altura;
  }
  
  public void inicializa(float base , float altura) {
	  if (this.base != null) {
		  System.out.println("Já existe um retângulo");
	}else {
		 System.out.println("Criado com sucesso!");
		 this.base = base;
		  this.altura = altura;
	}
	 
  }
  
  public void modificarRetangulo(float base , float altura) {
	  if (this.altura == null && this.base == null) {
		  System.out.println("Não existe um retângulo para ser modificado! ");
	}else if(this.base != null) {
		
		 this.base = base;
		  this.altura = altura;
		  System.out.println("Alterado com sucesso! ");
		 
	}
  }
	
  public void calcularArea(float base , float altura) {
	  if (this.altura == null && this.base == null) {
		  System.out.println("Não existe um retângulo para Calcular Área! ");
	}else if(this.base != null) {
		 this.base = base;
		  this.altura = altura;
		  System.out.println("A área do retângulo é:  "+base*altura);
		 
	}
  }
  
  public void MostraRetangulo() {
	  if (this.base != null) {
		  System.out.println("Base: "+getBase() +" "+"Altura: "+ getAltura());
	}else {
		 System.out.println("Não existe retângulo: ");
		 
	}
	 
  }
	
	
	
	
	
	public Float getBase() {
		return base;
	}
	public void setBase(Float base) {
		this.base = base;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	
	
}


public class Perro extends Animal {
	//Campos
	private String raza;
	private String color;

	//Contructor
	Perro(String raza, String color,String nombre, Sexo sexo) {
		super(nombre, sexo);
		// TODO Auto-generated constructor stub
	}
	
	//Getters y setters
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//To string
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + "]";
	}
	// metodos
	@Override
	public void sonido() {
		System.out.println("Guau guau guau");
	}
	
}

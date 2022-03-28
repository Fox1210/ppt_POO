
public abstract class  Animal {
	// CAMPOS
	private String nombre;
	private Sexo sexo;

	// CONSTRUCTOR
	Animal(String nombre, Sexo sexo){
		this.nombre=nombre;
		this.sexo=sexo;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	// To String
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", sexo=" + sexo + "]";
	}
	
	// Hash Code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}
	
	// Equals
	public boolean equals(Animal otroAnimal) {
		if (this == otroAnimal)
			return true;
		if (otroAnimal == null)
			return false;
		if (getClass() != otroAnimal.getClass())
			return false;
		
		if (this.nombre.equals(otroAnimal.getNombre()) && this.sexo.equals(otroAnimal.getSexo())) {
			return true;
		}else {
			return false;
		}
	}
	
	//Metodos 
	public void sonido() {
		
	}
	public void reproducir() {
		System.out.println("XXX");
	}
	public void comer() {
		System.out.println("ñam ñam");
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		Perro max=new Perro("labrador", "negro", "dogux", Sexo.Macho);
		Perro duque=new Perro("chiguagua", "marron", "dogux", Sexo.Macho);
		
		Perro lara=new Perro("labrador", "blanco", "dogux", Sexo.Hembra);
		
		if (max.equals(lara)) {
			System.out.println("mismo nombre y sexo");
		}else {
			System.out.println("No son iguales");
		}
		
		if (max.equals(duque)) {
			System.out.println("mismo nombre y sexo");
		}else {
			System.out.println("No son iguales");
		}
		lara.comer();
		System.out.println(lara.getSexo());
	}

}

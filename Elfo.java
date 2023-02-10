public class Elfo extends CreaturaMagica{
	
	protected String nombre;
	protected String habitat;
	
	
	public Elfo (String nombre, String habitat) {
		this.nombre=nombre;
		this.habitat=habitat;
	}
	
	public String gethabitat() {
		return this.habitat;
	}
	protected String getnombre() {
		return this.nombre;
	}
}

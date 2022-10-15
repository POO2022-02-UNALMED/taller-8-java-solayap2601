package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	
	public Portero() {
		super();
		golesRecibidos = 289;
		dorsal = 7;}

	public Portero(String nombre, int edad,  short golesRecibidos, byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
		}
	
	public int compareTo(Portero f) {
	 return this.golesRecibidos- f.golesRecibidos;
	}
	
	public String toString() {return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +  "con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;}

	public boolean jugarConLasManos() {
		return true;}
}

package futbol;

public abstract class  Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private final  String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");}

	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion =posicion;}

	@Override
	public String toString() { return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;}
	
	public boolean equals (Futbolista f) {
		return this.equals(f);}
	
	public abstract  boolean jugarConLasManos();

	public String getNombre() {
		return nombre;}

	public void setNombre(String nuevo) {
		nombre=nuevo;}
	
	public int getEdad() {
		return edad;}

	public void setEdad(int nuevo) {
		edad=nuevo;}
	
	public String getPosicion() {
		return posicion;}

}

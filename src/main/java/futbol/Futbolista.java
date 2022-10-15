package futbol;

public abstract class  Futbolista {
	private String nombre;
	private int edad;
	private final  String posicion;
	
	public Futbolista() {
		nombre = "Maradona";
		edad = 30;
		posicion = "delantero";}

	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion =posicion;}

	public String toString() { return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;}
	
	
	public int compareTo(Futbolista futbol) {
		return 0;}

	public boolean equals (Futbolista f) {
		return this.equals(f);}

	public boolean jugarConLasManos() {
		return false;}

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
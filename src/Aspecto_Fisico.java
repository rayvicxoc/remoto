/**
 * En esta clase creamos el objeto Aspecto_Físico para su uso en el Main y el objeto Personaje. 
 * @author Ray
 * @version 02/02/2023
 */
public class Aspecto_Fisico {
	private double altura;
	private double peso;
	private String color_pelo;
	private String vestimenta;
	private String escenario;

	// Constructor vacío para guardar un tipo de objeto Aspecto_Fisico
	public Aspecto_Fisico() {
		super();
	} // Cierre del constructor
	
	/**
	 * Constructor para crear un objeto tipo Aspecto_Fisico
	 * @param altura Altura del personaje en metros
	 * @param peso Peso del personaje en kg
	 * @param color_pelo Color de pelo del personaje
	 * @param vestimenta Vestimenta del personaje
	 * @param escenario Lugar en la que procederán los personajes a luchar
	 */
	public Aspecto_Fisico(double altura, double peso, String color_pelo, String vestimenta, String escenario) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.color_pelo = color_pelo;
		this.vestimenta = vestimenta;
		this.escenario = escenario;
	} // Cierre del constructor

	/**
	 * Getter : Obtener la altura del personaje en concreto
	 * @return Devuelve la altura del personaje
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Setter : Proceso para cambiar la altura de un personaje en concreto
	 * @param altura Parámetro para realizar el cambio del valor del atributo
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Getter : Obtener la peso del personaje en concreto
	 * @return Devuelve el peso del personaje
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Setter : Proceso para cambiar el peso de un personaje en concreto
	 * @param peso Parámetro para realizar el cambio del valor del atributo
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Getter : Obtener el color del pelo del personaje en concreto
	 * @return Devuelve el color del pelo del personaje
	 */
	public String getColor_pelo() {
		return color_pelo;
	}

	/**
	 * Setter : Proceso para cambiar el color de pelo de un personaje en concreto
	 * @param color_pelo Parámetro para realizar el cambio del valor del atributo
	 */
	public void setColor_pelo(String color_pelo) {
		this.color_pelo = color_pelo;
	}

	/**
	 * Getter : Obtener la vestimenta del personaje en concreto
	 * @return Devuelve la vestimenta del personaje
	 */
	public String getVestimenta() {
		return vestimenta;
	}

	/**
	 * Setter : Proceso para cambiar la vestimenta de un personaje en concreto
	 * @param vestimenta Parámetro para realizar el cambio del valor del atributo
	 */
	public void setVestimenta(String vestimenta) {
		this.vestimenta = vestimenta;
	}

	/**
	 * Getter : Obtener el escenario del personaje en concreto
	 * @return Devuelve el escenario del personaje
	 */
	public String getEscenario() {
		return escenario;
	}

	/**
	 * Setter : Proceso para cambiar el escenario de un personaje en concreto
	 * @param escenario Parámetro para realizar el cambio del valor del atributo
	 */
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}

} // Cierre de la clase

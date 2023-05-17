/**
 * En esta clase creamos el objeto Datos_Biograficos para su uso en el Main y el objeto Personaje.
 * @author Ray
 * @version 02/02/2023
 */
public class Datos_Biograficos {
	private String nombre;
	private String pais_procendencia;
	private String historia;

	// Constructor vacío para guardar un tipo de objeto Datos_Biograficos
	public Datos_Biograficos() {
		super();
	} // Cierre del constructor

	/**
	 * Constructor para crear un objeto tipo Datos_Biograficos
	 * @param nombre Nombre del personaje
	 * @param pais_procendencia Nombre del lugar de nacimiento o procedencia
	 * @param historia Descripción del personaje
	 */
	public Datos_Biograficos(String nombre, String pais_procendencia, String historia) {
		super();
		this.nombre = nombre;
		this.pais_procendencia = pais_procendencia;
		this.historia = historia;
	} // Cierre del constructor

	/**
	 * Getter : Obtener el nombre del personaje en concreto
	 * @return Devuelve el nombre del personaje
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter : Proceso para cambiar el nombre de un personaje en concreto
	 * @param nombre Parámetro para realizar el cambio del valor del atributo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter : Obtener el nombre del país de procedencia del personaje en concreto
	 * @return Devuelve el nombre del país de procedencia del personaje
	 */
	public String getPais_procendencia() {
		return pais_procendencia;
	}

	/**
	 * Setter : Proceso para cambiar el nombre del pais de procedencia de un personaje en concreto
	 * @param pais_procendencia Parámetro para realizar el cambio del valor del atributo
	 */
	public void setPais_procendencia(String pais_procendencia) {
		this.pais_procendencia = pais_procendencia;
	}

	/**
	 * Getter : Obtener la historia o descripción del personaje en concreto
	 * @return Devuelve la descripción del personaje
	 */
	public String getHistoria() {
		return historia;
	}

	/**
	 * Setter : Proceso para cambiar la descripcion de un personaje en concreto
	 * @param historia Parámetro para realizar el cambio del valor del atributo
	 */
	public void setHistoria(String historia) {
		this.historia = historia;
	}

} // Cierre de la clase

/**
 * En esta clase creamos el objeto Datos_Lucha para su uso en el Main y el objeto Personaje. 
 * @author Ray
 * @version 02/02/2023
 */
public class Datos_Lucha {
	private double puntos_vida;
	private double velocidad;
	private double fuerza;
	private String patada_rapida;
	private String patada_lenta;
	private String puno_rapido;
	private String puno_lento;
	private String agarre_rapido;
	private String agarre_lento;
	private String ataque_especial1;
	private String ataque_especial2;
	private String ataque_especial3;

	// Constructor vacío para guardar un tipo de objeto Datos_Lucha
	public Datos_Lucha() {
		super();
	} // Cierre del constructor

	/**
	 * Constructor para crear un objeto tipo Datos_Lucha
	 * @param puntos_vida Puntos de vida del personaje en double
	 * @param velocidad Velocidad del personaje en int
	 * @param fuerza Fuerza del personaje en double
	 * @param patada_rapida Tipo de patada (rápida)
	 * @param patada_lenta Tipo de patada (lenta)
	 * @param puno_rapido Tipo de puno (rápido)
	 * @param puno_lento Tipo de puno (lento)
	 * @param agarre_rapido Tipo de agarre (rápido)
	 * @param agarre_lento Tipo de agarre (lento)
	 * @param ataque_especial1 Tipo de ataque especial 1
	 * @param ataque_especial2 Tipo de ataque especial 2
	 * @param ataque_especial3 Tipo de ataque especial 3
	 */
	public Datos_Lucha(double puntos_vida, double velocidad, double fuerza, String patada_rapida, String patada_lenta,
			String puno_rapido, String puno_lento, String agarre_rapido, String agarre_lento, String ataque_especial1,
			String ataque_especial2, String ataque_especial3) {
		super();
		this.puntos_vida = puntos_vida;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.patada_rapida = patada_rapida;
		this.patada_lenta = patada_lenta;
		this.puno_rapido = puno_rapido;
		this.puno_lento = puno_lento;
		this.agarre_rapido = agarre_rapido;
		this.agarre_lento = agarre_lento;
		this.ataque_especial1 = ataque_especial1;
		this.ataque_especial2 = ataque_especial2;
		this.ataque_especial3 = ataque_especial3;
	} // Cierre del constructor

	/**
	 * Getter : Obtener los puntos de vida del personaje en concreto
	 * @return Devuelve los puntos de vida del personaje
	 */
	public double getPuntos_vida() {
		return puntos_vida;
	}

	/**
	 * Setter : Proceso para cambiar los puntos de vida de un personaje en concreto
	 * @param puntos_vida Parámetro para realizar el cambio del valor del atributo
	 */
	public void setPuntos_vida(double puntos_vida) {
		this.puntos_vida = puntos_vida;
	}

	/**
	 * Getter : Obtener la velocidad del personaje en concreto
	 * @return Devuelve la velocidad del personaje
	 */
	public double getVelocidad() {
		return velocidad;
	}

	/**
	 * Setter : Proceso para cambiar la velocidad de un personaje en concreto
	 * @param velocidad Parámetro para realizar el cambio del valor del atributo
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * Getter : Obtener la fuerza del personaje en concreto
	 * @return Devuelve la fuerza del personaje
	 */
	public double getFuerza() {
		return fuerza;
	}

	/**
	 * Setter : Proceso para cambiar la fuerza de un personaje en concreto
	 * @param fuerza Parámetro para realizar el cambio del valor del atributo
	 */
	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * Getter : Obtener la patada rapida del personaje en concreto
	 * @return Devuelve la patada rapida del personaje
	 */
	public String getPatada_rapida() {
		return patada_rapida;
	}

	/**
	 * Setter : Proceso para cambiar el tipo de patada rapida de un personaje en concreto
	 * @param patada_rapida Parámetro para realizar el cambio del valor del atributo
	 */
	public void setPatada_rapida(String patada_rapida) {
		this.patada_rapida = patada_rapida;
	}

	/**
	 * Getter : Obtener la patada lenta del personaje en concreto
	 * @return Devuelve la patada lenta del personaje
	 */
	public String getPatada_lenta() {
		return patada_lenta;
	}

	/**
	 * Setter : Proceso para cambiar el tipo de patada lenta de un personaje en concreto
	 * @param patada_lenta Parámetro para realizar el cambio del valor del atributo
	 */
	public void setPatada_lenta(String patada_lenta) {
		this.patada_lenta = patada_lenta;
	}

	/**
	 * Getter : Obtener el puno rápido del personaje en concreto
	 * @return Devuelve el puno rapido del personaje
	 */
	public String getpuno_rapido() {
		return puno_rapido;
	}

	/**
	 * Setter : Proceso para cambiar el tipo de puno rapido de un personaje en concreto
	 * @param puno_rapido Parámetro para realizar el cambio del valor del atributo
	 */
	public void setpuno_rapido(String puno_rapido) {
		this.puno_rapido = puno_rapido;
	}

	/**
	 * Getter : Obtener el puno lento del personaje en concreto
	 * @return Devuelve el puno lento del personaje
	 */
	public String getpuno_lento() {
		return puno_lento;
	}

	/**
	 * Setter : Proceso para cambiar el tipo de puno lento de un personaje en concreto
	 * @param puno_lento Parámetro para realizar el cambio del valor del atributo
	 */
	public void setpuno_lento(String puno_lento) {
		this.puno_lento = puno_lento;
	}

	/**
	 * Getter : Obtener el agarre rapido del personaje en concreto
	 * @return Devuelve el agarre rapido del personaje
	 */
	public String getAgarre_rapido() {
		return agarre_rapido;
	}

	/**
	 * Setter : Proceso para cambiar el tipo de agarre rapido de un personaje en concreto
	 * @param agarre_rapido Parámetro para realizar el cambio del valor del atributo
	 */
	public void setAgarre_rapido(String agarre_rapido) {
		this.agarre_rapido = agarre_rapido;
	}

	/**
	 * Getter : Obtener el agarre lento del personaje en concreto
	 * @return Devuelve el agarre lento del personaje
	 */
	public String getAgarre_lento() {
		return agarre_lento;
	}

	/**
	 * Setter : Proceso para cambiar el tipo de agarre lento de un personaje en concreto
	 * @param agarre_lento Parámetro para realizar el cambio del valor del atributo
	 */
	public void setAgarre_lento(String agarre_lento) {
		this.agarre_lento = agarre_lento;
	}

	/**
	 * Getter : Obtener el ataque especial 1 del personaje en concreto
	 * @return Devuelve el ataque especial 1 del personaje
	 */
	public String getAtaque_especial1() {
		return ataque_especial1;
	}

	/**
	 * Setter : Proceso para cambiar el ataque especial 1 de un personaje en concreto
	 * @param ataque_especial1 Parámetro para realizar el cambio del valor del atributo
	 */
	public void setAtaque_especial1(String ataque_especial1) {
		this.ataque_especial1 = ataque_especial1;
	}

	/**
	 * Getter : Obtener el ataque especial 2 del personaje en concreto
	 * @return Devuelve el ataque especial 2 del personaje
	 */
	public String getAtaque_especial2() {
		return ataque_especial2;
	}

	/**
	 * Setter : Proceso para cambiar el ataque especial 2 de un personaje en concreto
	 * @param ataque_especial2 Parámetro para realizar el cambio del valor del atributo
	 */
	public void setAtaque_especial2(String ataque_especial2) {
		this.ataque_especial2 = ataque_especial2;
	}

	/**
	 * Getter : Obtener el ataque especial 3 del personaje en concreto
	 * @return Devuelve el ataque especial 3 del personaje
	 */
	public String getAtaque_especial3() {
		return ataque_especial3;
	}

	/**
	 * Setter : Proceso para cambiar el ataque especial 3 de un personaje en concreto
	 * @param ataque_especial3 Parámetro para realizar el cambio del valor del atributo
	 */
	public void setAtaque_especial3(String ataque_especial3) {
		this.ataque_especial3 = ataque_especial3;
	}

} // Cierre de la clase

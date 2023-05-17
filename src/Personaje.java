import java.util.ArrayList;
import java.util.Scanner;

/**
 * En esta clase creamos el objeto Personaje para su uso en el Main. 
 * Los métodos creados harán que este dé su funcionalidad como programa al Main.
 * @author Ray
 * @version 02/02/2023
 */
public class Personaje {
	private Datos_Biograficos datos_biograficos;
	private Aspecto_Fisico aspecto;
	private Datos_Lucha datos_lucha;

	/*
	 * Constructor vacio para crear un objeto tipo Personaje
	 */
	public Personaje() {
		super();
	} // Cierre del constructor

	/**
	 * Constructor para crear un objeto tipo Personaje
	 * @param datos_biograficos Objeto tipo Datos_Biograficos
	 * @param aspecto Objeto tipo Aspecto_Fisico
	 * @param datos_lucha Objeto tipo Datos_Lucha
	 */
	public Personaje(Datos_Biograficos datos_biograficos, Aspecto_Fisico aspecto, Datos_Lucha datos_lucha) {
		super();
		this.datos_biograficos = datos_biograficos;
		this.aspecto = aspecto;
		this.datos_lucha = datos_lucha;
	} // Cierre del constructor

	/**
	 * Getter : Obtener el objeto tipo Datos_Biograficos del personaje en concreto
	 * @return Devuelve objeto tipo Datos_Biograficos
	 */
	public Datos_Biograficos getDatos_biograficos() {
		return datos_biograficos;
	}

	/**
	 * Setter : Proceso para cambiar el objeto tipo Datos_Biograficos de un personaje en concreto
	 * @param datos_biograficos Parámetro para realizar el cambio del valor del atributo
	 */
	public void setDatos_biograficos(Datos_Biograficos datos_biograficos) {
		this.datos_biograficos = datos_biograficos;
	}

	/**
	 * Getter : Obtener el objeto tipo Aspecto_Fisico del personaje en concreto
	 * @return Devuelve objeto tipo Aspecto_Fisico
	 */
	public Aspecto_Fisico getAspecto() {
		return aspecto;
	}

	/**
	 * Setter : Proceso para cambiar el objeto tipo Aspecto_Fisico de un personaje en concreto
	 * @param aspecto Parámetro para realizar el cambio del valor del atributo
	 */
	public void setAspecto(Aspecto_Fisico aspecto) {
		this.aspecto = aspecto;
	}

	/**
	 * Getter : Obtener el objeto tipo Datos_Lucha del personaje en concreto
	 * @return Devuelve objeto tipo Datos_Lucha
	 */
	public Datos_Lucha getDatos_lucha() {
		return datos_lucha;
	}

	/**
	 * Setter : Proceso para cambiar el objeto tipo Datos_Lucha de un personaje en concreto
	 * @param datos_lucha Devuelve objeto tipo Datos_Lucha
	 */
	public void setDatos_lucha(Datos_Lucha datos_lucha) {
		this.datos_lucha = datos_lucha;
	}

	/**
	 * Método que devuelve el dano afligido por los ataques realizados. A la vez, se tendrá en cuenta
	 * la fuerza del personaje.
	 * @param ataque Tipo de ataque que se realizará
	 * @return Devuelve el dano afligido de ese ataque
	 */
	public double Ataque(String ataque) {
		double dano_afligido = 0;
		if (this.datos_lucha.getFuerza() > 1 && this.datos_lucha.getFuerza() < 10) {
			if (ataque.equalsIgnoreCase(this.datos_lucha.getpuno_rapido())) {
				dano_afligido = this.datos_lucha.getFuerza() * 0.3;
			}
			if (ataque.equalsIgnoreCase(this.datos_lucha.getpuno_lento())) {
				dano_afligido = this.datos_lucha.getFuerza() * 0.7;
			}
			if (ataque.equalsIgnoreCase(this.datos_lucha.getPatada_rapida())) {
				dano_afligido = this.datos_lucha.getFuerza() * 0.5;
			}
			if (ataque.equalsIgnoreCase(this.datos_lucha.getPatada_lenta())) {
				dano_afligido = this.datos_lucha.getFuerza() * 1;
			}
			if (ataque.equalsIgnoreCase(this.datos_lucha.getAgarre_rapido())) {
				dano_afligido = this.datos_lucha.getFuerza() * 3;
			}
			if (ataque.equalsIgnoreCase(this.datos_lucha.getAgarre_lento())) {
				dano_afligido = this.datos_lucha.getFuerza() * 5;
			}
			if (ataque.equalsIgnoreCase(this.datos_lucha.getAtaque_especial1())) {
				dano_afligido = this.datos_lucha.getFuerza() * 1.5;
			}
			if (ataque.equalsIgnoreCase(this.datos_lucha.getAtaque_especial2())) {
				dano_afligido = this.datos_lucha.getFuerza() * 2;
			}
			if (ataque.equalsIgnoreCase(this.datos_lucha.getAtaque_especial3())) {
				dano_afligido = this.datos_lucha.getFuerza() * 3;
			}
		}
		return dano_afligido;
	}// Cierre del método
} // Cierre de la clase

import java.util.ArrayList;
import java.util.Scanner;
/**
 * En esta clase, se podrá realizar un programa de Street Fighter como temática. Se realizarán varios métodos para su funcionalidad
 * como la inicialización de personajes, la simulación de combates.
 * @author Ray
 * @version 02/02/2023
 */
public class Main {

	/**
	 * Programa de simulación de combate
	 * @param args Array que recibe datos de la línea de comando
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		ArrayList<Personaje> losPersonajes = new ArrayList<Personaje>();
		inicializarPersonajes(losPersonajes);
		System.out.println("------SELECCIÓN DE PERSONAJES------");
		for (int i = 0; i < losPersonajes.size(); i++) {
			System.out.println(">> " + losPersonajes.get(i).getDatos_biograficos().getNombre() + " <<");
		}
		System.out.println("------------");
		
		String j1 = "";
		String j2 = "";
		System.out.println("JUGADOR 1, elige personaje (Nombre): ");
		j1 = sn.nextLine();
		System.out.println("JUGADOR 2, elige personaje (Nombre): ");
		j2 = sn.nextLine();
		Personaje personaje1 = new Personaje();
		Personaje personaje2 = new Personaje();
		for (Personaje personajes : losPersonajes) {
			if(personajes.getDatos_biograficos().getNombre().equalsIgnoreCase(j1)) {
				personaje1 = personajes;
				System.out.println("J1 has seleccionado a " + personaje1.getDatos_biograficos().getNombre());
			}
			if(personajes.getDatos_biograficos().getNombre().equalsIgnoreCase(j2)) {
				personaje2 = personajes;
				System.out.println("J2 has seleccionado a " + personaje2.getDatos_biograficos().getNombre());
			}
		}
		System.out.println();
		simulaCombate(personaje1, personaje2);
	} // Cierre del programa

	/**
	 * Método que realizará la simulación de combate entre dos personajes.
	 * Se tendrá en cuenta las velocidades de cada uno para el primer ataque y sobre todo el uso del Método Ataque (Clase Personaje).
	 * A la vez que esta, mostrar antes del combate, los datos de cada personaje, escenario y pais en la que combatirán
	 * @param personaje1 Objeto tipo Personaje
	 * @param personaje2 Objeto tipo Personaje
	 */
	public static void simulaCombate(Personaje personaje1, Personaje personaje2) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println(personaje1.getDatos_biograficos().getNombre() + " Vs " + personaje2.getDatos_biograficos().getNombre());
		System.out.println();
		System.out.println("País: " + personaje1.getDatos_biograficos().getPais_procendencia());
		System.out.println("Escenario: " + personaje1.getAspecto().getEscenario());
		
		if (esMasRapidoP1(personaje1, personaje2)) {
			fightVoid();
			jugador1Ataca(personaje1, personaje2, sn);
		} else {
			fightVoid();
			jugador2Ataca(personaje1, personaje2, sn);
		}
		if(personaje1.getDatos_lucha().getVelocidad() == personaje2.getDatos_lucha().getVelocidad()) {
			if(personaje1.getDatos_lucha().getFuerza() > personaje2.getDatos_lucha().getFuerza()) {
				fightVoid();
				jugador1Ataca(personaje1, personaje2, sn);
			}
		}
		if(personaje1.getDatos_lucha().getVelocidad() == personaje2.getDatos_lucha().getVelocidad()) {
			if(personaje2.getDatos_lucha().getFuerza() > personaje1.getDatos_lucha().getFuerza()) {
				fightVoid();
				jugador2Ataca(personaje1, personaje2, sn);
			}
		}
	} // Cierre del método

	/**
	 * @param personaje1
	 * @param personaje2
	 * @return
	 */
	public static boolean esMasRapidoP1(Personaje personaje1, Personaje personaje2) {
		return personaje1.getDatos_lucha().getVelocidad() > personaje2.getDatos_lucha().getVelocidad();
	}

	public static void fightVoid() {
		System.out.println();
		System.out.println("¡¡  F I G H T  !!");
		System.out.println();
	} // Cierre del método

	/**
	 * Método en el cual se usa para simular el combate dependiendo de la velocidad de cada personaje.
	 * @param personaje1 Personaje del jugador 1
	 * @param personaje2 Personaje del jugador 2
	 * @param sn Scanner para introducción de datos por usuario
	 */
	public static void jugador1Ataca(Personaje personaje1, Personaje personaje2, Scanner sn) {
		String ataque;
		for (int i = 0; i < 100; i++) {
			System.out.print("Jugador 1 ataca (Introduzca tipo de ataque): ");
			ataque = sn.nextLine();
			personaje2.getDatos_lucha().setPuntos_vida(personaje2.getDatos_lucha().getPuntos_vida() - personaje1.Ataque(ataque));
			System.out.println(personaje2.getDatos_biograficos().getNombre() + " HP: " + personaje2.getDatos_lucha().getPuntos_vida());

			System.out.print("Jugador 2 ataca (Introduzca tipo de ataque): ");
			ataque = sn.nextLine();
			personaje1.getDatos_lucha().setPuntos_vida(personaje1.getDatos_lucha().getPuntos_vida() - personaje2.Ataque(ataque));
			System.out.println(personaje1.getDatos_biograficos().getNombre() + " HP: " + personaje1.getDatos_lucha().getPuntos_vida());
			System.out.println();
			if (personaje1.getDatos_lucha().getPuntos_vida() < 0) {
				System.out.println("¡Ganador Jugador 2!");
				personaje1.getDatos_lucha().setPuntos_vida(100);
				personaje2.getDatos_lucha().setPuntos_vida(100);
				break;
			}
			if (personaje1.getDatos_lucha().getPuntos_vida() < 0 && personaje2.getDatos_lucha().getPuntos_vida() == 100.0) {
				System.out.println("¡Ganador Jugador 2!");
				System.out.println("PERFECT");
				personaje1.getDatos_lucha().setPuntos_vida(100);
				personaje2.getDatos_lucha().setPuntos_vida(100);
				break;
			}
			if (personaje2.getDatos_lucha().getPuntos_vida() < 0) {
				System.out.println("¡Ganador Jugador 1!");
				personaje1.getDatos_lucha().setPuntos_vida(100);
				personaje2.getDatos_lucha().setPuntos_vida(100);
				break;
			}
			if (personaje2.getDatos_lucha().getPuntos_vida() < 0 && personaje1.getDatos_lucha().getPuntos_vida() == 100.0) {
				System.out.println("¡Ganador Jugador 1!");
				System.out.println("PERFECT");
				personaje1.getDatos_lucha().setPuntos_vida(100);
				personaje2.getDatos_lucha().setPuntos_vida(100);
				break;
			}
		}
	} // Cierre del método

	/**
	 * Método en el cual se usa para simular el combate dependiendo de la velocidad de cada personaje.
	 * @param personaje1 Personaje del jugador 1
	 * @param personaje2 Personaje del jugador 2
	 * @param sn Scanner para introducción de datos por usuario
	 */
	public static void jugador2Ataca(Personaje personaje1, Personaje personaje2, Scanner sn) {
		String ataque;
		for (int i = 0; i < 100; i++) {
			System.out.print("Jugador 2 ataca (Introduzca tipo de ataque): ");
			ataque = sn.nextLine();
			personaje1.getDatos_lucha().setPuntos_vida(personaje1.getDatos_lucha().getPuntos_vida() - personaje2.Ataque(ataque));
			System.out.println(personaje1.getDatos_biograficos().getNombre() + " HP: " + personaje1.getDatos_lucha().getPuntos_vida());

			System.out.print("Jugador 1 ataca (Introduzca tipo de ataque): ");
			ataque = sn.nextLine();
			personaje2.getDatos_lucha().setPuntos_vida(personaje2.getDatos_lucha().getPuntos_vida() - personaje1.Ataque(ataque));
			System.out.println(personaje2.getDatos_biograficos().getNombre() + " HP: " + personaje2.getDatos_lucha().getPuntos_vida());
			System.out.println();
			if (personaje1.getDatos_lucha().getPuntos_vida() < 0) {
				System.out.println("¡Ganador Jugador 2!");
				personaje1.getDatos_lucha().setPuntos_vida(100);
				personaje2.getDatos_lucha().setPuntos_vida(100);
				break;
			}
			if (personaje1.getDatos_lucha().getPuntos_vida() < 0 && personaje2.getDatos_lucha().getPuntos_vida() == 100.0) {
				System.out.println("¡Ganador Jugador 2!");
				System.out.println("PERFECT");
				personaje1.getDatos_lucha().setPuntos_vida(100);
				personaje2.getDatos_lucha().setPuntos_vida(100);
				break;
			}
			if (personaje2.getDatos_lucha().getPuntos_vida() < 0) {
				System.out.println("¡Ganador Jugador 1!");
				personaje1.getDatos_lucha().setPuntos_vida(100);
				personaje2.getDatos_lucha().setPuntos_vida(100);
				break;
			}
			if (personaje2.getDatos_lucha().getPuntos_vida() < 0 && personaje1.getDatos_lucha().getPuntos_vida() == 100.0) {
				System.out.println("¡Ganador Jugador 1!");
				System.out.println("PERFECT");
				personaje1.getDatos_lucha().setPuntos_vida(100);
				personaje2.getDatos_lucha().setPuntos_vida(100);
				break;
			}
		}
	} // Cierre del método
	
	/**
	 * Método que añadirá a un ArrayList de tipo Personaje, los datos de cada personaje.
	 * @param losPersonajes ArrayList de objeto tipo Personaje
	 */
	public static void inicializarPersonajes(ArrayList<Personaje> losPersonajes) {
		Personaje ryu = new Personaje(
				new Datos_Biograficos("Ryu", "Japón",
						"Un karateka japonés que trata de perfeccionar todas sus habilidades."),
				new Aspecto_Fisico(1.75, 68.0, "Castaño", "Kimono Blanco", "Suzaku Castle"),
				new Datos_Lucha(100.0, 90.0, 9.0, "Patada rapida", "Patada lenta", "Puño rapido", "Puño lento",
						"Agarre rapido", "Agarre lento", "Ataque especial 1", "Ataque especial 2",
						"Ataque especial 3"));
		Personaje honda = new Personaje(
				new Datos_Biograficos("E. Honda", "Japón", "Un luchador de sumo venido desde Japón."),
				new Aspecto_Fisico(1.88, 137.0, "Negro", "Mawashi", "Japanese Street"),
				new Datos_Lucha(100.0, 92.0, 7.5, "Patada rapida", "Patada lenta", "Puño rapido", "Puño lento",
						"Agarre rapido", "Agarre lento", "Ataque especial 1", "Ataque especial 2",
						"Ataque especial 3"));
		Personaje blanka = new Personaje(
				new Datos_Biograficos("Blanka", "Brasil",
						"Un mutante con forma de bestia que creció en la jungla de Brasil."),
				new Aspecto_Fisico(1.92, 98.0, "Naranja", "Vaqueros rotos", "Escenario de Blanka"),
				new Datos_Lucha(100.0, 86.0, 8.5, "Patada rapida", "Patada lenta", "Puño rapido", "Puño lento",
						"Agarre rapido", "Agarre lento", "Ataque especial 1", "Ataque especial 2",
						"Ataque especial 3"));
		Personaje guile = new Personaje(
				new Datos_Biograficos("Guile", "EE.UU", "Un antiguo miembro militar estadounidense."),
				new Aspecto_Fisico(1.82, 99.0, "Rubio", "Ropa de militar usada", "Air Force Base"),
				new Datos_Lucha(100.0, 85.0, 8.8, "Patada rapida", "Patada lenta", "Puño rapido", "Puño lento",
						"Agarre rapido", "Agarre lento", "Ataque especial 1", "Ataque especial 2",
						"Ataque especial 3"));
		Personaje ken = new Personaje(
				new Datos_Biograficos("Ken", "EE.UU", "Rival de Ryu, originario de los Estados Unidos."),
				new Aspecto_Fisico(1.75, 72.0, "Pelirrojo", "Kimono rojo", "Costa Rica"),
				new Datos_Lucha(100.0, 91.0, 8.9, "Patada rapida", "Patada lenta", "Puño rapido", "Puño lento",
						"Agarre rapido", "Agarre lento", "Ataque especial 1", "Ataque especial 2",
						"Ataque especial 3"));
		Personaje chunli = new Personaje(
				new Datos_Biograficos("Chun-Li", "China", "Una artista marcial china que trabaja para la Interpol."),
				new Aspecto_Fisico(1.69, 56.0, "Castaño", "Qipao", "Fighting Zone"),
				new Datos_Lucha(100.0, 85.0, 9.2, "Patada rapida", "Patada lenta", "Puño rapido", "Puño lento",
						"Agarre rapido", "Agarre lento", "Ataque especial 1", "Ataque especial 2",
						"Ataque especial 3"));
		Personaje zangief = new Personaje(
				new Datos_Biograficos("Zangief", "Rusia", "Un luchador profesional de la (antigua) Unión Soviética."),
				new Aspecto_Fisico(2.14, 115.0, "Negro", "Boxer deportivos rojos y botas rojas con un cinturón dorado.",
						"The World Warrior"),
				new Datos_Lucha(100.0, 81.0, 9.0, "Patada rapida", "Patada lenta", "Puño rapido", "Puño lento",
						"Agarre rapido", "Agarre lento", "Ataque especial 1", "Ataque especial 2",
						"Ataque especial 3"));
		Personaje dhalsim = new Personaje(new Datos_Biograficos("Dhalsim", "India", "Un maestro de yoga de India."),
				new Aspecto_Fisico(1.76, 48.0, "Blanco",
						"Pinturas en la cara, tobilleras y muñequeras de tela, y pantalones cortos de tela.",
						"Escenario de Dhalsim"),
				new Datos_Lucha(100.0, 85.0, 8.2, "Patada rapida", "Patada lenta", "Puño rapido", "Puño lento",
						"Agarre rapido", "Agarre lento", "Ataque especial 1", "Ataque especial 2",
						"Ataque especial 3"));
		losPersonajes.add(ryu);
		losPersonajes.add(honda);
		losPersonajes.add(blanka);
		losPersonajes.add(guile);
		losPersonajes.add(ken);
		losPersonajes.add(chunli);
		losPersonajes.add(zangief);
		losPersonajes.add(dhalsim);
	} // Cierre del método
	
} // Cierre de la clase

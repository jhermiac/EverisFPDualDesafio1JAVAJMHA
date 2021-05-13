
/*
 * DESAF�O 1 DE JAVA - FP DUAL EVERIS
 * JUAN MANUEL HERMIDA ACU�A
 */

package variables;

public class Developer {

	// Variables de instancias
	private String nombreTrabajador = "";
	private int idTrabajador = 0;
	private int diasVacaciones = 21;

	// Variable de clase est�tica
	private static byte numTotalTrabajadores = 0;

	// Variable constante, para el nombre de la emmpresa
	public final static String EMPRESA = "Everis NTT";

	/**
	 * Constructor para instanciar la clase Developer
	 * 
	 * @param nombreTrabajador
	 * 
	 * @param idTrabajador
	 * 
	 * @throws Exception
	 * 
	 * @author Juan Manuel Hermida Acu�a
	 * 
	 **/

	public Developer(String nombreTrabajador) throws Exception {

		this.nombreTrabajador = nombreTrabajador;
		this.idTrabajador = numTotalTrabajadores + 1;

		// Comprobamos que haya menos que no supere el limite de 127 trabajadores, en caso de susperarlo, lanzar� una exepci�n.
		if (numTotalTrabajadores < 127) {
			numTotalTrabajadores += 1;
		} else {
			throw new Exception("Ya hay m�s de 127 trabajadores");
		}

	}

	/**
	 * M�todo que devuelve el nombre del tabajador
	 */

	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	/**
	 * M�todo para devolver el numero total de trabajador de la empresa
	 */

	public byte getTotalTrabajadores() {
		return numTotalTrabajadores;
	}

	/**
	 * M�todo que devuelve el id del trabajador
	 */

	public int getIdTrabador() {
		return idTrabajador;
	}

	/**
	 * M�todo para descontar d�as de vacaciones
	 * 
	 * @throws Exception
	 */

	public void reducirVacaciones(int reduccion) throws Exception {

		// Comprobamos que el n�mero de d�as que quieras reducir de la jornaa de vacaciones, sea un numero comprendido entre 0 y 21.

		if (reduccion >= 0 && reduccion <= 21 && reduccion <= diasVacaciones) {
			diasVacaciones -= reduccion;
		} else {
			throw new Exception("No puedes quitar esos d�as de las vacaciones del trabajador ");
		}

	}

	/**
	 * M�todo que devulve los d�as de vacaciones
	 */

	public int getVacaciones() {
		return diasVacaciones;
	}

}

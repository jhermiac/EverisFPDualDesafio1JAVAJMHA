
/*
 * DESAFÍO 1 DE JAVA - FP DUAL EVERIS
 * JUAN MANUEL HERMIDA ACUÑA
 */

package variables;

public class Developer {

	// Variables de instancias
	private String nombreTrabajador = "";
	private int idTrabajador = 0;
	private int diasVacaciones = 21;

	// Variable de clase estática
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
	 * @author Juan Manuel Hermida Acuña
	 * 
	 **/

	public Developer(String nombreTrabajador) throws Exception {

		this.nombreTrabajador = nombreTrabajador;
		this.idTrabajador = numTotalTrabajadores + 1;

		// Comprobamos que haya menos que no supere el limite de 127 trabajadores, en caso de susperarlo, lanzará una exepción.
		if (numTotalTrabajadores < 127) {
			numTotalTrabajadores += 1;
		} else {
			throw new Exception("Ya hay más de 127 trabajadores");
		}

	}

	/**
	 * Método que devuelve el nombre del tabajador
	 */

	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	/**
	 * Método para devolver el numero total de trabajador de la empresa
	 */

	public byte getTotalTrabajadores() {
		return numTotalTrabajadores;
	}

	/**
	 * Método que devuelve el id del trabajador
	 */

	public int getIdTrabador() {
		return idTrabajador;
	}

	/**
	 * Método para descontar días de vacaciones
	 * 
	 * @throws Exception
	 */

	public void reducirVacaciones(int reduccion) throws Exception {

		// Comprobamos que el número de días que quieras reducir de la jornaa de vacaciones, sea un numero comprendido entre 0 y 21.

		if (reduccion >= 0 && reduccion <= 21 && reduccion <= diasVacaciones) {
			diasVacaciones -= reduccion;
		} else {
			throw new Exception("No puedes quitar esos días de las vacaciones del trabajador ");
		}

	}

	/**
	 * Método que devulve los días de vacaciones
	 */

	public int getVacaciones() {
		return diasVacaciones;
	}

}

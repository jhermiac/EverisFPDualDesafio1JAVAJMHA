
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
	 * @author Juan Manuel Hermida Acuña
	 **/

	public Developer(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
		this.idTrabajador = numTotalTrabajadores + 1;
		numTotalTrabajadores += 1;
	}

	// Método que devuelve el nombre del tabajador

	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	/*
	 * Método para devolver el numero total de trabajador de la empresa
	 */

	public byte getTotalTrabajadores() {
		return numTotalTrabajadores;
	}

	/*
	 * Método que devulve el id del trabajador
	 */

	public int getIdTrabador() {
		return idTrabajador;
	}

	/*
	 * Método para descontar días de vacaciones
	 */

	public void reducirVacaciones(int reduccion) {
		diasVacaciones -= reduccion;
	}

	/*
	 * Método que devulve los días de vacaciones
	 */

	public int getVacaciones() {
		return diasVacaciones;
	}

}

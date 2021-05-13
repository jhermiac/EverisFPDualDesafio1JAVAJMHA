
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
	 * @author Juan Manuel Hermida Acu�a
	 **/

	public Developer(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
		this.idTrabajador = numTotalTrabajadores + 1;
		numTotalTrabajadores += 1;
	}

	// M�todo que devuelve el nombre del tabajador

	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	/*
	 * M�todo para devolver el numero total de trabajador de la empresa
	 */

	public byte getTotalTrabajadores() {
		return numTotalTrabajadores;
	}

	/*
	 * M�todo que devulve el id del trabajador
	 */

	public int getIdTrabador() {
		return idTrabajador;
	}

	/*
	 * M�todo para descontar d�as de vacaciones
	 */

	public void reducirVacaciones(int reduccion) {
		diasVacaciones -= reduccion;
	}

	/*
	 * M�todo que devulve los d�as de vacaciones
	 */

	public int getVacaciones() {
		return diasVacaciones;
	}

}

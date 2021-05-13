
/*
 * DESAF�O 1 DE JAVA - FP DUAL EVERIS
 * JUAN MANUEL HERMIDA ACU�A
 */

package fpdualeveris;

import variables.Developer;

public class FPDual {

	/**
	 * MAIN
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		variablesChallenge();

	}

	/**
	 * Creac��n del m�todo privado y est�tico de variablesChallenge
	 */
	private static void variablesChallenge() {

		try {
			Developer trabajador1 = new Developer("Juanma");
			Developer trabajador2 = new Developer("F�tima");
			Developer trabajador3 = new Developer("Diego");
			Developer trabajador4 = new Developer("Dani");
			Developer trabajador5 = new Developer("Alexei");

			/*
			 * Nombre de la empresa
			 */
			System.out.println(Developer.EMPRESA);

			/*
			 * El n�mero total de trabajadores tiene que ser igual para el trabajador1 y para el trabajador4
			 */

			System.out.println("N�mero total de trabajadores en " + trabajador1.getNombreTrabajador() + " es" + trabajador1.getTotalTrabajadores());

			System.out.println("N�mero total de trabajadores en " + trabajador4.getNombreTrabajador() + " es" + trabajador4.getTotalTrabajadores());

			/*
			 * Mostrar el id de cada trabajador
			 */
			System.out.println("El id de " + trabajador1.getNombreTrabajador() + " es " + trabajador1.getIdTrabador());
			System.out.println("El id de " + trabajador2.getNombreTrabajador() + " es " + trabajador2.getIdTrabador());
			System.out.println("El id de " + trabajador3.getNombreTrabajador() + " es " + trabajador3.getIdTrabador());
			System.out.println("El id de " + trabajador4.getNombreTrabajador() + " es " + trabajador4.getIdTrabador());
			System.out.println("El id de " + trabajador5.getNombreTrabajador() + " es " + trabajador5.getIdTrabador());

			/*
			 * Al trabajador 1 le vamos a descontar d�as de vacaciones
			 */
			trabajador1.reducirVacaciones(5);
			System.out.println("D�as de vacaciones de " + trabajador1.getNombreTrabajador() + ": " + trabajador1.getVacaciones());

			/*
			 * D�as de vacaciones
			 */
			System.out.println("D�as de vacaciones de " + trabajador2.getNombreTrabajador() + ": " + trabajador2.getVacaciones());
			System.out.println("D�as de vacaciones de " + trabajador3.getNombreTrabajador() + ": " + trabajador3.getVacaciones());
			System.out.println("D�as de vacaciones de " + trabajador4.getNombreTrabajador() + ": " + trabajador4.getVacaciones());
			System.out.println("D�as de vacaciones de " + trabajador5.getNombreTrabajador() + ": " + trabajador5.getVacaciones());
			System.out.println("D�as de vacaciones de " + trabajador1.getNombreTrabajador() + ": " + trabajador1.getVacaciones());
			System.out.println("---------------------");

			/*
			 * El trabajador puede consultar sus d�as disfrutables de vacaciones asi como descontar d�as de vacaciones de los que le queden.
			 */

			trabajador1.reducirVacaciones(6);
			System.out.println("D�as de vacaciones de " + trabajador1.getNombreTrabajador() + ": " + trabajador1.getVacaciones());

			/*
			 * Si quitamos el comentario de la siguiente l�nea, lanzar� una excepci�n porque le estamos quitando al trabajador1 m�s d�as de vacaciones de los
			 * que tiene
			 */
			// trabajador1.reducirVacaciones(21);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}

package semaforo;

import java.util.concurrent.Semaphore;

public class semaforoseccioncritica {

	private static Sumador sumadores[];

	private static Semaphore semaforoprincipal = new Semaphore(1);

	public static void main(String[] args) {

		int n_sum = 4; // int n_sum

		// Crea Array de procesos Sumadores

		sumadores = new Sumador[n_sum];

		// Inicia los Procesos del Array

		for (int i = 0; i < n_sum; i++) {

			sumadores[i] = new Sumador(10000, i, semaforoprincipal);

			sumadores[i].start();

		}

		// Indica al Programa Principal espere a que todos los Procesos

		for (int i = 0; i < n_sum; i++) {

			try {

				sumadores[i].join();

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

		System.out.println("Acumulador; " + Acumula.acumulador);

	}
}


public class BacktrackingTableroMagico {

	private int[][] tableroMagico;
	private boolean[] available;
	private int maxValue;
	private int filCol;
	private int suma;
	private boolean haveSolution;
	private int[] sumaCol;
	private int[] sumaFil;

	public BacktrackingTableroMagico(int n, int k, int suma) {
		sumaCol = new int[n];
		sumaFil = new int[n];
		tableroMagico = new int[n][n];
		maxValue = k + 1;
		filCol = n;
		this.suma = suma;
		haveSolution = false;
		available = new boolean[k + 1];

	}

	private void llenarAvailable() {

		for (int i = 0; i < available.length; i++) {
			if (i < this.maxValue) {
				available[i] = true;
			}
		}
	}

	private void llenarMagicSquare() {

		for (int i = 0; i < filCol; i++) {
			for (int j = 0; j < filCol; j++) {
				this.tableroMagico[i][j] = -1;
			}
		}
	}

	public void jugar() {
		llenarMagicSquare();
		llenarAvailable();
		back(0, 0);
	}

	private void back(int row, int col) {
		int i = 0;
		while (i < this.maxValue && !this.haveSolution) {/*
															 * si se colaca un for y quitamos haveSolution va a imprimir
															 * todas las soluciones posibles
															 */
			if (estaDisponible(i)) {
				tableroMagico[row][col] = i;
				available[i] = false;
				incrementar(row, col, i);
				if (!hayPoda(row, col)) {
					if (isFull()) {
						printSolucion();
						this.haveSolution = true;
					} else {
						if (col != this.filCol - 1) {
							back(row, col + 1);
						} else if (row != this.filCol - 1) {
							back(row + 1, 0);
						}
					}
				}
				decrementar(row, col, i);
				tableroMagico[row][col] = -1;
				available[i] = true;
			}
			i++;

		}
	}

	private boolean hayPoda(int row, int col) {
		boolean retorno = false;

		if ((this.sumaCol[col] > this.suma) || (this.sumaFil[row] > this.suma)) {
			retorno = true;
		} else if ((col == this.filCol - 1) && (this.sumaFil[row] < this.suma)) {
			retorno = true;
		} else if ((row == this.filCol - 1) && (this.sumaCol[col] < this.suma)) {
			retorno = true;
		}

		return retorno;
	}

	private void decrementar(int row, int col, int valor) {
		this.sumaCol[col] -= valor;
		this.sumaFil[row] -= valor;
	}

	private void incrementar(int row, int col, int valor) {

		this.sumaCol[col] += valor;
		this.sumaFil[row] += valor;

	}

	private void printSolucion() {

		for (int i = 0; i < filCol; i++) {
			for (int j = 0; j < filCol; j++) {
				System.out.print(tableroMagico[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	private boolean isFull() {
		for (int i = 0; i < filCol; i++) {
			for (int j = 0; j < filCol; j++) {
				if (tableroMagico[i][j] == -1)
					return false;
			}
		}
		return true;
	}

	private boolean estaDisponible(int i) {
		if (available[i] == true)
			return true;
		else
			return false;
	}
}
	
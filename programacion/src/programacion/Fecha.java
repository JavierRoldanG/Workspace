package programacion;

public class Fecha {
	/**
	 * Representacion de una fecha de en formato Gregoriano
	 * 
	 * @author Elena Rioja
	 *
	 */
		int dia, mes, anno;

		public Fecha() {
			dia = mes = anno = -1;
		}

		public Fecha(int dia, int mes, int anno) {
			this.dia = dia;
			this.mes = mes;
			this.anno = anno;
		}

		public int getAnno() {
			return anno;
		}

		public void setAnno(int anno) {
			if (anno == 0)
				System.out.print("Error");
			this.anno = anno;
		}

		public int getDia() {
			if (mes != -1)
				switch (mes) {
				case 4, 6, 9, 11:
					if (dia > 30)
						System.out.print("Error");
					break;
				case 2:
					if (anno != -1) {
						if (dia > 28)
							System.out.print("Error");
					} else if (anno % 4 == 0) {
						if (dia > 29)
							System.out.print("Error");
					} else if (dia > 28)
						System.out.print("Error");
				case 1, 3, 5, 7, 8, 10, 12:
					if (dia > 31)
						System.out.print("Error");
				}
			return dia;
		}

		public int getMes() {
			return mes;
		}

		public void seDia(int dia) {
			this.dia = dia;
		}

		public void setMes(int mes) {
			if (mes < 1 || mes > 12)
				System.out.print("Error");
			this.mes = mes;
		}

		public String toString() {
			return "" + dia + "/" + mes + "/" + anno;
			// return String.format("%2d/%2d/%4d",dia,mes,anno);
		}

		Fecha incrementaDias(int dias) {
			Fecha resultado = new Fecha(dia, mes, anno);
			for (int i = 0; i < dias; i++) {
				resultado.dia++;
				switch (resultado.mes) {
				case 4, 6, 9, 11:
					if (resultado.dia == 31) {
						resultado.dia = 1;
						resultado.mes++;
					}
				case 1, 3, 5, 7, 8, 10, 12:
					if (resultado.dia == 32) {
						resultado.dia = 1;
						
						resultado.mes++;
						

					}
					break;
				}
			}
			return resultado;
		}

	}


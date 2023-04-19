package challenge_convertidor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) throws Exception {

		Object[] options = { "Convertir Divisas", "Convertir Temperatura", "Salir" };
		int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		if (elige == 2) {
			JOptionPane.showMessageDialog(null, "Programa cerrado");
			System.exit(0);
		}

		if (elige == 0) {
			DecimalFormat formatearDivisa = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opciones = { "Pesos MXN a Euros", "Pesos MXN a Dolares", "Pesos MXN a Libras Esterlinas",
						"Pesos MXN a Yenes", "Pesos MXN a Wones" };
				String cambio = (String) JOptionPane.showInputDialog(null, "Eliga una opcion:", "Conversor de Divisas",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				String input = JOptionPane.showInputDialog(null, "Ingrese cantidad de pesos:");
				double pesos = 0.00;
				try {
					pesos = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
				}

				if (cambio.equals("Pesos MXN a Euros")) {
					double euros = pesos / 19.8;
					JOptionPane.showMessageDialog(null,
							pesos + "Pesos mexicanos son: " + formatearDivisa.format(euros) + "Euros");
				} else if (cambio.equals("Pesos MXN a Dolares")) {
					double dolares = pesos / 18.05;
					JOptionPane.showMessageDialog(null,
							pesos + "Pesos mexicanos son: " + formatearDivisa.format(dolares) + "Dolares Americanos");
				} else if (cambio.equals("Pesos MXN a Libras Esterlinas")) {
					double libras = pesos / 22.43;
					JOptionPane.showMessageDialog(null,
							pesos + "Pesos mexicanos son: " + formatearDivisa.format(libras) + "Libras Esterlinas");
				} else if (cambio.equals("Pesos MXN a Yenes")) {
					double yen = pesos / 0.13;
					JOptionPane.showMessageDialog(null,
							pesos + "Pesos mexicanos son: " + formatearDivisa.format(yen) + "Yenes Japoneses");
				} else if (cambio.equals("Pesos MXN a Wones")) {
					double won = pesos / 0.014;
					JOptionPane.showMessageDialog(null,
							pesos + "Pesos mexicanos son: " + formatearDivisa.format(won) + "Won surcoreano");
				}
				int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
			}
		}
		if (elige == 1) {
			boolean seguirPrograma = true;
			while (seguirPrograma) {
				String[] opciones = { "Celsius a Fahrenheit", "Fehrenheit a Celsius" };
				int opcion = JOptionPane.showOptionDialog(null, "Eliga una opcion:", "Conversor de Temperatura",
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
				String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor de temperatura");
				double valor = 0.00;
				try {
					valor = Double.parseDouble(valorNominal);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}

				double resultado = 0.00;
				if (opcion == 0) {
					resultado = (valor * 9 / 5) + 32;
					JOptionPane.showMessageDialog(null,
							valor + "Grados Celsius son: " + resultado + " Grados Fahrenheint");
				} else if (opcion == 1) {
					resultado = (valor - 32) * 5 / 9;
					JOptionPane.showMessageDialog(null,
							valor + "Grados Fahrenheint son: " + resultado + " Grados Celsius");
				}
				int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas seguir usando el programa?", "Confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
					seguirPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
			}
		}

	}
}

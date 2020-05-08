import java.util.ArrayList;
import java.util.LinkedList;

import Model.Cuadrado;
import Model.Netflix;
import processing.core.PApplet;

public class Main extends PApplet {

	private LinkedList<Cuadrado> figuras;

	int[][] cuadrados = { { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, }, };

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {

		size(600, 400);
	}

	public void setup() {
		figuras = new LinkedList<Cuadrado>();

		for (int i = 0; i < cuadrados.length; i++) {
			for (int j = 0; j < cuadrados.length; j++) {

				int calculo = cuadrados[i][j];

				figuras.add(new Cuadrado(this, 20 * i, 20 * j, calculo));

				if (cuadrados[i][j] == 0) {

					calculo = 1;

				}
				if (cuadrados[i][j] == 1) {

					calculo = 2;

				}

				if (calculo == 1) {

					this.figuras.get(i).setTipo(1);

				}
				if (calculo == 2) {

					this.figuras.get(i).setTipo(2);

				}

			}

		}
	}

	public void draw() {

		background(200, 200, 200);
		for (int i = 0; i < cuadrados.length; i++) {
			for (int j = 0; j < cuadrados[i].length; j++) {

				figuras.get(i).pintar();

				new Thread(figuras.get(i)).start();

			}
		}

	}

	public void clickPressed() {

		for (int i = 0; i < cuadrados.length; i++) {
			for (int j = 0; j < cuadrados[i].length; j++) {

		if(mouseX >this.figuras.get(i).getPosX(), mouseY> this.figuras.get(i).getPosY(),mouseX< (this.figuras.get(i).getPosX()+this.figuras.get(j).getTam()),
				mouseY < (this.figuras.get(i).getPosY()+this.figuras.get(j).getTam())) {
			
			this.figura.get(i).setValidante = true;
		}
		if(mouseX >this.figuras.get(i).getPosX(), mouseY> this.figuras.get(i).getPosY(),mouseX< (this.figuras.get(i).getPosX()+this.figuras.get(j).getTam()),
				mouseY < (this.figuras.get(i).getPosY()+this.figuras.get(j).getTam()) && this.figura.get(i).getValidante == true)) {
					
					this.figuras.get(i).setTipo(3);
					this.figura.get(i).setValidante = false;
				}
			}
		}
	}

}

package Model;

import processing.core.PApplet;

public class Cuadrado implements Runnable {

	private PApplet app;
	private int posX;
	private int posY;
	private int tam;
	private int tipo;

	private boolean validante;
	private int tipoMov;

	public Cuadrado(PApplet app, int posX, int posY, int tipo) {

		this.app = app;
		this.posX = posX;
		this.posY = posY;

		this.tipo = 0;
		this.tipoMov = 1;

		this.validante = false;
		this.tam = 20;
	}

	@Override
	public void run() {
		while (validante) {

			try {
				Thread.sleep(1000);
				mover();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	public void mover() {
		if (this.tipoMov == 1) {
			this.posY += 20;
			this.tipoMov = 2;
		}
		if (this.tipoMov == 2) {
			this.posY -= 20;
			this.tipoMov = 1;
		}

	}

	public void pintar() {

		if (this.tipo == 1) {

			app.fill(0, 0, 0);
			app.rect(this.posX, this.posY, this.tam, this.tam);
		}
		if (this.tipo == 2) {

			app.fill(255, 255, 255);
			app.rect(this.posX, this.posY, this.tam, this.tam);
		}
		if (this.tipo == 3) {

			app.fill(255, 0, 0);
			app.rect(this.posX, this.posY, this.tam, this.tam);
		}

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isValidante() {
		return validante;
	}

	public void setValidante(boolean validante) {
		this.validante = validante;
	}

	public int getTipoMov() {
		return tipoMov;
	}

	public void setTipoMov(int tipoMov) {
		this.tipoMov = tipoMov;
	}

}

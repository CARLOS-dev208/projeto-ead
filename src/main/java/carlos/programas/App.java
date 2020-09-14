package carlos.programas;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

class App extends JFrame {
	private static final long serialVersionUID = 1L;
	private static int WINDOW_WIDTH = 500;
	private static int WINDOW_HEIGHT = 500;

	private Integer raio;
	public Integer getRaio() {
		return raio;
	}

	public void setRaio(Integer raio) {
		this.raio = raio;
	}

	
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
//		BufferedImage imagem = new BufferedImage(WINDOW_WIDTH, WINDOW_HEIGHT, BufferedImage.TYPE_INT_RGB);
//		drawCircleInImage(imagem, 250, 250, raio, 120, Color.WHITE);
//		g.drawImage(imagem, 0, 0, null);
		
		g.drawRect(200, 200, 10, 10);
	}

	private void desenha( int raio) {
	   setRaio(raio);
	}

	public void drawCircleInImage(BufferedImage imagem, int posicaoCentroX, int posicaoCentroY, int raio,
			int quantidadeDePontos, Color cor) {

		double distanciaEntrePontos = 2 * Math.PI / quantidadeDePontos;

		for (int i = 0; i < quantidadeDePontos; i++) {
			double cos = Math.cos(i * distanciaEntrePontos);
			double sin = Math.sin(i * distanciaEntrePontos);

			int x = (int) (cos * raio + posicaoCentroX);
			int y = (int) (sin * raio + posicaoCentroY);

			imagem.setRGB(x, y, cor.getRGB());
		}
	}

	public static void main(String... args) {
//	int res;
//		Scanner raio = new Scanner(System.in);
//		System.out.print("Informe o raio do circulor: ");
//		res=raio.nextInt();
//		
		
		App app = new App();
		//app.desenha(res);
		
		
		
		
		
	}
}
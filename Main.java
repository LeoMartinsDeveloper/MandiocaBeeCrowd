import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int curupira = 300;
		int boitata = 1500;
		int boto = 600;
		int mapinguari = 1000;
		int iara = 150;
		int donachica = 225;
		
		int cu2 = scan.nextInt();
		int boi2 = scan.nextInt();
		int boto2 = scan.nextInt();
		int map2 = scan.nextInt();
		int iara2 = scan.nextInt();
		
		int resultado = cu2 * curupira + boi2 * boitata + boto2 * boto + map2 * mapinguari
				+ iara2 * iara + donachica;
		
		System.out.println(resultado +  "\n");
		
	}
}

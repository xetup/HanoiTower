import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();

		game.move(game.getTower1(), game.getTower3());
		game.move(game.getTower1(), game.getTower2());
		game.move(game.getTower3(), game.getTower2());
		game.move(game.getTower1(), game.getTower3());
		game.move(game.getTower2(), game.getTower1());
		game.move(game.getTower2(), game.getTower3());
		game.move(game.getTower1(), game.getTower3());

		System.out.print("TOWER1 :   ");
		for (Disk disk : game.getTower1().getDiskStack()) {
			System.out.print(disk.getSize() + "  ");
		}
		System.out.println("\n");
		System.out.print("TOWER2 :   ");
		for (Disk disk : game.getTower2().getDiskStack()) {
			System.out.print(disk.getSize() + "  ");
		}
		System.out.println("\n");
		System.out.print("TOWER3 :   ");
		for (Disk disk : game.getTower3().getDiskStack()) {
			System.out.print(disk.getSize() + "  ");
		}

	}
}

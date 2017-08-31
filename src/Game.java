import java.util.Stack;

public class Game {

	final static int startSize = 3;
	private static Tower tower1 = new Tower();
	private static Tower tower2 = new Tower();
	private static Tower tower3 = new Tower();
	private int moveCounter = 0;

	public Tower getTower1() {
		return tower1;
	}

	public Tower getTower2() {
		return tower2;
	}

	public Tower getTower3() {
		return tower3;
	}

	public Game() {
		init();

	}

	public void init() {
		Stack<Disk> disks = new Stack<>();
		for (int i = startSize - 1; i >= 0; i--) {
			Disk disk = new Disk(i + 1);
			disks.push(disk);
		}

		tower1.setDiskStack(disks);
		tower2.setDiskStack(new Stack<Disk>());
		tower3.setDiskStack(new Stack<Disk>());
	}

	public void move(Tower from, Tower to) {

		if (isValidMove(from, to)) {
			Disk disk = from.getDiskStack().pop();
			to.getDiskStack().push(disk);
			moveCounter++;
			isGameOver();

		}

	}

	public boolean isValidMove(Tower from, Tower to) {
		if (from.getDiskStack().size() == 0) {
			return false;
		}

		else if (to.getDiskStack().size() > 0
				&& from.getDiskStack().peek().getSize() > to.getDiskStack().peek().getSize()) {
			return false;
		}

		return true;

	}

	public boolean isGameOver() {
		if (tower3.getDiskStack().size() == startSize) {
			System.out.println("You WON!");
			System.out.println("You solved this problem with " + moveCounter + " moves.");
			return true;
		}
		return false;
	}
	

}
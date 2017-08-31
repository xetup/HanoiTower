import java.util.Stack;

public class Tower {

	public Stack<Disk> diskStack;

	public Stack<Disk> getDiskStack() {
		return diskStack;
	}

	public void setDiskStack(Stack<Disk> diskStack) {
		this.diskStack = diskStack;
	}

	@Override
	public String toString() {
		return "Tower + diskStack";
	}

}

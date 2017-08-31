
public class Disk implements Comparable<Disk> {

	private int size;

	public Disk(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Disk [size=" + size + "]";
	}

	@Override
	public int compareTo(Disk disk) {
		return size - disk.getSize();
	}

}

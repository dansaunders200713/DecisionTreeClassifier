
public class Variable implements Comparable {
	int index;
	double info;
	double gain;
	
	public Variable(int index) {
		this.index = index;
	}
	
	public int compareTo(Object o) {
		Variable other = (Variable)o;
		if (this.gain == other.gain) {
			return 0;
		}
		if (this.gain > other.gain) {
			return 1;
		}
		return -1;
	}
	
	public String toString() {
		return this.index + " ";
	}
}

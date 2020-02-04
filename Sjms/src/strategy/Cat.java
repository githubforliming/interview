package strategy;

public class Cat  implements MyComparable<Cat>{
	private int weight;
	
	// 带参数构造
	public Cat(int weight) {
		this.weight = weight;
	}
	public int compareTo(Cat cat) {
		if (this.weight < cat.weight) {
			return -1;
		} else if (this.weight > cat.weight) {
			return 1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Cat [weight=" + weight + "]";
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	 
}

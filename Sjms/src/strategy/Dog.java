package strategy;

public class Dog implements MyComparable<Dog> {

	private float tz;
	
	public Dog(float tz) {
		this.tz = tz;
	}
	public int compareTo(Dog t) {
		if(this.tz  < t.tz) {
			return -1;
		} else if (this.tz > t.tz) {
			return 1;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Dog [tz=" + tz + "]";
	}

 
}

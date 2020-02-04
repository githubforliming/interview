package strategy;

public class CatComparatorTwo implements MyComparator<Cat> {

	@Override
	public int compare(Cat t1, Cat t2) {
		 if (t1.getWeight() >t2.getWeight()) {
			 return -1;
		 } else if (t1.getWeight() < t2.getWeight()) {
			 return 1;
		 } else {
			 return 0;
		 }
	}

}

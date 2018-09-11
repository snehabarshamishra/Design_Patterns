package after;

import collectionsapi.ArrayList;
import collectionsapi.Collection;




public class DecoratorClient {

	
	public static void main(String[] args) {
		
		
		Collection real = new ArrayList();
		AdditionCountingCollection decorator = new AdditionCountingCollection(real);
		
		decorator.add(123);
		decorator.add(234);
		decorator.remove(234);
		System.out.println(decorator.size());
		System.out.println(decorator.getCount());

	}

}

package com.jbk;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
	
		public static void main(String[] args) {
			Vector<String> vv=new Vector<>();
			vv.add("23");
			vv.add("67");
			
			
			
			
			
			//Iterator
			System.out.println("Iterator");
			
			Iterator<String> itr= vv.iterator();
			while(itr.hasNext()){
				vv.add("3");
				System.out.println(itr.next());
			}

}
}

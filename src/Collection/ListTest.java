package Collection;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import com.sun.org.apache.xml.internal.security.Init;

public class ListTest {
	
	public static void remove(ArrayList<String> list) 
    {
        Iterator<String> it = list.iterator();
        
        while (it.hasNext()) {
            String str = it.next();
            
            if (str.equals("b")) {
                it.remove();
            }
        }
        
        
    }
	
	public static void testStream() {
//		Stream<T>
	}

	public static void test() {
		BitSet bSet = new BitSet();
		bSet.set(4);
		bSet.set(9);
		for (int i = 0; i < 10; i++) {
			System.out.println(bSet.nextClearBit(i));
		}
		
	}
	
	public static void removeFor(ArrayList<String> list) 
    {
        for (String s : list)
        {
            if (s.equals("b")) 
            {
            	list.remove(s);
            }
        }
//        list.removeIf(filter)
    }
	
	public static void main(String[] args)
    {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("a");
//        list.add("a");
//        list.add("b");
//        list.add("b");
//        list.add("c");
//        list.add("c");
//        remove(list);// 删除指定的“b”元素
//
//        for(int i=0; i<list.size(); i++)
//        {
//            System.out.println("element : " + list.get(i));
//        }
		ListTest listTest = new ListTest();
		listTest.test();
    }

}

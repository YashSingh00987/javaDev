package yash.learn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Name{
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Name> list = new ArrayList<>();
		list.add(new Name("yash"));
		list.add(new Name("madhav_khandelwal"));
		list.add(new Name("akash"));
		list.add(new Name("chirag"));
		list.add(new Name("mohit_jalan"));
		
		
		Collections.sort(list,(Name o1, Name o2)->{
			if(o1.getName().length()<o2.getName().length()) {
				return -1;
			}else if(o1.getName().length()>o2.getName().length()) {
				return 1;
			}
			else {
				return 0;
			}
		});
		
		list.forEach(temp->System.out.println(temp.getName()));

		

	}

}

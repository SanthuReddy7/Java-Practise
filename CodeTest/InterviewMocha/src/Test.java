/*import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Foo> myFooSet = new HashSet<Foo>();
		myFooSet.add(new Foo(2));
		myFooSet.add(new Foo(1));
		myFooSet.add(new Foo(3));
		myFooSet.add(new Foo(3));
		myFooSet.add(new Foo(2));
		System.out.print(myFooSet.size());

}
}
class Foo{
	Integer code;
	Foo(Integer c){
		code=c;
	}
	public boolean equals(Foo f){
		return false;
		
	}
}
*/

public class Test{
	public static void main(String args[]){
		int x=1;
		int y=0;
		while(++x<5)y++;
		System.out.println(y);
	}
}
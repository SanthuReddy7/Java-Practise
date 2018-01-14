import java.lang.reflect.Constructor;

public class Ex {
	/*int x;
	 void cal(int item){
		x=item*item;
	}*/
	
public static void main(String[] args) {
	/*int x=20;
	String sup = (x<15)?"small":(x<22)?"tiny":"huge";
	System.out.println(sup);
*/
/*Locale obj = new Locale("ENGLISH","AMERICA");
System.out.println(obj.getCountry());*/
	
	/*Ex e = new Ex();
	e.x=0;
	e.cal(2);
	System.out.println(e.x);*/
	
	try{
		Class c =Class.forName("java.awt.Dialog");
		Constructor myconarr[]= c.getConstructors();
		for(int i=0;i<myconarr.length;i++)
			System.out.println(myconarr[i]);
		}
	catch(Exception e){
		System.out.println("Exception");
		
	}

}
}

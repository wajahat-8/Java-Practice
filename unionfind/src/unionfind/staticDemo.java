package unionfind;

class Main{
	int eid;
	int salary;
	static String ceo;
	static {//this will executed when you load a class
	ceo="larry";
	}
	Main(){//this constructor will executed when you crate object
		eid=1;
		salary=100;
	}
	
	void show() {
		System.out.println(eid+":"+salary+":"+ceo);
	}
}
public class staticDemo {

	public static void main(String[] args) {
		Main Ali=new Main();
//		Ali.eid=8;
//		Ali.salary=400;
//		Ali.ceo="Ahmed";
		Main Ahmed=new Main();
//		Ahmed.eid=9;
//		Ahmed.salary=500;
//		//It is preferred to use className for static variables
//		Main.ceo="Wajahat";
		Ali.show();
		Ahmed.show();

	}

}
//We don't need object to call static method

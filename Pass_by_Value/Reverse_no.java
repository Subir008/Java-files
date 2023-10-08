package Pass_by_Value;

class Rever{
	void rev(int no){
		int reve = 0;
		while (no != 0) {
			int rem = no % 10;
			reve = (reve * 10) + rem;
			no = no / 10;	
		}	
		System.out.println(reve);
	}
}

public class Reverse_no {

	public static void main(String[] args) {
		Rever r1 = new Rever();
		r1.rev(549);

	}

}

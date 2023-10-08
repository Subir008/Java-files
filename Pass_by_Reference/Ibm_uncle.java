package Pass_by_Reference;

class Ibm_aunty{
	void job() {
		System.out.println("Software Job");
	}
}


public class Ibm_uncle {

	public static void main(String[] args) {
		Ibm_aunty i = new Ibm_aunty();
		Dinga.needjob(i);
		Dinga.needjob(i);

	}

}

class Dinga{
	static void needjob(Ibm_aunty i) {
		i.job();
	}
}

class Dingi{
	static void needjob(Ibm_aunty i) {
		i.job();
	}
}
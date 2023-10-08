package Method_Overridding;

class Image{
	void uses() {
		System.out.println("Taking simple picture only");
	}
}

class Image1 extends Image{
	void uses() {
		super.uses();
		System.out.println("Take video, portrait, panorama");
	}
}

public class Camera {

	public static void main(String[] args) {
		Image1 i1 = new Image1();
		i1.uses();

	}

}

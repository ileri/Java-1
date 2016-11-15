public class NonStatik{
	public void cevap(){
		System.out.println("Cevap...");
	}
	public static void main(String args[]){
		NonStatik soru = new NonStatik();
		soru.cevap();
	}
}

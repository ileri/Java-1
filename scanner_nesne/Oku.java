import java.util.Scanner;
public class Oku{
	public static void main(String args[]){
		String ad;
		int yas;
		Scanner oku = new Scanner(System.in);
		System.out.printf("Adınızı giriniz: ");
		ad = oku.nextLine();
		System.out.printf("Yaşınızı girin: ");
		yas = oku.nextInt();
		System.out.printf("Sayın %S , Dünya %d yıldır sizinle daha güzel bir yer :)\n",ad,yas);
	}
}

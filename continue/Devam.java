public class Devam{
	public static void main(String args[]){
		int j = 0;
		System.out.printf("Merhaba Dünya\n");
		etiket:
		for(int i=0; i < 100 ; i++){
			System.out.printf("i = %d\n",i);
			j++;
			if( i == 2 ){
				continue etiket;
			}
			if( i == 5 ){
				System.out.println("Dayanamıyorum... Yeteeeer");
				break etiket;
			}
			System.out.printf("Bir şeyler daha yapayım...\n");
			if( j == 10 ){
				System.out.printf("Ooo j çoktan 5 olmuş, hadi ben kaçar...\n");
				break;
			}
		}
		System.out.println("Oooo , hayırlı olsun, döngüden çıkmışsın ;)");
	}
}

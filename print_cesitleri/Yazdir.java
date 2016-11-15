public class Yazdir{
	public static void main(String args[]){
		System.out.print("Merhaba Dünya\n");
		System.out.printf("%d kere Merhaba Dünya\n", 10);
		System.out.println("Yine yeni ve yeniden Merhaba Dünya");
		System.out.printf("%5.2s\n","merhaba");
		//5 karakterlik yer ayır, sağdan 2. karakterden itibaren yaz
		System.out.printf("%2$s\n","deneme","iki","üç","dört");
		System.out.printf("%2$d\n",111,222,333,444,555);
		// n. değişkeni yazdırmak için %n$(s|d|f|...)
		System.out.printf("%2$10.7S\n","merhaba","dünya","naber","nasılsın");
		// %s = Olduğu gibi yaz
		// %S = Hepsini büyük harfe çevirip yaz
	}
}

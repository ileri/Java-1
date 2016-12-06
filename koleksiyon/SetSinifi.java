import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class SetSinifi {
	
	public static int ilkIndis(LinkedList<String> liste, String aranan){
		for(int i = 0; i < liste.size(); i++){
			if(liste.get(i).equals(aranan)){
				return i;
			}
		}
		return -1;
	}
	
	public static int sonIndis(LinkedList<String> liste, String aranan){
		for(int i = liste.size(); i > 0 ; i--){
			if(liste.get(i-1).equals(aranan)){
				return i-1;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		//Heşset
		HashSet<String> hs = new HashSet<String>();
		hs.add("Elma");
		hs.add("Kiraz");
		hs.add("Armut");
		hs.add("Uzum");
		hs.add("Uzum"); //Aynı elemanı eklemiyor
		System.out.println(hs); //Yazarken rastgele yazdırıyor.
		hs.remove("Uzum");
		System.out.println(hs);
		hs.remove("Kiraz");
		System.out.println(hs);
		
		//Tıriiset
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(3);
		ts.add(5);
		ts.add(7);
		ts.add(9);
		ts.add(9); // Aynı eleman iki kere eklenmez
		System.out.println(ts); //Treeset sıralı yazdırılır
		ts.remove(1);ts.remove(9);
		System.out.println(ts);
		
		//TreeSet Iterator
		Iterator<Integer> i = ts.iterator();
		while(i.hasNext()){
			System.out.println("Sıradaki eleman:" + i.next());
			i.remove();
			System.out.println("Seçili eleman silindi.");
		}
		
		//HashSet Iterator
		Iterator<String> j = hs.iterator();
		while(j.hasNext()){
			System.out.println("HashSet teki sıradaki eleman: " + j.next());
			j.remove();
			System.out.println("Seçili eleman silindi");
		}
		
		// Listeler
		//LinkedList
		LinkedList<String> linked1 = new LinkedList<String>();
		LinkedList<String> linked2 = new LinkedList<String>();
		linked1.add("Merhaba");
		linked1.add("Dunya");
		linked1.add("Naber");
		linked1.add("Nasılsın");
		linked2.add("Sana");
		linked2.add("da");
		linked2.add("Merhaba");
		linked2.add("Iyiyim");
		linked2.add("Elhamduillah");
		linked1.add(0,"Selamun Aleykum"); //Add komutuna indis verirsek verilen indise ekler, sonrakileri kaydırır
		System.out.println("linked1:" + linked1);
		System.out.println("linked2:" + linked2);
		linked1.addAll(linked2);
		System.out.println("linked1:" + linked1);
		linked2.clear();
		System.out.println("linked2:" + linked2);
		System.out.println("linked1'in 3. elemanı:" + linked1.get(2));
		linked1.set(8,"Allah'a şükürler olsun");
		System.out.println("linked1:" + linked1);
		
		//LinkedList Yazdır
		Iterator<String> k = linked1.iterator();
		while(k.hasNext()){
			System.out.print(k.next() + " ");
		}
		System.out.println();
		System.out.println("linked1 de ilk \"Merhaba\" 'nın indisi:" + ilkIndis(linked1,"Merhaba"));
		System.out.println("linked1 de son \"Merhaba\" 'nın indisi:" + sonIndis(linked1,"Merhaba"));
		
		//Kuyruk - Queue
		Queue<String> kuyruk = new LinkedList<String>();
		kuyruk.offer("Pisa Kulesi");
		kuyruk.offer("Veliağa Hipodromu");
		kuyruk.offer("Eyfel Kulesi");
		System.out.println("kuyruk:" + kuyruk);
		System.out.println("kuyruktan silinen eleman:" + kuyruk.poll());
		System.out.println("poll uygulanmış kuyruk:" + kuyruk);
		
		//Yığıt - Stack
		Stack<String> yigit = new Stack<String>();
		yigit.push("Paris");
		yigit.push("Londra");
		yigit.push("Venedik");
		yigit.push("Çorum");
		yigit.push("New York");
		yigit.push("Mardin");
		System.out.println("yigit:" + yigit);
		System.out.println("yigitten silinen eleman:" + yigit.pop());
		System.out.println("yigit:" + yigit);
		System.out.println("yigitteki son eleman:" + yigit.peek());
		System.out.println("yigit:" + yigit);
	}
}

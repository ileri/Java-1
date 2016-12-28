# Java-1

Java bir programlama dili ve sistem platformudur.

Java kodları derlendiğinde **bytecode** denilen bir ara formata dönüşür.

Java'nın platform bağımsız olması **bytecode** sistemi sayesindedir.

İşletim sisteminin üzerine kurulan **Java Virtual Machine** bu bytecode ları yorumlar.

### JAVA
~~~
|
|-> JDK - Java Development Kit
|-> JRE - Java Runtime Environment
|-> JVM - Java Virtual Machine
~~~


JDK'nın içindeki temel programlar:
~~~
|
|-> javac.exe (Java Derleyicisi)
|-> java.exe (Java Yorumlayıcısı)
~~~

### JDK > JRE > JVM

Java programlarken oluşturulan dosyanın adı sınıf adıyla aynı olmak zorundadır ve uzantısı *.java* olmalıdır.

Java'da bir class'ın derlenebilmesi için o class main metoduna sahip olmalıdır.

Java programları çok kısa dahi olsa class içinde yazılmalıdır.


### Veri Tipleri

#### Tamsayılar: byte , short , long , int

 byte: En küçük tamsayı tipidir. -2^(7) ile (2^(7))-1 arasında değerler alır. Bellekte **8 bit** yer kaplar.

 short: -2^(16) ile (2^(16))-1 arasında değerler alır. Bellekte **16 bit** yer kaplar.

 int: -2^(32) ile (2^(32))-1 arasında değerler alır. Bellekte **32 bit** yer kaplar.

 long: -2^(63) ile (2^(63))-1 arasında değerler alır. Bellekte **64 bit** yer kaplar.

#### Ondalıklı Sayılar: float , double

 float: Bellekte **32 bit** yer kaplar. **Virgülden sonra 7 haneye kadar** duyarlıdır. Tek duyarlı ondalıklı sayı olarak da bilinir.

 double: Bellekte **64 bit**  yer kaplar. **Virgülden sonra 17 haneye kadar** duyarlıdır. Çift duyarlı ondalıklı sayı olarak da bilinir.

#### Karakterler

 char: Bellekte **16 bit** yer kaplar. Karakterleri tutar.

#### Mantıksal Tipler

 boolean: **true** - **false**


### Sayı Sistemleri

#### Decimal - Onluk Taban
0 1 2 3 4 5 6 7 8 9

Her basamak 10 un n. üssüyle çarpılıp toplanır.

#### Octal - Sekizli Taban
0 1 2 3 4 5 6 7

Her basamak 8 in n. üssüyle çarpılıp toplanır.

#### HexaDecimal - Onaltılı Taban

Tüm sayılar HexaDecimal olduğunu belirtmek için **0x** ile başlar.

**0x** den sonraki sayılarda

0 1 2 3 4 5 6 7 8 9 A B C D E F

sayıları

A = 10  -  B = 11  -  C = 12  -  D = 13  -  E = 14  -  F = 15

e eşittir.

#### Float - Double Tanımlama

0.25 değerinde bir float tanımlamak için:

~~~java
.25f
.25F
0.25f
0.25F
~~~

0.25 değerinde bir double tanımlamak için:

~~~java
.25d
.25D
0.25d
0.25D
0.25
.25
25E-2
~~~

**Not:** Noktalı bir sayının sonuna f,F,d,D konulmazsa **double** olarak atanır.

**Not:** Noktalı sayıyı yazarken **xyE-z** şeklinde yazılırsa E 10 üzeri anlamına gelir.(xy)^(-z) .
İçinde E geçen bir sayı double olarak tanımlanır.

**Not:** Karakterler tek tırnak içerisine yazılır.
~~~java
char a = '3';
~~~

**byte , short , int , long , float , double , char , boolean haricindeki TÜM VERİ TİPLERİ "Referans Veri Tipi" dir.**

Örn: String , Array , Classlar ...


### String

String karakter dizisidir. Referans Veri Tipidir. **Değişmez** bir veri tipidir.

~~~java
String s1 = "Merhaba";
String s2 = "Java";
String s3 = s1 + " " + s2;
System.out.println(s3);
// Merhaba Java
~~~

### Sınıf - Nesne

**Sınıf:** Sınıflar Java'nın temel programlama elemanlarıdır.Her sınıf bir veri tipidir.

**Nesne:** Bir sınıf tanımladığımızda yeni bir veri tipi oluşturmuş oluruz. Bu veri tipinden oluşturulan değişkene de **nesne** denir.

Örneğin **musteri** adında bir **class** tanımlayıp **musteri** tipinde **musteri1** diye bir değişken oluşturursak **musteri1** bir **nesne**dir.

#### Nesne Oluşturma Şablonu

~~~java
class_adi referans_adi = new sinif_adi();
~~~

Yukarıda **class_adi** tipinde **referans_adi** isimli bir **nesne** oluşturduk.

### final - Sabit Tanımlama
Java'da final deyimini kullanarak sabit değer tanımlayabiliriz.

final ile tanımlamayı metodun dışında yapıyorsak ilk değer atama zorunludur.

final ile tanımlamayı metod içinde yapıyorsak ilk değersiz tanımlayabiliriz.

Her iki durumda da sadece 1 defa değer alır. Sonraki değer atamalarında hata verir.

~~~java
class Sabit{
	static final double pi = 3.14;

	public static void main(){
		final double avagadro;
		avagadro = 6.02E-23;
	}
}
~~~

### Ekrana Basma Çeşitleri

#### System.out.print(...); -> Düz Yazdır
#### System.out.printf(...); -> Formatlı Yazdır
#### System.out.println(...); -> Yaz bitir, alt satıra geç

Kullanım örnekleri:
~~~java
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
~~~
Çıktısı:
~~~bash
Merhaba Dünya
10 kere Merhaba Dünya
Yine yeni ve yeniden Merhaba Dünya
   me
iki
222
     DÜNYA
~~~

### Argüman

~~~java
main(String args[]){
	args[0] = İlk parametre
	args[1] = İkinci parametre
	.
	.
	.
}
~~~

## Giriş - Çıkış İşlemleri

### Scanner

~~~java
import java.util.Scanner;
~~~

satırı dosyanın başına eklenir.

#### Scanner Nesnesi Oluşturma

~~~java
Scanner okuyucu = new Scanner(System.in);
degisken = okuyucu.metod_adi
~~~

Scanner nesnesi için temel metodlar şunlardır:

~~~java
nextInt(); int e çevirip oku
nextByte(); byte e çevirip oku
nextBoolean(); boolean'a çevirip oku
nextFloat(); float'a çevirip oku
nextDouble(); double a çevirip oku
next(); Boşluğa kadar olan yeri String olarak oku
hasNext(); Okunacak şey var mı kontrol et
nextLine(); Satır oku
~~~

## İletişim Kutuları

~~~java
import javax.swing.JOptionPane;
~~~

satırı kodun başına eklenir.

~~~java
String bilgi = JOptionPane.showInputDialog(null,"Mesaj","Baslik",icon_numarasi);
// GUI ile String tipinde Girdi almaya yarar

JOptionPane.showMessageDialog(null,"Mesaj","Baslik",simge_no);
// GUI ile Mesaj göstermeye yarar
~~~

## Değişkenlerin İnce Noktaları

Class içinde tanımlanan bir değişkenin yani **Nesne Değişkenlerinin**
 ilk değer ataması zorunlu değildir.
Yani class içinde tanımlanan **nesne değişkeni** ilk değersiz tanımlanabilir.

Ancak yine de bu değişkenlerin aslında bir ilk değerleri vardır.
~~~
public class Duck
  int a; // a = 0
  float b; //b = 0.0
  ...
~~~

Herhangi bir metodun içinde tanımlanan **Yerel Değişkenler** için ise
ilk değer ataması zorunludur.

İlk değeri atanmayan bir yerel değişken **Hatalıdır**

Değişkenler bulunduğu bloğun parantezleri arasında geçerlidir.

***Java'da aynı değişken 2 kere TANIMLANAMAZ***

## Değişkenlerin Depolanması

Değişkenler Bellekte 2 şekilde depolanır.

~~~
|
|-> Stack ( Yığın )
|-> Heap
~~~

**Yığın**: RAM'de Stack halinde tutulur. Değişkenler üst üste yığılır.
İşi biten değişken silinir.

**Heap**: new Anahtarı ile oluşturulan nesneler Heap 'da depolanır. Stack'a
göre yavaştır.

new Anahtarı ile bir nesne oluşturduğumuzda bu nesne 2 parçadan oluşur.

1 - **Referans** : Stack'te tutulur. İlgili değişkenin heap daki adresini tutar.
2 - **Heap Nesnesi**: Heap'da tutulur. Asıl bilgiler burada depolanır.

***Referans ile Nesne arasındaki bağlantı koparsa bu ilişki bir daha kurulamaz.
Heap taki nesne artık bir çöptür. Erişimi mümkün değildir.***

Örneğin aşağıdaki gibi bir kod yazdığımızda:

~~~java
public class Bellek{
  public void foo(){
    bar();
  }
  public void bar(){
    Duck d = new Duck();
  }
}
~~~
Bellekte aşağıdaki gibi tutulur:
~~~
[bar() d]-|---------------|
[foo()  ] |               |
[  ...  ] |               v
[  ...  ] |              /---\
[  ...  ] |             |  d  |
[  ...  ] |              \---/
[  ...  ] |               Duck
[  ...  ] |
|________| |____________________|
  STACK             HEAP
~~~

## GARBAGE COLLECTOR (Çöp Toplayıcı)
Referansı olmayan nesneler bellekte gereksiz yer kaplamaktadır.

Java bu nesnelerin belleği gereksiz işgalini önlemek için Çöp Toplayıcı
 sistemine sahiptir.

Çöp Toplayıcı belli aralıklarda devreye girerek heap'taki referansı olmayan
nesneleri bellekten siler.

Bir nesne silinmeden hemen önce o nesnenin ***finalize()*** fonskiyonu
çağırılır.

Bir nesnenin finalize() fonksiyonunu değiştirirsek, ilgili türden bir nesne
silindiğinde finalize() fonksiyonun içindeki komutlar çalıştırılır.

~~~java
System.gc
~~~
komutu ile istediğiniz anda Çöp Toplayıcıyı devreye sokabiliriz.

## Paketler

Kendi paketimizi tanımlamak için kodun başına
~~~java
package paketismi;
~~~
şeklinde bir satır ekleriz.Örneğin:
~~~java
package paket;
  public class deneme{
    public static void main(String args[]){
      ...
    }
  }
~~~
kodu ile paket isimli kendi paketimizi oluşturmuş olduk.

### Paket Import Etme

~~~java
import paketAdi.sinifAdi;
~~~
şeklinde bir komutla istediğimiz bir paketteki istediğimiz bir sınıfı import
edebiliriz.

## Nesne Üyelerine Erişim
***public*** : Açık, farklı paket ve sınıflardan erişilebilir.
Farklı bir paketten erişmek için o paket import edilmelidir.

***private*** : Özel, sadece kendi sınıfından erişilebilir.

***protected*** : Aynı paket ve sınıftan erişilebilir. Farklı paketten
sadece kalıtımla oluşturulanlar erişebilir.

Aynı class'ın içindeki **static** metodlar sadece adıyla çağırılabilir.

Farklı class'ın içindeki metodlar ***sinifAdi.metodAdi()***
şekline çağrılabilir.

### Static Metodlar
Static metodlar bulunduğu sınıfın içerisindeki herhangi bir fonksiyon tarafından
yeni bir nesne oluşturmaya gerek kalmadan çağırılabilir.
***Static vs Static Olmayan***
~~~java
//STATIC FONKSİYON ÖRNEĞİ
public class Soru{
  public static void cevap(){
    ...
  }
  public static void main(String args[]){
    cevap();
  }
}
~~~
~~~java
//STATIC OLMAYAN FONKSİYON ÖRNEĞİ
public class Soru{
  public void cevap(){
    ...
  }
  public static void main(String args[]){
    Soru yeniSoru = new Soru();
    yeniSoru.cevap();
  }
}
~~~
***Püfffffff Nokta***

Bir karar verme cümlesinde (if, while, ... ) bakılan mantıksal karşılaştırma
işlemlerinde Java en kısa yolu tercih eder.

Örneğin bir && karşılaştırmasında ( a && b ) eğer a 'nın 0 olduğu biliniyorsa
b ye hiç bakılmaz , çünkü AND işleminde bir elemanın 0 olması sonucun 0 olmasını
sağlar.

Aynı şekilde bir || karşılaştırmasında ( c || d ) eğer c 'nin değerinin 1 olduğu
biliniyorsa d ye hiç bakılmaz. çünkü OR işleminde bir elemanın 1 olması sonucun
1 olmasını sağlar.

## Object

Java'da temel veri tiiplerinin tutulduğu ana class ın adı Object tir.

Object class ı tüm veri tiplerini içinde barındırır.

Object tipindeki bir nesne oluşturulduğunda tüm veri tiplerinden bilgi
barındırabilir.

Object arraylarının farklı elemanları farklı veri tipleri olabilir.


## Diziler

Diziler nesnedir.

Diziler içinde belli sayıda eleman bulundurur.

Dizi indisi 0 dan başlar.

Dizi elemanları aynı türden olmalıdır.

n elemanlı dizide n+1 . eleman çağırılırsa bytecode a çevirirken hata vermez.
Ancak çalışırken hata verir. Yani **RUNTIME ERROR ( Çalışma Zamanı Hatası )**
verir.

Dizinin eleman sayısını bulmak için diziAdi.length fonksiyonu kullanılır.

### Dizi Türündeki Referanslar
~~~java
double[] dd; // double tipi dizi referansı tanımlama
double dd[]; // double tipi dizi referansı tanımlama
~~~
Yukarıdaki kodda **sadece referanslar tanımlandı**,
henüz **Nesneler oluşturulmadı!**

### Dizi Nesnesi Oluşturma
~~~java
double[] dd = new double[20];
double dd[] = new double[20];
Object kutu[] = new Object[20];
~~~

### Temel Tiplerden Oluşan Diziler
~~~java
double dizi[] = {1.1,2.2,3.3,4.4}; //Doğru bir kullanım
~~~

~~~java
double dizi[];
dizi = {1.1,2.2,3.3,4.4}; // HATALI!
~~~

~~~java
double dizi[];
dizi = new double[]{1.1,2.2,3.3,4.4}; //Doğru bir kullanım
~~~

~~~java
double dizi[] = new double[3];
dizi[0] = 1.1;
dizi[1] = 2.2;
dizi[2] = 3.3;
~~~

### Nesnelerden Oluşan Diziler
Diziler sadece temel veri tipinden bilgiler tutabilir veya dizilerin
elemanları aynı tipten oluşmalıdır gibi bir zorunluluk yoktur.

Bir nesne arrayı o nesne türünden değerler tutabilir.

Object nesnesi de tüm nesneleri içerdiği için object arrayları tüm veri
tipinden elemanlar içerebilir.

~~~java
Object[] kisi = new Object[4];
dizi[0] = 1;
dizi[1] = "Mehmet"
dizi[2] = 8.2;
dizi[3] = dizi[0] + 2; // Bu satır (Object + int) olduğu için hata verir
~~~

***Object arraylarının farklı elemanları farklı veri tipleri olabilir.***

### Dizilerde Nesne - Referans İlişkisi
~~~java
int liste[] = new int[5];
liste[0] = 1; liste[1] = 3; liste[2] = 8;
//Liste şu anda: [1,3,8]
liste = new int[15];
//Liste şu anda: []
~~~
Yukarıdaki örnekte yeni bir nesne tanımladık ve artık liste referansı yeni
oluşturulan nesneye işaret ediyor. Eski listenin içindekileri kaybettik.
Eski nesne artık bir ÇÖP!

### Çok Boyutlu Dizi
Dizi içindeki dizilerden oluşur.Birçok dizi iç içe olabilir.
~~~java
int[][] dizi = {{1,2,3},{2,3,4}}; //DOĞRU
int[][] dizi = new int[3][4]; //DOĞRU
int[][] dizi = new int[3][]; //DOĞRU
int[][] dizi = new int[][3]; //YANLIŞ!
int[][][][][][][][][][] dizi = int[a][b][c][d][e][f][g][h][i][j];
//Yukarıda a,b,c,d,e,f,g,h,i belirtilmesi zorunludur. j ise opsiyoneldir.
//Yani sadece en içteki dizinin boyutu belirsiz olabilir.
~~~

## Koleksiyonlar
Koleksiyonlar içinde birçok öğeyi barındıran bir nesnedir.

Koleksiyonları kullanabilmek için ilgili kütüphaneyi import etmeliyiz.

### Koleksiyonların Avantajları
Verileri bir araya toplamamızı ve veriler üzerinde işlem yapmamızı kolaylaştırır.

Yazılımcı koleksiyon sınıfı içerisinde yer alan algoritmaları kullanrak yeni algoritma yazmak zorunda kalmaz.

Yazılımcıya uygulamanın performansını artıran kullanışlı algoritma ve veri yapıları sağlar.

Belli bir boyutları yoktur. İçerisine veri ekleyip çıkardıkça boyutları değişir. Yani yazılımcının önceden koleksiyonu boyutlandırmasına gerek yoktur.

### Koleksiyon Türleri
Koleksiyonları **Set** ve **List** olarak ikiy türe ayırabiliriz.

### List
**List** nesnelerden oluşan topluluktur.

List içerisinde aynı değerde birden fazla eleman bulunbilir.
Yani **dublikasyona** izin verilir.

List teki elemanların belli bir sıralaması vardır.

Stack, Arraylist, Vector, LinkedList türleri de List sınıfından türetilmiştir.

#### List Fonksiyonları

add - Listeye eleman ekle

addAll(Collection c) - Belirtilen koleksiyonun tüm elemanlarını listeye ekle

clear - Listeyi temizle

get(i) - İndisi belirtilen öğeyi getir

set(i,b) - b elemanını i indisli yere yerleştir.(O indiste eleman varsa o silinerek yerine bu eklenir.Kaydırma yapılmaz!)

indexOf() - Aranan elemanın indisi. Yoksa -1 döndürür

lastIndexOf() - Aranan elemanın en son bulunduğu indir. Yoksa -1 döndürür

remove(i) Belirtilen indisteki elemanı listeden kaldırır.

size() - Listenin eleman sayısını verir.

toArray() - Listeyi diziye dönüştürür.

#### LinkedList
~~~java
LinkedList <Tip> degisken_adi = new LinkedList <Tip>();
~~~

Linked List Örneği:
~~~java
import java.util.*;
public class BagliListe {
  public static void main(String[] args) {
    LinkedList<String> liste = new LinkedList <String>();
    liste.add("Portakal");
    liste.add("Limon");
    liste.add("Mandalina");
    liste.add("Armut");
    liste.add("Mandalina");
    liste.add("Elma");
    System.out.println("İlk liste = " + liste);
    liste.add(4, "Ayva");
    System.out.println("Değişen liste = " + liste);
    System.out.println("ilk öğe = " + liste.getFirst());
    System.out.println("6.nci öğe = " + liste.get(6));
    System.out.println("silinen = " + liste.removeFirst());
    System.out.println("silinen = " + liste.removeLast());
    System.out.println("Liste son hali = " + liste);
  }
}
~~~

#### Queue ( Kuyruk )

Kuyrukta **FIFO** mantığı vardır. Yani ilk eklenen eleman listeden ilk çıkarılacak olan elemandır. Gerçek hayattaki kuyruk sisteminden adını almıştır.
~~~java
Queue <String> kyrk = new LinkedList <String>();
~~~

***Kuyruk İşlemleri:***

element() - En baştaki elemanı verir

offer() - Kuyruğa yeni eleman ekler

peek() - Kuyruğun başındaki elemanı döndürür. Kuyruk boşsa **null** döndürür

poll() -Kuyruğun başındaki elemanı döndürür ve **siler**. Kuyruk boşsa **null** döndürür

remove() - Kuyruğun önündeki nesneyi siler ve döndürür

size() - Kuyruktaki eleman sayısı

clear() - Kuyruğu temizle

~~~java
//Kuyrukta bekleyen 4 kişiyi FIFO mantığı ile kuyruktan çıkaran program
import java.util.*;
class Kuyruk {
  public static void main(String[] args) {
    Queue <String> kyrk = new LinkedList<String>();
    kyrk.offer("Bade");
    kyrk.offer("Zehra");
    kyrk.offer("Fatih");
    kyrk.offer("Hakan");
    System.out.println("Kuyruktan çıkartılıyor");
    while (!kyrk.isEmpty())
    System.out.print(kyrk.remove() + " ");
  }
}
~~~

### Set

Setlerde sıra yoktur.

**Duplikasyona** izin **VERİLMEZ!**

Kümede bir öğenin yeri belirsizdir.

Kümenin öğeleri sıralı olmadığı için, yeni gelen bir öğeyi kümede belirli bir konuma yerleştiremeyiz.

Aynı nedenle, bir öğe yerine başka bir öğe koyamayız (replacement olamaz). Ama, istenen öğe kümeden silinebilir ve istenen öğe kümeye eklenebilir.

Kümedeki öğelere erişmek (retrieving) mümkündür, ama erişim sırası belirsizdir.

#### HashSet
~~~java
HashSet <String> diziAdi = new HashSet <String>();
~~~
#### TreeSet
~~~java
TreeSet <String> diziAdi= new TreeSet <String>();
~~~

~~~java
import java.util.*;
public class HashSet01 {
  public static void main(String[] args) {
    HashSet <String> hs = new HashSet <String>();
    hs.add("Bursa");
    hs.add("Ankara");
    hs.add("Malatya");
    hs.add("Diyarbakır");
    hs.add("Muğla");
    hs.add("Ankara"); // Hashset çift veriye izin vermez
    System.out.println("illerin Sırasız hali");
    System.out.println(hs);
    System.out.println("illerin Sıralı hali");
    TreeSet <String> siraliKume= new TreeSet <String> (hs);
    System.out.println(siraliKume);
  }
}
~~~

Yukarıdaki örnek kodun çıktısı şu şekilde olacaktır:

~~~
illerin Sırasız hali
[Bursa,Malatya,Ankara,Muğla,Diyarbakır]
illerin Sıralı Hali
[Ankara,Bursa,Diyarbakır,Malatya,Muğla]
~~~

Burada dikkat edilmesi gereken nokta Set kolleksiyon tipinin dublikasyona izin vermediği için aynı eleman add komutuyla iki kere eklenmeye çalışıldığı halde setlerde sadece bir tane bulunuyor.

### Iterator

IIterator, elemanlar arası istenilen yönde ilerlemek için kullanılır. Üç temel yöntemi vardır:

next() - Bir sonraki elemanı çağırır.

hasNext() - Bir sonraki eleman var mı kontrol eder, bool olarak sonuç döner

remove() - Döndürülen son elemanı siler.

~~~java
Iterator degisken = list_değişkeni.iterator();
~~~

## Özel For Döngüsü
Dizi elemanları üzerinde dolaşmak için bir indis değişkeni kullanmak zorunda değiliz.

Javada bu iş için özel bir for döngüsü türü bulunmaktadır.

~~~java
int dizi[] = {1,2,3,4,5};
for(int i:dizi){
  System.out.println(i);
}
~~~

Yukarıdaki kodda i dizinin o anki elemanının değeridir, indisi değil.

## Parametre Olarak Dizi Göndermek

Oluşturduğumuz bir fonksiyona bir diziyi argüman olarak verebiliriz.

~~~java
public class Dizi{
  public static void main(String args[]){
    String dizi[] = new String[3];
    dizi[0] = "Merhaba";
    dizi[1] = "Dünya";
    yazdir(dizi);
  }
  static void yazdir(String dizi[]){
    for(String i:dizi){
      System.out.println(i);
    }
  }
}
~~~

## Özyineleme ( Recursive )

Bir fonksiyonun kendisini çağırmasına özyineleme denir.

~~~java
static int faktoriyel(int sayi){
  if(sayi == 1){
    return 1;
  }else{
    return(sayi*faktoriyel(sayi-1));
  }
}
~~~

Yukarıda faktöriyel hesaplama işlemini recursive olarak yapan bir fonksiyon yazılmıştır.

## Yapılandırıcılar ( Constructors )

Yapılandırıcı bir nesne oluşturulurken ilk çağırılan fonksiyona verilen isimdir.

***Yapılandırıcı adı sınıf adıyla aynı olmak ZORUNDA!***

**Yapılandırıcılar void dir.**

Yapılandırıcılar aşırı yüklenebilirler. ( Overload (*açıklaması sonraki bölümde mevcut*))

Her sınıf için parametresiz default bir yapılandırıcı vardır.

Eğer koda eklemesek bile derleyici otomatik olarak bir yapılandırıcı metod çağırır.

~~~java
public class Yapilandirici{
  int deger1;
  public Yapilandirici(){
    deger1 = 5;
  }
  public void main(String args[]){
    Yapilandirici nesne1 = new Yapilandirici();
    System.out.println(nesne1.deger1);
  }
}
~~~

Aşağıda da Overload bir Yapılandırıcı örneği mevcuttur:

~~~java
class Araba{
  int kapi;
  int vites;
  public Araba(int kapiSayi){
    kapi = kapiSayi;
  }
  public Araba(int kapiSayi, int vitesSayi){
    kapi = kapiSayi;
    vites = vitesSayi;
  }
}
public class Yapilandirici{
  public static void main(String args[]){
    Araba ar1 = new Araba();
    Araba ar2 = new Araba(4);
    Araba ar3 = new Araba(4,5);
  }
}
~~~

## Aşırı Yükleme ( Overload )

Aşırı Yükleme bir class'ın aynı isimli birden çok metod içermesidir.

Yani aynı isme sahip birden çok metod olma durumudur.

Aşırı yükleme yapılan fonksiyonlar için ayırt edici özellik argümandır.

Argüman sayısı yada tipine göre Java gerekli fonksiyonu çalıştırılır.

Örneğin aynı ada sahip iki fonkiyondan birisi String diğeri int tipinde
değişken alıyorsa, biz bu fonksiyonu çağırırken arguman olarak String
tipinden bir veri verirsek String argumanlı fonksiyon çalışır.
int tipinden veri verirsek int argumanlı fonksiyon çalışır.

Aynı şekilde arguman sayısına göre de overload yapılır.

Örneğin aynı ada sahip iki fonksiyondan biri hiç arguman almıyor, biri bir arguman alıyor, biri de iki arguman alıyorsa
biz bu fonksiyonu çağırırken arguman yollamazsak arguman almayan fonksiyon çalışır, 1 arguman yollarsak 1 arguman alan fonksiyon çalışır,
benzer şekilde 2 arguman yollarsak 2 arguman alan fonksiyon çalışır.

~~~java
public class Ornek{
  public int toplam(){
    return 0;
  }
  public int toplam(int sayi1){
    return sayi1;
  }
  public int toplam(int sayi1, int sayi2){
    return(sayi1 + sayi2);
  }
  public int toplam(int sayi1, int sayi2, int sayi3){
    return(sayi1 + sayi2 + sayi3);
  }
  public double toplam(double sayi1){
    return sayi1;
  }
  public double toplam(double sayi1, double sayi2){
    return(sayi1 + sayi2);
  }
  public double toplam(double sayi1, double sayi2, double sayi3){
    return(sayi1 + sayi2 + sayi3);
  }
}
~~~

## this Referansı

this referansı nesnenin kendisini refere etmesini sağlar. Özel bir referanstır.

İsim çakışması olması durumunda yerel değişkenin değil, nesne değişkeninin kullanılacağını belirtir.

Yapılandırıcı metodları çağırmak için kullanılır.

Yapılandırıcılar içinde this ile başka yapılandırıcı ÇAĞIRILAMAZ!

Yapılandırıcı içinde diğer bir yapılandırıcı çağırılırken İLK SATIRDA YAZILIR!

this referansı **static metodlarda KULLANILAMAZ!**

~~~java
public class Ogrenci{
  public int no;
  public String isim;
  public Ogrenci(int no){
    this(no,"Serhat"); //Yapılandırıcı fonksiyon çağırılıyor.
  }
  public Ogrenci(int no, String isim){
    this.no = no; //this.no dışarıdaki , yani Ogrenci nesnesinin değişkeni olan değişkeni ifade eder. 
    // no ise arguman olarak alınan yerel değişkeni.
    this.isim = isim; //this.isim dışarıdaki , yani Ogrenci nesnesinin değişkeni olan değişkeni ifade eder. 
    // isim ise arguman olarak alınan yerel değişkeni.
  }
  public static void main(String args[]){
    Ogrenci ogr1 = new Ogrenci(1,"Serhat");
    System.out.println(ogr1.no + " numaralı öğrenci: " + ogr1.isim );
    Ogrenci ogr2 = new Ogrenci(2);
    System.out.println(ogr2.no + " numaralı öğrenci: " + ogr2.isim );
  }
}
~~~

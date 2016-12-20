# Java-1
## Java 1 Dersinde Öğrenilenler

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

 byte: En küçük tamsayı tipidir. -2^(-7) ile (2^(7))-1 arasında değerler alır. Bellekte **8 bit** yer kaplar.

 short: -2^(-16) ile (2^(16))-1 arasında değerler alır. Bellekte **16 bit** yer kaplar.

 int: -2^(-32) ile (2^(32))-1 arasında değerler alır. Bellekte **32 bit** yer kaplar.

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
  fload b; //b = 0.0
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

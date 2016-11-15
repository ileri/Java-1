# Java-1
## Java 1 Dersinde Öğrenilenler

Java bir programlama dili ve sistem platformudur.

Java kodları derlendiğinde **bytecode** denilen bir ara formata dönüşür.

Java'nın platform bağımsız olması **bytecode** sistemi sayesindedir.

İşletim sisteminin üzerine kurulan **Java Virtual Machine** bu bytecode ları yorumlar.

### JAVA
I

I-> JDK - Java Development Kit

I-> JRE - Java Runtime Environment

I-> JVM - Java Virtual Machine



JDK'nın içindeki temel programlar:

I

I-> javac.exe (Java Derleyicisi)

I-> java.exe (Java Yorumlayıcısı)


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

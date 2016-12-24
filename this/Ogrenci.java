public class Ogrenci{
  public int no;
  public String isim;
public Ogrenci(int no){
  this(no,"Serhat Celil İLERİ"); //Yapılandırıcı fonksiyon çağırılıyor.
}
  public Ogrenci(int no, String isim){
    this.no = no; //this.no dışarıdaki , yani Ogrenci nesnesinin değişkeni olan değişkeni ifade eder. no ise arguman olarak alınan yerel değişkeni.
    this.isim = isim; //this.isim dışarıdaki , yani Ogrenci nesnesinin değişkeni olan değişkeni ifade eder. isim ise arguman olarak alınan yerel değişkeni.
  }
  public static void main(String args[]){
    Ogrenci ogr1 = new Ogrenci(1,"Serhat");
    System.out.println(ogr1.no + " numaralı öğrenci: " + ogr1.isim );
    Ogrenci ogr2 = new Ogrenci(2);
    System.out.println(ogr2.no + " numaralı öğrenci: " + ogr2.isim );

  }
}

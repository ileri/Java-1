import java.util.Scanner;
public class ogrenci{
  Scanner okuyucu = new Scanner(System.in);
  String isim;
  int vize;
  int finalNot;
  float ort;
  char[] harf;
  boolean gec;
  public ogrenci(){
    isimOku();
    notOku();

  }
  public ogrenci(String isim){
    this.isim = isim;
    notOku();
  }
  public ogrenci(String isim,int not){
    this.isim = isim;
    notOku();
  }
  public ogrenci(String isim,int vize,int finalNot){
    this.isim = isim;
    notOku(vize,finalNot);
  }
  public ogrenci(int not){
    isimOku();
    notOku();
  }
  public ogrenci(int vize,int finalNot){
    isimOku();
    notOku(vize,finalNot);
  }
  public void isimOku(){
    System.out.print("Öğrenci adı: ");
    this.isim = okuyucu.nextLine();
  }
  public void notOku(){
    System.out.print(this.isim + " adlı öğrencinin Vize notunu girin:");
    this.vize = okuyucu.nextInt();
    System.out.print(this.isim + " adlı öğrencinin Final notunu girin:");
    this.finalNot = okuyucu.nextInt();
    ortalamaAl();
  }
  public void notOku(int vize,int finalNot){
    this.vize = vize;
    this.finalNot = finalNot;
    ortalamaAl();
  }
  public void ortalamaAl(){
    this.ort = (float)((this.vize*0.4)+(this.finalNot*0.6));
    System.out.println(this.isim + " adlı öğrencinin ortalaması:" + this.ort);
    harfNotu();
  }
  public void harfNotu(){
    this.harf = new char[2];
    if(this.ort >= 80){
      this.harf[0] = 'A';this.harf[1] = 'A';
    }
    else if(this.ort >= 70){
      this.harf[0] = 'B';this.harf[1] = 'A';
    }
    else if(this.ort >= 60){
      this.harf[0] = 'B';this.harf[1] = 'B';
    }
    else if(this.ort >= 50){
      this.harf[0] = 'C';this.harf[1] = 'B';
    }
    else if(this.ort >= 40){
      this.harf[0] = 'C';this.harf[1] = 'C';
    }
    else if(this.ort >= 30){
      this.harf[0] = 'D';this.harf[1] = 'D';
    }
    else{
      this.harf[0] = 'F';this.harf[1] = 'F';
    }
    System.out.println(this.isim + " adlı öğrencinin harf notu: " + this.harf[0] + this.harf[1] );
  }
  public void gecerMi(){
    if(this.ort < 40)
      this.gec = false;
    else if(this.ort < 60){
      if(this.ort < Sinif.CAN)
        this.gec = false;
      else
        this.gec = true;
    }else
      this.gec = true;
    if(this.gec)
      System.out.println(this.isim + " adlı öğrenci dersi GEÇTİ.");
    else
      System.out.println(this.isim + " adlı öğrenci dersten KALDI.");
  }
  public void finalize(){
    System.out.println("ogrenci finalize() - Bir nesne RAM'den siliniyor...");
  }
}

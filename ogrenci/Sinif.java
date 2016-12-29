import java.util.*;
public class Sinif{
  static float CAN = 39.99f;
  static List<ogrenci> Ogrenciler = new ArrayList<ogrenci>();
  static ogrenci[] Students = new ogrenci[10];
  public static void main(String args[]){
    ogrenci ahmet = new ogrenci("Ahmet",50,100);
    ogrenci baran = new ogrenci("Baran", 10 ,90 );
    ogrenci ceyhun = new ogrenci("Ceyhun", 10 , 65);
    ogrenci deniz = new ogrenci("Deniz", 10 , 59);
    Students[0] = ahmet;
    Students[1] = baran;
    Students[2] = ceyhun;
    Students[3] = deniz;
    arrCanHesap();
    arrGecenler();
    Ogrenciler.add(ahmet);
    Ogrenciler.add(baran);
    Ogrenciler.add(ceyhun);
    Ogrenciler.add(deniz);
    //canHesap();
    //gecenler();
    System.out.println("Çan:" + CAN);
    //FIXME: Garbage Collector Manuel Çalıştır
    //System.gc();
  }
  public static void arrCanHesap(){
    float toplam = 0;
    int index = 0;
    int i = 0;
    for(; Students[i] != null; i++){
      toplam += Students[i].ort;
    }
    CAN = toplam / i;
  }
  public static void arrGecenler(){
    for(int i = 0; Students[i] != null; i++){
      Students[i].gecerMi();
    }
  }
  public static void canHesap(){
    float toplam = 0;
    for(int i = 0; i < Ogrenciler.size(); i++){
      toplam += Ogrenciler.get(i).ort;
    }
    CAN = toplam/Ogrenciler.size();
  }
  public static void gecenler(){
    for(int i = 0; i < Ogrenciler.size(); i++){
      Ogrenciler.get(i).gecerMi();
    }
  }

}

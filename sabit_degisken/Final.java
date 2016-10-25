public class Final{
  public static void main(String args[]){
    int yaricap = 5;
    double cevre = daire_cevre(yaricap);
    double alan = daire_alan(yaricap);
    System.out.printf("%d cm yarıçaplı dairenin çevresi %f cm\n",yaricap,cevre);
    System.out.printf("%d cm yarıçaplı dairenin alanı %f cm^2\n",yaricap,alan);
  }
  public static double daire_cevre(int r){
    final double PI = 3.1415;
    double cevre = 2 * PI * r;
    return cevre;
  }
  public static double daire_alan(int r){
    final double PI = 3.1415;
    double alan = PI * r * r;
    return alan;
  }
}

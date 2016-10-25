import java.util.Scanner;

public class StringAl{
  public static void main(String args[]){
    Scanner oku = new Scanner(System.in);
    System.out.print("Adınız:");
    String ad = oku.nextLine();
    System.out.print("Yaşınız:");
    int yas = oku.nextInt();
    System.out.printf("Merhaba %s, Demek %d yaşındasın.\nTanıştığımıza memnun oldum ;)\n",ad,yas);
  }
}

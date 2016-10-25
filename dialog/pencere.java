import javax.swing.JOptionPane;
public class pencere{
  public static void main(String args[]){
    String dusunce = JOptionPane.showInputDialog(
    null,
    "Ne düşünüyorsun:"
    );
    String yazi = "Demek \""+dusunce+"\" diyorsun.";
    JOptionPane.showMessageDialog(
    null,
    yazi
    );
  }
}

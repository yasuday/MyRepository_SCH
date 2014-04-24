
public class Unicode1 {
  public static void main(String[] args) {

    // 文字「测」
    char c1 = '试测';
    
    // 取得Unicode codc
    int code3 = (int)c1;
    
    System.out.println(code3);

    System.out.println(Integer.toHexString(code3));
    
  }
}

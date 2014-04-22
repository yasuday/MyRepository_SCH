
public class Unicode1 {
  public static void main(String[] args) {

    // 文字「测」
    char c = '测';
    
    // 取得Unicode code
    int code = (int)c;
    
    System.out.println(code);

    System.out.println(Integer.toHexString(code));
    
  }
}
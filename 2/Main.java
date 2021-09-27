public class Main {
  public static void main(String[] args) {
    int a;
    int b;
    a = 20;
    b = a + 5;
    System.out.println(a);
    System.out.println(b);

    // System.out.println("私の好きな記号は二重引用符(")です");
    // エスケープシーケンスを用いないと「私の好きな記号は二重引用符("」だけが文字列とみなされてしまいエラー
    System.out.println("私の好きな記号は二重引用符(\")です");
    a = 100;
    a++;
    System.out.println(a);
  }
}

public class Caluculate {
  // フィボナッチ数列の処理
  public static void fib(int inputNum) {
    int a = 0;
    int b = 1;
    int c = 0;
    int[] resultNums = new int[inputNum];
    for (int i = 0; i < inputNum;  i++) {
      resultNums[i] = a;
      c = a + b;
      a = b;
      b = c;
    }
    String totalNum = "";
    for (int j : resultNums) {
      totalNum += j + " ";
    }
      System.out.println(inputNum + " 番目のフィボナッチ数: " + c);
      System.out.println(inputNum + " 番目までのフィボナッチ数列: " + totalNum);
    }
}

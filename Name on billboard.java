public class Billboard {
	
	public static int billboard(String name, int price) {
    int result = 0;
    for (int i = 0; i < name.length(); i++) {
      result = result + price;
    }
    return result;
  }
}

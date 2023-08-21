public class Solution{
  public static String doubleChar(String s){
    char[] chars = s.toCharArray();
    char[] result = new char[s.length() * 2];
    for (int i = 0; i < chars.length; i++) {
      result[i * 2] = chars[i];
      result[i * 2 + 1] = chars[i];
    }
    return String.valueOf(result);
  }
}

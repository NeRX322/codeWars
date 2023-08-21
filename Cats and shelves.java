public class Kata {
  public static int solution(int start, int finish) {
    return ((finish - start) / 3) + ((finish - start) - ((finish - start) / 3) * 3);
  }
}

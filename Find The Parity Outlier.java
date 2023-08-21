public class FindOutlier {
  static int find(int[] integers) {
    int oddCounter = 0;
    int evenCounter = 0;
    
    for (int i = 0; i < 3; i ++) {
      if (integers[i] % 2 == 0) {
        evenCounter = evenCounter + 1;
      } else {
        oddCounter = oddCounter + 1;
      }
    }
    
    if (evenCounter > oddCounter) {
      for (int i = 0; i < integers.length; i++) {
        if (integers[i] % 2 != 0) return integers[i];
      }
    } else {
            for (int i = 0; i < integers.length; i++) {
        if (integers[i] % 2 == 0) return integers[i];
      }
    }
    
    return 0;
  }
}

public class Kata {
  public static int GetParticipants(int handshakes) {
    if (handshakes == 0) {
      return 0;
    }
    int people = 2;
    int result = 1;
    int token = result;
    
    while (token < handshakes) {
      result = 0;
      for (int i = people; i > 0; i--) {
        result = result + i;
      } 
      token = result;
      people = people + 1;
    }
    
    return people;
  }
}

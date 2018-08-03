import java.util.HashMap;

public class Assignment {
  private HashMap<String, Integer> names;

  Assignment(HashMap<String, Integer> names){
    this.names = names;
  }

  public HashMap<String, Integer> getMap() {
    return this.names;
  }
}
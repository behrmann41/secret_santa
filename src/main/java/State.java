import java.util.HashMap;

public class State {
  // create master state object/map
  HashMap<String, Assignment> state = new HashMap<>();

  // for each name passed, create an assignment map to track count
  public void addToMap(String name, String match) {

    HashMap<String, Integer> matches = new HashMap<String, Integer>();
    matches.put(match, 0);
    Assignment assignment = new Assignment(matches);

    // add map to state
    state.put(name, assignment);
  }

  // get previous assignments based on name
  public HashMap<String, Integer> getAssignments(String name) {
    Assignment assignment = state.get(name);
    return assignment.getMap();
  }

  // should be able to protect and not use null check
  public Boolean checkAssignments(String name) {
    Assignment assignment = state.get(name);
    return assignment == null;
  }

}
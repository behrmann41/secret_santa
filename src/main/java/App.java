import java.util.Arrays;
import java.util.List;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
  public static void main(String[] args) {
    List<String> participants = generateParticipants(args);

    SecretSanta secretSanta = new SecretSanta();
    List<String> assignments = secretSanta.generateAssignments(participants);
    secretSanta.printResults(participants, assignments);
  }

  /**
   * @param arguments
   *          even number of names, space separated
   */
  public static List<String> generateParticipants(String[] args) {
    List<String> nameList = Arrays.asList(args);

    if (nameList.size() == 0) {
      throw new java.lang.Error("Please enter some names");
    }

    if (nameList.size() % 2 > 0) {
      throw new java.lang.Error("Please enter an even number of names");
    }
    return nameList;
  }
}
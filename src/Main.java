import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    SecretSanta secretSanta = new SecretSanta();
    String[] participants = generateParticipants(args);

    secretSanta.generateAssignments(participants);
    secretSanta.printResults();
  }

  /**
   * @param arguments even number of names, space separated
   */
  public static String[] generateParticipants(String[] args) {
    char[] cArg;
    String name;
    List<String> nameList = new ArrayList<String>();

    for(String arg: args) {
      cArg = arg.toCharArray();
      name = new String(cArg);
      nameList.add(name);
    }

    if (nameList.size() % 2 > 0) {
      throw new java.lang.Error("Please enter an even number of names");
    }
    return nameList.toArray(new String[nameList.size()]);
  }
}
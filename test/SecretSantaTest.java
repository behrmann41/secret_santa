import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.*;

public class SecretSantaTest {

  String[] participants;
  SecretSanta secretSanta;

  /**
   * Create list of names and Secret Santa Instance
   */
  @Before
  public void init(){
    participants = new String[] { "Ashley", "Daniel", "Jim", "Jill", "Guy", "Louise" };
    secretSanta = new SecretSanta();
  }

  /**
   * Test randomized set of participants
   */
	@Test
	public void testSelfAssignment(){
    secretSanta.generateAssignments(participants);
    boolean checkAssignment = false;
    for(int i = 0; i < participants.length; i++){
      if(participants[i].equals(secretSanta.Assignments[i])) {
        checkAssignment = true;
      }
    }
    assertFalse(checkAssignment);
	}

  /**
   * verify there is a pair for every name.
   */
  @Test
  public void testPlayerAssignment(){
    secretSanta.generateAssignments(participants);
    assertTrue(secretSanta.Assignments.length == secretSanta.Participants.length);
  }
}
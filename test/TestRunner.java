import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(SecretSantaTest.class);

    if(result.getFailureCount() == 0) {
      System.out.println("Tests Successful!");
    } else {
      for(Failure failure : result.getFailures()){
        System.out.println(failure.toString());
      }
    }
	}
}
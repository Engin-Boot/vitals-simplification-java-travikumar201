package vitals;

public class VitalReporter implements IReporter{

	@Override
	public void alert(String vitalName, String message) {

        System.out.println(vitalName + " is " + message);
        
	}
	
}

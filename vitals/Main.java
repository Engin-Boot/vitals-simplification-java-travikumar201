package vitals;

public class Main {
    public static void main(String[] args) {
    	
    	IVitals chkVitals = new VitalChecker();
    	
    	assert(chkVitals.vitalsAreOk(100, 95, 70)) == true; //all vitals okay
        assert(chkVitals.vitalsAreOk(180, 95, 70))== false; // BP is high
        assert(chkVitals.vitalsAreOk(30, 95, 70))== false; // BP is low
        assert(chkVitals.vitalsAreOk(100, 60, 70))== false; // spo2 is low
        assert(chkVitals.vitalsAreOk(100, 95, 20))== false; //respRate is low
        assert(chkVitals.vitalsAreOk(100, 95, 115))== false; // respRate is high
        assert(chkVitals.vitalsAreOk(185, 55, 70))== false; // BP is high, spo2 is low
        assert(chkVitals.vitalsAreOk(100, 55, 15))== false; // spo2 is low, respRate is low
        assert(chkVitals.vitalsAreOk(100, 55, 110))== false; //spo2 is low, respRate is high
        assert(chkVitals.vitalsAreOk(180, 95, 10))== false; //BP is high, respRate is low
        assert(chkVitals.vitalsAreOk(10, 95, 100))== false; //BP is low, respRate is high
        assert(chkVitals.vitalsAreOk(10, 55, 10))== false; // BP is low, spo2 is low, respRate is low
        assert(chkVitals.vitalsAreOk(190, 20, 150))== false; //BP is high, spo2 is low, respRate is high
        System.out.println("tests are completed");
    }

}

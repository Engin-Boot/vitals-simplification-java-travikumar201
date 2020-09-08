package vitals;

public class VitalChecker implements IVitals{
	
	private IReporter report = new VitalReporter();

	@Override
	public boolean vitalsAreOk(float bpm, float spo2, float respRate) {
		return (checkBpm(bpm) && checkSpo2(spo2) && checkRespRate(respRate));
	}

	private boolean checkBpm(float bpm) {
		if(bpm < 70) {
            report.alert("bpm", "too low");
            return false;
        }
		else if(bpm > 150){
			report.alert("bpm", "too high");
            return false;
		}
		return true;
	}
	
	private boolean checkSpo2(float spo2) {
		
		if(spo2 < 90){
			report.alert("spo2", "too low");
			return false;
		}
		return true;
	}

	private boolean checkRespRate(float respRate) {
		if(respRate < 30) {
			report.alert("respRate", "too low");
			return false;
        }
		else if(respRate > 95){
			report.alert("respRate", "too high");
			return false;
		}
		return true;
	}
	
}

package Project;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private Map<String, Aadhaar> aadhaarMap = new HashMap<>();

    AadhaarService (){
        aadhaarMap.put("234435678", new Aadhaar("234435678", "Ritika", "Arun Kumar Sinha",
                "Rohini"));
        aadhaarMap.put("234435676", new Aadhaar("234435676", "Ram", "Mahesh Sharma",
                "CP"));
        aadhaarMap.put("234435675", new Aadhaar("234435675", "Ritu", "Rajesh Goyal",
                "CP"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);
    }
}

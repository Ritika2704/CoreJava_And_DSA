package Project;

import java.util.HashMap;
import java.util.Map;

public class PanService {

    private Map<String, Pan> PanMap = new HashMap<>();

    PanService() {
        PanMap.put("EABFTO2345", new Pan("EABFTO2345", "234435678",
                "Sbi", "MF, stocks"));
        PanMap.put("EABFTO2346", new Pan("EABFTO2346", "234435676",
                "Kotak", "LIC, stocks"));

    }
    public Pan getPanByAadhaarNum(String aadhaarNumber) throws NoMatchFoundException {
//        if apply .values() function is java8 part - it provides the collection esme ek ek value se check hoga
        for(Pan pan:PanMap.values()){
            if(pan.getAadhaarNum().equals(aadhaarNumber)){
                return pan;
            }
        }
       throw new NoMatchFoundException("Not Found! ");
//        return null;
    }
}

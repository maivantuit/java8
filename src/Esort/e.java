package Esort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e {
	public static void main(String[] args) {
		Map<Integer, Map<String,String>> map = new HashMap<Integer, Map<String,String>>();
		Map<String,String> mapTemp1 = new HashMap<String,String>();
		mapTemp1.put("airlineCode", "aircode1");
		mapTemp1.put("airlineName", "airname1");
		mapTemp1.put("startDate", "startdate1");
		mapTemp1.put("conf", "conf1");

		Map<String,String> mapTemp2 = new HashMap<String,String>();
		mapTemp2.put("airlineCode", "aircode2");
		mapTemp2.put("airlineName", "airname2");
		mapTemp2.put("startDate", "startdate2");
		mapTemp2.put("conf", "conf2");

		Map<String,String> mapTemp3 = new HashMap<String,String>();
		mapTemp3.put("airlineCode", "aircode3");
		mapTemp3.put("airlineName", "airname3");
		mapTemp3.put("startDate", "startdate3");
		mapTemp3.put("conf", "conf3");

		Map<String,String> mapTemp4 = new HashMap<String,String>();
		mapTemp4.put("airlineCode", "aircode1");
		mapTemp4.put("airlineName", "airname3");
		mapTemp4.put("startDate", "startdate1");
		mapTemp4.put("conf", "conf2");

		Map<String,String> mapTemp5 = new HashMap<String,String>();
		mapTemp5.put("airlineCode", "aircode1");
		mapTemp5.put("airlineName", "airname2");
		mapTemp5.put("startDate", "startdate2");
		mapTemp5.put("conf", "conf1");

        map.put(1, mapTemp2);
        map.put(2, mapTemp1);
        map.put(3, mapTemp3);
        map.put(4, mapTemp4);
        map.put(5, mapTemp5);

        List<Map.Entry<Integer, Map<String,String>>> entries = new ArrayList<Map.Entry<Integer, Map<String,String>>>(map.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Integer, Map<String,String>>>() {

			@Override
			public int compare(Entry<Integer, Map<String, String>> o1, Entry<Integer, Map<String, String>> o2) {
				int result;
				if((result = o1.getValue().get("airlineCode").compareTo(o2.getValue().get("airlineCode"))) == 0){
					if((result = o1.getValue().get("airlineName").compareTo(o2.getValue().get("airlineName"))) == 0){
						if((result = o1.getValue().get("startDate").compareTo(o2.getValue().get("startDate"))) == 0){
				if((result = o1.getValue().get("conf").compareTo(o2.getValue().get("conf"))) == 0){
								return result;
							}
						}
					}
				}
				return result;
			}
        });

        for (Map.Entry<Integer, Map<String,String>> e : entries) {
            System.out.println(e.getKey() + " : [" + e.getValue().get("airlineCode")
                                          + ", " + e.getValue().get("airlineName")
                                          + ", " + e.getValue().get("startDate")
                                          + ", " + e.getValue().get("conf")
                                          + "]");
        }
}
}

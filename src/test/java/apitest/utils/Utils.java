package apitest.utils;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	public static Map<String, RecordHandler> sortmap(Map<String, RecordHandler> myInput) {  
	    if (myInput == null || myInput.isEmpty()) {  
	        return null;  
	    }  
	    Map<String, RecordHandler> sortmap = new TreeMap<String, RecordHandler>(new Comparator<String>() 
	    		{	  
	        public int compare(String key1, String key2) {  
	            int intKey1 = 0, intKey2 = 0;  
	            try {  
	                intKey1 = getInt(key1);  
	                intKey2 = getInt(key2);  
	            } catch (Exception e) {  
	                intKey1 = 0;   
	                intKey2 = 0;  
	            }  
	            return intKey1 - intKey2;  
	        }});  
	    sortmap.putAll(myInput);  
	    return sortmap;  
	}  
	  
	private static int getInt(String str) {  
	    int i = 0;  
	    try {  
	        Pattern p = Pattern.compile("^\\d+");  
	        Matcher m = p.matcher(str);  
	        if (m.find()) {  
	            i = Integer.valueOf(m.group());  
	        }  
	    } catch (NumberFormatException e) {  
	        e.printStackTrace();  
	    }  
	    return i;  
	}  
	
}

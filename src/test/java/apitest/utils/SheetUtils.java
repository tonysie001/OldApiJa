package apitest.utils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SheetUtils {
	
	public static void removeSheetByName(XSSFWorkbook wb,String sheetName) { 
        try 
        { 
            wb.removeSheetAt(wb.getSheetIndex(sheetName)); 
            
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 

}

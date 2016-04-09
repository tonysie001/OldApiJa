package apitest.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.skyscreamer.jsonassert.JSONCompareResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class that write data to XSSF sheet
 * 
 */
public class DataWriter {
  
  protected static final Logger logger = LoggerFactory.getLogger(DataReader.class);
  
  public static void writeData(XSSFSheet outputSheet,String response, String ID, String test_case)
  {
	  XSSFRow row = outputSheet.createRow(0);
	  
	  XSSFCell cell0 = row.createCell((int)0,0);
	  XSSFRichTextString xts0=new XSSFRichTextString("ID");
	  cell0.setCellValue(xts0);
	  
	  XSSFCell cell1 = row.createCell((int)0,1);
	  XSSFRichTextString xts1 = new XSSFRichTextString("TestCase");
	  cell1.setCellValue(xts1);
	  
	  XSSFCell cell2 = row.createCell((int)0,2);
	  XSSFRichTextString xts2 = new XSSFRichTextString("Response");
	  cell2.setCellValue(xts2); 
	  
	  XSSFRow rownext =outputSheet.createRow((short)(outputSheet.getLastRowNum()+1));
	  rownext.createCell((short)0).setCellValue(ID);
	  
	  XSSFCell celln1 = rownext.createCell((short)1);
	  XSSFRichTextString xtsn1 = new XSSFRichTextString(test_case);
	  celln1.setCellValue(xtsn1);
	  //rownext.createCell((short)1).setCellValue(test_case);
	  //rownext.createCell((short)2).setCellValue(response);
	  XSSFCell celln2 = rownext.createCell((short)2);
	  XSSFRichTextString xtsn2 = new XSSFRichTextString(response);
	  celln2.setCellValue(xtsn2);
  }
  
  public static void writeData(XSSFSheet comparsionSheet,JSONCompareResult result, String ID, String test_case )
  {
	  XSSFRow row = comparsionSheet.createRow(0);
	  
	  XSSFCell cell0 = row.createCell((int)0,0);
	  XSSFRichTextString xts0=new XSSFRichTextString("ID");
	  cell0.setCellValue(xts0);
	  
	  XSSFCell cell1 = row.createCell((int)0,1);
	  XSSFRichTextString xts1 = new XSSFRichTextString("TestCase");
	  cell1.setCellValue(xts1);
	  
	  XSSFCell cell2 = row.createCell((int)0,2);
	  XSSFRichTextString xts2 = new XSSFRichTextString("Result");
	  cell2.setCellValue(xts2); 
	  
	  XSSFRow rownext =comparsionSheet.createRow((short)(comparsionSheet.getLastRowNum()+1));
	  rownext.createCell((short)0).setCellValue(ID);
	  
	  XSSFCell celln1 = rownext.createCell((short)1);
	  XSSFRichTextString xtsn1 = new XSSFRichTextString(test_case);
	  celln1.setCellValue(xtsn1);
	  //rownext.createCell((short)1).setCellValue(test_case);
	  //rownext.createCell((short)2).setCellValue(response);
	  XSSFCell celln2 = rownext.createCell((short)2);
	  XSSFRichTextString xtsn2 = new XSSFRichTextString(result.toString());
	  celln2.setCellValue(xtsn2);
	  
	  
  }
  
  public static void writeData(XSSFSheet resultSheet, String string, String ID,
		String test_case, int i) 
  {
      XSSFRow row = resultSheet.createRow(0);
	  
	  XSSFCell cell0 = row.createCell((int)0,0);
	  XSSFRichTextString xts0=new XSSFRichTextString("ID");
	  cell0.setCellValue(xts0);
	  
	  XSSFCell cell1 = row.createCell((int)0,1);
	  XSSFRichTextString xts1 = new XSSFRichTextString("TestCase");
	  cell1.setCellValue(xts1);
	  
	  XSSFCell cell2 = row.createCell((int)0,2);
	  XSSFRichTextString xts2 = new XSSFRichTextString("Response");
	  cell2.setCellValue(xts2); 
	  
	  XSSFRow rownext =resultSheet.createRow((short)(resultSheet.getLastRowNum()+1));
	  rownext.createCell((short)0).setCellValue(ID);
	  
	  XSSFCell celln1 = rownext.createCell((short)1);
	  XSSFRichTextString xtsn1 = new XSSFRichTextString(test_case);
	  celln1.setCellValue(xtsn1);
	  //rownext.createCell((short)1).setCellValue(test_case);
	  //rownext.createCell((short)2).setCellValue(response);
	  XSSFCell celln2 = rownext.createCell((short)2);
	  XSSFRichTextString xtsn2 = new XSSFRichTextString(string);
	  celln2.setCellValue(xtsn2);
	
  }

  public static void writeData(XSSFSheet outputSheet) 
  {
	
  }

  public static void writeData(XSSFSheet comparsionSheet, String statusLine,
		String ID, String baseline_message, String test_case) 
  {
      XSSFRow row = comparsionSheet.createRow(0);
	  
	  XSSFCell cell0 = row.createCell((int)0,0);
	  XSSFRichTextString xts0=new XSSFRichTextString("ID");
	  cell0.setCellValue(xts0);
	  
	  XSSFCell cell1 = row.createCell((int)0,1);
	  XSSFRichTextString xts1 = new XSSFRichTextString("TestCase");
	  cell1.setCellValue(xts1);
	  
	  XSSFCell cell2 = row.createCell((int)0,2);
	  XSSFRichTextString xts2 = new XSSFRichTextString("Response");
	  cell2.setCellValue(xts2); 
	  
	  XSSFRow rownext =comparsionSheet.createRow((short)(comparsionSheet.getLastRowNum()+1));
	  rownext.createCell((short)0).setCellValue(ID);
	  
	  XSSFCell celln1 = rownext.createCell((short)1);
	  XSSFRichTextString xtsn1 = new XSSFRichTextString(test_case);
	  celln1.setCellValue(xtsn1);
	  //rownext.createCell((short)1).setCellValue(test_case);
	  //rownext.createCell((short)2).setCellValue(response);
	  XSSFCell celln2 = rownext.createCell((short)2);
	  XSSFRichTextString xtsn2 = new XSSFRichTextString(baseline_message);
	  celln2.setCellValue(xtsn2);
	  XSSFCell celln3 = rownext.createCell((short)3);
	  XSSFRichTextString xtsn3 = new XSSFRichTextString(statusLine);
	  celln3.setCellValue(xtsn3);
	  
  }

  public static void writeData(XSSFSheet resultSheet, double totalcase,
		double failedcase, String startTime, String endTime) 
  {
	  
  }

}


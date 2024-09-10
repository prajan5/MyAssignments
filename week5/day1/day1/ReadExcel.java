package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//Step1-> Set path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//step2-> Get into the sheet
		//XSSFSheet sh=  wb.getSheetAt(0);
		
		XSSFSheet sh=  wb.getSheet("Sheet1");
		
		//Step3-> Get row count, excluding header 
		int rowcount = sh.getLastRowNum();
		System.out.println("Rowcount:"+rowcount);
		
		//No of rows including header 
		int rowswithheader = 	sh.getPhysicalNumberOfRows();
		System.out.println("No of rows including headers"+rowswithheader);
		
		//Step4-> Get into cell values(No of columns)
		int columcount = sh.getRow(1).getLastCellNum();
		System.out.println("Columncount:"+columcount);
		
		
		//Step5-> Read Data from workbook and print
		for (int i = 1;i<=rowcount;i++)
		{
			for (int j=0;j<columcount;j++) 
			{
			String cellvalue = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(cellvalue);
			}
		
		}
		//Step6-> close the workbook
		wb.close();


	}

}

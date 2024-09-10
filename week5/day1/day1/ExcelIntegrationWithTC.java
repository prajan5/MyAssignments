package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegrationWithTC {

	//step4 change main method to normal method and retain the static keyword.
	public static String[][] readExcel() throws IOException {
	XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
	XSSFSheet sh = wb.getSheetAt(0);
	
	//get row count
	int rowcount = sh.getLastRowNum();

	//get column count 
	int columcount = sh.getRow(1).getLastCellNum();
	//Step 1
	String [][] data = new String[rowcount][columcount];
	for (int i=1;i<=rowcount;i++) {
		for (int j=0;j<columcount;j++)
		{
			String cellvalue = sh.getRow(i).getCell(j).getStringCellValue();
			//step2 read value from excel
			data[i-1][j]= cellvalue;
		}
	}
	wb.close();
	//step3 return variable name 
	return data;

	}

}

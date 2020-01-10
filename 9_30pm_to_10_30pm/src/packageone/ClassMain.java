package packageone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

public class ClassMain extends Selenium_Operations{
	
	@BeforeTest
	public void MainMethod() throws IOException, InterruptedException {
		int Column_Count = 0;
		LinkedList<String> Key = new LinkedList<String>();
		LinkedList<String> Value = new LinkedList<String>();
		
		
		
		File Excel = new File("C:/Users/Satish/workspace/9_30pm_to_10_30pm/TestDataFolder/TestData.xlsx");
		FileInputStream Read_Write = new FileInputStream(Excel);
		
		
		XSSFWorkbook wb = new XSSFWorkbook(Read_Write);
		XSSFSheet TestDataSheet = wb.getSheet("DataSheet");
		
		DataFormatter formatter = new DataFormatter();
		
		int Row_Count = TestDataSheet.getLastRowNum()-TestDataSheet.getFirstRowNum();
		System.out.println(Row_Count);
		
		for(int i=0;i<Row_Count;i++){
			Column_Count = TestDataSheet.getRow(i).getLastCellNum();
			System.out.println(Column_Count);
			for(int j=0;j<Column_Count;j++){
				String value = formatter.formatCellValue(TestDataSheet.getRow(i).getCell(j));
				Key.add(value);
			}
		}
		System.out.println(Key);
		
		for(int i=1;i<=Row_Count;i++){
			for(int j=0;j<Column_Count;j++){
				String value = formatter.formatCellValue(TestDataSheet.getRow(i).getCell(j));
				Value.add(value);
			}
		}
		System.out.println(Value);
		
		for(int k=0;k<Key.size();k++){
			DataMap.put(Key.get(k), Value.get(k));
		}
		System.out.println(DataMap);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import base.AnnotationClass;

public class ExcelDataProvider extends AbstractDataProvider{

	//@Test
	public static Object[][] excelInputs(String sheetName) throws InvalidFormatException{

		XSSFWorkbook wbook;
		XSSFSheet sheet;
		XSSFRow row;
		String cellValue="";
		Object[][] data = null;
		int cellType;


		try {
			wbook = new XSSFWorkbook(new FileInputStream(new File("./data/inputs.xlsx")));
			sheet =wbook.getSheet(sheetName);
			row=sheet.getRow(0);
			int rowcount=sheet.getLastRowNum();
			int columncount=row.getLastCellNum();
			
			data= new Object[rowcount][columncount];		


			for(int i= 1; i<=rowcount; i++ ){
				row=sheet.getRow(i);
				for(int j=0; j<columncount; j++){
					cellType=row.getCell(j).getCellType();
					if(cellType==0){
						try{
						cellValue=row.getCell(j).getStringCellValue();
						}
						catch (Exception e) {
							// TODO: handle exception
						}
						
					}
					else if(cellType==1){
						try{
					
					 cellValue=row.getCell(j).getStringCellValue();
						}
						catch(Exception e){
							
						}
					}
					data[i-1][j]=cellValue;
					System.out.println("cell value"+" "+ data[i-1][j]);
				}
				
				

			}
			
			
			//wbook.close();

		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

}

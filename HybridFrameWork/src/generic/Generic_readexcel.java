package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_readexcel 
{
	public static String getData(String sheet, int row, int column) throws EncryptedDocumentException, IOException 
	{
		String val="";
		FileInputStream fis=new FileInputStream("./excel/Trail.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet).getRow(row).getCell(column);
		return val=c.getStringCellValue();
	}	
		
	}
package PackageOne;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	File file = null;
	FileInputStream inputStream = null;
	FileOutputStream outputStream = null;
	Workbook wb = null;
	Sheet sheet = null;
	
	public Excel(String _filename, String _sheet) throws IOException 
	{
		file = new File(System.getProperty("user.dir")+"\\src\\"+_filename) ;
		inputStream = new FileInputStream(file);
		String fileExtension = _filename.substring(_filename.lastIndexOf('.'));
		if(fileExtension.equals(".xlsx")) 
		{
			wb = new XSSFWorkbook(inputStream);
			sheet = wb.getSheet(_sheet);
		}
		else
		{
			wb = new HSSFWorkbook(inputStream);
		} 
	}
	
	public int rowCount()
	{	
		return sheet.getLastRowNum();		
	}
	
	public int coloumCountForRow(int rowNum)
	{	
		return sheet.getRow(rowNum).getLastCellNum();		
	}
	
	public String getCellValue(int rowNum,int colNum)
	{	
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	}
	
	public void setCellValue(int rowNum,int colNum,String data) throws IOException
	{	
		sheet.getRow(rowNum).createCell(colNum).setCellValue(data);
		inputStream.close();
		outputStream = new FileOutputStream(file);
		wb.write(outputStream);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException
	{		
		Excel excel = new Excel("ExportExcel.xlsx","ExcelGuru99Demo");
		System.out.println(excel.rowCount());
		System.out.println(excel.coloumCountForRow(0));
		System.out.println(excel.getCellValue(0, 0));
		excel.setCellValue(0, excel.coloumCountForRow(0), "Testing");
	}
}

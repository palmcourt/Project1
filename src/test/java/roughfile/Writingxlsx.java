package roughfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingxlsx {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("first sheet");
		Row row0 = sheet0.createRow(1);
		Row row1 = sheet0.createRow(2);
		Cell cell0 = row0.createCell(1);
		Cell cell1 = row0.createCell(2);
		cell0.setCellValue("shrihan");
		File f = new File("c:\\priyafile\\xlsxfile.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);
		fo.close();
		
		
		
		
		
		
	}
}

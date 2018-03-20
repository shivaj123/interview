package interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src= new File("F:\\honda.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet ws= wb.getSheetAt(0);
		ws.getRow(0).createCell(2).setCellValue("model");
		ws.getRow(0).createCell(3).setCellValue("price");
		
		ws.getRow(1).createCell(2).setCellValue("NSA700A9DN-01");
		ws.getRow(1).createCell(3).setCellValue("6288");
		
		ws.getRow(2).createCell(2).setCellValue("statehonda");
		ws.getRow(2).createCell(3).setCellValue("8288");
		
		ws.getRow(3).createCell(2).setCellValue("CTX1300");
		ws.getRow(3).createCell(3).setCellValue("10088");
		
		ws.getRow(4).createCell(2).setCellValue("GL18HPNMEGOLDWING");
		ws.getRow(4).createCell(3).setCellValue("11288");
		
		ws.getRow(5).createCell(2).setCellValue("GOLDWING");
		ws.getRow(5).createCell(3).setCellValue("14988");
		
		FileOutputStream fout= new FileOutputStream(src);
		wb.write(fout);
		wb.close();

	}

}

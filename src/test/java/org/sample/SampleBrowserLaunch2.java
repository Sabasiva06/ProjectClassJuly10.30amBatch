package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleBrowserLaunch2 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\3PmFrameWorkBatch\\ExcelData\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet createSheet = workbook.createSheet("7.30AmBatch");
		Row createRow = createSheet.createRow(3);
		Cell createCell = createRow.createCell(3);
		createCell.setCellValue("FrameworkClasss");
		FileOutputStream stream2 =new FileOutputStream(file);
		workbook.write(stream2);
		
		System.out.println("donee");
		
		// for reading --> we dont need to use fileOutuput Stream
		//for updating (or) Creating --> we need to use fileoutput stream
		//when we are going to update or creat a content in excel we need to close 
		//the file..otherwise it will throw exception
		
	}

}

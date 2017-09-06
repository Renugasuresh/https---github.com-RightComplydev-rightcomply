package com.rightcomply.UIAutomation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Xlreader {
	private static String xlpath;
	
	@DataProvider(name="dtparam")
	public static String [][]read(String xlpath,String sheetname) throws IOException
	
	{
		File xfile=new File(xlpath);
		FileInputStream xdoc=new FileInputStream(xfile);
		HSSFWorkbook wb=new HSSFWorkbook(xdoc);
		HSSFSheet sheetn=wb.getSheet(sheetname);
		int rcount=sheetn.getLastRowNum()+1;
		int ccount=sheetn.getRow(0).getLastCellNum();
		String[][] dataxl=new String[rcount][ccount];
		for(int i=0;i<rcount;i++)
		{
			for(int j=0;j<ccount;j++)
			{
				dataxl[i][j]=sheetn.getRow(i).getCell(j).getStringCellValue();
				System.out.println(sheetn.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		
	return dataxl;
		
	}
	

}

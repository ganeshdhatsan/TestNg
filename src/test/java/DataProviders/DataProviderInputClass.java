package DataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderInputClass {

	@DataProvider(name = "login_data_03")
	private Object[][] login_Info_03() {

		return new Object[][] {

				{ "edhachumPassPannu", "s" }, { "summaEngittayeKekkadha", "se" }, { "puriyudha", "sel" }

		};

	}

	@DataProvider
	private Object[][] login_Info_04() {

		return new Object[][] {

				{ "API", "s" }, { "SQL", "se" }, { "GIT", "sel" }

		};

	}

	@DataProvider
	private Object[][] login_Info_05() {

		return new Object[][] {

				{ 5, 10 }, { "API", "s" }, { true, false }, { 'x', 'y' }, { 25.56, 48.52 }

		};

	}
	

	@DataProvider(name = "LoginInfoFromWorkbook")
	public Object[][] validateLoginInfoFromWorkbook() throws IOException {
	    String[][] excelData = dataFromExcel();
	    Object[][] loginInfo = new Object[excelData.length][2]; 

	    for (int i = 0; i < excelData.length; i++) {
	        loginInfo[i][0] = excelData[i][0]; // user
	        loginInfo[i][1] = excelData[i][1]; // password
	    }
	    return loginInfo; // Returns all sets of login info
	}

	private String[][] dataFromExcel() throws IOException {
		DataFormatter format = new DataFormatter();
		File file = new File(System.getProperty("user.dir") + "\\Login Data.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(stream);
		XSSFSheet sheet = book.getSheet("Login Data");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("lastRowNum --> " + lastRowNum);
		XSSFRow row = sheet.getRow(0);
		int lastCellNum = row.getLastCellNum();
		System.out.println("lastCellNum --> " + lastCellNum);

		String[][] result = new String[lastRowNum][lastCellNum];
		System.out.println("size of array " + result.length);

		for (int i = 1; i <= lastRowNum; i++) {
			row = sheet.getRow(i);
			if (row != null) {
				for (int j = 0; j < lastCellNum; j++) {
					XSSFCell cell = row.getCell(j);
					if (cell != null) {
						String data = format.formatCellValue(cell);
						result[i - 1][j] = data;
						System.out.println("result --> " + (i - 1) + ":" + j + " " + data);
					}
				}
			}
		}
		book.close();
		stream.close();
		return result;

	}
	
}

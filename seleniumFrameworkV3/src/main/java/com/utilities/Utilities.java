package com.utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Utilities {
static Workbook book;
static Sheet sheet;
// Reading from excel sheet.
public static Object[][] getTestData(String sheetName) {
FileInputStream file = null;
try {
String inputData = "C:\\Users\\DELL\\OneDrive\\Desktop\\ProjectFolder\\TestData.xlsx";
file = new FileInputStream(inputData );
} catch (FileNotFoundException e) {
e.printStackTrace();
}
try {
book = WorkbookFactory.create(file);
}catch (InvalidFormatException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
} 
sheet = book.getSheet(sheetName);
Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
for (int i = 0; i < sheet.getLastRowNum(); i++) {
for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
}
}
return data;
}
}

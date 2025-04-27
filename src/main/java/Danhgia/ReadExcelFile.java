package Danhgia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
    XSSFWorkbook wb;
    XSSFSheet sheet;

    public ReadExcelFile(String excelPath) {
        try {
            File src = new File(excelPath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getStringData(int sheetnumber, int row, int column) {
        sheet = wb.getSheetAt(sheetnumber);
        return sheet.getRow(row).getCell(column).getStringCellValue();
    }

    public double getNumericData(int sheetnumber, int row, int column) {
        sheet = wb.getSheetAt(sheetnumber);
        return sheet.getRow(row).getCell(column).getNumericCellValue();
    }

    public int getRowCount(int sheetIndex) {
        return wb.getSheetAt(sheetIndex).getLastRowNum() + 1;
    }
}


package org.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;

public class ExcelUtil {

    public static Object[][] getExcelData(String resourceName, String sheetName) {

        try (InputStream is = ExcelUtil.class
                .getClassLoader()
                .getResourceAsStream(resourceName)) {

            if (is == null) {
                throw new RuntimeException(
                        "Excel file not found in classpath: " + resourceName
                );
            }

            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

            Object[][] data = new Object[rowCount - 1][colCount];

            for (int i = 1; i < rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                    data[i - 1][j] = sheet.getRow(i)
                            .getCell(j)
                            .toString();
                }
            }

            workbook.close();
            return data;

        } catch (Exception e) {
            throw new RuntimeException("Failed to read Excel file", e);
        }
    }
}

package com.hello.code.excel;


import com.hello.code.excel.entity.ExcelCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelAppTest {
    private String excelFileDir = "D:\\tmp\\hello-code";

    private List<ExcelCell> excelCellList;

    @Before
    public void init(){
        excelCellList = new ArrayList<>();

        ExcelCell cell1 = new ExcelCell();
        cell1.setCellValue("姓名");
        ExcelCell cell2 = new ExcelCell();
        cell2.setCellValue("年龄");
        ExcelCell cell3 = new ExcelCell();
        cell3.setCellValue("性别");
        ExcelCell cell4 = new ExcelCell();
        cell4.setCellValue("所在城市");
        ExcelCell cell5 = new ExcelCell();
        cell5.setCellValue("国家");

        excelCellList.add(cell1);
        excelCellList.add(cell2);
        excelCellList.add(cell3);
        excelCellList.add(cell4);
        excelCellList.add(cell5);
    }

    @Test
    public void createExcelFileTest() throws IOException {
        String excelFileName = System.currentTimeMillis() + ".xlsx";
        String excelFullFilePath = String.join(File.separator, excelFileDir, excelFileName);
        //Create blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        //Create a blank sheet
        XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");
        //Create row object
        XSSFRow row = spreadsheet.createRow(0);
        int index = 0;
        for(ExcelCell head : excelCellList){
            Cell cell = row.createCell(index);
            cell.setCellValue(head.getCellValue());
            index++;
        }
        findCellAndWriteValue(spreadsheet);
        FileOutputStream out = new FileOutputStream(excelFullFilePath);
        workbook.write(out);
        out.close();
    }

    public void findCellAndWriteValue(XSSFSheet spreadsheet){
        int rowIndex = 3;
        int cellIndex = 0;
        Row row = spreadsheet.getRow(rowIndex);
        if(null == row){
            row = spreadsheet.createRow(rowIndex);
        }
        Cell cell = row.getCell(cellIndex);
        if(null == cell){
            cell = row.createCell(cellIndex);
        }
        cell.setCellValue("测试");
    }
}
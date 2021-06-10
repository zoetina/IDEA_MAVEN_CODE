package java29_homework.day10;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

/**
 * @Project: java29_code
 * @Author: zoe
 * @Create: 2021-05-20 15:23
 * @Desc： 实现类
 **/
public class WriteBackDataTest {
    public static void main(String[] args) throws Exception {
        //ArrayList<WriteBackData> WBD = new ArrayList<>();
        //WriteBackData w1 = new WriteBackData(1,2,"Pass");
        //WriteBackData w2 = new WriteBackData(2,2,"Fail");
        //WriteBackData w3 = new WriteBackData(3,2,"Pass");
        //
        //WBD.add(w1);
        //WBD.add(w2);
        //WBD.add(w3);
        //System.out.println(WBD);

        /*
         *   1、用IO流去读excel文件（打开excel）
         *   2、POI解析excel文件得到 excel对象。
         *   3、获取sheet
         *   4、获取所有row
         *   5、获取所有cell
         *   6、修改内容
         * */
        //创建  修改

        //1、用IO流去读excel文件（打开excel）
        FileInputStream fis = new FileInputStream("src/test/resources/exam.xls");
        //2、POI解析excel文件得到 excel对象。
        Workbook sheets = WorkbookFactory.create(fis);
        //System.out.println(sheets);
        //3、获取sheet
        Sheet sheet = sheets.getSheet("用例");
        //4、获取所有row
        //获取当前sheet最大行号。
        int lastRowNum = sheet.getLastRowNum();
        for(int i=1;i<=lastRowNum;i++) {
            Row row = sheet.getRow(i);
            //获取当前row最大列号。
            int lastCellNum = row.getLastCellNum();
            //5、获取所有cell
            for(int j=0;j<lastCellNum;j++) {
                //6、打印内容
                //修改cell数据格式为String
                Cell cell = row.getCell(j);
                //cell.setCellValue();
                cell.setCellType(CellType.STRING);
                System.out.print(cell.getStringCellValue() + ",");
            }
            System.out.println();
        }

    }
    }


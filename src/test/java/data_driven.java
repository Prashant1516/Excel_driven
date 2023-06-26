import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class data_driven {
    public static void main(String[] args) throws IOException {
        FileInputStream file= new FileInputStream("J:\\Testdata.xls");
        XSSFWorkbook workbook =new XSSFWorkbook(file);
       int sheets= workbook.getNumberOfSheets();//no of sheet in excel file
       for(int i=0;i<sheets;i++)//assigning i to every sheet
       {
           if (workbook.getSheetName(i).equalsIgnoreCase("Testdata"))// checking if sheet is =Testdata
           {
              XSSFSheet sheet= workbook.getSheetAt(i);//getting index of that sheet with= testdata
               Iterator<Row> rows= sheet.iterator();
              Row first_row=rows.next();// selecting first row
               Iterator<Cell> cell= first_row.iterator();
               while (cell.hasNext())
               {
                   Cell value= cell.next();
                   if (value.getStringCellValue().equalsIgnoreCase("Testdata"))
                   {

                   }
               }


           }
       }
    }
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JFileChooser;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {

	public static void main(String[] args) {
		JFileChooser fileChooser = new JFileChooser();
		int returnValue = fileChooser.showOpenDialog(null);
		
		if(returnValue == JFileChooser.APPROVE_OPTION) {
				
			try {
					XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(fileChooser.getSelectedFile()));
					XSSFSheet sheet = workbook.getSheetAt(1);
					Iterator<Row> rowIterator = sheet.rowIterator();
					while(rowIterator.hasNext()) {
						Row row = rowIterator.next();
						Iterator<Cell> cellIterator = row.cellIterator();
						while(cellIterator.hasNext()) {
							Cell cell = cellIterator.next();

							System.out.println(cell.getCellType() + "\t\t");

							}
							else if (ct == Cell.CELL_TYPE_NUMERIC) {
								String str = NumberToTextConverter.toText(cell.getNumericCellValue())
								System.out.println(str + "\t\t");
							}
						}
					}
					workbook.close();
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JFileChooser;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {

	public static void main(String[] args) {
		JFileChooser fileChooser = new JFileChooser();
		int returnValue = fileChooser.showOpenDialog(null);
		
		if(returnValue == JFileChooser.APPROVE_OPTION) {
				
			try {
					XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(fileChooser.getSelectedFile()));
					FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
					
					// Sheet sheet = workbook.getSheetAt(1);
//					Iterator<Row> rowIterator = sheet.rowIterator();
//					while(rowIterator.hasNext()) {
//						Row row = rowIterator.next();
//						Iterator<Cell> cellIterator = row.cellIterator();
//						while(cellIterator.hasNext()) {
//							Cell cell = cellIterator.next();
					
				for (Sheet sheet : workbook) {
					for (Row row : sheet) {
						for (Cell cell : row) {
							switch (cell.getCellType()) {
							case STRING:
								System.out.print(cell.getStringCellValue() + "\t");
								break;
							case NUMERIC:
								if (DateUtil.isCellDateFormatted(cell)) {
									System.out.print(cell.getRichStringCellValue().getString() + "\t");
								} else {
									System.out.print(cell.getNumericCellValue() + "\t");
								}
								break;
							case BOOLEAN:
								System.out.print(cell.getBooleanCellValue() + "\t");
								break;
							case FORMULA:
								System.out.print(evaluator.evaluateFormulaCell(cell) + "\t");
								break;
							case BLANK:
								System.out.print("\t");
								break;
							default:
								System.out.println();
							}
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

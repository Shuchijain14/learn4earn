package file_handling;

public class Manage_XLSX 
{

	public static void main(String[] args) 
	{
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir") + "\\src\\shuchi\\automation\\file_handling\\Data.xlsx.xlsx";
		Xls_Reader xls = new  Xls_Reader(path);
		
		//1. Counting Rows in Excel
		int rows = xls.getRowCount("LoginTest");
		System.out.println(rows);
		
		//2. Counting Columns in Excel
		int cols = xls.getColumnCount("LoginTest");
		System.out.println(cols);
		
		//3. Reading Data in Excel
		String data = xls.getCellData("LoginTest", "Browser", 3);
		System.out.println(data);
		String data1 = xls.getCellData("LoginTest", 2, 2);
		System.out.println(data1);
		String data2 = xls.getCellData("LoginTest", "Password", 4);
		System.out.println(data2);
		
		//4. Writing Data in Excel
		xls.setCellData("LoginTest", "Browser", 10, "FireFox");
		
		
	}

}

import java.io.FileWriter;

public class ExportToCSV 
{
	private FileWriter file;
	
	private static final String DELIMITER = ",";
	private static final String SEPARATOR = "\n";
	private static final String HEADER = "Item, Amount, Customizations";
	
	public ExportToCSV(FileWriter file) 
	{
		this.setFile(file);
	}
	
	public FileWriter getFile() 
	{
		return file;
	}
	
	public void setFile(FileWriter file) 
	{
		this.file = file;
	}
	
	{
	try 
	{
		FileWriter file = new FileWriter("Test.csv");
	} 	
		catch(Exception e) 
	{
		
	}
	}
}

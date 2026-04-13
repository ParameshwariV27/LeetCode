package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSortingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FileSort> fs = new ArrayList<>();
		
		fs.add(new FileSort("FI-CORE.pdf", 123455));
		fs.add(new FileSort("FI-CRM.txt", 345677));
		fs.add(new FileSort("CV.pdf", 3456547));
		fs.add(new FileSort("ParameshwariV.txt", 341277));
		fs.add(new FileSort("ghgh.txt", 345670));
		fs.add(new FileSort("FI-CORE.txt", 345077));
		Collections.sort(fs);
		fs.stream().forEach(System.out::println);
	}

}
class FileSort implements Comparable<FileSort>
{
	private String fileName;
	private Integer size;
	
	public FileSort(String fileName, int size)
	{
		this.fileName=fileName;
		this.size=size;
	}
	
	@Override
	public String toString()
	{
		return "FileSort["+" FileName="+fileName+", Size="+size+"]";
	}
	
	@Override
	public int compareTo(FileSort o)
	{
		int ext = this.fileName.lastIndexOf(".",0);
		String sub = this.fileName.substring(ext+1);
		int ext1 = o.fileName.lastIndexOf(".",0);
		String sub1 = o.fileName.substring(ext1+1);
		Integer res = sub.compareTo(sub1);
		if(res!=0)
		{
			return res;
		}
		Integer resSize = Integer.compare(this.size, o.size);
		return resSize;
	}
}
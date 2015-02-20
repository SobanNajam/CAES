package main;
import java.io.*;
import java.util.*;
public class CSVRead{
   List<Integer> paid = new ArrayList<Integer>();

 public int[] reader() throws IOException {

  BufferedReader CSVFile =
        new BufferedReader(new FileReader("c:\\csvfile.csv"));

  String dataRow = CSVFile.readLine(); // Read first line.
  // The while checks to see if the data is null. If
  // it is, we've hit the end of the file. If not,
  // process the data.

  dataRow = CSVFile.readLine();
  while (dataRow != null){
   String[] dataArray = dataRow.split("\n");
   for (String item:dataArray) {
       paid.add(Integer.parseInt(item));
   }
   System.out.println(); // Print the data line.
   dataRow = CSVFile.readLine(); // Read next line of data.
  }
  // Close the file once all data has been read.
  CSVFile.close();
  int array[] = new int[paid.size()];

  for (int i=0; i< paid.size(); i++ )
      array[i]= paid.get(i);
  return array;

 } //main()
} // CSVRead
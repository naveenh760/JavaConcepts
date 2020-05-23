package lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterEx {

	public static void main(String[] args) {
		
//      FileFilter filter = new FileFilter() {
//
//          @Override
//          public boolean accept(File pathname) {
//              
//              return pathname.getName().endsWith(".java");
//          }
//      };
      
      FileFilter filterLambda = (File pathname) -> 
              pathname.getName().endsWith("");
      
      File dir = new File("C:\\PtcExportViewer");
      
      File[] files = dir.listFiles(filterLambda);
      
      for (File f : files) {
          System.out.println(f);
      }
		
		
      

	}
	
	

}

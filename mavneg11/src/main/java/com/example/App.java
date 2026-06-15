package com.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String> fruits=ImmutableList.of("Apple","Banna","Cherry");
        System.out.println(fruits);
        File sourceFile=new File("source.txt");
        File dest=new File("dest.txt");
        try{
        	FileUtils.copyFile(sourceFile,dest);
        	System.out.println("File Copied Successfully!");
        }catch(IOException e) {
        	System.out.println("Error occured while Copying file:"+e.getMessage());
        }
    }
}

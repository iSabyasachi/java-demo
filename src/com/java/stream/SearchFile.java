package com.java.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchFile {
	public static void main(String[] args) throws IOException {
        String path ="C:\\test";
        System.out.println(listAllFiles(path));
    }
    // Uses Files.walk method   
   
    public static long listAllFiles(String path) throws IOException{
        System.out.println("In listAllfiles(String path) method");
        long totalFiles = 0;
        totalFiles = Files.walk(Paths.get(path)).count();
        Set<Path> files= Files.walk(Paths.get(path)).filter(ele -> ele.toFile().getAbsolutePath().contains(".java")).collect(Collectors.toSet());
        System.out.println(files);
        System.out.println(files.size());
        //Stream<Path> paths = Files.walk(Paths.get(path));        
        //totalFiles = paths.filter(i -> i.endsWith(".java")).count();
        return totalFiles;
    }

}

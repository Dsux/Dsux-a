package com.xdsux.spring2.entities;

import java.io.File;

public class FileBuilder {
	public static void main(String[] args) {
		File path = new File(".");

		File[] list;
		list = path.listFiles();
		for(File dirItem : list)
			System.out.println(dirItem.getAbsolutePath());
	}
	

}

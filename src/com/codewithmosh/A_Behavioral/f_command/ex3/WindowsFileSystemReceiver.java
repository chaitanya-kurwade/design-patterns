package com.codewithmosh.A_Behavioral.f_command.ex3;

public class WindowsFileSystemReceiver implements FileSystemReceiver{

	@Override
	public void openFile() {
		System.out.println("opening file in windows os");		
	}

	@Override
	public void writeFile() {
		System.out.println("writing file in windows os");
		
	}

	@Override
	public void closeFile() {
		System.out.println("closing file in windows os");
		
	}

}

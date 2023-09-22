package com.codewithmosh.A_Behavioral.f_command.ex3;

public class UnixFileSystemReceiver implements FileSystemReceiver{

	@Override
	public void openFile() {
		System.out.println("opening unix file");		
	}

	@Override
	public void writeFile() {
		System.out.println("writing unix file");
	}

	@Override
	public void closeFile() {
		System.out.println("closing unix file");
	}
}

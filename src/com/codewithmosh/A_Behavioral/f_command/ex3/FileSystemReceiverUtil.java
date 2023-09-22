package com.codewithmosh.A_Behavioral.f_command.ex3;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getTheFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying os name: "+osName);
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}
	
}

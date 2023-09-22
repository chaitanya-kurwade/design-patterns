package com.codewithmosh.A_Behavioral.f_command.ex3;

public class CloseFileCommand implements Command{

	private FileSystemReceiver fileSystemReceiver;
	
	public CloseFileCommand (FileSystemReceiver fileSystemReceiver) {
		this.fileSystemReceiver = fileSystemReceiver;
	}
	
	@Override
	public void execute() {
			this.fileSystemReceiver.closeFile();
	}

}

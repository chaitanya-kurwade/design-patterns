package com.codewithmosh.B_Structural.c_decorator.lecture;

public class EncryptedColudStream implements Stream{

	private Stream stream;
	
	public EncryptedColudStream(Stream stream) {
		this.stream = stream;
	}
	
	@Override
	public void write(String data) {
		var encrypted = encrypt(data);
		stream.write(encrypted);
	}

	public String encrypt(String data) {
		return "*%(*$#KJOIJERjfokwjf";
	}
	
}

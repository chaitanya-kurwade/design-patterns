package com.codewithmosh.B_Structural.c_decorator;

import com.codewithmosh.B_Structural.c_decorator.lecture.CloudStream;
import com.codewithmosh.B_Structural.c_decorator.lecture.CompressedCloudStream;
import com.codewithmosh.B_Structural.c_decorator.lecture.EncryptedColudStream;
import com.codewithmosh.B_Structural.c_decorator.lecture.Stream;

public class LectureMain {

	public static void main(String[] args) {
		storeCreditCard(new CompressedCloudStream(new EncryptedColudStream(new CloudStream())));
	}

	public static void storeCreditCard(Stream stream) {
		stream.write("1234-1234-1234-1234");
	}
}

package com.ibercode;

import java.util.function.IntUnaryOperator;

public class Caesar {

	private int shift;
	private IntUnaryOperator mapperEnc = c -> c + shift;
	private IntUnaryOperator mapperDec = c -> c - shift;

	public Caesar(int shift) {
		super();
		this.shift = shift;
	}

	public String encrypt(String word) {
		return getString(word, mapperEnc);
	}

	public String dencrypt(String word) {
		return getString(word, mapperDec);
	}

	private String getString(String word, IntUnaryOperator mapperEnc) {
		StringBuilder sb = new StringBuilder();
		word.chars()
		.map(mapperEnc)
		.forEach(c -> sb.append(Character.toString((char) c)));

		return sb.toString();
	}

}

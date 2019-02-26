package com.cenit.Spring_FirstApp03;

import org.springframework.beans.factory.annotation.Autowired;


public class Logger {
	
	@Autowired
	private ConsoleWriter consolewrite;
	
	@Autowired
	private FileWriter filewrite;
	
	public void setConsolewrite(ConsoleWriter consolewrite) {
		this.consolewrite = consolewrite;
	}
	public void setFilewrite(FileWriter filewrite) {
		this.filewrite = filewrite;
	}
	public void writeFile(String text)
	{
		filewrite.write(text);
	}
	public void consoleWrite(String text)
	{
		consolewrite.write(text);
	}

}

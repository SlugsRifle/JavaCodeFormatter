package com.SlugsRifle;

public class CodeFormatter                  {
	
	String str                              ;
	
	public CodeFormatter()                  {
		this("")                            ;}
	
	public CodeFormatter(String str)        {
		this.str = str                      ;}
	
	public CodeFormatter set(String str)    {
		this.str = str                      ;
		return this                         ;}
		
	public CodeFormatter run()              {
		return this                         ;}}
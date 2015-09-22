package org.dimigo.exception;

public class AgeCheckException extends Exception{
	
	public AgeCheckException(){
		
	}
	
	public AgeCheckException(Movie movie){
		super(movie.getTitle()+"는 "+movie.getAge()+"세 이상 관람가입니다.");
	}

}

package org.dimigo.exception;

public class MovieTest {
	
	public static void main(String[] args) {
		try{
			Movie[] movies = {
					new Movie("앤트맨",12), new Movie("사도",12),
					new Movie("베테랑",15)
			};
			int age = 13;
			
			for(Movie movie : movies){
				buyTicket(movie,age); // 여기서 예외 던짐
				}
			} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	private static void buyTicket(Movie movie,int age) throws AgeCheckException{
		if(age < movie.getAge()){
			throw new AgeCheckException(movie);
		} else {
			System.out.println(movie.getTitle() + " 즐감하세요~");
		}
	}

}

package Day13.Ex05_Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. Movie 영화 클래스 정의
 * 2. Movie 변수는 title, autor, price로 변수 선언
 * 3. 영화를 제목순으로 오름차순 정렬
 *   - String 의 conpareTo()를 활용
 *   	해당 문자열.compareTO(비교문자열)
 *   	* 해당문자열이 사전순으로 더 뒤에 있으면(양수)
 *   	* 해당문자열이 사전순으로 더 앞에 있으면(음수)
 *   	* 같은 문자열이면 0
 */

class Movie implements Comparable<Movie>{
	String title;
	String autor;
	int price;
	
	public Movie() {
		this("제목없음", "감독없음", 0);
	}
	public Movie(String title, String autor, int price) {
		this.title = title;
		this.autor = autor;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", autor=" + autor + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Movie o) {
		String thistitle = this.getTitle();
		String comtitle = o.getTitle();
		int result = thistitle.compareTo(comtitle); // 문자열 비교는 compareTo 사용해서 비교
		return -result;  // -result(내림차순) / result(오름차순)
	}
	
	
	
	
}


public class ComparableEx2 {
	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<Movie>();
		
		movieList.add(new Movie("베테랑", "황전민", 50000));
		movieList.add(new Movie("인셉션", "디카프리오", 40000));
		movieList.add(new Movie("범죄도시1", "장첸", 30000));
		movieList.add(new Movie("파일럿", "조정석", 20000));
		movieList.add(new Movie("타짜", "조승우", 10000));
		
		//정렬 전
		System.out.println("정렬 전");
		for (Movie movie : movieList) {
			System.out.println(movie);
			
		}
		System.out.println("------------------------------");
		// 정렬
		// Movie 클래스에서 구현한 compareTo() 메소드의 비교 기준에 따라서 정렬
		Collections.sort(movieList);
		
		//정렬후
		System.out.println("정렬 후");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println("------------------------------");
	}

	
	}

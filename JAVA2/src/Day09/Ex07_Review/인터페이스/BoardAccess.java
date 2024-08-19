package Day09.Ex07_Review.인터페이스;

public class BoardAccess implements BoardInterface {

	int count = 5;
	Board[] boardList = {
			new Board("제목01", "작성자01", "내용01"),
			new Board("제목02", "작성자02", "내용02"),
			new Board("제목03", "작성자03", "내용03"),
			new Board("제목04", "작성자04", "내용04"),
			new Board("제목05", "작성자05", "내용05"),
	};
	
	/**
	 * 게시글 등록
	 * 1. 매개변수로 넘겨받은 board 객체에 게시글 번호를 부여한다.
	 * 2. 등록일자와 수정일자를 현재 날짜/시간으로 지정한다.
	 * 3. board 객체를 현재까지 등록된 배열요소 다음 index에 저장한다.
	 * 4. 등록된 board 객체를 반환한다.
	 */
	
	@Override
	public Board create(Board board) {
		
		int boardNo = count++;
		board.setNo(boardNo);
		String redDate = "2024/08/19 - 18:00";
		String upDate = "2024/08/19 - 18:00";
		board.setRegDate(redDate);
		board.setUpDate(upDate);
		
		boardList[count-1] = board;
		System.out.println(board);
		System.out.println("게시글이 등록되었습니다.");
		
		return board;
		
	}
	/**
	 * 게시글 목록
	 * 1. 게시글이 존재는지 확인하고 1개의 게시글도 없으면 null을 반환
	 * 2. 게시글이 존재하면, 전체 게시글 배열인 boardList를 반환
	 */
	
	@Override
	public Board[] list() {
		if(count == 0) {
			return null;
		}
		else {
			return boardList;
		}
	}
	/**
	 * 게시글 조회
	 * 1. 넘겨받은 게시글 번호 no가 유효한지 확인하고 유효하지 않으면, null 반환
	 * 2. 게시글 번호 no가 유효하면, 번호에 해당하는 boardList[]의 요소 반환
	 */
	@Override
	public Board read(int no) {
		if(no <= 0 || count >= 5) {
			return null;
		}
		else {
			return boardList[no-1];
		}
	}
	/**
	 * 게시글 수정
	 * 1. 수정할 게시글 번호 no가 유효하지 않으면, 0 반환
	 * 2. 수정할 게시길 번호 no가 유효하면, 
	 *  - 번호에 해당하는 boardList[] 요소를 변경
	 *  - 수정일자(upDate)를 현재 날짜/시간으로 변경
	 *  - 수정된 게시글 수 1을 반환
	 */
	@Override
	public int update(Board board) {
		if(board.getNo() <= 0 || count >= 5) {
		return 0;}
		else {
	
			boardList[board.getNo() -1 ] = board;
			String upDate = "2024/08/19 - 18:15";
			board.setUpDate(upDate);
		}
		return 1;
		
	}
	
	/**
	 * 게시글 삭제
	 * 1. 삭제할 게시글 번호 no가 유효하지 않으면, 0을 반환
	 * 2. 게시글이 하나도 존재하지 않으면, 0 반환
	 * 3. 삭제할 게시글 번호 no가 유효하면, 
	 * 		- 번호에 해당하는 boardList[]요소를 null로 변경
	 * 		- 해당 index 다음으 요소들을 앞으로 한 칸식 당겨준다.
	 * 		- 게시글 개수 count를 1 감소시킨다.
	 */
	@Override
	public int delete(int no) {
		return 0;
	}
}

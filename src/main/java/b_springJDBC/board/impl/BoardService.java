package b_springJDBC.board.impl;

import java.util.List;

import b_springJDBC.board.BoardVO;

public interface BoardService {
	
	// 글 등록
	void insertBoard(BoardVO vo);
	
	// 글 상세 조회
	BoardVO getBoard(BoardVO vo);

	// 글 목록 조회
	List<BoardVO> getBoardList(BoardVO vo);
	
}
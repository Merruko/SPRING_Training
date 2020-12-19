package d_springDBCP.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import d_springDBCP.board.BoardService;
import d_springDBCP.board.BoardVO;
import d_springDBCP.board.impl.BoardDAOSpring;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
//	@Autowired
//	private BoardDAO boardDAO;
	
	@Autowired
	private BoardDAOSpring boardDAO;
	

	public void insertBoard(BoardVO vo) {
//		if(vo.getSeq()==0) {
//			throw new IllegalArgumentException("0번 글은 등록하실 수 없습니다.");
//		}
		boardDAO.insertBoard(vo);
		
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
		
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
		
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
	
}
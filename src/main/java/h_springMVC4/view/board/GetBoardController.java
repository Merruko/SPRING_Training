package h_springMVC4.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import h_springMVC4.biz.board.BoardVO;
import h_springMVC4.biz.board.impl.BoardDAO;

public class GetBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글상세조회 처리");
		
//		1) 검색할 게시글 번호 추출
		String seq = request.getParameter("seq");
		
//		2) DB연동 처리
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);
		
//		3) 검색 결과를 세션에 저장하고 상세 화면으로 리턴 
//		HttpSession session  = request.getSession();
//		session.setAttribute("board", board);
//		return "getBoard";
		ModelAndView mav = new ModelAndView();
		mav.addObject("board", board);
		mav.setViewName("getBoard");
		return mav;
	}
}

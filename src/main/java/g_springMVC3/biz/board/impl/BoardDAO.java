package g_springMVC3.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import g_springMVC3.biz.board.BoardVO;
import g_springMVC3.biz.common.JDBCUtil;

//@Repository("boardDAO")	// 데이터연동을 담당하는 클래스에서 객체를 생성한다는 표시, 컴포넌트 대신에 사용 
public class BoardDAO {
	//JDBC 관련변수 
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	//SQL명령어들
//	(mysql)
//	private final String BOARD_INSERT = "insert into board(seq, title, writer, "
//			+ "			content, regdate) values ((select ifnull(max(seq)+1,1)+1 from board b),?,?,? now())";
	private final String BOARD_INSERT = "insert into board(seq, title, writer, "
			+ "			content) values ((select nvl(max(seq), 0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
	//CRUD 기능의 메소드 구현
	// 글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoard() 기능 처리 ");
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// 글 수정 
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoard() 기능 처리 ");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
		
	// 글 삭제  
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoard() 기능 처리 ");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// 글 상세조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> JDBC로 getBoard() 기능 처리 ");
		BoardVO board = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			while(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getNString("TITLE"));
				board.setWriter(rs.getNString("WRITER"));
				board.setContent(rs.getNString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		} 	
		return board;
	}
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("===> JDBC로 getBoardList() 기능 처리 ");
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			while(rs.next()){
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getNString("TITLE"));
				board.setWriter(rs.getNString("WRITER"));
				board.setContent(rs.getNString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		} 	
		return boardList;
	}
}

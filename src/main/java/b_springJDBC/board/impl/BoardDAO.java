package b_springJDBC.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import b_springJDBC.board.BoardVO;
import b_springJDBC.common.JDBCUtil;

@Repository("boardDAO")
public class BoardDAO implements BoardService {
	
	// JDBC 관련변수 
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	// SQL명령어들
	private final String BOARD_INSERT = "INSERT INTO board(seq, title, writer, "
			+ "			content) VALUES((SELECT nvl(max(seq), 0)+1 FROM board),?,?,?)";
//	private final String BOARD_UPDATE = "UPDATE board SET title=?, content=? WHERE seq=?";
//	private final String BOARD_DELETE = "DELETE board WHERE seq=?";
	private final String BOARD_GET = "SELECT * FROM board WHERE seq=?";
	private final String BOARD_LIST = "SELECT * FROM board ORDER BY seq DESC";
	
	// CRUD 기능의 메소드 구현
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
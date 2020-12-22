package g_springMVC3.view.controller;

import java.util.HashMap;
import java.util.Map;

import g_springMVC3.view.board.DeleteBoardController;
import g_springMVC3.view.board.GetBoardController;
import g_springMVC3.view.board.GetBoardListController;
import g_springMVC3.view.board.InsertBoardController;
import g_springMVC3.view.board.UpdateBoardController;
import g_springMVC3.view.user.LoginController;
import g_springMVC3.view.user.LogoutController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}

	public Controller getController(String path) {
		return mappings.get(path);
	}
}
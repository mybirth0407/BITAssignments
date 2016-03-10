package Practice6.prob6;

import java.util.LinkedList;
import java.util.List;

public class BoardDao {
    List<Board> list = new LinkedList<Board>();

    BoardDao() {
        Board[] boards = new Board[3];
        for (int i = 0; i < boards.length; i++) {
            boards[i] = new Board("제목" + (i + 1), "내용" + (i + 1));
            list.add(boards[i]);
        }
    }

    public List<Board> getBoardList() {
        return list;
    }

}

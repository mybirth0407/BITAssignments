package mysite.action.guestbook;

import mysite.web.action.Action;
import mysite.web.action.ActionFactory;

public class GuestBookActionFactory extends ActionFactory {
    @Override
    public Action getAction(String actionName) {
        Action action = null;

        if ("insert".equals(actionName)) {
            action = new GuestBookInsertAction();
        }
        else if ("delete".equals(actionName)) {
            action = new GuestBookDeleteAction();
        }
        else {
            action = new GuestListAction();
        }
        return action;
    }
}

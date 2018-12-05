package pl.infoshare.lastLesson.view.component.tabbedPane;


import pl.infoshare.lastLesson.view.panel.tab.UserInfoTab;
import pl.infoshare.lastLesson.view.panel.tab.UserListTab;

public class MainTabbedPane extends BaseTabbedPane {

    private UserInfoTab userInfoTab;
    private UserListTab userListTab;



    protected void configureComponent() {

    }


    protected void addComponents() {

    }

    protected void initComponents() {
        userInfoTab = new UserInfoTab();
        userListTab = new UserListTab();
    }

}

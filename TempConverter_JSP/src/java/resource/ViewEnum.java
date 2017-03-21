package resource;

public enum ViewEnum
{
    START("/view/start.jsp"),
    RESULT("/WEB-INF/result/result.jsp"),
    ERROR("/WEB-INF/error/errorView.jsp"),
    EXCEPTION("/WEB-INF/error/exceptionView.jsp"),
    FORM_HOME("/WEB-INF/includes/formGoHome.jsp");

    private String view;

    private ViewEnum(String view)
    {
        this.view = view;
    }

    public String getView()
    {
        return view;
    }

}

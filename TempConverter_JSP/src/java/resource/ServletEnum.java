package resource;

public enum ServletEnum {
    HELLOWORLD("/HelloWorld"),
    ERRORHANDLER("/ErrorHandler");

    private String urlPattern;

    private ServletEnum(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

}

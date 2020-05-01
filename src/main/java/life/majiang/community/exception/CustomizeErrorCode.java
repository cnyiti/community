package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你找的问题不在了，要不换个试试-=-"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中如何问题和评论进行回复"),
    NOT_LOGIN(2003,"当前操作需要登录，请登录后重试"),
    SYS_ERROR(2004,"服务猫眼了"),
    TYPE_PATH_WRONG(2005,"评论类型错误或不存在，要不换个试试-=-"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在，要不换个试试-=-"),
    COMMENT_IS_EMPTY(2007,"输入内容不能为空-=-"),
    READ_NOTIFICATION_FAIL(2008,"兄弟你这是读别人的信息呢"),
    NOTIFICATION_NOT_FOUND(2009,"消息莫非是不翼而飞了？"),

    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code ;
    }

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code,String message) {
        this.message = message;
        this.code = code;
    }


}

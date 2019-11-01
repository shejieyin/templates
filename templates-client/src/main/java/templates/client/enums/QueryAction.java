package templates.client.enums;

public enum QueryAction {


    QUERY_BY_ID("QUEEY_BY_ID"),
    QUERY_BY_STUDENT_NO("QUERY_BY_STUDENT_NO"),
    QUERY_BY_NAME("QUERY_BY_NAME");
    String queryAction;

    QueryAction(String queryAction){
        this.queryAction = queryAction;
    }

    public String getQueryAction(){
        return this.queryAction;
    }


}

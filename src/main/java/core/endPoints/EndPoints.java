package core.endPoints;

public enum EndPoints {
    EMPLOYEE("https://dummy.restapiexample.com/api/v1/employees"),
    EMPLOYEEBYID("https://dummy.restapiexample.com/api/v1/employee/"),
    CREATEEMPLOYEE("https://dummy.restapiexample.com/api/v1/create"),
    DELETEEMPLOYEEBYID("https://dummy.restapiexample.com/api/v1/delete/");

    private final String url;

    EndPoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

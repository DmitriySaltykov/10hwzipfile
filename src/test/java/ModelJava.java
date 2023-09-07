


import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelJava {

    @JsonProperty("mdm_id")
    private String mdm_id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("client_type")
    private String client_type;
    @JsonProperty("organization")
    private String organization;

    public String getId() {
        return mdm_id;
    }

    public void setId(String id) {
        this.mdm_id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClientType() {
        return client_type;
    }


    public void setClient_type(String client_type) {
        this.client_type = client_type;
    }

    public String getOrganization() {
        return organization;
    }


    public void setOrganization(String organization) {
        this.organization = organization;
    }




    }

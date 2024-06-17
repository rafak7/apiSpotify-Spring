package desenvolvimento.api.spotify.client;

import feign.form.FormProperty;

public class LoginRequest {

    @FormProperty("grant_type")
    private String grandType;

    @FormProperty("client_id")
    private String clientId;

    @FormProperty("client_secret")
    private String clientSecret;


    public LoginRequest() {
    }

    public LoginRequest(String grandType, String clientId, String clientSecret) {
        this.grandType = grandType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getGrandType() {
        return grandType;
    }

    public void setGrandType(String grandType) {
        this.grandType = grandType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}

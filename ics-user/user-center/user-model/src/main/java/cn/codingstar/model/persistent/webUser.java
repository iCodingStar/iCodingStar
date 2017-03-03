package cn.codingstar.model.persistent;


import cn.codingstar.common.authorization.AuthorizationHelper;

public class WebUser extends BaseModel{

    private String username;

    private String password;

    private String passwordSalt;

    private String token;

    private String nickname;

    private Boolean enable;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt == null ? null : passwordSalt.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public void encodePassword() {
        this.password = AuthorizationHelper.encodePassword(this.password, this.passwordSalt);
    }

    public boolean checkPassword(String password) {
        return this.password.equals(AuthorizationHelper.encodePassword(password, this.passwordSalt));
    }

    public void generateToken() {
        this.token = AuthorizationHelper.generateToken(this.username, this.password);
    }
}
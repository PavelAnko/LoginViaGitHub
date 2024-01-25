package ua.kiev.prog.oauth2.loginviagoogle.dto;

public class AccountDTO {
    private final String email;
    private final String name ;
    private final String avatar_url;

    private AccountDTO(String email, String name , String avatar_url) {
        this.email = email;
        this.name  = name ;
        this.avatar_url = avatar_url;
    }

    public static AccountDTO of(String email, String name, String avatar_url) {
        return new AccountDTO(email, name, avatar_url);
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name ;
    }

    public String getPictureUrl() {
        return avatar_url;
    }
}

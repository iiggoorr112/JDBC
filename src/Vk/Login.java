package Vk;

public class Login {
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPasswor() {
        return passwor;
    }

    public void setPasswor(int passwor) {
        this.passwor = passwor;
    }

    private int passwor;


    public Login(String login, int passwor) {
        this.login = login;
        this.passwor = passwor;
    }

    @Override
    public String toString() {
        return "Login{" +
                "login='" + login + '\'' +
                ", passwor=" + passwor +
                '}';
    }


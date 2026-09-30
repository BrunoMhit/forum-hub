package br.com.forum_hub.domain.autenticacao.github;

public class LoginGithubService {

    public String gerarUrl(){
        return "https://github.com/login/oauth/authorize"+
                "?client_id=Ov23LinqPz0cwrTV1Rau"+
                "&redirect_uri=http://localhost:8080/login/github/autorizado"+
                "&scope=read:user,user:email";
    }
}

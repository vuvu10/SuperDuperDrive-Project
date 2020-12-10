package com.udacity.jwdnd.course1.cloudstorage.model;

public class User {

    private int userid;
    private String username;
    private String salt;
    private String password;
    private String firstname;
    private String lastname;

    private String role;
    private List <File> files;
    private List <Notes> notes;

    public collection<GrantedAuthority>getAuthorities() {

        collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        GrantedAuthority grantedAuthority = new GrantedAuthority() {
            //
            public String getAuthority() {
                return "ROLE_USER";
            }
        };
        grantedAuthorities.add(grantedAuthority);
        return grantedAuthorities;
    }

}


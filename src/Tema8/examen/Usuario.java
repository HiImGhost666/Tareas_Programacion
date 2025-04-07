
package Tema8.examen;

import java.util.Comparator;

/**
 *
 * @author jvega
 */
public class Usuario{
    private String nick;
    private String email;
    private int password;
    
    public Usuario (String nick, String email, int password) {
        this.nick = nick;
        this.email = email;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return String.format("\t%-16s %-28s %-4d",
                         nick, email, password);
    }

    public int getPassword() {
        return password;
    }

    public String getNick() {
        return nick;
    }

    public String getEmail() {
        return email;
    }

    public int compare(Usuario u1, Usuario u2) {
        return u1.nick.compareTo(u2.nick);
    }

}

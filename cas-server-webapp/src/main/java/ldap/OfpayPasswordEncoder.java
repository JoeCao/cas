package ldap;

import org.apache.commons.codec.digest.DigestUtils;
import org.jasig.cas.authentication.handler.PasswordEncoder;

/**
 * Created with IntelliJ IDEA.
 * User: caozupeng
 * Date: 13-8-29
 * Time: 下午12:58
 * To change this template use File | Settings | File Templates.
 */
public class OfpayPasswordEncoder implements PasswordEncoder {

    public String encode(String password) {
        String hex = DigestUtils.sha256Hex(password);
        return hex;
    }
}

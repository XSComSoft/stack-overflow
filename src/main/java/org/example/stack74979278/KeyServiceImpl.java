package org.example.stack74979278;

import sun.misc.BASE64Decoder;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.List;
import java.util.Properties;

/**
 * Operation by XSSoft LXC
 * 由 星溯软件科技（莆田）有限公司 连旭灿 进行创建
 * Create at 2023/1/2
 * 创建于 2023/1/2
 * the designer is lxc@xssoft.club || mawserver@foxmail.com
 * 作者联系方式 lxc@xssoft.club 或 mawserver@foxmail.com
 *
 * @author DogeOdell/MawManager[Same people]
 * @author DogeOdell/MawManager[同人]
 * ____  ___   _________   _________            _____    __
 * \   \/  /  /   _____/  /   _____/   ____   _/ ____\ _/  |_
 * \     /   \_____  \   \_____  \   /  _ \  \   __\  \   __\
 * /     \   /        \  /        \ (  <_> )  |  |     |  |
 * /___/\  \ /_______  / /_______  /  \____/   |__|     |__|
 * \_/         \/          \/
 */
@WebService(endpointInterface = "org.example.stack74979278.KeyService")
public class KeyServiceImpl implements KeyService{

    private RSAPublicKey puk;
    private RSAPrivateKey prk;

    public byte[] getPublicKey() {
        return puk.getEncoded();
    }

    @Override
    public String getDecodeByPrivateKey(String base64) throws Exception {
        return RSAUtils.decryptByPrivateKey(base64, prk);
    }

    public KeyServiceImpl() throws Exception {
        //        List<Key> keyList = RSAUtils.getRSAKeyObject(1024);
        //        puk = (RSAPublicKey) keyList.get(0);
        //        prk = (RSAPrivateKey) keyList.get(1);
        Properties properties = new Properties();
        properties.load(KeyServiceImpl.class.getResourceAsStream("/stack74979278/keys.properties"));

        puk = RSAUtils.getPublicKey(properties.getProperty("public"));
        prk = RSAUtils.getPrivateKey(properties.getProperty("private"));

        String publicKey = Base64.getEncoder().encodeToString(puk.getEncoded());
        String privateKey = Base64.getEncoder().encodeToString(prk.getEncoded());
        System.out.println("publicKey");
        System.out.println(publicKey);

        System.out.println("privateKey");
        System.out.println(privateKey);
    }

    public static void main(String[] args) throws Exception {
        Endpoint.publish("http://localhost/test", new KeyServiceImpl());
    }
}

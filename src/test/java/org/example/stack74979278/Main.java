package org.example.stack74979278;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import java.security.interfaces.RSAPublicKey;

/**
 * Operation by XSSoft LXC
 * 由 星溯软件科技（莆田）有限公司 连旭灿 进行创建
 * Create at 2023/1/3
 * 创建于 2023/1/3
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
@Log
public class Main {

    @Test
    public void getPublicKey(){
        byte[] bytes = new KeyServiceImplService().getKeyServiceImplPort().getPublicKey();
        System.out.println(bytes);
    }

    @Test
    public void getDecode() throws Exception {
        KeyService keyService = new KeyServiceImplService().getKeyServiceImplPort();
        byte[] bytes = keyService.getPublicKey();
        RSAPublicKey publicKey = RSAUtils.getPublicKey(bytes);
        String encrypt = "The message encrypt";
        String str = keyService.getDecodeByPrivateKey(RSAUtils.encryptByPublicKey(encrypt, publicKey));
        log.info(str);
    }

}

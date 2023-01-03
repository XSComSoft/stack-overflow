package org.example.stack74956508;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

/**
 * Operation by XSSoft LXC
 * 由 星溯软件科技（莆田）有限公司 连旭灿 进行创建
 * Create at $DATE
 * 创建于 $DATE
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
public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Entity entity = new Entity();
        entity.amount1 = BigDecimal.valueOf(2.2222);
        entity.amount2 = BigDecimal.valueOf(3.3333);
        entity.amount3 = BigDecimal.valueOf(4.4444);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(entity);
        System.out.println(jsonString);
    }
}
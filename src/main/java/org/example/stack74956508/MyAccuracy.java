package org.example.stack74956508;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Operation by XSSoft LXC
 * 由 星溯软件科技（莆田）有限公司 连旭灿 进行创建
 * Create at 2022/12/30
 * 创建于 2022/12/30
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
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAccuracy {
    int value() default 0;
}

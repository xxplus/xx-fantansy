package com.fantasy.xxbase.service;

import java.awt.image.BufferedImage;

/**
 * @author li.fang
 * @since  2017/02/18.
 */
public interface CaptchaService {

    /**
     * 生成验证码图片
     *
     * @param captchaId 验证ID
     * @return 验证码图片
     */
    BufferedImage buildCaptchaImage(String captchaId);

    /**
     * 验证码验证
     *
     * @param captchaId   验证ID
     * @param captcha     验证码(忽略大小写)
     * @return 验证码验证是否通过
     */
    boolean isValid(String captchaId, String captcha);

}

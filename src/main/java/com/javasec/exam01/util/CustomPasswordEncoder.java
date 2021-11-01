package com.javasec.exam01.util;

import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Base64;

public class CustomPasswordEncoder implements PasswordEncoder {

    /**
     * 对密码进行加密并返回
     */
    public String encode(CharSequence rawPassword) {
        return Base64.getEncoder().encodeToString(rawPassword.toString().getBytes());
    }

    /**
     * 验证密码是否正确
     */
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }
}

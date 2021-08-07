package com.sq.project.service;

import com.sq.project.bean.User;
import com.sq.project.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@Service
public class InfoService {

    @Autowired
    InfoMapper infoMapper;

    public static final String COOKIE_NAME_TOKEN = "cookie";

    public void saveInfo(HttpServletRequest request, HttpServletResponse response, User user){
        String token = getCookieValue(request,COOKIE_NAME_TOKEN);
        if(token==null){
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            Cookie cookie = new Cookie(COOKIE_NAME_TOKEN, uuid);
            int expireTime = 3600*24*2;
            cookie.setMaxAge(expireTime);
            cookie.setPath("/");//设置为网站根目录
            user.setUserId(uuid);
            response.addCookie(cookie);
        }else{
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            String newToken = token.substring(0,16)+uuid.substring(16,32);
            user.setUserId(newToken);
        }
    }

    public void login(HttpServletRequest request, HttpServletResponse response, HttpSession session, User user){
        saveInfo(request,response,user);
        infoMapper.insert(user);
        session.setAttribute("userId",user.getUserId());
        System.out.println(user.toString());
    }

    public String getCookieValue(HttpServletRequest request, String cookieName) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null || cookies.length <= 0) {
            return null;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                return cookie.getValue();
            }
        }
        return null;
    }
}

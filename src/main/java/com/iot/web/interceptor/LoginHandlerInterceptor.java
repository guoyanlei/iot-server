package com.iot.web.interceptor;

import com.google.common.collect.Lists;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by guoyanlei
 * date：2017/7/26
 * time：15:50
 */
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {

    private List<String> excludeUserAuthMapping = Lists.newArrayList();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");
        if (!StringUtils.isEmpty(username)) {
            return true;
        }

        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

    public List<String> getExcludeUserAuthMapping() {
        return excludeUserAuthMapping;
    }

    public void setExcludeUserAuthMapping(List<String> excludeUserAuthMapping) {
        this.excludeUserAuthMapping = excludeUserAuthMapping;
    }
}

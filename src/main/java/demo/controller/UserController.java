package demo.controller;

import demo.model.User;
import demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sys on 2016/6/5.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    private String login(User user) {
        user = userService.login(user);

        if (user != null) {
            if (user.getRole().equals("a")) {
                return "redirect:/admin/index.jsp";
            } else {
                return "redirect:/user/index.jsp";
            }
        }

        request.setAttribute("message", "用户名密码错误！");
        return "index";

    }


}

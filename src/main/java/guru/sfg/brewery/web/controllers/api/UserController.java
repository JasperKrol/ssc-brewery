package guru.sfg.brewery.web.controllers.api;

import com.sun.xml.bind.v2.TODO;
import guru.sfg.brewery.repositories.security.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/register2Fa")
    public String register2fa(Model model  ) {

        model.addAttribute("googleurl","todo");

        return "user/register2fa";
    }

    @PostMapping
    public String confirm2Fa(@RequestParam Integer verifyCode) {

        //TODO

        return "index";
    }
}

package test.dockeractions;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final UserRepository userRepository;

    @GetMapping("/")
    public String hello(){
        return "hi!!";
    }

    @GetMapping("/save")
    public String save(){
        User user = new User();
        user.setName("진수");
        userRepository.save(user);
        return "save complete!";
    }
}

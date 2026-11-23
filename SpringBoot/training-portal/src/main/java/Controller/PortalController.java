package Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to my portal";
    }
}
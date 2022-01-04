
@RestController
public class creatingController {

    @RequestMapping("/")
    public String greeting(){
        return "<h1> Hi Nirosha. Welcome to game changing framework. Spring Boot!!!";
    }
}
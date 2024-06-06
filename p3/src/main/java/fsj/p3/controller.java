package fsj.p3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/name")
    public String hello() {
        return "Sasi_Kanakinti";
    }
    @GetMapping("/job")
    public String proffession() {
        return "Student";
    }
    @GetMapping("/hobby")
    public String hobby() {
        return "Reading";
    }
    @GetMapping("/experience")
    public String exp()
   	{
   		return "None";
   	}
    @GetMapping("/projects")
    public String proj() {
    	return "Expense Tracker\n"+"\nBlog\n"+"\nSignUpForm";
    }
    @GetMapping("/address")
    public String add() {
    	return "Tirupati";
    }
    @GetMapping("/phone")
    public String phno()
    {
    	return "901xxxxx09";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/email")
    public String mail() {
    	return "990xxxxxxxks@gmail.com";
    }
    @GetMapping("/web")
    public String web()
    {
        return "<!DOCTYPE html>\n"+
"<html>\n"+
"<head>\n"+
"<meta charset=\"ISO-8859-1\">\n"+
"<title>page1 after home</title>\n"+
"</head>\n"+
"<body>\n"+
"    <p>this is page2</p>\n"+
"</body>\n"+
"</html>\n";
    }
}
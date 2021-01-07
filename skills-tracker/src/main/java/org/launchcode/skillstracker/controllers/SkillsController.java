package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SkillsController {

    @RequestMapping()
    @ResponseBody

    public String skillsTrackerSetUp(){
        return  "<html" +
                "<h1>Skills Tracker</h1>" +
                "<h2>My Favorite Programming Languages: </h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html>";
    }

    @ResponseBody
    @GetMapping("form")
    public String form(){
        return "<html>"+
                "<form method='post'>" +
                "<h1>Name: </h1>"+
                "<input type='text' name='name'>" +

                "<h2>My Favorite Language: </h2>"+
                "<select name= 'language1'>" +
                     "<option value='language'>Select</option>" +
                     "<option value='Java'>Java</option>" +
                     "<option value='JavaScript'>JavaScript</option>" +
                     "<option value='Python'>Python</option>" +
                "</select>"+

                "<h2>My Second Favorite Language</h2>" +
                "<select name='language2'>" +
                     "<option value='language'>Select</option>" +
                     "<option value='Java'>Java</option>" +
                     "<option value='JavaScript'>JavaScript</option>" +
                     "<option value='Python'>Python</option>"+
                "</select>"+

                "<h2>My Second Third Favorite Language</h2>" +
                "<select name='language3'>" +
                    "<option value='language'>Select</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>"+
                "<input type='submit'/>"+
                "</form>" +
                "<html>";
    }
    @ResponseBody
    @PostMapping("form")
    public String formWithQueryParam(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3 ) {
        return "<html>" +
                "<body>" +
                "<h1>Hello, " + name + "!</h1>" +
                "<ol>" +
                    "<li>" + language1 + "</li>" +
                    "<li>" + language2+ "</li> " +
                    "<li>" + language3+ "</li> " +
                "</ol>";

    }


}

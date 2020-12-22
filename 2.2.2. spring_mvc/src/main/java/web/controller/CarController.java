package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping()
    public String printWelcome(
            @RequestParam(value = "count", required = false) String count, Model model) {

        if (count == null) { count = "0"; }
        model.addAttribute("messages", carServiceImp.getCountCars(count));

        return "cars";
    }
}

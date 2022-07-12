package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
@RequestMapping("/")
public class CarController {
    private final CarServiceImp carService;
    @Autowired
    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String show (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("list", carService.carsCount(count));
        return "cars";
    }
}

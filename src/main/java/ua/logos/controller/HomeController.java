package ua.logos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.logos.entity.Make;
import ua.logos.entity.enums.BodyType;
import ua.logos.entity.enums.FuelType;
import ua.logos.service.MakeService;
import ua.logos.service.ModelService;

@Controller
public class HomeController {

    private MakeService makeService;
    private ModelService modelService;

    @Autowired
    public HomeController(MakeService makeService, ModelService modelService) {
        this.makeService = makeService;
        this.modelService = modelService;
    }

    @GetMapping("/")
    public ModelAndView showHome() {
        return new ModelAndView("home");
    }

    @GetMapping("/add/make")
    public String showAddMakeForm(Model model) {
        model.addAttribute("carMake", new Make());
        return "add-make";
    }

    @GetMapping("/add/model")
    public String showAddModelForm(Model model) {
        model.addAttribute("carModel", new ua.logos.entity.Model());
        model.addAttribute("makeList", makeService.findAll());
        model.addAttribute("fuelTypeList",FuelType.values());
        model.addAttribute("bodyTypeList",BodyType.values());
        return "add-model";
    }

    @PostMapping("/add/make")
    public String saveMake(@ModelAttribute("carMake") Make make
    ) {
        if (makeService.findByName(make.getName().toLowerCase()) == null) {
        makeService.saveMake(make);} else {
            return "redirect:/add/make";
        }
        return "redirect:/";
    }

    @PostMapping("/add/model")
    public String saveModel(@ModelAttribute("carModel") ua.logos.entity.Model model) {

            modelService.saveMake(model);
        return "redirect:/";
    }

    @GetMapping("/list")
    public String showAll(Model model) {
        model.addAttribute("allData", makeService.findAll());
        return "list";
    }


}

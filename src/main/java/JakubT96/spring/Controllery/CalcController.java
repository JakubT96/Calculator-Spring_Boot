package JakubT96.spring.Controllery;
import JakubT96.spring.models.CalculatorDTO;
import JakubT96.spring.models.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("calculator")
public class CalcController {
    @Autowired
    private CalcService calcService;
    @GetMapping
    public String renderCalculator(@ModelAttribute CalculatorDTO calculatorDTO) {
        return "calculator";
    }

    @PostMapping
    public String calculate(@ModelAttribute CalculatorDTO calculatorDTO, Model model) {
        float result = calcService.calculate(calculatorDTO);
        model.addAttribute("result", result);
        return "result";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException() {
        return "invalid-form";
    }
}
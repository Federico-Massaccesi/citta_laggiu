package it.padi.padi.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/finance")
public class FinanceDataController {

    @Autowired
    private FinanceDataService financeDataService;

    @GetMapping("/{id}")
    public FinanceData getFinanceData(@PathVariable Long id) {
        return financeDataService.getFinanceData(id);
    }

    @PostMapping
    public FinanceData createFinanceData(@RequestBody FinanceData financeData) {
        return financeDataService.saveFinanceData(financeData);
    }

    @PutMapping("/entrate/{id}")
    public void updateEntrate(@PathVariable Long id, @RequestBody double amount) {
        financeDataService.updateEntrate(id, amount);
    }

    @PutMapping("/spese/{id}")
    public void updateSpese(@PathVariable Long id, @RequestBody double amount) {
        financeDataService.updateSpese(id, amount);
    }
}

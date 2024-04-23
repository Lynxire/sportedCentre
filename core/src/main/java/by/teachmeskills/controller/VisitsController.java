package by.teachmeskills.controller;

import by.teachmeskills.entity.Visitor;
import by.teachmeskills.entity.Visits;
import by.teachmeskills.service.VisitorService;
import by.teachmeskills.service.VisitsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("visits")
public class VisitsController {
    private final VisitsService visitsService;
    @GetMapping
    public List<Visits> getVisitors() {
        return visitsService.getAllVisits();
    }
}

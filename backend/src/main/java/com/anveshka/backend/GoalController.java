package com.anveshka.backend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {

    private final GoalService goalService;

    public GoalController(GoalService goalService){
        this.goalService = goalService;
    }

    // post karna h means database me persist karna hoga -> create karega goal ko and then update karega
    @PostMapping
    public Goal createGoal(@RequestBody Goal goal){
        return goalService.createGoal(goal);
    }

    // request ayega and uske hisab se Goal ko as a list fetch karega
    @GetMapping
    public List<Goal> getAllGoals(){
        return goalService.getAllGoals();
    }

    // Agar hame databas me changes karne h toh ye method kaam ayega
    @PutMapping("/{id}")
    public Goal updateGoal(@PathVariable Long id, @RequestBody Goal goal) {
        return goalService.updateGoal(id, goal);
    }


    // Deletion ka logic yaha pe h
    @DeleteMapping("/{id}")
    public void deleteGoal(@PathVariable Long id) {
        goalService.deleteGoal(id);
    }
}


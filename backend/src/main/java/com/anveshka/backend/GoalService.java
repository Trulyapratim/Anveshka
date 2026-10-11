package com.anveshka.backend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {

    private final GoalRepository goalRepository;

    public GoalService(GoalRepository goalRepository){
        this.goalRepository = goalRepository;
    }

    public Goal createGoal(Goal goal){
        return goalRepository.save(goal);
    }

    public List<Goal> getAllGoals(){
        return goalRepository.findAll();
    }


    public Goal updateGoal(Long id, Goal updatedGoal) {
        Goal existingGoal = goalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Goal not found"));

        existingGoal.setTitle(updatedGoal.getTitle());
        existingGoal.setDescription(updatedGoal.getDescription());
        existingGoal.setAvailableTime(updatedGoal.getAvailableTime());
        existingGoal.setAvailableTimeUnit(updatedGoal.getAvailableTimeUnit());
        existingGoal.setStartDate(updatedGoal.getStartDate());
        existingGoal.setOriginalDeadline(updatedGoal.getOriginalDeadline());
        existingGoal.setCurrentDeadline(updatedGoal.getCurrentDeadline());
        existingGoal.setDifficulty(updatedGoal.getDifficulty());

        return goalRepository.save(existingGoal);
    }


    public void deleteGoal(Long id) {
        Goal goal = goalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Goal not found"));

        goalRepository.delete(goal);
    }
}

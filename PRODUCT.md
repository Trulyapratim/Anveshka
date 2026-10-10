# Anveshka — Unfinished

> A personal execution and growth system designed to help users plan,
> execute, recover, and reflect on meaningful goals.

---

# 1. Product Vision

Anveshka is a personal + developer growth and execution system.

It is not designed to be just another task manager.

Its purpose is to help a user connect small daily actions with meaningful
long-term goals and continuously understand whether they are moving in the
right direction.

Anveshka should help answer two fundamental questions:

1. Did I execute my work today?
2. Am I moving in the right direction toward my long-term goal?

The product is built around progress, recovery, reflection, and continuous
growth rather than punishment for missed work.

---

# 2. Product Identity

## Name

**Anveshka — Unfinished**

## Meaning

> Anveshka represents exploration, discovery, and real learning to build a
> better self.

"Unfinished" represents the idea that growth is an ongoing journey.

A user does not need to be perfect to continue progressing.

---

# 3. Core Philosophy

Anveshka follows these principles:

- Progress over perfection.
- Missed work is data, not failure.
- A changed plan is adaptation, not defeat.
- Users should be able to recover unfinished work.
- Historical truth should be preserved.
- The system should never shame or punish the user.
- Daily actions should contribute toward meaningful long-term goals.
- The user should always understand their current direction.
- Users remain in control of their goals and plans.
- Anveshka measures progress, not a person's worth.

### Core Principle

> You may fall behind, but you are never out of the journey.

---

# 4. V1 Objective

The primary objective of V1 is to build a complete execution loop:

**Goal → Daily Tasks → Execution → Points → Progress → Feedback → Goal Completion → Achievement History**

V1 should provide enough structure for a user to:

1. Define a meaningful long-term goal.
2. Break the goal into daily tasks.
3. Execute tasks on specific days.
4. Recover missed work.
5. Earn points based on execution.
6. See actual progress.
7. Compare actual progress with expected progress.
8. Understand whether they are ahead, on track, or behind.
9. Complete goals without the system treating an extended deadline as failure.
10. Receive achievements when goals are successfully completed.

---

# 5. V1 Scope

V1 contains the following major concepts:

- Long-term Goals
- Daily Tasks
- Goal → Daily Task relationship
- Daily task execution
- Missed task handling
- Task recovery
- Points
- Goal progress
- Expected vs Actual progress
- Automatic deadline extension
- Day navigation
- Goal completion
- Badges
- Achievement history
- Goal editing
- Historical data preservation
- Basic progress visualization

---

# 6. Long-Term Goals

A Goal represents a meaningful long-term objective that the user wants to
achieve.

A goal should contain information such as:

- Title
- Description
- Why the goal is important
- Start date
- Original deadline
- Current deadline
- Status
- Associated daily tasks
- Progress information

The exact database/entity representation will be finalized during the
architecture and database design phase.

---

# 7. Goal Creation

When creating a long-term goal, Anveshka should guide the user through
planning instead of presenting only an empty text field.

The planning flow should consider:

- What do you want to achieve?
- Why is it important?
- When will you start?
- What is your target/deadline?
- How much time can you give?
- How do you want to break the goal down?

The user should be able to:

- Create tasks manually.
- Use suggested templates.
- Edit suggested templates.
- Modify the plan later.

Templates are suggestions, not mandatory plans.

The user always remains in control of the final plan.

---

# 8. Goal → Daily Task Relationship

A long-term goal is broken down into daily tasks.

Relationship:

**One Goal → Many Daily Tasks**

Daily tasks provide the execution layer through which long-term goal progress
is measured.

This relationship allows the user to understand how today's work contributes
to a larger objective.

---

# 9. Daily Tasks

A Daily Task represents a specific piece of work assigned to a particular
day and associated with a goal.

A task should contain information such as:

- Task ID
- Title
- Description
- Task date
- Associated goal
- Status
- Points earned

A daily task does **not** require a separate deadline.

The task's effective deadline is the end of its assigned day.

---

# 10. Daily Task Creation

When creating a task, the user should be able to specify:

- Task title
- Description
- Task date
- Goal

The goal should be selectable from the user's existing goals.

The user should also be able to create a new goal from the task creation flow
when required.

Priority is not a required V1 concept.

---

# 11. Task Lifecycle

The V1 task lifecycle is:

```text
PENDING
   ↓
COMPLETED
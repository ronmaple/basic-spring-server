# Basic spring TODO server

---

## Milestones 1: Basic Server

[X] Set up basic healthcheck server
[X] Set up Health check test
[X] Set up JPA with Postgres (Docker)

```
Todo { 
  content: String,
  completed: {
    type: Boolean,
    default: false
  },
  createdAt: Date
}
```

Routing milestones with Tests:
[X] GET /todos -> `Todo[]`
[] GET /todos/:id 
[] POST /todos 
[] PUT /todos/:id 
[] DELETE /todos/:id

--- 

## Milestones 2: Deployment
[] Refactor the App folder structure
[] Deploy on Heroku or AWS EC2


---

## Milestone 3: Angular Todo
[] Angular Todo App

## Milestone 4: Integration
[]

## Milestone 5: Deploy Angular

** 3-5 might be done on a separate repo

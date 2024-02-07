# Basic spring TODO server

Todo's:

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
1. GET /todos -> `Todo[]`
2. GET /todos/:id
3. POST /todos
4. PUT /todos/:id
5. DELETE /todos/:id
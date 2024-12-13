## Coding Style

### General Guidelines
- Write clear, concise, and self-documenting code.
- Avoid unnecessary complexity.
- Follow the [DRY (Don't Repeat Yourself)](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself) principle.

### Formatting
- Use 4 spaces for indentation.
- Limit lines to 80 characters.
- Use Unix-style line endings (`\n`).
- Place opening braces on the same line as the statement.
- Use a single blank line to separate logical sections of your code.

### Naming Conventions
- **Variables and Functions:**
  - Use `camelCase` for variable and function names.
  - Example: `myVariable`, `calculateTotal()`
- **Classes and Interfaces:**
  - Use `PascalCase` for class and interface names.
  - Example: `CustomerOrder`, `IOrderService`
- **Constants:**
  - Use `UPPER_SNAKE_CASE` for constants.
  - Example: `MAX_CONNECTIONS`, `DEFAULT_TIMEOUT`

### Comments
- Use `//` for single-line comments.
- Use `/* ... */` for multi-line comments.
- Write comments that explain the "why" behind the code, not the "what".

### Example
```java
// filepath: /path/to/file
public class CustomerOrder {
    private static final int MAX_ITEMS = 100;

    private String customerName;
    private List<Item> items;

    public CustomerOrder(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.size() < MAX_ITEMS) {
            items.add(item);
        } else {
            throw new IllegalArgumentException("Cannot add more items");
        }
    }

    // Other methods...
}
```
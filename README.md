# EasyAuthLogic
An implementation of the Strategy Pattern in Java, which allows you to easily switch the authentication strategy of your program. The code includes examples of two different authentication methods: Basic and OAuth. 

## Questions

### Intuitive algorithm 
#### Does this respect the Opened/Closed principle of SOLID principles?

No it does not. The code is not open for extension. If you want to add a new authentication method, you have to modify the AuthProgram each time a new authentication is added.

### Strategy pattern
#### Does this respect the Opened/Closed principle of SOLID principles?

This implementation respects the Open/Closed principle, as adding new authentication strategies does not require modification of the existing AuthProgram class.

#### Advantages of the strategy pattern:

- Better adherence to the Open/Closed principle, as adding new strategies does not require modifying existing code.
- Improved code organization and readability, as each strategy is implemented in its own class.
- Easier to maintain and extend, as each strategy can be developed and tested independently.
- Enhanced flexibility, as the strategy can be changed at runtime, allowing for more dynamic behavior.
- The strategy pattern is a better solution in this scenario compared to the intuitive approach because it makes the code more maintainable, modular, and adheres to the SOLID principles.

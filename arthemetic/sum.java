1. What are the differences between `var`, `let`, and `const` in JavaScript?
var:

Function-scoped: The scope is confined to the function in which it's declared.

Can be redeclared: You can declare the same variable multiple times using var.

Hoisting: Variables declared with var are hoisted to the top of their scope, but are initialized with undefined.

let:

Block-scoped: The scope is limited to the block, statement, or expression where it's used.

Cannot be redeclared: You can't redeclare a variable with the same name using let within the same scope.

Temporal Dead Zone (TDZ): Variables declared with let are not accessible before they are declared, even though they are hoisted.

const:

Block-scoped: Similar to let, the scope is limited to the block, statement, or expression.

Cannot be redeclared or reassigned: Once assigned, the variable cannot be reassigned, but if it's an object, the properties can still be modified.

Temporal Dead Zone (TDZ): Like let, variables declared with const are not accessible before their declaration.


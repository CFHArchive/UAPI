#CFH Java Coding Standards

#File Structure & Formatting

##Source File
All source files must follow a specific naming convention, and structure.

###Source File Naming
All source files should be named(case-sensitive) after the top-level class they contain.

###Source File Structure
All source files should be organized similarly to provide an easier experience to fellow developers.

The common structure, in order, is as follows:

- License information
- Package statement
- Import Statements
- Class Javadoc comment
- Only one top-level class

##Indentation & Line Wrapping
You should use a unit of indentation of two spaces.

###Length
Lines longer than 80 characters should be avoided, and wrapped when present.

###Wrapping
When you exceed the suggested length specified above for an expression you must break it
into multiple lines.


When to break:

- After commas
- Before operators


Indentation for breaks:

- Each new line for an expression that must be broken should be indented four spaces
from the start of the expression.

##Comments
Comments are formatted in a specific way to improve readability, and help guide developers to writing cleaning
code that requires less comments.

###Inline Comments
Inline comments should be preceded by `/*` and followed up by `*/`. Inline comments should be no longer than
forty characters, and consist of only one line. If you require more characters, or more lines you should re-evaluate your comment text, and/or think about moving it to a block comment.

###Block Comments
Inline comments should be preceded by `/*` and followed up by `*/`. Each line in a block comment should begin with an asterisk(*). Block comments should have no blank lines consisting of solely an asterisk(*) character. Block comments should be indented to the same level as the code they describe.

###Trailing Comments
Short comments may follow code they describe on the same line. They should be shifted at least four indentation units to help differentiate them from the code they describe. All trailing comments in the same code block should be aligned left-justified with each other.

### EOL Comments
End-of-line comments, also know as EOL comments here, are used to comment out full or partial lines of code. They should not be used on multiple consecutive lines for text comments. They can, however, be used on multiple consecutive lines to comment out blocks of code.

##Declarations
The maximum for declarations per line is one. This allows for developers to comment code without confusion.

###Location & Spacing

####Spacing
The accepted method of declaration spacing is one space between the type and identifier.

####Location
Declarations should be placed at the beginning of code blocks. This allows for better readability. Hiding a declaration behind a lower-level declaration should be avoided.
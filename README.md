## Parser generator
The program generates Kotlin source code of top-down recursive parsers for LL(1) grammars. The generated code looks nice and is easy to modify. The generator itself is written entirely in Kotlin.
* Inherited and synthesized attributes are supported.
* Generator checks if the described grammar belongs to LL(1).
* A class with a context can be passed to the parser.
* During the parsing process, a parse tree is built and represented in graphviz format.
* Ability to add custom imports to the generated parser.
* Possibility to specify a package to which classes of the generated parser will belong.

The grammar according to which parsers are generated is described in a format similar to the one used by ANTLR.

The grammar for describing grammars based on which parsers are generated is contained in the file [ParserGeneratorGrammar.g4](src/main/resources/ParserGeneratorGrammar.g4). 
The [java](src/main/java) folder contains the parser for this grammar generated using ANTLR.
The [app](src/main/kotlin/app) package contains files that demonstrate an example of how to use the parser generator. 
As an example, parsers are generated for the grammars described in the [VarDeclaration.g4](src/main/resources/VarDeclaration.g4) and [Expression.g4](src/main/resources/Expression.g4) files.
The generated parsers for these grammars are in the packages [varDeclaration](src/main/kotlin/varDeclaration) and [expressionParser](src/main/kotlin/expressionParser) respectively.

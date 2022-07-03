# eo-strings
[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/InnoSWP/eo-strings/blob/main/LICENSE.txt)
[![Qulice](https://github.com/InnoSWP/eo-strings/actions/workflows/qulice.yml/badge.svg)](https://github.com/InnoSWP/eo-strings/actions/workflows/qulice.yml)
[![Unit tests](https://github.com/InnoSWP/eo-strings/actions/workflows/mvn-test.yml/badge.svg)](https://github.com/InnoSWP/eo-strings/actions/workflows/mvn-test.yml)  
This is a collection of objects for string operations for [EO](https://www.eolang.org)
## How to use
Import function from the library with `+alias org.eolang.txt.function` and use the imported function in the code.
## Feature list
The library implements a list of functions:
- `capitalize string`  
  Converts the first character of `string` to upper case.
- `compare a b`  
  Compares `a` and `b` strings and returns `1` if `a` is greater than `b`, `0` if they are equal, `-1` otherwise
- `concatenate a b`  
  Concatenates `a` and `b` and returns the resulting string
- `is-alphabetic string`  
  Returns `true` if all of the the characters in `string` are alphabetic (Analog of `Character.isAlphabetic` in Java)
- `is-lowercase string`  
  Returns `true` if all of the the characters in `string` are in lower case (Analog of `Character.isAlphabetic` in Java)
- `swap-case string`  
  Replaces all the lower case characters in `string` with upper case counterparts, and vice versa
## How to install
The library is designed to be integrated in the base EO, and will be automatically downloaded during project compilation.
## How to Contribute

Fork repository, make changes, send us a pull request.
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
mvn clean install -Pqulice
```

You will need Maven 3.3+ and Java 8+.

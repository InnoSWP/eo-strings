# EO strings
[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/InnoSWP/eo-strings/blob/main/LICENSE.txt)
[![GitHub Super-Linter](https://github.com/InnoSWP/eo-strings/workflows/Lint%20Code%20Base/badge.svg)](https://github.com/marketplace/actions/super-linter)
## The standard library for strings
The functions for the EO language are chosen on the basis of the fact that the function is present in the Python, C++ and Java libraries.
## List of functions
[**Here**](https://github.com/InnoSWP/eo-strings/blob/main/List.md) you can find full list of functions with short description and similar fubctions in Java, Python, Ruby and C++. At the list below you can see already implemented functions in library:

- ![EO](https://github.com/InnoSWP/eo-strings/blob/main/readme-assets/eo.svg)`compare`  
Similar functions in other languages:  
  - Java: `compareTo`      
  - C++: `strcmp`    
  - Ruby: `<=>, casecmp`    

  Compares two strings
  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/main/readme-assets/eo.svg)`concatenate`  
Similar functions in other languages:  
  - Java: `concat`    
  - Python: `+= operator`    
  - C++: `+= operator`    
  - Ruby: `concat`    

  Concatenates two strings

## How to Contribute

Fork repository, make changes, send us a pull request.
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
mvn clean install -Pqulice
```

You will need Maven 3.3+ and Java 8+.

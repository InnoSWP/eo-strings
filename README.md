[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/timolai-andrievich/eo-strings/blob/main/LICENSE)
# eo-strings
Library for string operations in EO programming language
## List of functions
- ### Comparative functions
  - `compare(string1: string, string2: string) -> integer`  
    Compares `string1` and `string2` lexigrophically and returns `1` if `string1` is greater than `string2`, `0` if they are equal, and `-1` if `string1` is lesser than `string2`.
  - `compare-ignore-case(string1: string, string2: string) -> integer`  
    Compares `string1` and `string2` lexigrophically, ignoring all upper case and lower case differences and returns `1` if `string1` is greater than `string2`, `0` if they are equal, and `-1` if `string1` is lesser than `string2`.
  - `compare-ignore-case(string1: string, string2: string) -> boolean`  
    Compares `string1` and `string2` lexigrophically, ignoring all upper case and lower case differences and returns `True` if `string1` is equal to `string2`, and `False` otherwise.
- ### Validation functions
  - `is-alphabetical(s: string) -> boolean`  
    Checks if the string consists only of alphabetic characters(`[A-Za-z]+`)
  - `is-empty(s: string) -> boolean`  
    Checks if the string is empty
  - `is-hexadecimal(s: string) -> boolean`  
    Checks if the string is a valid hexadecimal number(hexadecimal numbers may start with `0x`)
  - `is-int(s: string) -> boolean`  
    Checks if the string is a valid decimal integer
  - `is-lowercase(s: string) -> boolean`  
    Checks if the string contains only lowercase letters(may include other symbols)
  - `is-uppercase(s: string) -> boolean`  
    Checks if the string is contains only uppercase letters(may include other symbols)
  - `is-whitespace(s: string) -> boolean`  
    Checks if the string is contains only whitespace characters(such as ` `, `\t`, etc.)

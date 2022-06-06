[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/timolai-andrievich/eo-strings/blob/main/LICENSE)
# eo-strings
Library for string operations in EO programming language.

The functions for the EO language are chosen on the basis of the fact that the function is present in the Python, C++ and Java libraries.
## List of functions
- ### Comparative functions
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `compare(string1: string, string2: string) -> int`  
    Compares `string1` and `string2` lexigrophically and returns `1` if `string1` is greater than `string2`, `0` if they are equal, and `-1` if `string1` is lesser than `string2`.
- ### Validation functions
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `is-alphabetical(s: string) -> boolean`  
    Checks if the string consists only of alphabetic characters(`[A-Za-z]+`) and there is at least one character in the string
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `is-hexadecimal(s: string) -> boolean`  
    Checks if the string is a valid hexadecimal number(hexadecimal numbers may start with `0x`)
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `is-int(s: string) -> boolean`  
    Checks if the string is a valid decimal integer
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `is-lowercase(s: string) -> boolean`  
    Checks if the string contains only lowercase letters(may include other symbols) and there is at least one character in the string
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `is-uppercase(s: string) -> boolean`  
    Checks if the string is contains only uppercase letters(may include other symbols) and there is at least one character in the string
- ### Search functions
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `find-first(string: string, substring: string) -> int`  
    Searches for the first occurence of `substring` in `string`, and returns the index of the first symbol of that occurence, -1 if none were found
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `replace-all(string: string, substring1: string, substring2: string) -> string`  
    Searches for all occurences of `substring1` in `string`, and replaces them with `substring2`, returning the resulting string
- ### String operations
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `concatenate(string1: string, string2: string) -> string`  
    Appends `string2` to the end of `string1` and returns the resulting string
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `substring(string: string, start: int, end: int) -> string`  
    Returns the substring of `string` that starts at `start` and ends at `end` (`end`-th character is not included into the substring)
- ### Formatting operations
  -  ![Java-EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg) `format(string: string, arguments: List[string]) -> string`  
    Similar to `printf` function from C, but the only specifier is `s`. Returns the formatted string  
    `string` may contain format flags. The format tags prototype is `%[[[filler]flag]width]s`
    #### Flags
    - `-` Left align the string within the given field
    - `+` Right align the string within the given field(default) 
    - `^` Center align the string within the given field
    - `~` Justify the string within the given field
    #### Filler
    The character with which the string will be padded, ` `(space) by default
    #### Width
    Integer that indicates the designated field width
- ### Miscellanious
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `to-lowercase(string: string) -> string`  
    Converts all uppercase letters to the lowercase variants, and returns the result
  - ![EO](https://github.com/timolai-andrievich/eo-strings/blob/marking-in-progress/readme-assets/eo.svg) `to-uppercase(string: string) -> string`  
    Converts all lowercase letters to the uppercase variants, and returns the result

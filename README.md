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
  - `equals-ignore-case(string1: string, string2: string) -> boolean`  
    Compares `string1` and `string2` lexigrophically, ignoring all upper case and lower case differences and returns `True` if `string1` is equal to `string2`, and `False` otherwise.
- ### Validation functions
  - `is-alphabetical(s: string) -> boolean`  
    Checks if the string consists only of alphabetic characters(`[A-Za-z]+`) and there is at least one character in the string
  - `is-empty(s: string) -> boolean`  
    Checks if the string is empty
  - `is-hexadecimal(s: string) -> boolean`  
    Checks if the string is a valid hexadecimal number(hexadecimal numbers may start with `0x`)
  - `is-int(s: string) -> boolean`  
    Checks if the string is a valid decimal integer
  - `is-lowercase(s: string) -> boolean`  
    Checks if the string contains only lowercase letters(may include other symbols) and there is at least one character in the string
  - `is-uppercase(s: string) -> boolean`  
    Checks if the string is contains only uppercase letters(may include other symbols) and there is at least one character in the string
  - `is-whitespace(s: string) -> boolean`  
    Checks if the string is contains only whitespace characters(such as ` `, `\t`, etc.) or the string is empty
- ### Search functions
  - `contains(string: string, substring: string) -> boolean`  
    Returns `True` if `string` contains `substring`, `False` otherwise
  - `count(string: string, substring: string) -> int`  
    Returns the number of occurences of `substring` in `string`
  - `find-all(string: string, substring: string) -> List[int]`  
    Searches for occurences of `substring` in `string`, and returns the list of indexes of the first symbol of these occurences
  - `find-first(string: string, substring: string) -> int`  
    Searches for the first occurence of `substring` in `string`, and returns the index of the first symbol of that occurence, -1 if none were found
  - `find-last(string: string, substring: string) -> int`  
    Searches for the last occurence of `substring` in `string`, and returns the index of the first symbol of that occurence, -1 if none were found
  - `replace-all(string: string, substring1: string, substring2: string) -> string`  
    Searches for all occurences of `substring1` in `string`, and replaces them with `substring2`, returning the resulting string
  - `replace-first(string: string, substring1: string, substring2: string) -> string`  
    Searches for the first occurence of `substring1` in `string`, and replaces it with `substring2`, returning the resulting string
  - `replace-last(string: string, substring1: string, substring2: string) -> string`  
    Searches for the last occurence of `substring1` in `string`, and replaces it with `substring2`, returning the resulting string
- ### String operations
  - `concatenate(string1: string, string2: string) -> string`  
    Appends `string2` to the end of `string1` and returns the resulting string
  - `insert(string1: string, string2: string, index: int) -> string`  
    Inserts the `string2` into `string1` between `index`-th and `index + 1`-th characters. Returns the resulting string
  - `join(strings: List[string], connector: string) -> string`  
    Concatecanates all strings in `strings`, inserting `connector` between them. Returns the resulting string
  - `repeat(string: string, x: int) -> string`  
    Repeats the `string` `x` times and returns the resulting string
  - `split(string: string, separator: string) -> List[string]`  
    Splits the `string` into a list of strings, using `separator` as a delimiter string. Returns the resulting list

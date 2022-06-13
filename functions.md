# Description of the functions
This file is temporary and is designed to provide specifications of methods and classes to team members.
## `String` class
- `String(str: string)`  
    Constructs new instance of String from `str`
- `String.capitalize() -> void`  
    Converts the first character to the uppercase, and all other to the lowercase
- `String.compare(other: String) -> int`  
    Compares two string and returns 1 if the parent string is greater than `other`, 0 if they are equal, and -1 otherwise
- `String.concatenate(other: String) -> int`  
    Appends `other` to the parent string
- `String.format(*args) -> String`  
    Formats the string similar to `sprintf` function in C
- `String.hash() -> int`  
    Returns the hash of the parent string
- `String.is-alphabetic() -> bool`  
    Returns `true` if the string consists only of letters, `false` otherwise
- `String.is-lowercase() -> bool`  
    Returns `true` if all the letters in the string consists are lowercase, `false` otherwise
- `String.is-uppercase() -> bool`  
    Returns `true` if all the letters in the string consists are uppercase, `false` otherwise
- `String.join(array: Array<String>) -> String`  
    Concatenates all the strings in `array`, inserting parent string in between each string
- `String.length() -> int`  
    Returns the length of the string
- `String.substring(start: int, length: int) -> String`  
    Returns substring of the given length starting at `start`-th symbol, 0-indexed
- `String.swap-case() -> String`  
    Swaps case of all the letters in the parent string: lowercase to uppercase and vise versa.
- `String.to-int() -> int`  
    Converts the string to an integer
- `String.to-float() -> int`  
    Converts the string to a float
- `String.to-lowercase() -> String`  
    Converts all letters in the string to lowercase
- `String.to-uppercase -> String`   
    Converts all letters in the string to uppercase

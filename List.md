[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/timolai-andrievich/eo-strings/blob/main/LICENSE)  
Full list of functions with short justifications for implementation, or the lack thereof  
# Summary
Following functions were selected for implementation:
  - **Basic string operations**: `concatenate`, `compare`, `substring`  
    Operations that are used very often and should be part of standart string type.
  - **Regular expressions**: `find-all-regexp`, `find-first-regexp`, `find-last-regexp`, `matches-regexp`, `replace-all-regexp`, `replace-first-regexp`, `replace-last-regexp`, `split-regexp`   
    Regular expressions can not be implemented on the fly, thus, the library implementation is required
  - **Function that deal with finding string in another string("Find" functions)**: `find-all`, `find-first`, `find-last`, `replace-all`, `replace-first`, `replace-last`, `split`  
    These functions duplicate the functionality of regexp functions, but they give a significant performance boost, especially on a large set of small strings - up to 1000x, and around 1.5x on very large strings
  - **Case-related functions**: `to-uppercase`, `to-lowercase`  
    As these functions deal with case of the characters, they should be handled separately to support different locales, languages, etc.  
    
All other functions were not selected for follwing reasons:
  - They can be implemented in a few minutes or even few lines  
    For example, `is-empty` can be done by simple check if the length of the string is zero, `compare-ignore-case` by combination of `to-lowercase` and `compare`, etc.
  - They are not applicable to EO  
    For example, memory managing functions from C++ such as `capacity`
  - They are already implemented in EO  
    `char-at`, `equals`, etc.
  - They are too rare to justify implementation  
    For example, `swapcase` in Python is practically only used by students learning the language, thus, despite the implementation being somewhat difficult, the inclusion in the standart library is unnecessary
# Full list
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`append`  
Similar functions in other languages:  
  - Java: `append`    
  - Python: `__add__`    
  - C++: `push_back, operator+`    
  - Ruby: `<<, prepend`    

  Adds a substring to the end of the string   
  Should not be implemented:  
  The same as concatenate  
- `capacity`  
Similar functions in other languages:      
  - C++: `capacity`      

  Returns the amount of memory allocated   
  Should not be implemented:  
  Is not applicable to EO  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`capitalize`  
Similar functions in other languages:    
  - Python: `capitalize`      
  - Ruby: `capitalize`    

  Converts the first character to the uppercase, and all other to the lowercase   
  Should not be implemented:  
  Can be done in about three lines with substring, to-uppercase and cocatenate  
- `char-at`  
Similar functions in other languages:  
  - Java: `charAt`    
  - Python: `[] operator`    
  - C++: `[] operator`    
  - Ruby: `[] operator, slice`    
  - EO: `char-at`  

  Returns the character at given index   
  Should not be implemented:  
  Already implemented in base EO  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`compare`  
Similar functions in other languages:  
  - Java: `compareTo`      
  - C++: `strcmp`    
  - Ruby: `<=>, casecmp`    

  Compares two strings   
  Should be implemented:  
  Impossible to do with regular expressions, Combines greater than, less than, and equal in one  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`compare-ignore-case`  
Similar functions in other languages:  
  - Java: `compareToIgnoreCase`          

  Compares two strings ignoring case differences   
  Should not be implemented:  
  Can be done in a few lines using to-lowercase and compare  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`compile-regexp`  
Similar functions in other languages:    
  - Python: `re.compile("regex")`        

  collects a regular expression into a separate object   
  Should not be implemented:  
  Out-of-scope for string library  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`concatenate`  
Similar functions in other languages:  
  - Java: `concat`    
  - Python: `+= operator`    
  - C++: `+= operator`    
  - Ruby: `concat`    

  Concatenates two strings   
  Should be implemented:  
  Impossible to do with regular expresions, essential for string operations  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`contains`  
Similar functions in other languages:  
  - Java: `contains`    
  - Python: `in operator`      
  - Ruby: `include?`    

  Checks if the string contains the given substring   
  Should not be implemented:  
  Can be done by checking if length of array returned by find-all-regexp is zero in very few lines.  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`count`  
Similar functions in other languages:    
  - Python: `count`      
  - Ruby: `count`    

  Counts the amount of occurences of the substring in string   
  Should not be implemented:  
  Can be done by getting the length of array returned by find-all is zero.  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`ends-with`  
Similar functions in other languages:  
  - Java: `endsWith`    
  - Python: `endswith`      
  - Ruby: `end_with?`    

  Checks if the string ends with substring   
  Should not be implemented:  
  Can be easily done with find-last  
- `equals`  
Similar functions in other languages:  
  - Java: `equals`    
  - Python: `== operator`    
  - C++: `== operator`    
  - Ruby: `eql?`    
  - EO: `eq`  

  Check if the two strings are equal   
  Should not be implemented:  
  Already implemented in base EO  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`equals-ignore-case`  
Similar functions in other languages:  
  - Java: `equalsIgnoreCase`          

  Check if the two strings are equal, ignoring case differences   
  Should not be implemented:  
  Can be done in a few lines using to-lowercase and compare  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`fill-left`  
Similar functions in other languages:        
  - Ruby: `ljust`    

  Fills the string with given characters from the left, untill the string is of a required length   
  Should not be implemented:  
  Can be done with one for loop  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`fill-right`  
Similar functions in other languages:        
  - Ruby: `rjust`    

  Fills the string with given characters from the right, untill the string is of a required length   
  Should not be implemented:  
  Can be done with one for loop  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`fill-zero-left`  
Similar functions in other languages:    
  - Python: `zfill`      
  - Ruby: `ljust(int, '0')`    

  Fills the string with zeroes from the left, untill the string is of a required length   
  Should not be implemented:  
  Can be done with one for loop  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`fill-zero-right`  
Similar functions in other languages:        
  - Ruby: `rjust(int, '0')`    

  Fills the string with zeroes from the right, untill the string is of a required length   
  Should not be implemented:  
  Can be done with one for loop  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`find-all`            

  Returns the list of all indexes of the occurrences of the string   
  Should be implemented:  
  All regular find function have better performance compared to regexp ones  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`find-all-regexp`  
Similar functions in other languages:    
  - Python: `re.findall("regex")`        

  Returns the list of all indexes of the occurrences of the pattern   
  Should be implemented:  
  Too cumbersome to implement through find-first-regexp  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`find-first`  
Similar functions in other languages:  
  - Java: `indexOf`    
  - Python: `find`    
  - C++: `find`    
  - Ruby: `index`    

  Returns the index of the first occurrence of the substring.   
  Should be implemented:  
  All regular find function have better performance compared to regexp ones  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`find-first-regexp`            

  Returns the index of the first occurrence of the pattern.   
  Should be implemented:  
  Essential for regexp operations  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`find-last`  
Similar functions in other languages:  
  - Java: `lastIndexOf`    
  - Python: `rfind`      
  - Ruby: `rindex`    

  Returns the index of the last occurrence of the substring (searches the string right-to-left).   
  Should be implemented:  
  All regular find function have better performance compared to regexp ones  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`find-last-regexp`            

  Returns the index of the last occurrence of the pattern.   
  Should be implemented:  
  All regular find function have better performance compared to regexp ones  
- `format`  
Similar functions in other languages:  
  - Java: `format`    
  - Python: `format`    
  - C++: `sprintf`    
  - Ruby: `% operator (string % object)`    
  - EO: `printf`  

  Returns formatted string   
  Should not be implemented:  
  Already implemented in base EO  
- `getline`  
Similar functions in other languages:      
  - C++: `getline`      

  Applies to i/o operations, gets a line from character string   
  Should not be implemented:  
  Not applicable to EO  
- `hash`  
Similar functions in other languages:  
  - Java: `hashCode`    
  - Python: `hash`    
  - C++: `hash`    
  - Ruby: `hash`    
  - EO: `as-hash`  

  Returns the hash of the string   
  Should not be implemented:  
  Already implemented in base EO  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`insert`  
Similar functions in other languages:      
  - C++: `insert`    
  - Ruby: `insert`    

  Inserts substring after given character   
  Should not be implemented:  
  Can be easily done with substring and concatenate  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`is-alphabetic`  
Similar functions in other languages:    
  - Python: `isalpha`    
  - C++: `isalpha`      

  Checks if the string contains only letters   
  Should not be implemented:  
  Can be done in regular expressions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`is-empty`  
Similar functions in other languages:  
  - Java: `isEmpty`        
  - Ruby: `empty?`    

  Checks if the string is empty   
  Should not be implemented:  
  Can be done in regular expressions/length check/compare  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`is-hexadecimal`  
Similar functions in other languages:  
  - Java: `isHexDigit`      
  - C++: `isxdigit`      

  Checks if the string is a valid hexadecimal number   
  Should not be implemented:  
  Can be done in regular expressions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`is-int`  
Similar functions in other languages:    
  - Python: `isdigit`    
  - C++: `isdigit`      

  Checks if the string contains only digits   
  Should not be implemented:  
  Can be done in regular expressions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`is-lowercase`  
Similar functions in other languages:  
  - Java: `isLowerCase`    
  - Python: `islower`        

  Checks if the string contains only lowercase letters   
  Should not be implemented:  
  Can be done in regular expressions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`is-title`  
Similar functions in other languages:    
  - Python: `istitle`        

  Checks if the string starts with the capital letter   
  Should not be implemented:  
  Can be done in regular expressions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`is-uppercase`  
Similar functions in other languages:  
  - Java: `isUpperCase`    
  - Python: `isupper`        

  Checks if the string contains only uppercase letters   
  Should not be implemented:  
  Can be done in regular expressions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`is-whitespace`  
Similar functions in other languages:  
  - Java: `isBlank`    
  - Python: `isspace`        

  Checks if the string contains only whitespace letters   
  Should not be implemented:  
  Can be done in regular expressions  
- `join`  
Similar functions in other languages:  
  - Java: `join`    
  - Python: `join`        
  - EO: `joined`  

  Joins the list of strings with the given string   
  Should not be implemented:  
  Already implemented in base EO  
- `length`  
Similar functions in other languages:  
  - Java: `length`    
  - Python: `__len__`    
  - C++: `length, size`    
  - Ruby: `length`    
  - EO: `length`  

  Returns the length of the string   
  Should not be implemented:  
  Already implemented in base EO  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`matches-regexp`  
Similar functions in other languages:  
  - Java: `matches`    
  - Python: `re.match`      
  - Ruby: `match?`    

  Checks if the string matches the given regexp   
  Should be implemented:  
  Impossible to do with other functions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`partition`  
Similar functions in other languages:    
  - Python: `partition`      
  - Ruby: `partition`    

  Returns a tuple containing the part before the first template, the template itself, and the part after the template   
  Should not be implemented:  
  Can be done using find-regexp and substring in a few lines, and has very limited set of applications  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`repeat`  
Similar functions in other languages:  
  - Java: `repeat`    
  - Python: `* operator`        

  Returns string repeated multiple times   
  Should not be implemented:  
  Can be done with for loop and concatenate  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`replace-all`  
Similar functions in other languages:  
  - Java: `replaceAll`    
  - Python: `replace`    
  - C++: `replace`    
  - Ruby: `replace, gsub!`    

  Replace all occurences of the substring in string   
  Should be implemented:  
  All regular find function have better performance compared to regexp ones  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`replace-all-regexp`  
Similar functions in other languages:  
  - Java: `s.replaceAll("regex")`          

  Replace all occurences of the regex in string   
  Should be implemented:  
  Too cumbersome to implement through other functions  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`replace-first`  
Similar functions in other languages:  
  - Java: `replaceFirst`        
  - Ruby: `sub!`    

  Replaces the first occurrence of the substring   
  Should be implemented:  
  All regular find function have better performance compared to regexp ones  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`replace-first-regexp`  
Similar functions in other languages:  
  - Java: `s.replaceFirst("regex")`          

  Replaces the first occurrence of the regex   
  Should be implemented:  
  Too cumbersome to implement through other functions  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`replace-last`            

  Replaces the last occurrence of the substring   
  Should be implemented:  
  All regular find function have better performance compared to regexp ones  
- `resize`  
Similar functions in other languages:      
  - C++: `resize`      

  Resizes the memory allocated to the string   
  Should not be implemented:  
  Unapplicable to EO  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`right-partition`  
Similar functions in other languages:    
  - Python: `rpartition`        

  Returns a tuple containing the part before the last template, the template itself, and the part after the template   
  Should not be implemented:  
  Can be done using find-regexp and substring in a few lines, and has very limited set of applications  
- `shrink-to-fit`  
Similar functions in other languages:      
  - C++: `shrink_to_fit`      

  Decreases the capacity of the string and makes it equal to the minimum capacity of the string   
  Should not be implemented:  
  Unapplicable to EO  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`split`  
Similar functions in other languages:  
  - Java: `split`    
  - Python: `split`      
  - Ruby: `split`    

     
  Should be implemented:  
  Has better performance than split-regexp  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`split-regexp`  
Similar functions in other languages:  
  - Java: `s.split("regex")`    
  - Python: `s.split("regex")`        

  Splits the string into the array of the strings by the regex.   
  Should be implemented:  
  Too cumbersome to write with other regexp functions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`starts-with`  
Similar functions in other languages:  
  - Java: `startsWith`    
  - Python: `startswith`      
  - Ruby: `start_with?`    

  Checks if the string starts with substring   
  Should not be implemented:  
  Can be done through regexp/for loop  
- `strip`  
Similar functions in other languages:  
  - Java: `strip`    
  - Python: `strip`      
  - Ruby: `strip`    
  - EO: `trim`  

  Removes all whitespace characters from the both side of the string   
  Should not be implemented:  
  Already implemented in base EO  
- ![Java-EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/java-eo.svg)`substring`  
Similar functions in other languages:  
  - Java: `subSequence, substring`    
  - Python: `slices`    
  - C++: `substr`    
  - Ruby: `[] operator, slice`    

  Returns substring specified by arguments   
  Should be implemented:  
  Too cumbersome to write with primitive functions, essential for other functions  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`swap-case`  
Similar functions in other languages:    
  - Python: `swapcase`      
  - Ruby: `swapcase`    

  Converts all lowercase characters to uppercase, and vise versa   
  Should not be implemented:  
  Can be done in a for loop, and has very limited set of applications to justify implementation  
- `to-float`  
Similar functions in other languages:  
  - Java: `valueOf`    
  - Python: `float`    
  - C++: `stringToFloat`    
  - Ruby: `to_f`    
  - EO: `as-float`  

  Converts string to float   
  Should not be implemented:  
  Already implemented in base EO  
- `to-int`  
Similar functions in other languages:  
  - Java: `valueOf`    
  - Python: `int`    
  - C++: `stringToInteger`    
  - Ruby: `to_i`    
  - EO: `as-int`  

  Converts string to integer   
  Should not be implemented:  
  Already implemented in base EO  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`to-lowercase`  
Similar functions in other languages:  
  - Java: `toLowerCase`    
  - Python: `lower`    
  - C++: `toLowerCase`    
  - Ruby: `downcase`    

  Converts all letters to lowercase   
  Should be implemented:  
  Regular expressions analog is too cumbersome to write, needed for case-blind comparisons  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`to-uppercase`  
Similar functions in other languages:  
  - Java: `toUpperCase`    
  - Python: `upper`    
  - C++: `toUpperCase`    
  - Ruby: `upcase`    

  Converts all letters to uppercase   
  Should be implemented:  
  Regular expressions analog is too cumbersome to write  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`trim-left`  
Similar functions in other languages:  
  - Java: `stripLeading`    
  - Python: `lstrip`      
  - Ruby: `lstrip`    

  Removes all whitespace characters from the left side of the string   
  Should not be implemented:  
  Can be done through regexp, and is relatively rare to justify regular implementation  
- ![EO](https://github.com/InnoSWP/eo-strings/blob/marking-in-progress/readme-assets/eo.svg)`trim-right`  
Similar functions in other languages:  
  - Java: `stripTrailing`    
  - Python: `rstrip`        

  Removes all whitespace characters from the right side of the string   
  Should not be implemented:  
  Can be done through regexp, and is relatively rare to justify regular implementation  

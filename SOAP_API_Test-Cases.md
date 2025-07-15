Test Cases for DataFlex ISBN Validation Web Service



|   Test Case ID                      |   Scenario                 |   Description                                      |   Preconditions   |  Steps                         |   Input Data         |   Expected Result                  |
| ----------------------------------- | -------------------------- | -------------------------------------------------- | ----------------- | ------------------------------ | -------------------- | ---------------------------------- |

 **Positive Scenarios**    
| TC001                               | Valid ISBN                 | Verify service returns TRUE for correct ISBN-10    | Service running   | Send request                   | `0471958697`         | `true`                             |
| TC002                               | Valid ISBN                 | Verify service returns TRUE for another valid ISBN | Service running   | Send request                   | `0306406152`         | `true`                             |
| TC003                               | Valid ISBN with X          | Verify service returns TRUE when ISBN ends with X  | Service running   | Send request                   | `123456789X`         | `true`                             |

 **Negative Scenarios** 
| TC004                               | Invalid ISBN (checksum)    | Wrong checksum should return FALSE                 | Service running   | Send request                   | `0471958699`         | `false`                            |
| TC005                               | Invalid ISBN (digits only) | Invalid digits should return FALSE                 | Service running   | Send request                   | `1234567890`         | `false`                            |


 **Edge Cases: Length & Characters**
| TC006                               | Too Short ISBN             | ISBN < 10 digits should return FALSE               | Service running   | Send request                   | `12345678`           | `false`                            |
| TC007                               | Too Long ISBN              | ISBN > 10 digits should return FALSE               | Service running   | Send request                   | `12345678901`        | `false`                            |
| TC008                               | Non-Numeric ISBN           | Alphabet-only should return FALSE                  | Service running   | Send request                   | `ABCDEFGHIJ`         | `false`                            |
| TC009                               | Mixed Characters           | Mixed letters & digits should return FALSE         | Service running   | Send request                   | `12345ABCDE`         | `false`                            |
| TC010                               | Empty String               | Empty input should return FALSE                    | Service running   | Send request                   | \`\`                 | `false`                            |
| TC011                               | Spaces Only                | Spaces-only input should return FALSE              | Service running   | Send request                   | `          `         | `false`                            |
| TC012                               | Special Characters         | Special characters should return FALSE             | Service running   | Send request                   | `!@#$%^&*()`         | `false`                            |


 **Boundary & Format**                                      
| TC013                               | Leading/Trailing Spaces    | Should trim spaces and validate correctly          | Service running   | Send request                   | `0471958697`         | `true`                             |
| TC014                               | Lowercase x                | Lowercase `x` at end should return TRUE            | Service running   | Send request                   | `123456789x`         | `true`                             |
| TC015                               | Hyphenated ISBN            | Hyphenated ISBN should return FALSE                | Service running   | Send request                   | `0-471-95869-7`      | `false`                            |
| TC016                               | Null Value                 | Null input should return FALSE                     | Service running   | Send request                   | `null`               | `false`                            |


**Performance / Stress**  
| TC017                               | Large String               | Handle 1000-digit input gracefully                 | Service running   | Send request                   | 1000-digit string    | `false`                            |
| TC018                               | Rapid Repeated Requests    | Stability under multiple quick calls               | Service running   | Send 100 requests quickly      | Multiple valid ISBNs | All responses correct, no failures |


**Protocol Specific**
| TC019                               | SOAP 1.1 Request           | Verify response using SOAP 1.1                     | Service running   | Send SOAP 1.1 request          | `0471958697`         | `true`                             |
| TC020                               | SOAP 1.2 Request           | Verify response using SOAP 1.2                     | Service running   | Send SOAP 1.2 request          | `0471958697`         | `true`                             |
| TC021                               | JSON Request               | Verify response using JSON format                  | Service running   | Send JSON request              | `0471958697`         | `true`                             |
| TC022                               | Invalid Content-Type       | Wrong content-type should return error             | Service running   | Send request with `text/plain` | `0471958697`         | HTTP 415 Unsupported Media Type    |


**Invalid HTTP Methods** 
| TC023                               | GET Method                 | Using GET should return error                      | Service running   | Send GET request               | `0471958697`         | HTTP 405 Method Not Allowed        |
| TC024                               | PUT Method                 | Using PUT should return error                      | Service running   | Send PUT request               | `0471958697`         | HTTP 405 Method Not Allowed        |

---

# REST-API-for-CRM-system
Spring REST - CRUD Database for Customer Relationship Management system. 

# Steps
1. 
   1) Create Customer REST Controller
   2) Include @Autowire Customer Service
   3) Add mapping for GET/customers
   4) Add mapping for GET/customers/{customerId}
2.
   1) Create a custom error response class
   2) Create a custom exception class
   3) Update REST service to throw exception if customer is not found
   4) Add exception handler methods using @ExceptionHandler
3.
     Add Customer
4.
     Update Customer
5.
     Delete Customer
 
 # API points
 @RequestMapping("/api")
 * @GetMapping("/customers")
 * @GetMapping("/customers/{customerId}")
 * @PostMapping("/customers")
 * @PutMapping("/customers")
 * @DeleteMapping("/customers/{customerId}")

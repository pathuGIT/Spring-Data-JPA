# Spring-Data-JPA

## INPUT

POST
http://localhost:8080/employees

{
"name": "mohn Doe",
"age": 50,
"address": {
    "address": "123 Main St"
    }
}

## OUTPUT
200 OK

{
"id": 1,
"name": "mohn Doe",
"age": 50,
"address": {
    "id": 1,
    "address": "123 Main St"
    }
}
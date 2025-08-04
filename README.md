# Spring-Data-JPA

---

# Spring Data JPA Derived Query Cheat Sheet

## **Basic Structure**

```
findBy<FieldName><Operator>[And/Or]<FieldName><Operator>...
```

---

## **Equality & Basic Matching**

* `findByName(String name)` → `name = ?`
* `findByNameIs(String name)` → `name = ?`
* `findByNameEquals(String name)` → `name = ?`
* `findByNameNot(String name)` → `name <> ?`
* `findByNameIsNot(String name)` → `name <> ?`

---

## **LIKE / Pattern Matching**

* `findByNameLike(String name)` → `name LIKE ?` (must include `%`)
* `findByNameContaining(String name)` → `name LIKE %?%`
* `findByNameStartingWith(String name)` → `name LIKE ?%`
* `findByNameEndingWith(String name)` → `name LIKE %?`

---

## **Case Sensitivity**

* `IgnoreCase` → make case-insensitive
  **Example:** `findByNameContainingIgnoreCase(String name)`

---

## **Comparison Operators**

* `findByAgeGreaterThan(int age)` → `age > ?`
* `findByAgeGreaterThanEqual(int age)` → `age >= ?`
* `findByAgeLessThan(int age)` → `age < ?`
* `findByAgeLessThanEqual(int age)` → `age <= ?`
* `findByAgeBetween(int start, int end)` → `age BETWEEN ? AND ?`

---

## **Null Checks**

* `findByNameIsNull()` → `name IS NULL`
* `findByNameIsNotNull()` → `name IS NOT NULL`

---

## **Boolean Checks**

* `findByActiveTrue()` → `active = true`
* `findByActiveFalse()` → `active = false`

---

## **Collection Operators**

* `findByRoleIn(Collection<String> roles)` → `role IN (...)`
* `findByRoleNotIn(Collection<String> roles)` → `role NOT IN (...)`

---

## **Logical Operators**

* `And` → `findByNameAndAge(String name, int age)`
* `Or` → `findByNameOrAge(String name, int age)`

---

## **Sorting**

* `findByNameOrderByAgeAsc(String name)` → sort ascending
* `findByNameOrderByAgeDesc(String name)` → sort descending

---

## **Distinct**

* `findDistinctByName(String name)` → removes duplicates

---

## **Limiting Results**

* `findFirstByOrderByAgeDesc()` → first result
* `findTop3ByOrderBySalaryDesc()` → top 3 results

---

## **Nested Properties (Relationships)**

* `findByAddress_City(String city)` → `JOIN address WHERE city = ?`
* `findByAddress_CityContaining(String city)` → `JOIN address WHERE city LIKE %?%`

---

## **Special Cases**

* `findByCreatedDateAfter(LocalDate date)` → after date
* `findByCreatedDateBefore(LocalDate date)` → before date
* `findByCreatedDateBetween(LocalDate start, LocalDate end)` → between dates
* `findBySalaryNotNullOrderBySalaryDesc()` → filter + sort

---

## **Count & Exists**

* `countByAgeGreaterThan(int age)` → returns count
* `existsByEmail(String email)` → returns boolean

---

## **Examples for Employee + Address**

* `findByAddress_AddressContainingIgnoreCase(String keyword)`
  → Employees where address contains keyword

* `findByNameContainingIgnoreCaseAndAgeGreaterThan(String name, int age)`
  → Employees name like X and older than Y

* `findTop3ByAgeOrderByNameDesc()`
  → Top 3 oldest employees sorted by name desc

---

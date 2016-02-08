Iteration 01. Simple operations
==========================
Use MongoDB Shell

01.
---
Set working database to **training**

02.
---
Insert into collection **persons** document representing you (person) with fields
- first_name
- last_name
- age

03.
---
Display your data on screen. Use find().

04.
---
Insert into collection **persons** document representing person sitting next to you.
Use the same fields as in previous task. 

05.
---
Verify both persons are in collection **persons**. Display them with pretty JSON.

06.
---
Add third person with fields:
- first_name = Donald
- last_name = Duck
- is_cartoon = true  

07.
---
Add fourth person with data:
- first_name = Barrack
- last_name = Obama
- age = 54
- address (an embedded document with fields:)
  - country = United States
  - street = Pennsylvania Ave NW
  - city = Washington

08.
---
Check content of your collection.
You should have something like:
```
{
    "_id" : ObjectId("56a626429c36b8f8be2e160d"),
    "first_name" : "Szymon",
    "last_name" : "Sobocik",
    "age" : 29
}
{
    "_id" : ObjectId("56a626529c36b8f8be2e160e"),
    "first_name" : "Artur",
    "last_name" : "Mleczko",
    "age" : 30
}
{
    "_id" : ObjectId("56a62ac79c36b8f8be2e1610"),
    "first_name" : "Donald",
    "last_name" : "Duck",
    "is_cartoon" : true
}
{
    "_id" : ObjectId("56a62b459c36b8f8be2e1611"),
    "first_name" : "Barrack",
    "last_name" : "Obama",
    "age" : 54,
    "address" : {
            "country" : "United States",
            "street" : "Pennsylvania Ave NW",
            "city" : "Washington"
    }
}
```

09.
---
Find only document with Donald Duck (use `is_cartoon` field)

10.
---
Find persons with different `first_name` than Barrack

11.
---
Remove second person (person sitting next to you) from collection. (use `first_name` or `last_name` field)

12.
---
Count size of your collection.
Expected size = 3.

13.
---
Update your age to 67. Use `update()` method and `$set` operator.

14.
---
Find all persons older than 50 years. Use and `$gt` operator.
Count them.

15.
---
Set field `vip` to `true` for all persons older than 50 years. Use `updateMany()` function.

Verify that you're actually updating two documents. Watch for `matchedCount` and `modifiedCount` in write result.
```
{ "acknowledged" : true, "matchedCount" : 2, "modifiedCount" : 2 }
```

16.
---
Verify your collection state.
Expected results:
```
{
    "_id" : ObjectId("56a626429c36b8f8be2e160d"),
    "first_name" : "Szymon",
    "last_name" : "Sobocik",
    "age" : 67,
    "vip" : true
}
{
    "_id" : ObjectId("56a62ac79c36b8f8be2e1610"),
    "first_name" : "Donald",
    "last_name" : "Duck",
    "is_cartoon" : true
}
{
    "_id" : ObjectId("56a62b459c36b8f8be2e1611"),
    "first_name" : "Barrack",
    "last_name" : "Obama",
    "age" : 54,
    "address" : {
            "country" : "United States",
            "street" : "Pennsylvania Ave NW",
            "city" : "Washington"
    },
    "vip" : true
}
```

17.
---
Decrement your age by 30 with single update. Use update operator different than $set.

18.
---
Check what will happen if you try to increment Donald Ducks age by some value.
Note that he doesn't have `age` field in his document.

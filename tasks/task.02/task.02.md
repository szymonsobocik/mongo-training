Iteration 02. Import, Query, Projections
========================================

01.
---
Import data from file accounts.json into database 'training' and into collection 'accounts'.

02.
---
Count documents in `accounts` collection. Should be 5000.

03.
---
Find all persons with `last_name` equal Smith.

Count them. Should be 23.

04.
---
Pretty display first 3 persons with `last_name` equal Smith. Sort by `first_name` ascending.

You should get persons with names: Aaron, Adam, Alice 

05.
---
Find persons who don't have any accounts.

Count them. Should be 964.

06.
---
Get only first and last names of first 20 persons. Sort by `last_name` ascending.

07.
---
Do the same as above, but don't include `_id` field in the results.

Expected results:
```
{ "first_name" : "Clarence", "last_name" : "Adams" }
{ "first_name" : "Daniel", "last_name" : "Adams" }
{ "first_name" : "Kenneth", "last_name" : "Adams" }
{ "first_name" : "Russell", "last_name" : "Adams" }
{ "first_name" : "Andrew", "last_name" : "Adams" }
{ "first_name" : "Howard", "last_name" : "Adams" }
{ "first_name" : "Arthur", "last_name" : "Adams" }
{ "first_name" : "Maria", "last_name" : "Adams" }
{ "first_name" : "Cynthia", "last_name" : "Adams" }
{ "first_name" : "Daniel", "last_name" : "Adams" }
{ "first_name" : "Judy", "last_name" : "Adams" }
{ "first_name" : "Timothy", "last_name" : "Adams" }
{ "first_name" : "Debra", "last_name" : "Adams" }
{ "first_name" : "Judith", "last_name" : "Adams" }
{ "first_name" : "Pamela", "last_name" : "Adams" }
{ "first_name" : "Marilyn", "last_name" : "Adams" }
{ "first_name" : "Andrew", "last_name" : "Adams" }
{ "first_name" : "Anna", "last_name" : "Adams" }
{ "first_name" : "Benjamin", "last_name" : "Adams" }
{ "first_name" : "Louise", "last_name" : "Adams" }
```

08.
---
Find person whos `mother_name` is Lisa and `father_name` is John.

Should get 1 result.

09.
---
Find one person, who joined the bank most recently.

10.
---
Find the person, who's been member of the bank for the longest period.

11.
---
Display only `gender' of the oldest person in the bank.

12.
---
Display `personal` data of youngest person, who doesn't have any accounts.
```
db.accounts.find({"accounts":{$exists:0}}, {"personal":1, _id:0}).sort({"personal.birth_date":-1}).limit(1).pretty()
"personal" : {
       "mother_name" : "Marilyn",
       "father_name" : "Clarence",
       "gender" : "female",
       "birth_date" : ISODate("2013-02-25T08:25:43.292Z")
}
```       

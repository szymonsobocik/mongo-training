Final task
==========

01.
---
Connect to remote mongo server:
```
mongo --host 10.57.200.48
```

02.
---
Use `szkolenie` database.

03.
---
Into collection `feedback` insert document with feedback.

Expected format:
```
{
  "mark": number
  "comment": "Some text"
}
```

`mark` - 1 to 10 (10 is the best) 
`comment` - write something, that you liked/hated most

04.
---
Into collection `present` insert document containing your name and last name

Expected format:
```
{
  "first": "your name",
  "last": "your last name"
}
```
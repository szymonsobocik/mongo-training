Iteration 04. Indexes
=====================

01.
---
Use `training` dabase. Count documents in collection `meds`.

02.
---
Execute `.explain("executionStats")` on `.find()`

Observe that it requires collection scan. (COLLSCAN)
Try to observe CPU usage also (Resource Monitor).

03.
---
Find meds with `quantity` equal 200.

Look how long this query executes.

04.
---
Find 20 meds which have the least quantity. (Smaller value)

Look how long this query executes.

05.
---
Create an index, that will help with two queries above.

06.
---
Find meds with category 50, and subcategory 600.

07.
---
Create an index to speed up query above.

Should you use one or two indexes?


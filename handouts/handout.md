MongoDB training handout
========================
                        
Basic Mongo Shell operations  
----------------------------
```
help
db.help()
show dbs
use databaseName
show collections
db.collection.help()
db.collection.findOne()
db.collection.find()
db.collection.find({<query object>})
db.collection.find({<query object>}, {<projection object>})
db.collection.update({<query object>}, {<update object>})
db.collection.remove({<query object>})
db.collection.deleteOne({<query object>})
db.collection.drop()
```

Import data from json file into database
----------------------------------------
```
mongoimport --db databaseName --collection collectionName --file file.json 
or
mongoimport --db databaseName --collection collectionName --jsonArray arrayFile.json
```

Query operators
---------------
### Comparison
```
db.collection.find({"field":"value","age":{$gt: 20}})
```
| Name      | Description|
|-----------|------------|
| $eq	    | Matches values that are equal to a specified value. |
| $gt	    | Matches values that are greater than a specified value.|
| $gte	    | Matches values that are greater than or equal to a specified value.|
| $lt       | Matches values that are less than a specified value.|
| $lte	    | Matches values that are less than or equal to a specified value.
| $ne	    | Matches all values that are not equal to a specified value.
| $in   	| Matches any of the values specified in an array.
| $nin	    | Matches none of the values specified in an array.

### Logical
```
db.persons.find({$or:[{"name":"Marek"},{"age":31}]})
```
| Name	    | Description
|-----------|------------|
| $or	    | Joins query clauses with a logical OR returns all documents that match the conditions of either clause.
| $and	    | Joins query clauses with a logical AND returns all documents that match the conditions of both clauses.
| $not	    | Inverts the effect of a query expression and returns documents that do not match the query expression.
| $nor	    | Joins query clauses with a logical NOR returns all documents that fail to match both clauses.

### Element
```
db.persons.find({"field":{$exists: true}})
```
| Name	    | Description
|-----------|------------|
| $exists	|Matches documents that have the specified field.
| $type		|Selects documents if a field is of the specified type.

### Array
| Name	    | Description
|-----------|------------|
| $all		| Matches arrays that contain all elements specified in the query.
| $elemMatch| Selects documents if element in the array field matches all the specified $elemMatch conditions.
| $size	    | Selects documents if the array field is a specified size.

Update Operators
----------------
### Fields
| Name  	| Description|
|-----------|------------|
| $inc	    | Increments the value of the field by the specified amount.
| $mul	    | Multiplies the value of the field by the specified amount.
| $rename	| Renames a field.
| $setOnInsert |Sets the value of a field if an update results in an insert of a document. Has no effect on update operations that modify existing documents.
| $set		| Sets the value of a field in a document.
| $unset	| Removes the specified field from a document.
| $min		| Only updates the field if the specified value is less than the existing field value.
| $max		| Only updates the field if the specified value is greater than the existing field value.
| $currentDate | Sets the value of a field to current date, either as a Date or a Timestamp.

### Array Operators
| Name  	| Description|
|-----------|------------|
| $		    | Acts as a placeholder to update the first element that matches the query condition in an update.
| $addToSet	| Adds elements to an array only if they do not already exist in the set.
| $pop		| Removes the first or last item of an array.
| $pullAll	| Removes all matching values from an array.
| $pull	    | Removes all array elements that match a specified query.
| $pushAll	| Deprecated. Adds several items to an array.
| $push	    | Adds an item to an array.

db.test.insert({'Name': 'Szymon'})

db.test.insert({
    'Name': 'Adam',
    'last_name': 'Sandler'
})

db.test.find({
        'Name': 'Szymon'
    }
).pretty()


db.persons.insert({"first_name": "Donald", "last_name": "Duck", "is_cartoon": true})

db.persons.insert({
    "first_name": "Barrack", "last_name": "Obama", "age": 54, "address": {
        "country": "United States",
        "street": "Pennsylvania Ave NW",
        "city": "Washington"
    }
});

db.persons.find({"is_cartoon":true})

db.persons.remove({"first_name":"Artur"})

db.persons.update({"first_name":"Szymon"}, {"$set":{"age":67}})


    db.person.aggregate([{$group: {_id: "$accounts.account_type"}}])
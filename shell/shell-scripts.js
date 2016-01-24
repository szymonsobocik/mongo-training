db.test.insert({'Name': 'Szymon'})

db.test.insert({
'Name': 'Adam',
'last_name': 'Sandler'
})

db.test.find({
    'Name': 'Szymon'
    }
    ).pretty()
db.test.insert({'Name': 'Szymon'})

db.test.insert({
'Name': 'Adam',
'last_name': 'Sandler'
})

db.test.find({
    'Name': 'Szymon'
    }
    ).pretty()



db.person.aggregate([{$group:{_id:"$accounts.account_type"}}])
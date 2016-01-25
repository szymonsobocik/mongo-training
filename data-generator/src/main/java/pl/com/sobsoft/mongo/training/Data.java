package pl.com.sobsoft.mongo.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

public class Data {

    public static final List<String> LAST_NAMES = unmodifiableList(asList("Grant", "Kelley", "Washington", "Meyer", "Allen", "Hernandez", "Alvarez", "Gutierrez", "Stanley", "Lane", "Hunter", "Willis", "Chavez", "Hill", "Sims", "Rodriguez", "Holmes", "Elliott", "Allen", "Campbell", "Woods", "Nguyen", "Stevens", "Thomas", "Webb", "Daniels", "Garrett", "Fernandez", "Evans", "Lee", "Hunter", "Ray", "Flores", "Scott", "Long", "Cunningham", "Romero", "Kim", "Alvarez", "Bryant", "Perkins", "Spencer", "Moreno", "Mendoza", "Garrett", "Cunningham", "Patterson", "Robertson", "Nelson", "Weaver", "Williams", "Morales", "Wright", "Hayes", "Price", "Rogers", "Spencer", "Hawkins", "Reynolds", "Garcia", "Roberts", "Baker", "Young", "Hunter", "Hart", "Black", "Robinson", "Dixon", "Gomez", "Jordan", "Sims", "Hernandez", "Miller", "Morales", "Sanders", "Lewis", "Fisher", "Walker", "Sullivan", "Snyder", "Edwards", "Gilbert", "Walker", "Lee", "Warren", "Baker", "Wright", "Kelley", "Mcdonald", "Carpenter", "Webb", "Rodriguez", "Grant", "George", "Ruiz", "Lawrence", "Harvey", "Hansen", "Kim", "Gomez", "Sanchez", "Cook", "Meyer", "Burton", "Porter", "Morgan", "Ruiz", "Perkins", "Rodriguez", "Lewis", "Ortiz", "Grant", "Hamilton", "Peters", "Ward", "Jackson", "Washington", "Lewis", "Marshall", "Carr", "Marshall", "Fields", "Pierce", "Holmes", "Allen", "Sanchez", "Hill", "Harris", "Reed", "Long", "Cole", "Johnston", "Hughes", "Gomez", "Bryant", "Howard", "Carter", "Powell", "Adams", "Stewart", "Meyer", "Cox", "Carter", "Martinez", "Black", "Gray", "Taylor", "Jenkins", "Cunningham", "Carroll", "Mason", "Alexander", "Rice", "Nelson", "Graham", "Perez", "Watson", "Lane", "Miller", "Allen", "Cunningham", "Hughes", "Turner", "Mason", "Pierce", "Lawson", "Chapman", "Spencer", "Ramirez", "Fowler", "Murray", "Butler", "Kelley", "Shaw", "Fox", "Reynolds", "Olson", "Stone", "Flores", "Gibson", "Garrett", "Stephens", "Riley", "Collins", "Holmes", "Perkins", "Bennett", "Clark", "Nichols", "Phillips", "Kim", "Thomas", "Butler", "Rivera", "Baker", "Sanders", "Palmer", "Sanders", "Carpenter", "Campbell", "Edwards", "Schmidt", "Richardson", "Watkins", "Ford", "Greene", "Bell", "Chapman", "Taylor", "Vasquez", "Ramirez", "Castillo", "Fernandez", "Gilbert", "Matthews", "Parker", "Wagner", "Franklin", "Chapman", "Brown", "George", "White", "Hill", "Gilbert", "Richards", "Bell", "Daniels", "Smith", "Reid", "Ramos", "Burke", "Gonzales", "Pierce", "Ramos", "Little", "Austin", "Myers", "Holmes", "Baker", "Burns", "Wagner", "Turner", "Warren", "Henderson", "Gonzales", "Lopez", "Welch", "Gordon", "Richardson", "Price", "Austin", "Vasquez", "Hicks", "Lynch", "Lawrence", "Morris", "Garrett", "Fernandez", "Lane", "Hall", "Cooper", "Kelley", "Diaz", "Greene", "Bryant", "Hunter", "Hansen", "Fernandez", "Gray", "Ryan", "Johnston", "Wallace", "Payne", "Peterson", "Ward", "Ward", "Nguyen", "Palmer", "Murphy", "Simmons", "Arnold", "Garza", "Morales", "Washington", "Hill", "Dunn", "Henry", "Carpenter", "Hansen", "Howard", "Cunningham", "Robertson", "Morrison", "White", "Johnston", "Long", "Grant", "Marshall", "Lopez", "Sullivan", "Williams", "Baker", "Watkins", "Snyder", "Lopez", "Graham", "Nguyen", "Hunter", "Armstrong", "Stevens", "Sullivan", "Reyes", "Parker", "Freeman", "Washington", "Crawford", "Hudson", "Lewis", "Richards", "Perez", "Burke", "Ryan", "Andrews", "Sanchez", "Lawson", "Peters", "Nichols", "Butler", "Collins", "Kennedy", "Bennett", "Schmidt", "Murray", "Jones", "Montgomery", "Burton", "Warren", "Flores", "Hughes", "Dixon", "Wagner", "Foster", "Murphy", "Ferguson", "Banks", "Palmer", "Armstrong", "Simmons", "Duncan", "Kelly", "Hunt", "Foster", "Arnold", "Myers", "Greene", "Montgomery", "Kelley", "Williams", "Fowler", "Powell", "Evans", "Henderson", "Torres", "Rogers", "Jordan", "Palmer", "Hansen", "Jenkins", "Tucker", "Carr", "Welch", "Bailey", "Scott", "Hamilton", "Berry", "Powell", "Dixon", "Ryan", "Miller", "Russell", "Brown", "Nichols", "Vasquez", "Ortiz", "Scott", "Garrett", "Gomez", "Medina", "Fuller", "Owens", "Gordon", "Ortiz", "Meyer", "Mccoy", "Phillips", "Cooper", "Austin", "Wagner", "Lewis", "Fernandez", "Sullivan", "Morales", "Stevens", "Thomas", "Carter", "Little", "Harper", "Boyd", "Stewart", "Ferguson", "Griffin", "Thomas", "Bishop", "Ellis", "Stewart", "Webb", "Edwards", "Alexander", "Morgan", "Burns", "Carroll", "Marshall", "Mason", "Gilbert", "Mitchell", "Watkins", "Larson", "Garza", "Wilson", "Anderson", "Scott", "Sims", "Lane", "Jackson", "Wells", "Barnes", "Martin", "Rogers", "Turner", "Montgomery", "Henry", "Moore", "Parker", "Carroll", "Rodriguez", "Riley", "Stewart", "Austin", "Evans", "Walker", "Larson", "Reyes", "Jones", "Foster", "Jones", "Richards", "Hughes", "Long", "Wheeler", "Porter", "Burns", "Burns", "Moreno", "Ellis", "Mason", "Carter", "Kelley", "Ramirez", "Welch", "Wagner", "Dean", "Clark", "Williamson", "Ryan", "Arnold", "Henry", "Henderson", "Hernandez", "Rodriguez", "Williams", "Myers", "Franklin", "Roberts", "Austin", "Cook", "Ramos", "Morrison", "Larson", "Sullivan", "Cox", "Peterson", "Collins", "Perry", "Fox", "Morales", "Perkins", "Dean", "Larson", "Alvarez", "Lane", "Miller", "Shaw", "Perry", "Chapman", "Burton", "Marshall", "Garza", "Dixon", "Griffin", "Mcdonald", "Cruz", "Walker", "Ferguson", "Bryant", "Alexander", "King", "Washington", "Porter", "Gardner", "Snyder", "Bradley", "Howard", "Torres", "Meyer", "Perez", "Fisher", "Taylor", "Rogers", "Sims", "Tucker", "Torres", "Gomez", "Howard", "Peters", "Shaw", "Gray", "Franklin", "Carpenter", "Morris", "Murray", "Chavez", "Montgomery", "Gibson", "Fowler", "Reyes", "Holmes", "Mitchell", "Campbell", "Richardson", "Marshall", "Cooper", "Shaw", "Wells", "Scott", "Ford", "Romero", "Porter", "Berry", "Parker", "Reed", "Gordon", "Ryan", "Bennett", "Schmidt", "Dixon", "Woods", "Davis", "Warren", "Lewis", "Lane", "Rose", "Castillo", "Gray", "Shaw", "Fisher", "Cox", "Fowler", "Riley", "Armstrong", "Mendoza", "Banks", "Fields", "Graham", "Simpson", "Harrison", "Sims", "Morales", "Ruiz", "Vasquez", "Shaw", "Bishop", "Mason", "Edwards", "Jones", "Mccoy", "Wells", "Griffin", "Armstrong", "Reed", "Powell", "Sanchez", "Fisher", "Peterson", "Torres", "Diaz", "Lewis", "Dean", "Peters", "Jackson", "Knight", "Nguyen", "Burns", "Bishop", "Ward", "Lynch", "Stevens", "Stone", "Cook", "Flores", "Ferguson", "Carr", "Banks", "Hanson", "Anderson", "Woods", "Ruiz", "Burke", "Kelley", "Baker", "Alvarez", "Andrews", "Ryan", "Palmer", "Morgan", "Owens", "Davis", "Daniels", "Brooks", "Gray", "Simmons", "Chavez", "Gonzales", "Bradley", "Hughes", "Gonzales", "Holmes", "Hughes", "Berry", "Sims", "Brown", "Burton", "Oliver", "Stone", "Long", "Ray", "Oliver", "Nguyen", "James", "Graham", "Olson", "Chavez", "Wood", "Burton", "Stewart", "Smith", "Price", "Ray", "Perkins", "Sanchez", "Hicks", "Fox", "Stone", "Woods", "Boyd", "Ford", "Woods", "Castillo", "Perez", "Edwards", "Collins", "Perry", "Gomez", "Carr", "Lynch", "Vasquez", "Clark", "Morris", "Morgan", "Medina", "Ramirez", "Hawkins", "Lawrence", "Castillo", "Franklin", "Evans", "Gutierrez", "Wood", "Chapman", "Harvey", "Reynolds", "Lee", "Thomas", "Reynolds", "Burns", "Reed", "Peterson", "Gray", "Clark", "Allen", "Snyder", "Lane", "Cole", "Woods", "Burke", "Reed", "Montgomery", "Clark", "Andrews", "Williamson", "White", "Alexander", "Rodriguez", "Hill", "King", "Stewart", "Walker", "Allen", "Lynch", "Alvarez", "Tucker", "Fisher", "Ramirez", "Carr", "Wells", "Murray", "Patterson", "Robinson", "Bryant", "Powell", "Spencer", "Baker", "Ramos", "Morrison", "Lane", "Nguyen", "Jackson", "Simpson", "Larson", "Jones", "Sanders", "Reynolds", "Hart", "Nguyen", "Jackson", "Romero", "Mitchell", "Burns", "Carr", "Alexander", "Stanley", "Grant", "Dean", "Arnold", "Grant", "Warren", "Jenkins", "Stephens", "Howell", "Welch", "Washington", "Elliott", "Wright", "Hill", "Stanley", "Fernandez", "Porter", "Mitchell", "Schmidt", "Anderson", "Welch", "Garcia", "Oliver", "Ellis", "Hart", "Williamson", "Hunter", "Pierce", "Wilson", "Fields", "Hernandez", "Cox", "Harrison", "Johnston", "Wells", "Campbell", "Owens", "Rogers", "Fox", "Mitchell", "Jacobs", "Warren", "Ramirez", "Elliott", "Hansen", "Bishop", "Simmons", "Mitchell", "Butler", "Chavez", "Hunter", "Pierce", "Lewis", "Ward", "Hamilton", "Ramirez", "Garrett", "Scott", "Mason", "Reid", "Brooks", "Holmes", "Simpson", "Lawrence", "Simpson", "Austin", "Gomez", "Robertson", "Lopez", "West", "Banks", "Adams", "Kim", "Gray", "Spencer", "Myers", "Stewart", "Jones", "Knight", "Mccoy", "Lopez", "Perry", "Kelley", "Montgomery", "George", "Willis", "Rodriguez", "Evans", "Morrison", "Roberts", "Diaz", "Dean", "Scott", "White", "James", "Reed", "Jackson", "Fisher", "Sims", "Tucker", "Lopez", "Hansen", "Meyer", "Welch", "Gardner", "Lynch", "Day", "Perez", "Sanchez", "White", "Peters", "Medina", "Kelley", "Watkins", "Campbell", "James", "Kim", "Marshall", "Perez", "Flores", "Thompson", "Webb", "Webb", "Morrison", "Andrews", "Burke", "Harris", "Rodriguez", "Garcia", "Collins", "Howard", "Tucker", "Davis", "Carr", "Rogers", "Gardner", "Anderson", "Watkins", "Armstrong", "Stevens", "Crawford", "Bowman", "Reid", "George", "Roberts", "Reyes", "Daniels", "Fields", "Warren", "Collins", "Hudson", "Wright", "Bennett", "Weaver", "Dean", "Garcia", "Wallace", "Peterson", "Burke", "Morris", "Gray", "Wilson", "Wells", "Wells", "Mccoy", "Rivera", "Smith", "Wallace", "Andrews", "Spencer", "Gibson", "Andrews", "Daniels", "Rose", "Clark", "Jordan", "Collins", "Jones", "Lopez", "Bryant", "Walker", "Oliver", "Martinez", "Elliott", "Coleman", "Sanchez", "Turner", "White", "Hunt", "Boyd", "Lawson", "Hicks", "Harper", "Mason", "Burke", "Nguyen", "Owens", "Andrews", "Gibson", "Reyes", "Cook", "Little", "Miller", "Dean", "Matthews", "Medina", "Lane", "Robertson", "Marshall", "Fox", "Woods", "Ward", "Turner", "Dean", "Hall", "Burton", "Lewis", "Gonzalez", "Arnold", "Green", "Garcia", "Richards", "Barnes", "Spencer", "Harris", "Chavez", "Mendoza", "Fowler", "Little", "Stanley", "Peters", "Gardner", "Moreno", "Ruiz", "Stephens", "Ruiz", "Jordan", "Bradley", "Gonzales", "Warren", "Smith"));
    public static final List<String> FIRST_NAMES = unmodifiableList(asList("Lori", "Terry", "Sean", "Cheryl", "Jeffrey", "Kathryn", "Ruby", "Jennifer", "Donna", "Frank", "Andrea", "Lillian", "Albert", "Mark", "William", "Nicole", "Steven", "Linda", "Sarah", "Louis", "Christina", "Tammy", "Steve", "Maria", "Adam", "Marie", "Robert", "Julia", "Daniel", "Eric", "Craig", "Louise", "Brandon", "Joyce", "Scott", "Pamela", "Phyllis", "Mildred", "Gloria", "Gerald", "Denise", "Heather", "Joan", "Michael", "Julia", "Donna", "Dorothy", "Nicole", "Gregory", "Jack", "Jeffrey", "Donald", "Stephen", "Barbara", "Arthur", "Nancy", "Joyce", "Gloria", "Roy", "Fred", "Willie", "Sharon", "Johnny", "Gerald", "Albert", "Fred", "Jose", "James", "Adam", "Angela", "Sean", "Scott", "Jean", "Angela", "Ruth", "Jesse", "Helen", "William", "Shawn", "Robin", "Fred", "John", "Frank", "George", "Kimberly", "Gregory", "James", "Jacqueline", "Phyllis", "Gregory", "Sharon", "Maria", "Joseph", "Richard", "Cynthia", "Jean", "Joseph", "Nancy", "Kevin", "Diane", "Nicole", "Harold", "Ruth", "Deborah", "Benjamin", "Catherine", "Margaret", "Bobby", "Joseph", "Nancy", "Tina", "Phyllis", "Ruth", "Marie", "Lillian", "Rebecca", "Theresa", "Kathy", "Christina", "Daniel", "George", "Todd", "Jessica", "Peter", "Gerald", "Alan", "Samuel", "Terry", "Tina", "Victor", "Alan", "Sharon", "Dennis", "Mildred", "Johnny", "Jacqueline", "Earl", "Robin", "Carl", "David", "Jessica", "Jerry", "Teresa", "Wanda", "Heather", "Juan", "Juan", "Kelly", "Susan", "Robert", "Johnny", "Adam", "Willie", "Karen", "Billy", "Robert", "Robin", "Jack", "Pamela", "Linda", "Howard", "Chris", "Cheryl", "Juan", "Lori", "Carolyn", "Dorothy", "Larry", "Lori", "Todd", "Cynthia", "Teresa", "William", "Kimberly", "Robert", "Maria", "Philip", "Carolyn", "Antonio", "Diane", "Diana", "Heather", "Keith", "Jacqueline", "Michelle", "Patricia", "Ryan", "Lillian", "Tammy", "Rose", "Antonio", "Todd", "Billy", "Albert", "Judy", "Doris", "Robert", "Bonnie", "Aaron", "Arthur", "Katherine", "Robert", "Kathleen", "Fred", "Denise", "John", "Louise", "Helen", "Linda", "Emily", "George", "Paul", "Susan", "Ralph", "Marie", "Michael", "Juan", "Cynthia", "Betty", "Lori", "Sarah", "Antonio", "Deborah", "Kevin", "Richard", "Gregory", "Jose", "Beverly", "Mary", "Roger", "Benjamin", "Jason", "Philip", "Brandon", "Ernest", "Joan", "Victor", "Larry", "Joyce", "Antonio", "Elizabeth", "Samuel", "Phyllis", "Brian", "Peter", "Juan", "Harold", "Nicole", "Patricia", "Terry", "Wanda", "Shawn", "Nicole", "Howard", "Martin", "Frances", "Anthony", "Marie", "Rebecca", "Tina", "Angela", "Gary", "Jeffrey", "Ann", "Louis", "Louise", "Stephanie", "Louis", "Lois", "Laura", "Billy", "Sarah", "Jane", "Alice", "Gregory", "Roger", "Cheryl", "Amy", "George", "Walter", "Louise", "Billy", "Linda", "Lillian", "Lori", "Ralph", "Heather", "Cynthia", "Lisa", "Clarence", "Jane", "Joseph", "Steven", "Scott", "Victor", "Anna", "Jonathan", "Nicholas", "Walter", "Sarah", "James", "Laura", "Maria", "Nicole", "Keith", "Gary", "Joe", "Brenda", "Jose", "Melissa", "Andrea", "Richard", "Scott", "Jerry", "Laura", "Elizabeth", "Evelyn", "Judith", "Willie", "Howard", "Harold", "Julia", "Jessica", "Samuel", "Fred", "Carlos", "Patricia", "Carol", "Anthony", "Sandra", "Howard", "John", "Tina", "Stephen", "Doris", "Jason", "Doris", "Brandon", "Louis", "Timothy", "Douglas", "Ryan", "Willie", "Kathleen", "Philip", "Katherine", "Samuel", "Anthony", "Deborah", "Sharon", "Paul", "Benjamin", "Albert", "Lisa", "David", "Raymond", "Lois", "Christine", "William", "Eugene", "Emily", "Larry", "Andrew", "Phyllis", "Ernest", "Thomas", "Raymond", "Donald", "Anna", "Carlos", "Tina", "Christine", "Frances", "Frank", "Aaron", "Larry", "Benjamin", "Lisa", "Bruce", "Joseph", "Donald", "Jean", "Evelyn", "Matthew", "Eugene", "Teresa", "Jean", "Amanda", "Cheryl", "Ashley", "Randy", "Margaret", "Frances", "Pamela", "Eugene", "Douglas", "Jeffrey", "Sharon", "Mark", "Gerald", "Joseph", "Sara", "Keith", "Mary", "Eugene", "Julie", "Jerry", "Anthony", "Jonathan", "Brenda", "Shawn", "Harry", "Rachel", "Andrew", "Lisa", "Billy", "Jane", "Carolyn", "Jessica", "Terry", "Debra", "Barbara", "Frances", "John", "Eric", "Anthony", "Diane", "Brandon", "Nancy", "Aaron", "Michelle", "Raymond", "Mary", "Brenda", "Jason", "Sarah", "Maria", "Sean", "Katherine", "Anthony", "Sandra", "Tina", "Matthew", "Denise", "Beverly", "Wanda", "Benjamin", "Lawrence", "Andrea", "Sharon", "Ruby", "Gerald", "Phillip", "Helen", "Irene", "Douglas", "Anne", "Ashley", "Amy", "Larry", "James", "Linda", "Willie", "Janet", "Todd", "Timothy", "Sarah", "Ann", "Anna", "Brandon", "Joan", "Annie", "Robin", "Larry", "Fred", "Jeremy", "Martha", "Ernest", "Denise", "Marie", "Kelly", "Jessica", "Paula", "Ronald", "Irene", "Shawn", "Russell", "Eugene", "Louise", "Carl", "Johnny", "Roger", "Mary", "Shawn", "Teresa", "Ralph", "Nicholas", "George", "Barbara", "Samuel", "Jack", "Louise", "Judith", "Wayne", "Kelly", "Jennifer", "Anne", "Sandra", "Lawrence", "Elizabeth", "Jason", "Carl", "Arthur", "Julie", "Joseph", "Teresa", "Michelle", "Jean", "Lisa", "Gregory", "Deborah", "Linda", "Tammy", "Wayne", "Victor", "Jessica", "Patricia", "Brandon", "Keith", "Bobby", "Jack", "Jesse", "Anna", "Lawrence", "Melissa", "Kathy", "Kathy", "Jennifer", "Philip", "Ruth", "Martin", "Larry", "Bonnie", "Scott", "Catherine", "Christina", "Ryan", "Nancy", "William", "Jeremy", "Phillip", "Brenda", "Ernest", "Frank", "Christina", "Angela", "Gerald", "Mary", "Michael", "Evelyn", "Gregory", "Julie", "Douglas", "Janice", "Gary", "Keith", "Rachel", "Ernest", "William", "Lois", "Samuel", "Lisa", "Beverly", "Joseph", "Nicole", "Kenneth", "Kevin", "Chris", "Carol", "Daniel", "Paula", "Christopher", "Melissa", "Thomas", "Barbara", "Angela", "Paula", "Dorothy", "Michael", "Carlos", "Nancy", "Anthony", "Kevin", "Ryan", "Mildred", "Joshua", "Anthony", "Lisa", "Dennis", "Marilyn", "Richard", "Bobby", "Teresa", "Barbara", "Martha", "Carlos", "Debra", "Sharon", "William", "Ronald", "Laura", "Sharon", "Lillian", "Kelly", "Joyce", "Howard", "Jonathan", "Tina", "Benjamin", "Ruth", "Carol", "Peter", "Justin", "Virginia", "Jimmy", "Jeffrey", "Irene", "Arthur", "Ann", "John", "Sean", "Joseph", "Carl", "Julia", "Shirley", "Fred", "Wanda", "Jimmy", "Joseph", "Janice", "Joyce", "Chris", "Diane", "Lawrence", "Gregory", "Phyllis", "Andrea", "Benjamin", "Sharon", "Kathy", "Michael", "Paul", "Carlos", "Debra", "Bobby", "Tina", "Frank", "Melissa", "Patricia", "Pamela", "Kathleen", "Cynthia", "Jose", "Angela", "Joseph", "Doris", "Nicole", "Gary", "Martin", "Betty", "Mary", "Carlos", "Linda", "Teresa", "Teresa", "Jennifer", "Karen", "Lawrence", "Mildred", "Amanda", "Denise", "Randy", "Rose", "Jeremy", "Jeffrey", "Andrew", "Todd", "Jean", "Richard", "Earl", "Lisa", "Russell", "Phillip", "Norma", "Judy", "Diane", "Robert", "John", "Anna", "Shawn", "Sean", "Donna", "Nicole", "Ronald", "Jessica", "Kimberly", "Russell", "Johnny", "Benjamin", "Diana", "Frances", "Gloria", "Chris", "Irene", "Harold", "James", "Jean", "Jack", "Howard", "Larry", "Rebecca", "Jeremy", "Antonio", "Betty", "Larry", "Cheryl", "Mary", "Justin", "Diana", "Sandra", "Jonathan", "Nancy", "Carol", "Aaron", "Joan", "Judy", "Arthur", "Kevin", "Aaron", "Anna", "Paula", "Peter", "Stephanie", "Alan", "Joshua", "Keith", "Harry", "Anne", "Nancy", "Jane", "Sean", "David", "Daniel", "Joe", "Ralph", "Ralph", "Sandra", "Jean", "Cheryl", "Gloria", "Sharon", "Helen", "Jeffrey", "Brandon", "Ronald", "Kimberly", "Ashley", "Jennifer", "Michelle", "David", "Louise", "Katherine", "Louis", "Kathleen", "Pamela", "Peter", "Rebecca", "Johnny", "Cheryl", "Daniel", "Rebecca", "Michael", "Theresa", "Diane", "Phillip", "Ryan", "Jeffrey", "Chris", "Christine", "Richard", "Robin", "Jimmy", "Lori", "Russell", "Larry", "Albert", "Bonnie", "Timothy", "Tina", "Steve", "Helen", "Arthur", "Judith", "Howard", "Jennifer", "George", "Mildred", "Martha", "Jessica", "Jessica", "Kathy", "Earl", "Bruce", "Mark", "Willie", "Ruth", "Jeremy", "Ruby", "Diana", "Stephen", "Kimberly", "Phyllis", "Ernest", "Donald", "Andrew", "Bruce", "Earl", "Stephanie", "Marilyn", "Julie", "Nancy", "Bobby", "Anthony", "Richard", "Virginia", "John", "Willie", "Melissa", "Brandon", "Jacqueline", "Lori", "Jesse", "Marie", "Bruce", "Gerald", "James", "Mary", "Beverly", "Julie", "Melissa", "Jesse", "Victor", "Dennis", "Amy", "Sandra", "James", "Bruce", "Jane", "Michael", "Keith", "David", "Elizabeth", "Howard", "Victor", "Sarah", "Pamela", "Julia", "Craig", "Jonathan", "Diana", "Sara", "Teresa", "Christine", "Jack", "Anne", "Sandra", "Joan", "Samuel", "Donna", "Arthur", "Eric", "Lois", "Denise", "Kimberly", "Russell", "Christine", "Jacqueline", "Frances", "Stephanie", "Roy", "Helen", "Diana", "Emily", "Wayne", "Angela", "Kelly", "Walter", "Margaret", "Lisa", "Judy", "Janet", "Cheryl", "Steven", "Jessica", "Barbara", "Andrew", "Jeffrey", "Jacqueline", "Alice", "Brian", "Carlos", "Fred", "Kathy", "Jeremy", "Joan", "Mildred", "Edward", "David", "George", "Robin", "Catherine", "Stephen", "Kathy", "Charles", "Martha", "Paul", "Rachel", "Todd", "Paul", "Cheryl", "Carolyn", "Shirley", "Benjamin", "Chris", "Steven", "Gerald", "Joshua", "Ralph", "Dorothy", "Janet", "Frank", "Raymond", "Shirley", "Samuel", "Jason", "Wayne", "Thomas", "Gary", "Philip", "Donna", "Joe", "Shirley", "Nancy", "Dorothy", "Stephanie", "Keith", "Ronald", "Raymond", "Gloria", "Paula", "Judy", "Doris", "Diana", "Edward", "Timothy", "Raymond", "Bobby", "Robin", "Jack", "Shirley", "Aaron", "Tina", "Keith", "Henry", "Julia", "Scott", "Dorothy", "Jeffrey", "Melissa", "Donna", "Mark", "Mildred", "Virginia", "Elizabeth", "Michelle", "Wanda", "Ronald", "Nancy", "Beverly", "Patricia", "Carolyn", "Teresa", "Annie", "Bruce", "Adam", "Adam", "Anne", "Jeremy", "Heather", "Heather"));

    public static final List<String> ACCOUNT_TYPES = unmodifiableList(asList("savings", "investment", "checking", "401k"));

    public static final List<String> CURRENCIES = unmodifiableList(asList("USD", "YEN", "PLN"));


}

package Map_and_FlatMap;

public class Theory {
/*

MAP vs FLATMAP IN STREAM API

1) map()
Definition:
- map() is an Intermediate Operation.
- It performs one-to-one transformation.
- It converts each element into another element.
- It returns Stream<R>.

Syntax:
stream.map(element -> transformation)


2) flatMap()
Definition:
- flatMap() is also an Intermediate Operation.
- It performs one-to-many transformation.
- It flattens nested collections into a single stream.
- It returns Stream<R>.

Syntax:
stream.flatMap(element -> element.stream())

Instead of Stream<List<String>>,
it produces Stream<String>.



Interview Answer:
map():
- One-to-One transformation
- Used for modifying objects
- Returns Stream<R>

flatMap():
- One-to-Many transformation
- Used for nested collections
- Flattens multiple streams into one
- Returns Stream<R>

Examples:

map():
Employee -> Name

flatMap():
Employee -> List<Skills>

        Java
        Spring
        Docker
----------------------------

Remember:

filter()      -> Intermediate
map()         -> Intermediate
flatMap()     -> Intermediate
sorted()      -> Intermediate

collect()     -> Terminal
forEach()     -> Terminal
count()       -> Terminal
reduce()      -> Terminal

*/


}

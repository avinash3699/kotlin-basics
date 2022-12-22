/*
    Why getters and setters?
        1. We can directly get or set a property’s value using the dot operator.
        2. But in the hands of the wrong person, allowing direct access to all our properties in this way can be quite a dangerous weapon.

    Custom getters and setters
        If you want to tweak a property’s return value, or validate a value before it gets assigned to a property, you can write your own getters and setters.
        Writing custom getters and setters lets you protect your property values, and they give you more control over what values are returned or assigned

        1. Getters (Accessors)
        A getter’s sole purpose in life is to send back a return value

        2. Setters (Mutators)
        A setter lives and breathes for the chance to take an argument value, and use it to set the value of a property.

    Technically, getters and setters are optional parts of the property declaration

    What is no custom setters and getters are written?
        The compiler secretly creates getters and setters for all properties that don’t already have one.
        If a property is defined using val, the compiler adds a getter, and if a property is defined using var, the compiler adds both a getter and a setter”

        This means that whenever you use the dot operator to get or set a property’s value, behind the scenes is always the property’s getter or setter that gets called

    So why does the compiler do this?
        Removing direct access to a property’s value by wrapping it in getters and setters is known as data hiding.

        Adding a getter and setter to every property means that there’s a standard way of accessing that property’s value.
        The getter handles any requests to get the value, and the setter handles any requests to set it.
 */

class Song(val songName: String, val composer: String) {

    var rating: Float = 0f
        get() = field
        set(newValue){
            if( (newValue >= 0) && (newValue <= 5) )
                field = newValue
        }
    // 'field' refers to the property’s backing field, which you can think of as being a reference to the underlying value of the property
    // Using field in your getters and setters in place of the property name is important, as it stops you getting stuck in an endless loop

}

fun main() {

    val song1 = Song("Marakkuma Nenjam", "A R Rahman")
    println(song1.rating) // 0.0

    song1.rating = 6.0f // The new value 6.0 will not be set as it doesn't satisfy the condition in the setter
    println(song1.rating) // 0.0

    song1.rating = 4.5f // The new value 4.5 will be set successfully
    println(song1.rating) // 4.5

    /* Output

        0.0
        0.0
        4.5
     */

}
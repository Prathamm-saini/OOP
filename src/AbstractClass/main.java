package AbstractClass;

/// let's say we have a parent class which tells us what to do but not how to do it - abstract
/// Real life scenario of Abstract classes
///                            Career (takes name) Parent class
///     1st child
///   (set career name as Engineer)                                              2nd  child
///                                                                           (set career name as Doctor)
/// here parent class will give a generalize form not it's actual body - not implementing anything just giving a name not the body
///  these are called abstract classes
/// child class will override all the necessary methods
/// when your parent class func does not have any-body, it's the responsibility of child class to provide it
///  we will do it via overriding
///
/// syntax
/// public/private abstract void career(String name){}
/// any class containing one or more than one abstract methods then it must also be declared as abstract
///
/// use cases of abstract classes
/// it looks cleaner such that if you know already which functions needs to be overridden it makes life easy
///

public class main {
    public static void main(String[] args) {
        son son = new son();
        son.career();
        daughter daughter = new daughter();
        daughter.career();
    }
}

package Week7;

public class Foo {
    private  int foo;
    Foo(int foo){this.foo=foo;}
}

class Bar extends Foo{
    private int bar;
//    Bar(int bar ){this.bar=bar;}
    Bar(int foo, int bar){
        super(foo);
        this.bar=bar;
    }
}



### Exception Tracing

```
public class ExceptionFun {
    Car[] myarr;
  
    public ExceptionFun(int n) {
        this.myarr = new Car[n];
        for(int i=0; i<n; i++) {
            myarr[i] = new Car();
        }
    }

    public void mixup() {
        for (int i=1; i<myarr.length+1; i++) {
            myarr[i].repaint(i);
        }
    }

    public static void foo() {
        ExceptionFun f = new ExceptionFun(10);
        try {
            System.out.println("calling mixup");
            f.mixup();
            System.out.println("done calling mixup");
        }
        catch (NullPointerException e) {
            System.out.println("null pointer");
        }
        catch (RuntimeException e) {
            System.out.println("other exception");
        }
        finally {
            System.out.println("all finished");
            throw new RuntimeException();
            System.out.println("here");
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("calling foo")
            ExceptionFun.foo();
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        }
        catch (Exception e) {
            System.out.println("general exception");
        }
        finally {
            System.out.println("guess I'm done");
        }
    }

    private class Car {
        String color;
        int doors;

        public Car() {
            color = "blue";
            doors = 4;
        }

        public void repaint(int i) {
            if (i % 3 == 0) {
                color = "black";
            }
            else if (i % 2 == 0) {
                color = "silver";
            }
            else {
                color = "white";
            }
        }
    }
  }
```

What is the output of this code?


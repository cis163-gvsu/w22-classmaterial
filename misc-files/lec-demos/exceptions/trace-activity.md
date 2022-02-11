# Tracing Exceptions

Consider the following code:

```
public class ExceptionFun {
    Car[] myarr;
  
    public ExceptionFun(int n) {
        this.myarr = new Car[n];
        for(int i=0; i<n; i++) {
            myarr[i] = null;
        }
    }

    public void mixup() {
        for (int i=1; i<myarr.length+1; i++) {
            myarr[i].repaint(i);
        }
    }

    public static void main(String[] args) {
        ExceptionFun f = new ExceptionFun(10);
        try {
            System.out.println("calling mixup");
            f.mixup();
            System.out.println("done calling mixup");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        }
        catch (Exception e) {
            System.out.println("other exception");
        }
        finally {
            System.out.println("all finished");
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
  }```

What is the output of this code?




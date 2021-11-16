class test {
    public static void m1() throws InterruptedException {
        method2();
    }

    public static void method2() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void main(String[] args) {
        try
        {
            m1();
        } catch ( InterruptedException obj)
        {
            System.out.println(obj);
        }
    }
}


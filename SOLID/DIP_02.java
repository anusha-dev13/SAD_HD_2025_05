package SOLID;

public class DIP_02 {

    public static interface Notification {
        void doNotify();
    }
    public static class EmailNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via email!");
        }
    }
    public static class Employee {
        private Notification notification; 

        public Employee(Notification notification) {
            this.notification = notification;
        }

        public void notifyEmployee() {
            notification.doNotify();
        }
    }

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification(); 
        Employee employee = new Employee(emailNotification);
        employee.notifyEmployee();
    }
}

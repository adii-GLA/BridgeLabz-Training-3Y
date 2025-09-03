class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String mName, int sNo, double p) {
        movieName = mName;
        seatNumber = sNo;
        price = p;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("Avengers", 12, 250);
        t.displayTicket();
    }
}
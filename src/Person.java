public record Person(int id, String forename, String surname) {
    public void addToDB() {
        String qry = "INSERT INTO java (id, forename, surname) VALUES " +
                "(" + this.id + ", " + this.forename + ", " + this.surname + ")";

    }
}
import java.time.LocalDate;

public class Artist {
    // Fields
    String artistName;
    LocalDate dateOfBirth;
    String City;
    String Country;

    // Constructor
    public Artist(String artistName, LocalDate dateOfBirth, String City, String Country) {
        this.artistName = artistName;
        this.dateOfBirth = dateOfBirth;
        this.City = City;
        this.Country = Country;
    }

    // Getters and setters
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }
    
    // Prints values
    public void printObject() {
        System.out.println("Name: " + this.artistName);
        System.out.println("Date of birth: " + this.dateOfBirth);
        System.out.println("City: " + this.City);
        System.out.println("Country: " + this.Country);
    }
}
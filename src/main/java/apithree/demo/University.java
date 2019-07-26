package apithree.demo;


public class University {
    private Long id;
    private String universityName;
    private String location;
    private double latitude;
    private double longitude;
    private Integer capacity;

    public University(String universityName, double latitude, double longitude) {
        this.universityName = universityName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public University(String universityName, String location, int capacity) {
        this.universityName = universityName;
        this.location = location;
        this.capacity = capacity;
    }

    private University() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", universityName='" + universityName + '\'' +
                ", location='" + location + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", capacity=" + capacity +
                '}';
    }
}

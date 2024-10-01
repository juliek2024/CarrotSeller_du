import java.time.LocalDate;

public class CarrotSeller {
    private String name;
    private String address;
    private LocalDate birthday;
    private String sellerTown;
    private int contractCount;
    private double soldQuantityInTons;
    private String vehicleRegistrationPlate;
    private double consumptionPer100KmInL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getSellerTown() {
        return sellerTown;
    }

    public void setSellerTown(String sellerTown) {
        this.sellerTown = sellerTown;
    }

    public int getContractCount() {
        return contractCount;
    }

    public void setContractCount(int contractCount) {
        this.contractCount = contractCount;
    }

    public double getSoldQuantityInTons() {
        return soldQuantityInTons;
    }

    public void setSoldQuantityInTons(double soldQuantityInTons) {
        this.soldQuantityInTons = soldQuantityInTons;
    }

    public String getVehicleRegistrationPlate() {
        return vehicleRegistrationPlate;
    }

    public void setVehicleRegistrationPlate(String vehicleRegistrationPlate) {
        this.vehicleRegistrationPlate = vehicleRegistrationPlate;
    }

    public double getConsumptionPer100KmInL() {
        return consumptionPer100KmInL;
    }

    public void setConsumptionPer100KmInL(double consumptionPer100KmInL) {
        this.consumptionPer100KmInL = consumptionPer100KmInL;
    }
}
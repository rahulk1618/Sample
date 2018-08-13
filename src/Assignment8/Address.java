//package Assignment8;
//
//public class Address {
//    String address1;
//    String address2;
//    String city;
//    String state;
//    int zipCode;
//
//    public Address(String address1, String address2, String city, String state, int zipCode) {
//        this.address1 = address1;
//        this.address2 = address2;
//        this.city = city;
//        this.state = state;
//        this.zipCode = zipCode;
//    }
//
//    public String getAddress1() {
//        return this.address1;
//    }
//
//    public void setAddress1(String address1) {
//        this.address1 = address1;
//    }
//
//    public String getAddress2() {
//        return this.address2;
//    }
//
//    public void setAddress2(String address2) {
//        this.address2 = address2;
//    }
//
//    public String getCity() {
//        return this.city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return this.state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public int getZipCode() {
//        return this.zipCode;
//    }
//
//    public void setZipCode(int zipCode) {
//        this.zipCode = zipCode;
//    }
//
//    public String toString() {
//        return "Address [address1=" + this.address1 + ", address2=" + this.address2 + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + "]";
//    }
//
//    public int hashCode() {
//        int prime = true;
//        int result = 1;
//        int result = 31 * result + (this.address1 == null ? 0 : this.address1.hashCode());
//        result = 31 * result + (this.address2 == null ? 0 : this.address2.hashCode());
//        result = 31 * result + (this.city == null ? 0 : this.city.hashCode());
//        result = 31 * result + (this.state == null ? 0 : this.state.hashCode());
//        result = 31 * result + this.zipCode;
//        return result;
//    }
//
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        } else if (obj == null) {
//            return false;
//        } else if (this.getClass() != obj.getClass()) {
//            return false;
//        } else {
//            Address other = (Address)obj;
//            if (this.address1 == null) {
//                if (other.address1 != null) {
//                    return false;
//                }
//            } else if (!this.address1.equals(other.address1)) {
//                return false;
//            }
//
//            if (this.address2 == null) {
//                if (other.address2 != null) {
//                    return false;
//                }
//            } else if (!this.address2.equals(other.address2)) {
//                return false;
//            }
//
//            if (this.city == null) {
//                if (other.city != null) {
//                    return false;
//                }
//            } else if (!this.city.equals(other.city)) {
//                return false;
//            }
//
//            if (this.state == null) {
//                if (other.state != null) {
//                    return false;
//                }
//            } else if (!this.state.equals(other.state)) {
//                return false;
//            }
//
//            return this.zipCode == other.zipCode;
//        }
//    }
//}

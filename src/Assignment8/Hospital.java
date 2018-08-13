//public class Hospital {
//    String hospitalName;
//    Doctor doc;
//    Address hospitalAddress;
//
//    public Hospital(String hospitalName, Doctor doc, Address hospitalAddress) {
//        this.hospitalName = hospitalName;
//        this.doc = doc;
//        this.hospitalAddress = hospitalAddress;
//    }
//
//    public String getHospitalName() {
//        return this.hospitalName;
//    }
//
//    public void setHospitalName(String hospitalName) {
//        this.hospitalName = hospitalName;
//    }
//
//    public Doctor getDoc() {
//        return this.doc;
//    }
//
//    public void setDoc(Doctor doc) {
//        this.doc = doc;
//    }
//
//    public Address getHospitalAddress() {
//        return this.hospitalAddress;
//    }
//
//    public void setHospitalAddress(Address hospitalAddress) {
//        this.hospitalAddress = hospitalAddress;
//    }
//
//    public String toString() {
//        return "Hosipital [hospitalName=" + this.hospitalName + ", doc=" + this.doc + ", hospitalAddress=" + this.hospitalAddress + "]";
//    }
//
////    public int hashCode() {
////        int prime = true;
////        int result = 1;
////        int result = 31 * result + (this.hospitalAddress == null ? 0 : this.hospitalAddress.hashCode());
////        result = 31 * result + (this.hospitalName == null ? 0 : this.hospitalName.hashCode());
////        return result;
////    }
//
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        } else if (obj == null) {
//            return false;
//        } else if (this.getClass() != obj.getClass()) {
//            return false;
//        } else {
//            Hospital other = (Hospital) obj;
//            if (this.hospitalAddress == null) {
//                if (other.hospitalAddress != null) {
//                    return false;
//                }
//            } else if (!this.hospitalAddress.equals(other.hospitalAddress)) {
//                return false;
//            }
//
//            if (this.hospitalName == null) {
//                if (other.hospitalName != null) {
//                    return false;
//                }
//            } else if (!this.hospitalName.equals(other.hospitalName)) {
//                return false;
//            }
//
//            return true;
//        }
//    }
//}
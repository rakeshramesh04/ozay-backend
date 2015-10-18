package com.ozay.model;

/**
 * Created by Adi Subramanian on 10/15/2015.
 */
public class Advertisement {
    private String address;
    private String imageLink;
    private String pageLink;
    private String string;
    private int srNo;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    public String getString() { return string; }

    public void setString(String string) { this.string = string; }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }


    public String toString() {
        return "Advertisement{" +
            "address='" + address + '\'' +
            "imageLink='" + imageLink + '\'' +
            "pageLink='" + pageLink + '\'' +
            "srNo='" + srNo + '\'' +
            "}";
    }
}

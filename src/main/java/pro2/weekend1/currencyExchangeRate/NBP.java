package pro2.weekend1.currencyExchangeRate;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NBP {
    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("effectiveDate")
    @Expose
    private String effectiveDate;
    @SerializedName("mid")
    @Expose
    private Double mid;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }


//    public String table;
//    public String currency;
//    public String no;
//    public String effectiveDate;
//    public String mid;
//
//    public String value;

    public NBP() {

    }
}

package one.contentbox.boxd.protocol.core.request;

import java.util.Map;


public class SplitAddrTx {

    private String from;
    private long gasPrice;
    private Map<String, Long>  detail;

    public SplitAddrTx() {
    }

    public String getFrom() {
        return this.from;
    }

    public long getGasPrice() {
        return this.gasPrice;
    }

    public Map<String, Long> getDetail() {
        return this.detail;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setGasPrice(long gasPrice) {
        this.gasPrice = gasPrice;
    }

    public void setDetail(Map<String, Long> detail) {
        this.detail = detail;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SplitAddrTx)) return false;
        final SplitAddrTx other = (SplitAddrTx) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$from = this.getFrom();
        final Object other$from = other.getFrom();
        if (this$from == null ? other$from != null : !this$from.equals(other$from)) return false;
        if (this.getGasPrice() != other.getGasPrice()) return false;
        final Object this$detail = this.getDetail();
        final Object other$detail = other.getDetail();
        if (this$detail == null ? other$detail != null : !this$detail.equals(other$detail)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final long $fee = this.getGasPrice();
        result = result * PRIME + (int) ($fee >>> 32 ^ $fee);
        final Object $detail = this.getDetail();
        result = result * PRIME + ($detail == null ? 43 : $detail.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof SplitAddrTx;
    }

    public String toString() {
        return "SplitAddrTx(from=" + this.getFrom() + ", gasPrice=" + this.getGasPrice() + ", detail=" + this.getDetail() + ")";
    }
}

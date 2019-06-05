package one.contentbox.boxd.protocol.core.request;

import java.util.Map;

public class UnsignedTxReq {

    private String from;
    private long gasPrice;
    private Map<String, Long> to;

    public UnsignedTxReq() {
    }

    public String getFrom() {
        return this.from;
    }

    public long getGasPrice() {
        return this.gasPrice;
    }

    public Map<String, Long> getTo() {
        return this.to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setGasPrice(long gasPrice) {
        this.gasPrice = gasPrice;
    }

    public void setTo(Map<String, Long> to) {
        this.to = to;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UnsignedTxReq)) return false;
        final UnsignedTxReq other = (UnsignedTxReq) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$from = this.getFrom();
        final Object other$from = other.getFrom();
        if (this$from == null ? other$from != null : !this$from.equals(other$from)) return false;
        if (this.getGasPrice() != other.getGasPrice()) return false;
        final Object this$to = this.getTo();
        final Object other$to = other.getTo();
        if (this$to == null ? other$to != null : !this$to.equals(other$to)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final long $fee = this.getGasPrice();
        result = result * PRIME + (int) ($fee >>> 32 ^ $fee);
        final Object $to = this.getTo();
        result = result * PRIME + ($to == null ? 43 : $to.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UnsignedTxReq;
    }

    public String toString() {
        return "UnsignedTxReq(from=" + this.getFrom() + ", gasPrice=" + this.getGasPrice() + ", to=" + this.getTo() + ")";
    }
}
